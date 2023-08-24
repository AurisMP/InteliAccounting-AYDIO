
package controlador;

import static controlador.CrudArchivos.cantidadRegistros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class crudTablaTrans {
    private static int sec =1;
     public static void crearDBTablaTransacciones(){
        File crearArc = new File("tablaTransacciones.txt");
        
        try{
            
            if (crearArc.createNewFile()){
                System.out.println("La DB de tablaTransacciones creada con exito :D");
                
            }
            else{
                System.out.println("La DB de tablaTransacciones ya EXISTE D:");
            }
            
            
        }catch(IOException e){
            System.out.println("Ocurrio un error al crear la base de datos tablaTransacciones :c");
            e.printStackTrace();
        }
    }
     
    public static void guardarTablaTransacciones(String[] crear) throws FileNotFoundException, UnsupportedEncodingException {
        crearDBTablaTransacciones();
        File Arc = new File("tablaTransacciones.txt");
        BufferedWriter escribir = null;
        String num="";
        int numInt=0;
        String[] tablaTras=new String[crear.length+1];
        
        for (int i = 0; i < tablaTras.length; i++) {
            if(Arc.exists() && Arc.length()==0 && i == 0){
            
                tablaTras[i]=String.valueOf(sec);
                sec=sec+1;
                
                
            }
            
            else if(i>=1 && i <10){
                    tablaTras[i]=crear[i-1];
                }
            else{
                    if(Arc.exists() && Arc.length()>0 && i==0){
                        num=buscartrans()[0];
                        numInt= Integer.parseInt(num)+1;
                        num= String.valueOf(numInt);
                        tablaTras[0]=num;
                        
                    }
                    else if(i>=1 && i <10){
                        tablaTras[i]=crear[i-1];
                    }
                }
              
        }
        
        escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Arc,
                true), "utf-8"));

        try {
            if (!Arc.exists()) {
                Arc.createNewFile();
            }
            for (int x = 0; x < tablaTras.length; x++) {
                
                escribir.write(tablaTras[x]);
                if (x != tablaTras.length - 1) {
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
    
    public static String[] buscartrans(){
        String[] listaUsr= new String[6];
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("tablaTransacciones.txt")); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaUsr = line.split(";");
                
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return listaUsr;
        
        }
        
        public static String buscarTipoCat(String numCuenta){
        String[] listaTran= new String[6];
        String tipoCuenta= "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("catalogo.txt")); 
            String line;

            while ((line = br.readLine()) != null) {
                listaTran = line.split(";");
                
                if(listaTran[0].equals(numCuenta)){
                
                    tipoCuenta=listaTran[2];
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return tipoCuenta;
        
        }
    
    public static String[][] buscarTablaTrans(){
        String[][] tablaTrans= new String[cantidadRegistrosTT()][6];
        int cont=0;
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("tablaTransacciones.txt")); 
            String line;
            String ast="";
            while ((line = br.readLine()) != null) {
                
               
               String[] datosUsuarios= line.split(";");
               tablaTrans[cont]=datosUsuarios;
               cont++;
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
       
        
        return tablaTrans;
        }
    
    public static int cantidadRegistrosTT(){
        String[] listaUsr= new String[6];
        int cont=0;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("tablaTransacciones.txt")); // Cambia el nombre del archivo
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
    public static boolean buscartrans(String numCuenta){
        String[] listaTrans= new String[6];
        boolean idCuenta=false;
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("tablaTransacciones.txt")); 
            String line;

            while ((line = br.readLine()) != null) {
                listaTrans = line.split(";");
                if(listaTrans[1].equals(numCuenta)){
                    idCuenta=true;
                }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return idCuenta;
        
        }
    
    public static String[] buscarDebCretrans(){
        String[] listaTrans= new String[6];
        String[] listaDebCre = new String[2];
        int[] intDepCre= new int[2];
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("tablaTransacciones.txt")); 
            String line;

            while ((line = br.readLine()) != null) {
                listaTrans = line.split(";");
                
                intDepCre[0]+=Integer.parseInt(listaTrans[3]);
                intDepCre[1]+=Integer.parseInt(listaTrans[4]);
                
                
                
            }
            listaDebCre[0]= String.valueOf(intDepCre[0]);
            listaDebCre[1]= String.valueOf(intDepCre[1]);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return listaDebCre;
        
        }
}
