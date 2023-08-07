package controlador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class CrudArchivos {
    

    public static void crearDBUsuarios(){
        File crearArc = new File("usuarios.txt");
        
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
    
}