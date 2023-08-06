package controlador;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static controlador.CrudArchivos.crearDBUsuarios;
import java.io.BufferedReader;
import java.io.FileReader;
import modelo.Usuarios;


public class InicioSesion {
    
    public static boolean iniciarSesion(String nom,String pass){
    boolean encontrarUsr =false;
    ObjectMapper mapeador = new ObjectMapper();
    try{
    
        BufferedReader buffeador = new BufferedReader(new FileReader(crearDBUsuarios()));    
        
        String datosArc;
    
    
    while((datosArc =buffeador.readLine())!=null){
        
        Usuarios existeUsr = mapeador.readValue(datosArc,Usuarios.class);
        
        if (existeUsr.getLoginUsr().equals(nom) && existeUsr.getPassUsr().equals(pass)){
            encontrarUsr=true;
            break;
            }
        }
                
    }catch(IOException e){
        
        e.printStackTrace();
    }
        
        
        
    
    return encontrarUsr;
    }
}
    