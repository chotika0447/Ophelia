/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Chotika
 */
public class P_Menu_icon extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    public static String backPage;
    private final String ADDRESS = "menuBtn";
    /**
     * Creates new form Menu_icon
     */
    public P_Menu_icon(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testimony = new javax.swing.JLabel();
        EvidenPage = new javax.swing.JLabel();
        timelinepage = new javax.swing.JLabel();
        b_exit = new javax.swing.JLabel();
        base_img = new javax.swing.JLabel();

        setLayout(null);

        testimony.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/file_icon.png"))); // NOI18N
        testimony.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testimonyMouseClicked(evt);
            }
        });
        add(testimony);
        testimony.setBounds(500, 280, 250, 250);

        EvidenPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/evidence_icon.png"))); // NOI18N
        EvidenPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EvidenPageMouseClicked(evt);
            }
        });
        add(EvidenPage);
        EvidenPage.setBounds(820, 290, 250, 220);

        timelinepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/timeline_icon.png"))); // NOI18N
        timelinepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timelinepageMouseClicked(evt);
            }
        });
        add(timelinepage);
        timelinepage.setBounds(150, 270, 250, 250);

        b_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/exit_icon.png"))); // NOI18N
        b_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_exitMouseClicked(evt);
            }
        });
        add(b_exit);
        b_exit.setBounds(1070, 40, 80, 80);

        base_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fileIcon_base.png"))); // NOI18N
        add(base_img);
        base_img.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void b_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_exitMouseClicked
        // TODO add your handling code here:
        cd.show(mainPanel,backPage);
    }//GEN-LAST:event_b_exitMouseClicked

    private void timelinepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timelinepageMouseClicked
        // TODO add your handling code here:
        P4_2Timeline2.backPage=ADDRESS;
        cd.show(mainPanel, "timelineLookBack");
    }//GEN-LAST:event_timelinepageMouseClicked

    private void EvidenPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EvidenPageMouseClicked
        // TODO add your handling code here:
        P4Evidence2.backPage=ADDRESS;
        cd.show(mainPanel, "evidenceLookBack");
    }//GEN-LAST:event_EvidenPageMouseClicked

    private void testimonyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testimonyMouseClicked
        // TODO add your handling code here:
        testimonyPageLookBack.backPage = ADDRESS;
        cd.show(mainPanel,"testimonyPageLookBack");
    }//GEN-LAST:event_testimonyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EvidenPage;
    private javax.swing.JLabel b_exit;
    private javax.swing.JLabel base_img;
    private javax.swing.JLabel testimony;
    private javax.swing.JLabel timelinepage;
    // End of variables declaration//GEN-END:variables
}
