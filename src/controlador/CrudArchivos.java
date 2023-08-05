package controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Usuarios;

public class CrudArchivos {
    // ...

    
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(usuarioJson + "\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro en el archivo de texto.");
            e.printStackTrace();
        }
    }


}
