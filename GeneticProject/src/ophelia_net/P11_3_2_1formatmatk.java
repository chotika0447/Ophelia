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
 * @author LENOVO
 */
public class P11_3_2_1formatmatk extends javax.swing.JPanel {
    
    private CardLayout cd;
    private JPanel mainPanel;
    private static final String ADDRESS="format1";
    public static String backPageFromMenu;
    
    public P11_3_2_1formatmatk(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextBT = new javax.swing.JButton();
        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        backBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        nextBT.setBackground(new java.awt.Color(242, 242, 242));
        nextBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        nextBT.setText("NEXT>");
        nextBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 3, new java.awt.Color(174, 0, 0)));
        nextBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTActionPerformed(evt);
            }
        });
        add(nextBT);
        nextBT.setBounds(1050, 610, 100, 40);

        toolLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(980, 10, 60, 50);

        fileLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLB1MouseClicked(evt);
            }
        });
        add(fileLB1);
        fileLB1.setBounds(1040, 10, 65, 50);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coin.setText(" 3 ");
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1110, 0, 40, 60);

        coinLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        coinLB.setAlignmentY(0.0F);
        coinLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(coinLB);
        coinLB.setBounds(1110, 10, 60, 50);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("<BACK");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 4, 0, new java.awt.Color(174, 0, 0)));
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(50, 610, 100, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/contam_matk.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1230, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        // TODO add your handling code here:
        toolLB.setVisible(false);
        fileLB1.setVisible(false);
        coinLB.setVisible(false);
        coin.setVisible(false);
        
        nextBT.setEnabled(false);
        nextBT.setVisible(false);
        testimonyPageLookBack.foodSelBtn.setEnabled(true);
        cd.show(mainPanel,"selectWaytoCheck");
    }//GEN-LAST:event_nextBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        if(nextBT.isEnabled()){
            cd.show(mainPanel,"foodFormat");
        }
        else{
            cd.show(mainPanel,backPageFromMenu);
        }
    }//GEN-LAST:event_backBTActionPerformed

    private void toolLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolLBMouseClicked
        // TODO add your handling code here:
        P_Hint_page.backPage=ADDRESS;
        cd.show(mainPanel,"toolPage");
    }//GEN-LAST:event_toolLBMouseClicked

    private void fileLB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLB1MouseClicked
        // TODO add your handling code here:
        P_Menu_icon.backPage=ADDRESS;
        cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLB1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    static javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton nextBT;
    private javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
}
