package gest;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
    static login login_interface = new login();
    static MongoClient client;
    static MongoDatabase db;
        public static void main(String args[]) {
            System.out.println("Hello, world!");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            client = new MongoClient("localhost",27017); //Location by Default
            db = Main.client.getDatabase("GS");
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            login_interface.setLocation(dim.width/2- login_interface.getSize().width/2, dim.height/2- login_interface.getSize().height/2);
            login_interface.setVisible(true);
            });
    }
}
