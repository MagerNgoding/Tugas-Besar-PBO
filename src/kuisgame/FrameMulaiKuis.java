/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisgame;

/**
 *
 * @author Rosyid Iz
 */
public class FrameMulaiKuis extends javax.swing.JFrame {

    /**
     * Creates new form FrameMulaiKuis
     */
    public FrameMulaiKuis() {
        initComponents();
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
        closePanel = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(111, 90, 126));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 500));

        jPanel2.setBackground(new java.awt.Color(252, 246, 246));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closePanel.setBackground(new java.awt.Color(205, 102, 132));
        closePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closePanelMouseClicked(evt);
            }
        });

        X.setFont(new java.awt.Font("THE CHAMP", 0, 24)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        closePanel.add(X);

        jPanel2.add(closePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, -1));

        jLabel1.setFont(new java.awt.Font("THE CHAMP", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(205, 102, 132));
        jLabel1.setText("KUIS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        jPanel3.setBackground(new java.awt.Color(205, 102, 132));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 270));

        jButton1.setBackground(new java.awt.Color(205, 102, 132));
        jButton1.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("JAWABAN 2");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 290, 50));

        jButton2.setBackground(new java.awt.Color(205, 102, 132));
        jButton2.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("JAWABAN 1");
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 290, 50));

        jButton3.setBackground(new java.awt.Color(205, 102, 132));
        jButton3.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("JAWABAN 3");
        jButton3.setBorder(null);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 290, 50));

        jButton4.setBackground(new java.awt.Color(205, 102, 132));
        jButton4.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("JAWABAN 4");
        jButton4.setBorder(null);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 290, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 660, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePanelMouseClicked
        this.dispose();
    }//GEN-LAST:event_closePanelMouseClicked

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
            java.util.logging.Logger.getLogger(FrameMulaiKuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMulaiKuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMulaiKuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMulaiKuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMulaiKuis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X;
    private javax.swing.JPanel closePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
