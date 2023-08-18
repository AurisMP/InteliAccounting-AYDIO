
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class CRUDcatalogo {
    public static void Crear(String[] crear, String tabla) throws FileNotFoundException, UnsupportedEncodingException {
        File F1 = new File(tabla);
        BufferedWriter escribir = null;
        escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(F1,
                true), "utf-8"));

        try {
            if (!F1.exists()) {
                F1.createNewFile();
            }
            for (int x = 0; x < crear.length; x++) {
                escribir.write(crear[x]);
                if (x != crear.length - 1) {
                    escribir.write(";");
                } else {
                    escribir.write("\n");
                }
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error al grabar Archivo " + ex);
        }

    }
    public static boolean buscarCatalogo(String numCuenta){
        String[] listaUsr= new String[11];
        boolean encontrarUsr= false;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("catalogo.txt")); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaUsr = line.split(";");
                
                if(numCuenta.equals(listaUsr[0])){
            
                    encontrarUsr =true;
                    }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return encontrarUsr;
        }
    
    public static String[] buscarCuenta(String dumCuenta,String dbCat){
        String[] listaCuenta= new String[11];
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(dbCat)); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaCuenta = line.split(";");
                
                if(dumCuenta.equals(listaCuenta[0]) ){
                    
                    return listaCuenta;
                   
                    }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return listaCuenta;
        
        }
    
    public static String[] Buscar(String codigo, String tabla, int campos) throws IOException {
        File F1 = new File(tabla);
        String[] ar = new String[campos + 1];
        try {
            if (!F1.exists()) {
                F1.createNewFile();
            }
            try (Scanner s = new Scanner(F1)) {
                boolean encontrado = false;
                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner sl = new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    if (codigo.equals(sl.next())) {
                        ar[0] = codigo;
                        for (int x = 1; x < ar.length; x++) {
                            if (x == campos) {
                                ar[x] = "1";
                                encontrado = true;
                            } else {
                                ar[x] = sl.next();
                            }
                        }
                    } else {
                        ar[ar.length - 1] = "0";
                    }

                }
            }

        } catch (IOException ex) {
        }
        return ar;
    }

    public static void Modificar(String[] ar, String tabla) {

        // Especifica el archivo de texto que deseas leer y modificar
        String archivo = tabla;

        try {
            // Abre el archivo de texto para leer
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            // Crea un archivo temporal para escribir los datos modificados
            File archivoTemporal = new File("temp.txt");
            PrintWriter escritor = new PrintWriter(new FileWriter(archivoTemporal));

            // Lee cada línea del archivo
            String linea = lector.readLine();
            while (linea != null) {

                // Divide la línea en campos separados por ";"
                String[] campos = linea.split(";");

                if (campos[0].equals(ar[0])) {
                    campos = ar;
                }

                for (int x = 0; x < campos.length; x++) {
                    escritor.print(campos[x]);
                    if (x != campos.length - 1) {
                        escritor.print(";");
                    } else {
                        escritor.println();
                    }
                }

                // Lee la siguiente línea del archivo
                linea = lector.readLine();
            }

            // Cierra el archivo de texto y el archivo temporal
            lector.close();
            escritor.close();

            // Borra el archivo original
            File archivoOriginal = new File(archivo);
            archivoOriginal.delete();

            // Renombra el archivo temporal con el nombre del archivo original
            archivoTemporal.renameTo(archivoOriginal);

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }

    public static boolean LeerUsuario(String login, String pass) throws FileNotFoundException,
            UnsupportedEncodingException, IOException {
        boolean encontrado = false;
        String nivel_us = "";
        String logArc = "", passArc = "", u1 = "", u2 = "", u3 = "";

        File F1 = new File("Usuarios.txt");

        try {
            if (!F1.exists()) {
                F1.createNewFile();
            }
            try (Scanner s = new Scanner(F1)) {
                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner sl = new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    logArc = (sl.next());
                    passArc = (sl.next());
                    sl.next();
                    sl.next();
                    sl.next();
                    nivel_us = sl.next();

                    if (login == null ? logArc == null : login.equals(logArc) && pass.equals(passArc)) {
                        encontrado = true;
                        u1 = logArc;
                        u2 = passArc;
                        u3 = nivel_us;
                    }

                }
                s.close();
            }
        } catch (FileNotFoundException e1) {

            System.out.println("Error al leer Archivo " + e1);
        }

        //PERMISO DE USUARIO
        try {
            File F2 = new File("Us_actual.txt");

            if (F2.exists()) {
                F2.delete();
            }
            F2.createNewFile();
            try (BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(F2, true), "utf-8"))) {
                escribir.write(u1 + ";" + u2 + ";" + u3 + "\n");
                escribir.close();
            } catch (Exception e2) {
                System.out.println("Error al grabar Archivo " + e2);
            }
        } catch (IOException ex) {
            System.out.println("Error al grabar Archivo " + ex);
        }

        return (encontrado);
    }

     
    
    public static String[] Buscar2(String codigo, String tabla, int campos) throws IOException {
        File F1 = new File(tabla);
        String[] ar = new String[campos];
        try {
            if (!F1.exists()) {
                F1.createNewFile();
            }
            try (Scanner s = new Scanner(F1)) {
                boolean encontrado = false;
                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner sl = new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    if (codigo.equals(sl.next())) {
                        ar[0] = codigo;
                        for (int x = 1; x < ar.length; x++) {
                            ar[x] = sl.next();
                        }
                    }
                }
            }

        } catch (IOException ex) {
        }
        return ar;
    }
}
