package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CRUDdocumento {
    
    public static void crearDBdocumentos(){
        File crearArc = new File("Documentos.txt");
        
        try{
            
            if (crearArc.createNewFile()){
                System.out.println("La DB de documentos creada con exito :D");
                
            }
            else{
                System.out.println("La DB de documentos ya EXISTE D:");
            }
            
            
        }catch(IOException e){
            System.out.println("Ocurrio un arror al crear la base de datos documentos :c");
            e.printStackTrace();
        }
    }
    
    
    public static boolean buscarDoc(String numDoc){
        String[] listaUsr= new String[2];
        boolean encontrarUsr= false;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Documentos.txt")); // Cambia el nombre del archivo
            String line;

            while ((line = br.readLine()) != null) {
                listaUsr = line.split(";");
                
                if(numDoc.equals(listaUsr[0])){
            
                    encontrarUsr =true;
                    }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return encontrarUsr;
        }
    
    
     public static String[] buscarDocumentos(String loginUsr,String dbDoc){
        String[] listaDoc= new String[2];
        String[] Doc= new String[2];
        crearDBdocumentos();
        try {
            BufferedReader br = new BufferedReader(new FileReader(dbDoc));
            String line;

            while ((line = br.readLine()) != null) {
                listaDoc = line.split(";");
                
                if(loginUsr.equals(listaDoc[0])){
                    
                    Doc=listaDoc;
                    
                    }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < listaDoc.length; i++) {
            System.out.println(listaDoc[i]);
            
        }
        
        
        return Doc;
        }
}
