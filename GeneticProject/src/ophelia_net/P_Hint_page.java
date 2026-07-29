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
public class P_Hint_page extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    public static String backPage;
    /**
     * Creates new form NewJPanel
     */
    public P_Hint_page(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Hint_ScrollPanel = new javax.swing.JPanel();
        coin = new javax.swing.JLabel();
        DNA = new javax.swing.JLabel();
        Finger = new javax.swing.JLabel();
        Contaminate_1 = new javax.swing.JLabel();
        Contaminate_2 = new javax.swing.JLabel();
        closeBT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Hint_ScrollPanel.setBackground(new java.awt.Color(47, 46, 62));
        Hint_ScrollPanel.setPreferredSize(new java.awt.Dimension(1185, 3440));
        Hint_ScrollPanel.setRequestFocusEnabled(false);
        Hint_ScrollPanel.setLayout(null);

        coin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Guide_1.png"))); // NOI18N
        Hint_ScrollPanel.add(coin);
        coin.setBounds(0, 0, 1200, 700);

        DNA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Guide_2.png"))); // NOI18N
        Hint_ScrollPanel.add(DNA);
        DNA.setBounds(0, 706, 1200, 566);

        Finger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Guide_3.png"))); // NOI18N
        Hint_ScrollPanel.add(Finger);
        Finger.setBounds(0, 1278, 1200, 614);

        Contaminate_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Guide_4.png"))); // NOI18N
        Hint_ScrollPanel.add(Contaminate_1);
        Contaminate_1.setBounds(0, 1898, 1200, 700);

        Contaminate_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Guide_5.png"))); // NOI18N
        Hint_ScrollPanel.add(Contaminate_2);
        Contaminate_2.setBounds(0, 2604, 1200, 700);

        closeBT.setBackground(new java.awt.Color(242, 242, 242));
        closeBT.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        closeBT.setText("Close");
        closeBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        closeBT.setPreferredSize(new java.awt.Dimension(70, 32));
        closeBT.setRequestFocusEnabled(false);
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });
        Hint_ScrollPanel.add(closeBT);
        closeBT.setBounds(479, 3322, 120, 56);

        jScrollPane1.setViewportView(Hint_ScrollPanel);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        // TODO add your handling code here:
        cd.show(mainPanel,backPage);
    }//GEN-LAST:event_closeBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contaminate_1;
    private javax.swing.JLabel Contaminate_2;
    private javax.swing.JLabel DNA;
    private javax.swing.JLabel Finger;
    private javax.swing.JPanel Hint_ScrollPanel;
    private javax.swing.JButton closeBT;
    private javax.swing.JLabel coin;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
