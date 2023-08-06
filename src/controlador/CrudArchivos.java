package controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Usuarios;

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
    public static void guardarUsuarioEnArchivo(Usuarios usuario) {
        
        
        // Convertir el objeto Usuario a formato JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String usuarioJson;
        try {
            usuarioJson = objectMapper.writeValueAsString(usuario);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el objeto Usuario a JSON.");
            e.printStackTrace();
            return;
        }

        // Guardar el JSON en un archivo de texto
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(crearDBUsuarios(), true))) {
            writer.write(usuarioJson + "\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro en la base de datos :c.");
            e.printStackTrace();
        }
    }


}
