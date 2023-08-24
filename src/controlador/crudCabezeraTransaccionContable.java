
package controlador;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class crudCabezeraTransaccionContable {
    public static void crearDBCabezeraTransaccionContable(){
        File crearArc = new File("Cabezera Transaccion Contable.txt");
        
        try{
            
            if (crearArc.createNewFile()){
                System.out.println("La DB de Cabezera Transaccion Contable creada con exito :D");
                
            }
            else{
                System.out.println("La DB de Cabezera Transaccion Contable  ya EXISTE D:");
            }
            
            
        }catch(IOException e){
            System.out.println("Ocurrio un arror al crear la base de datos Cabezera Transaccion Contable  :c");
            e.printStackTrace();
        }
    }
    
    public static void guardarCabeTranCont(String[] crear) throws FileNotFoundException, UnsupportedEncodingException {
        File Arc = new File("Cabezera Transaccion Contable.txt");
        BufferedWriter escribir = null;
        crearDBCabezeraTransaccionContable();
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
