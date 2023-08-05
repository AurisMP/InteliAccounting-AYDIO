package controlador;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.fasterxml.jackson.databind.ObjectMapper;
import views.PantallaLogin;
import modelo.Usuarios;
import views.PantallaRegistro;




public class Main {
    
     private static final String nombreArc = "usuarios.txt";
    
     
     public static void main(String[] args) {
        
        PantallaLogin pr = new PantallaLogin();
        pr.setVisible(true);
        
    }
    private static void guardarUsuarioEnArchivo(Usuarios usuario) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String usuarioJson = objectMapper.writeValueAsString(usuario);

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nombreArc, true))) {
                bufferedWriter.write(usuarioJson);
                bufferedWriter.newLine();
            }

            JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario en el archivo");
        }
    }
}
