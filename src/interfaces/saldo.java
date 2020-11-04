package interfaces;
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Arenas
 */
public class saldo extends javax.swing.JFrame {
    /**
     * Creates new form listar
     */
    public static String ss="";
    public static String pasas="";
    public static String nn="";
    public static String saldos="";
    public static int cont=3;
    public saldo() {
        initComponents();
        setLocationRelativeTo(null);       
        setSize(853, 810);                
       this.setTitle("Cajero BMS");
        this.setLocationRelativeTo(saldo.this);
        this.setResizable(false);
        this.setVisible(true);
        Date fecha = new Date();
        DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
        fechaaa.setText(formato.format(fecha));       
        String cadena;
        conectar con=new conectar();
        Connection reg=con.conectar();
   try {
        Statement ps= reg.createStatement();
     ResultSet rs=ps.executeQuery("select * from usuario ");
         while(rs.next()){
                pasas=rs.getString("cuenta");
                nn=rs.getString("nombre");
                saldos=rs.getString("saldo");
                ss=rs.getString("pass"); 
        }
          
   } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
       } 
   
   while(cont>0 ){
            String pass;
            cadena=JOptionPane.showInputDialog("Introduce tu contraseña");
            pass=(cadena);
            if(!pass.equals("")){
             if(pass.equals(ss)){
                 cuenta.setText(pasas);  
                 nombres.setText(nn);    
                 saldo.setText(saldos);
                 cont = -1;
                 
             } else {
                 cont --;
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta te quedan: "+cont+" intentos.");
             }
             if(cont==0){
                 JOptionPane.showMessageDialog(null,"Se ha detectado intentos erroreos en su cuenta, ser realizara un bloqueo temporal a su cuenta.");
                 }
         }else{
            JOptionPane.showMessageDialog(null,"Campo vacio, ingrese su contraseña.");
            }
         }
   if(cont==0){
                new login();
                this.dispose();
                cont=3;
       }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bolivianos = new javax.swing.JButton();
        fechaaa = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        cuenta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        banner2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 66, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 65, 75));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(17, 66, 50));
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-izquierda-en-círculo-2-32.png"))); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel2.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 120, 40));

        jLabel6.setFont(new java.awt.Font("Bodoni MT Poster Compressed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bolivia");
        jLabel6.setAlignmentX(2.0F);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 110, 30));

        jLabel7.setFont(new java.awt.Font("Bodoni MT Poster Compressed", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BANCO LA FLORIDA");
        jLabel7.setAlignmentX(2.0F);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 280, 40));

        bolivianos.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bolivianos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-imprimir-32.png"))); // NOI18N
        bolivianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianosActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 100, 40));

        fechaaa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fechaaa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(fechaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre y apellido:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, 60));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONSULTA DE SALDO");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 260, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Saldo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 60));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Numero de cuenta:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, 60));

        saldo.setEditable(false);
        saldo.setBackground(new java.awt.Color(0, 65, 75));
        saldo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        saldo.setForeground(new java.awt.Color(204, 204, 204));
        saldo.setBorder(null);
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        jPanel2.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 420, 40));

        nombres.setEditable(false);
        nombres.setBackground(new java.awt.Color(0, 65, 75));
        nombres.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        nombres.setForeground(new java.awt.Color(204, 204, 204));
        nombres.setBorder(null);
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });
        jPanel2.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 420, 40));

        cuenta.setEditable(false);
        cuenta.setBackground(new java.awt.Color(0, 65, 75));
        cuenta.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cuenta.setForeground(new java.awt.Color(204, 204, 204));
        cuenta.setBorder(null);
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });
        jPanel2.add(cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 420, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 420, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 420, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 420, 10));
        jPanel2.add(banner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 790));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 790));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new menu();
        this.dispose();
        cont=3;
    }//GEN-LAST:event_volverActionPerformed

    private void bolivianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianosActionPerformed
        JOptionPane.showMessageDialog(null, "Imprimiendo");
        new menu();
        this.dispose();
        cont=3;
    }//GEN-LAST:event_bolivianosActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new saldo().setVisible(true);
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner2;
    private javax.swing.JButton bolivianos;
    private javax.swing.JTextField cuenta;
    private javax.swing.JLabel fechaaa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
