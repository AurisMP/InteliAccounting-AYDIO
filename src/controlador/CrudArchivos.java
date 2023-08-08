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
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class CrudArchivos {
    

    public static void crearDBUsuarios(){
        File crearArc = new File("Usuarios.txt");
        
        try{
            
            if (crearArc.createNewFile()){
                System.out.println("La DB de usuarios crear con exito :D");
                
            }
            else{
                System.out.println("La DB de usuarios ya EXISTE D:");
            }
            
            
        }catch(IOException e){
            System.out.println("Ocurrio un arror al crear la base de datos usuarios :c");
            e.printStackTrace();
        }
    }
    
    
    public static void guardarUsuarios(String[] crear) throws FileNotFoundException, UnsupportedEncodingException {
        File Arc = new File("Usuarios.txt");
        BufferedWriter escribir = null;
        escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Arc,
                true), "utf-8"));

        try {
            if (!Arc.exists()) {
                Arc.createNewFile();
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
    
    
    public static boolean buscarUsuarios(String loginUsr,String contra){
        String[] listaUsr= new String[5];
        boolean encontrarUsr= false;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt")); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaUsr = line.split(";");
                
                if(loginUsr.equals(listaUsr[0]) && contra.equals(listaUsr[1])){
            
                    encontrarUsr =true;
                    }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < listaUsr.length; i++) {
            System.out.println(listaUsr[i]);
            
        }
        
        
        return encontrarUsr;
        }
    
    public static boolean buscarUsuarios(String loginUsr){
        String[] listaUsr= new String[5];
        boolean encontrarUsr= false;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt")); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaUsr = line.split(";");
                
                if(loginUsr.equals(listaUsr[0]) ){
            
                    encontrarUsr =true;
                    }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < listaUsr.length; i++) {
            System.out.println(listaUsr[i]);
            
        }
        
        
        return encontrarUsr;
        }
    
    public static String[][] buscarUsuarios(){
        String[][] listaUsr= new String[cantidadRegistros()][5];
        int cont=0;
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt")); // Cambia el nombre del archivo
            String line;
            
            while ((line = br.readLine()) != null) {
                
               
               String[] datosUsuarios= line.split(";");
               listaUsr[cont]=datosUsuarios;
               cont++;    
                
                
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
       
        
        return listaUsr;
        }
    
    public static int cantidadRegistros(){
        String[] listaUsr= new String[5];
        int cont=0;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt")); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaUsr = line.split(";");
                cont++;
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
       
        
        return cont;
        }
    
    public static void actualizarUsuario(String nombreUsuario, String[] nuevosDatos) {
        ArrayList<String> lineas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineas.add(line);
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("Usuarios.txt"));

            for (String linea : lineas) {
                String[] datosUsuario = linea.split(";");
                if (datosUsuario[0].equals(nombreUsuario)) {
                    
                    for (int i = 0; i < nuevosDatos.length; i++) {
                        datosUsuario[i] = nuevosDatos[i];
                    }
                }

                //
                for (int i = 0; i < datosUsuario.length; i++) {
                    bw.write(datosUsuario[i]);
                    if (i != datosUsuario.length - 1) {
                        bw.write(";");
                    } else {
                        bw.write("\n");
                    }
                }
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}