import java.awt.Image;
import javax.swing.ImageIcon;

public class AmongUsForm extends javax.swing.JFrame {
    
    //This is a comment
    String[] PlayersAlive = {"./AmongUs/Red.png", "./AmongUs/Black.png", "./AmongUs/Purple.png", "./AmongUs/Orange.png", "./AmongUs/White.png"};
    String[] PlayersDead = {"./AmongUs/Red Dead.png", "./AmongUs/Black Dead.png", "./AmongUs/Purple Dead.png", "./AmongUs/Orange Dead.png", "./AmongUs/White Dead.png"};

    public AmongUsForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCharacter = new javax.swing.JLabel();
        cmbPlayers = new javax.swing.JComboBox<>();
        lblKnife = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Among Us");
        setSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCharacter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCharacter.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(lblCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 300, -1));

        cmbPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlayersActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 300, -1));

        lblKnife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AmongUs/Knife.png"))); // NOI18N
        lblKnife.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKnifeMouseClicked(evt);
            }
        });
        getContentPane().add(lblKnife, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (String player : PlayersAlive) {
            cmbPlayers.addItem(player.substring(player.lastIndexOf("/") + 1,player.lastIndexOf(".")));
        }
        cmbPlayers.setSelectedIndex(0);
    }//GEN-LAST:event_formWindowOpened

    private void cmbPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlayersActionPerformed
        Image PlayerIcon = new ImageIcon(getClass().getResource(PlayersAlive[cmbPlayers.getSelectedIndex()])).getImage();//.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
        lblCharacter.setIcon(new ImageIcon(PlayerIcon));
    }//GEN-LAST:event_cmbPlayersActionPerformed

    private void lblKnifeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKnifeMouseClicked
        Image DeadPlayerIcon = new ImageIcon(getClass().getResource(PlayersDead[cmbPlayers.getSelectedIndex()])).getImage();//.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
        lblCharacter.setIcon(new ImageIcon(DeadPlayerIcon));
    }//GEN-LAST:event_lblKnifeMouseClicked

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
            java.util.logging.Logger.getLogger(AmongUsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmongUsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmongUsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmongUsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmongUsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPlayers;
    private javax.swing.JLabel lblCharacter;
    private javax.swing.JLabel lblKnife;
    // End of variables declaration//GEN-END:variables
}
