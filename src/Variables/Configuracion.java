package Variables;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import ficherotxt.Interface.Network;
import java.awt.TextField;

public class Configuracion {
   public String DDBB;
   public String UserDDBB;
   public String PassDDBB;
   public String LocalServer;
   public String RemoteServer;
   public String RemoteServer2;
   public String Puerto;
   public String NuevoPuerto;
   public static Network nw = new Network();
   

public Configuracion(){
      //Declara objeto para las Propiedades
        Properties Propiedades = new Properties();

        //Declara objeto lectura de Archivo
        InputStream Archivo;
        

        try {
            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            Propiedades.load(Archivo);
            

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }

        //Despliega cada una de las Propiedades
         DDBB = Propiedades.getProperty("DDBB");
         UserDDBB = Propiedades.getProperty("UserDDBB");
         PassDDBB = Propiedades.getProperty("PassDDBB");
         LocalServer = Propiedades.getProperty("LocalServer");
         RemoteServer = Propiedades.getProperty("RemoteServer");
         RemoteServer2 = Propiedades.getProperty("RemoteServer2");
         Puerto = Propiedades.getProperty("Puerto");
         System.out.println("PuertoDesdeConfiguracion="+Puerto);
         
         
         try {
            //Graba el Archivo con las modificaciones realizadas
            Propiedades.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        nw.jtf_UserDDBB.setText(UserDDBB);
        nw.jtf_PassDDBB.setText(PassDDBB);
        nw.jtf_LocalServer.setText(LocalServer);
        nw.jtf_RemoteServer.setText(RemoteServer);
        nw.jtf_RemoteServer2.setText(RemoteServer2);
        nw.jtf_DDBB.setText(DDBB);
        nw.jtf_Puerto.setText(Puerto);

   }
  public void Lectura(Network nw) {//SETTER
       //Declara objeto para las Propiedades
        Properties Propiedades = new Properties();

        //Declara objeto lectura de Archivo
        InputStream Archivo;
        

        try {
            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            Propiedades.load(Archivo);

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }

        //Despliega cada una de las Propiedades
         DDBB = Propiedades.getProperty("DDBB");
         UserDDBB = Propiedades.getProperty("UserDDBB");
         PassDDBB = Propiedades.getProperty("PassDDBB");
         LocalServer = Propiedades.getProperty("LocalServer");
         RemoteServer = Propiedades.getProperty("RemoteServer");
         RemoteServer2 = Propiedades.getProperty("RemoteServer2");
         Puerto = Propiedades.getProperty("Puerto");
         System.out.println("Puerto Desde Lectura="+Puerto);
         
         
         try {
            //Graba el Archivo con las modificaciones realizadas
            Propiedades.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        nw.jtf_UserDDBB.setText(UserDDBB);
        nw.jtf_PassDDBB.setText(PassDDBB);
        nw.jtf_LocalServer.setText(LocalServer);
        nw.jtf_RemoteServer.setText(RemoteServer);
        nw.jtf_RemoteServer2.setText(RemoteServer2);
        nw.jtf_DDBB.setText(DDBB);
        nw.jtf_Puerto.setText(Puerto);
        
    }      

public String DimeUserDDBB(){
    System.out.println("UserDDBB= "+ UserDDBB);
    return "UserDDBB= "+ UserDDBB;
    
}


     /*
    
     public void Escritura(Network nw) {
        //Declara objeto para las Propiedades
        Properties PropiedadesEscritura = new Properties();

        //Declara objeto lectura de Archivo
        InputStream Archivo;
/*
        try {

            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            PropiedadesEscritura.load(Archivo);

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }
*/       
   
   /*
        UserDDBB=nw.jtf_UserDDBB.getText();
        PassDDBB=nw.jtf_PassDDBB.getText();
        LocalServer=nw.jtf_LocalServer.getText();
        RemoteServer=nw.jtf_RemoteServer.getText();
        RemoteServer2=nw.jtf_RemoteServer2.getText();
        DDBB=nw.jtf_DDBB.getText();
        Puerto=nw.jtf_Puerto.getText();         

        //Reconfiguracion 
        
        PropiedadesEscritura.setProperty( "UserDDBB",UserDDBB.toString());
        PropiedadesEscritura.setProperty( "PassDDBB",PassDDBB.toString());
        PropiedadesEscritura.setProperty( "LocalServer",LocalServer.toString());
        PropiedadesEscritura.setProperty( "RemoteServer",RemoteServer.toString());
        PropiedadesEscritura.setProperty( "RemoteServer2",RemoteServer2.toString());
        PropiedadesEscritura.setProperty( "DDBB",DDBB.toString());
        
         System.out.println("Puerto Desde Escritura="+Puerto);
        
        try {
            //Graba el Archivo con las modificaciones realizadas
            PropiedadesEscritura.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
*/




}


