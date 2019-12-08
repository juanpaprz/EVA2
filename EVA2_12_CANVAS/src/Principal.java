
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    Graphics gpsMiDibu;
    int l;
    int x;
    int y;
    int xIni;
    int yIni;
    
    public Principal() {
        initComponents();
        this.setSize(590, 350);
        gpsMiDibu = cnvDibu.getGraphics();
        this.l = 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cnvDibu = new java.awt.Canvas();
        btnFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(570, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cnvDibu.setBackground(new java.awt.Color(255, 255, 255));
        cnvDibu.setMinimumSize(new java.awt.Dimension(550, 350));
        cnvDibu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnvDibuMouseClicked(evt);
            }
        });
        getContentPane().add(cnvDibu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 499, 340));

        btnFin.setText("Finalizar");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        getContentPane().add(btnFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnvDibuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnvDibuMouseClicked
        if (l == 0){
            x = evt.getX();
            y = evt.getY();
            gpsMiDibu.fillOval(x - 2, y - 2, 4, 4);
            l++;
            xIni = x;
            yIni = y;
        } else{
            int x2 = evt.getX();
            int y2 = evt.getY();
            gpsMiDibu.fillOval(x2 - 2, y2 - 2, 4, 4);
            gpsMiDibu.drawLine(x, y, x2, y2);
            l++;
            x = x2;
            y = y2;
        }
    }//GEN-LAST:event_cnvDibuMouseClicked

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        if (l > 2) {
            gpsMiDibu.drawLine(xIni, yIni, x, y);
            l = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Error. Introduzca mas puntos");
        }
    }//GEN-LAST:event_btnFinActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFin;
    private java.awt.Canvas cnvDibu;
    // End of variables declaration//GEN-END:variables
}
