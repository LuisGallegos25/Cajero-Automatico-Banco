/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class retdolar extends javax.swing.JFrame {

    /**
     * Creates new form retdolar
     */
    public retdolar() {
        initComponents();
        setLocationRelativeTo(null);       
       setSize(853, 810); 
        this.setTitle("Cajero BMS");
        this.setLocationRelativeTo(retdolar.this);
        this.setResizable(false);
        this.setVisible(true);
        Date fecha = new Date();
        DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
        
        fechaaa.setText(formato.format(fecha));
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
        jLabel3 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bolivianos = new javax.swing.JButton();
        bolivianos1 = new javax.swing.JButton();
        bolivianos2 = new javax.swing.JButton();
        bolivianos3 = new javax.swing.JButton();
        bolivianos4 = new javax.swing.JButton();
        bolivianos5 = new javax.swing.JButton();
        bolivianos6 = new javax.swing.JButton();
        fechaaa = new javax.swing.JLabel();
        banner2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 66, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 65, 75));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RETIRO DOLARES");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 240, 30));

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

        jLabel2.setBackground(new java.awt.Color(204, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-retirada-256.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 260, 260));

        bolivianos.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        bolivianos.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos.setText("300Usd");
        bolivianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianosActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 240, 70));

        bolivianos1.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        bolivianos1.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos1.setText("50Usd");
        bolivianos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianos1ActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 70));

        bolivianos2.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        bolivianos2.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos2.setText("200Usd");
        bolivianos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianos2ActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 240, 70));

        bolivianos3.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos3.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        bolivianos3.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos3.setText("100Usd");
        bolivianos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianos3ActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 70));

        bolivianos4.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        bolivianos4.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos4.setText("400Usd");
        bolivianos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianos4ActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 240, 70));

        bolivianos5.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bolivianos5.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos5.setText("Más");
        bolivianos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianos5ActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 690, 100, 40));

        bolivianos6.setBackground(new java.awt.Color(204, 204, 204));
        bolivianos6.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        bolivianos6.setForeground(new java.awt.Color(17, 66, 50));
        bolivianos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-efectivo-en-mano-32(1).png"))); // NOI18N
        bolivianos6.setText("500Usd");
        bolivianos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolivianos6ActionPerformed(evt);
            }
        });
        jPanel2.add(bolivianos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 240, 70));

        fechaaa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fechaaa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(fechaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 40));

        banner2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        banner2.setForeground(new java.awt.Color(17, 66, 50));
        jPanel2.add(banner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 790));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 790));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new retiro();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void bolivianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianosActionPerformed
        float saldoss=0;
        conectar con=new conectar();
        Connection reg=con.conectar();
        try {
            Statement ps= reg.createStatement();
            ResultSet rs=ps.executeQuery("select * from usuario ");
            while(rs.next()){
                saldoss=rs.getFloat("saldo");
            }
        }catch (SQLException ex) {
            
        }
        float k=(float) (saldoss-(300*6.90));
        if(k>2069){
            try {

                String sqll="UPDATE usuario SET saldo=?";
                PreparedStatement ps;
                ps = reg.prepareStatement(sqll);

                ps.setFloat(1,k);
                int rs=ps.executeUpdate();
                /*if(rs>0){
                    JOptionPane.showMessageDialog(null, "Modificado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al Modificado");
                }*/
            } catch (SQLException ex) {
               
            }
            Date hora = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String ff=(dateFormat.format(hora));

            String sql;

            String sqll="insert into deposito (des, monto, fecha)values(?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sqll);
                pst.setString(1, "Retiro en usd.");
                pst.setString(2,"300");
                pst.setString(3, ff);
                //pst.setString(3, hh);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actualizado");
                }
            } catch (SQLException ex) {
                
            }}else{JOptionPane.showMessageDialog(null, "Saldo insuficiente");}
    }//GEN-LAST:event_bolivianosActionPerformed

    private void bolivianos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianos1ActionPerformed
        float saldoss=0;
        conectar con=new conectar();
        Connection reg=con.conectar();
        try {
            Statement ps= reg.createStatement();
            ResultSet rs=ps.executeQuery("select * from usuario ");
            while(rs.next()){
                saldoss=rs.getFloat("saldo");
            }
        }catch (SQLException ex) {
           
        }
        float k=(float) (saldoss-(50*6.90));
        if(k>49){
            try {

                String sqll="UPDATE usuario SET saldo=?";
                PreparedStatement ps;
                ps = reg.prepareStatement(sqll);

                ps.setFloat(1,k);
                int rs=ps.executeUpdate();
                /*if(rs>0){
                    JOptionPane.showMessageDialog(null, "Modificado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al Modificado");
                }*/
            } catch (SQLException ex) {
              
            }
            Date hora = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String ff=(dateFormat.format(hora));

            String sql;
            String sqll="insert into deposito (des, monto, fecha)values(?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sqll);
                pst.setString(1, "Retiro en usd.");
                pst.setString(2,"50");
                pst.setString(3, ff);
                //pst.setString(3, hh);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actualizado");
                }
            } catch (SQLException ex) {
               
            }}else{JOptionPane.showMessageDialog(null, "Saldo insuficiente");}

    }//GEN-LAST:event_bolivianos1ActionPerformed

    private void bolivianos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianos2ActionPerformed
        float saldoss=0;
        conectar con=new conectar();
        Connection reg=con.conectar();
        try {
            Statement ps= reg.createStatement();
            ResultSet rs=ps.executeQuery("select * from usuario ");
            while(rs.next()){
                saldoss=rs.getFloat("saldo");
            }
        }catch (SQLException ex) {
            
        }
        float k=(float) (saldoss-(200*6.90));
        if(k>1379){
            try {

                String sqll="UPDATE usuario SET saldo=?";
                PreparedStatement ps;
                ps = reg.prepareStatement(sqll);

                ps.setFloat(1,k);
                int rs=ps.executeUpdate();
                /*if(rs>0){
                    JOptionPane.showMessageDialog(null, "Modificado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al Modificado");
                }*/
            } catch (SQLException ex) {
               
            }
            Date hora = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String ff=(dateFormat.format(hora));

            String sql;
            String sqll="insert into deposito (des, monto, fecha)values(?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sqll);
                pst.setString(1, "Retiro en usd.");
                pst.setString(2,"200");
                pst.setString(3, ff);
                //pst.setString(3, hh);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actualizado");
                }
            } catch (SQLException ex) {
                
            }}else{

                JOptionPane.showMessageDialog(null, "Saldo insuficiente");}
    }//GEN-LAST:event_bolivianos2ActionPerformed

    private void bolivianos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianos3ActionPerformed
        float saldoss=0;
        conectar con=new conectar();
        Connection reg=con.conectar();
        try {
            Statement ps= reg.createStatement();
            ResultSet rs=ps.executeQuery("select * from usuario ");
            while(rs.next()){
                saldoss=rs.getFloat("saldo");
            }
        }catch (SQLException ex) {
            
        }
        float k=(float) (saldoss-(100*6.90));
        if(k>689){
            try {

                String sqll="UPDATE usuario SET saldo=?";
                PreparedStatement ps;
                ps = reg.prepareStatement(sqll);

                ps.setFloat(1,k);
                int rs=ps.executeUpdate();
                /*if(rs>0){
                    JOptionPane.showMessageDialog(null, "Modificado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al Modificado");
                }*/
            } catch (SQLException ex) {
                
            }
            Date hora = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String ff=(dateFormat.format(hora));

            String sql;
            float monto=k;
            String sqll="insert into deposito (des, monto, fecha)values(?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sqll);
                pst.setString(1, "Retiro en usd.");
                pst.setString(2,"100");
                pst.setString(3, ff);
                //pst.setString(3, hh);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actualizado");
                }
            } catch (SQLException ex) {
                
            }}else{JOptionPane.showMessageDialog(null, "Saldo insuficiente");}
    }//GEN-LAST:event_bolivianos3ActionPerformed

    private void bolivianos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianos4ActionPerformed
        float saldoss=0;
        conectar con=new conectar();
        Connection reg=con.conectar();
        try {
            Statement ps= reg.createStatement();
            ResultSet rs=ps.executeQuery("select * from usuario ");
            while(rs.next()){
                saldoss=rs.getFloat("saldo");
            }
        }catch (SQLException ex) {
            
        }
        float k=(float) (saldoss-(400*6.90));
        if(k>2769){
            try {

                String sqll="UPDATE usuario SET saldo=?";
                PreparedStatement ps;
                ps = reg.prepareStatement(sqll);

                ps.setFloat(1,k);
                int rs=ps.executeUpdate();
                /*if(rs>0){
                    JOptionPane.showMessageDialog(null, "Modificado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al Modificado");
                }*/
            } catch (SQLException ex) {
                
            }
            Date hora = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String ff=(dateFormat.format(hora));

            String sqll="insert into deposito (des, monto, fecha)values(?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sqll);
                pst.setString(1, "Retiro en usd.");
                pst.setString(2,"400");
                pst.setString(3, ff);
                //pst.setString(3, hh);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actualizado");
                }
            } catch (SQLException ex) {
                
            }}else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");}
    }//GEN-LAST:event_bolivianos4ActionPerformed

    private void bolivianos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bolivianos5ActionPerformed

    private void bolivianos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolivianos6ActionPerformed
        float saldoss=0;
        conectar con=new conectar();
        Connection reg=con.conectar();
        try {
            Statement ps= reg.createStatement();
            ResultSet rs=ps.executeQuery("select * from usuario ");
            while(rs.next()){
                saldoss=rs.getFloat("saldo");
            }
        }catch (SQLException ex) {
           
        }
        float k=(float) (saldoss-(500*6.90));
        if(k>3449){
            try {

                String sqll="UPDATE usuario SET saldo=?";
                PreparedStatement ps;
                ps = reg.prepareStatement(sqll);

                ps.setFloat(1,k);
                int rs=ps.executeUpdate();
                /*if(rs>0){
                    JOptionPane.showMessageDialog(null, "Modificado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al Modificado");
                }*/
            } catch (SQLException ex) {
                
            }
            Date hora = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String ff=(dateFormat.format(hora));

            String sql;
            String sqll="insert into deposito (des, monto, fecha)values(?,?,?)";
            try {
                PreparedStatement pst = reg.prepareStatement(sqll);
                pst.setString(1, "Retiro en usd.");
                pst.setString(2,"500");
                pst.setString(3, ff);
                //pst.setString(3, hh);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actualizado");
                }
            } catch (SQLException ex) {
               
            }
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");}
    }//GEN-LAST:event_bolivianos6ActionPerformed

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
            java.util.logging.Logger.getLogger(retdolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(retdolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(retdolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(retdolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new retdolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner2;
    private javax.swing.JButton bolivianos;
    private javax.swing.JButton bolivianos1;
    private javax.swing.JButton bolivianos2;
    private javax.swing.JButton bolivianos3;
    private javax.swing.JButton bolivianos4;
    private javax.swing.JButton bolivianos5;
    private javax.swing.JButton bolivianos6;
    private javax.swing.JLabel fechaaa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
