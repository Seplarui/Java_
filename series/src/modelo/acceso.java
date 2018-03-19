package modelo;

import  java.io.*;

/**
 * 
 * @author sepla
 */
public class acceso {
    
    private static File f= new File("series.dat");
    
    public static void guardarLS(listShow ls) {
        try{
            FileOutputStream fos= new FileOutputStream(f);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Fallo al abrir fichero");
        }
    }
    
    public static listShow cargarLS() {
        
        listShow ls= new listShow();
        ObjectInputStream ois=null;
        try{
            FileInputStream fis= new FileInputStream(f);
            ois= new ObjectInputStream(fis);
            ls=(listShow)ois.readObject();
            ois.close();
        } catch(IOException io) {
            System.out.println("Fallo al guardar en el fichero");
        } finally {
            return ls;
        }
        
    }

}
