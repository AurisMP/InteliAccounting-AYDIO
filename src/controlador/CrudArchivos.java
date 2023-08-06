package controlador;
import java.io.File;
import java.io.IOException;


public class CrudArchivos {
    // ...

    public static String crearDBUsuarios(){
        String DBUsr="";
        try{
            File crearArc = new File("usuarios.txt");
            if (crearArc.createNewFile()){
                System.out.println("La DB de usuarios crear con exito :D");
            }
            else{
                System.out.println("La DB de usuarios ya EXISTE D:");
            }
            DBUsr=crearArc.getName();
            
        }catch(IOException e){
            System.out.println("Ocurrio un arror al crear la base de datos usuarios :c");
            e.printStackTrace();
        }
        
        
        return DBUsr;
    
    }
    
    }
 