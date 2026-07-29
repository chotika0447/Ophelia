/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Khao
 */
public class P12ChooseSuspect extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    private ButtonGroup group;
     public static String backPage;
     private final String ADDRESS = "pickKiller";
    public P12ChooseSuspect(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        group = new ButtonGroup();
        group.add(choosePoppyBT);
        group.add(chooseDesmondBT);
        group.add(chooseAmiBT);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBT = new javax.swing.JButton();
        choosePoppyBT = new javax.swing.JToggleButton();
        chooseDesmondBT = new javax.swing.JToggleButton();
        chooseAmiBT = new javax.swing.JToggleButton();
        fileLB = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        comfirmJB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        backBT.setText("<Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(10, 600, 130, 50);

        choosePoppyBT.setBackground(new java.awt.Color(242, 242, 242));
        choosePoppyBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        choosePoppyBT.setText("CHOOSE");
        choosePoppyBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        choosePoppyBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choosePoppyBTMouseClicked(evt);
            }
        });
        add(choosePoppyBT);
        choosePoppyBT.setBounds(540, 540, 110, 40);

        chooseDesmondBT.setBackground(new java.awt.Color(242, 242, 242));
        chooseDesmondBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        chooseDesmondBT.setText("CHOOSE");
        chooseDesmondBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        chooseDesmondBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseDesmondBTMouseClicked(evt);
            }
        });
        add(chooseDesmondBT);
        chooseDesmondBT.setBounds(900, 540, 110, 40);

        chooseAmiBT.setBackground(new java.awt.Color(242, 242, 242));
        chooseAmiBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        chooseAmiBT.setText("CHOOSE");
        chooseAmiBT.setBorder(new javax.swing.border.MatteBorder(null));
        chooseAmiBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseAmiBTMouseClicked(evt);
            }
        });
        add(chooseAmiBT);
        chooseAmiBT.setBounds(180, 540, 110, 40);

        fileLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLBMouseClicked(evt);
            }
        });
        add(fileLB);
        fileLB.setBounds(1020, 20, 70, 70);

        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(coin);
        coin.setBounds(1100, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        add(coinLB);
        coinLB.setBounds(1090, 20, 60, 60);

        comfirmJB.setBackground(new java.awt.Color(242, 242, 242));
        comfirmJB.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        comfirmJB.setText("Confirm");
        comfirmJB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        comfirmJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfirmJBActionPerformed(evt);
            }
        });
        add(comfirmJB);
        comfirmJB.setBounds(1060, 600, 130, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/chooseSuspect.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void fileLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLBMouseClicked
        P_Menu_icon.backPage="pickKiller";
        cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLBMouseClicked

    private void chooseAmiBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseAmiBTMouseClicked
        
    }//GEN-LAST:event_chooseAmiBTMouseClicked

    private void choosePoppyBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosePoppyBTMouseClicked
        
    }//GEN-LAST:event_choosePoppyBTMouseClicked

    private void chooseDesmondBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseDesmondBTMouseClicked
        
    }//GEN-LAST:event_chooseDesmondBTMouseClicked

    private void comfirmJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirmJBActionPerformed
        if(!chooseAmiBT.isSelected() && !chooseDesmondBT.isSelected() && !choosePoppyBT.isSelected())
            JOptionPane.showMessageDialog(this, "Please the suspect before comfirm.", "Select", JOptionPane.WARNING_MESSAGE);
        else{
            int result = JOptionPane.showConfirmDialog(null,"You can not go back after you choose. Do you want to continue?","Confirm", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                if(chooseAmiBT.isSelected()||chooseDesmondBT.isSelected()){
                    cd.show(mainPanel, "ChooseWrong");
                }
                else if(choosePoppyBT.isSelected()){
//                    cd.show(mainPanel,"Newspaper");
//                    Answer_AllTest.backPage=ADDRESS;
                    cd.show(mainPanel, "AllTestAnswer");
                    
                }
            }
            //Choose No option
//            else{
//                cd.show(mainPanel, "pickKiller");
//            }
        }
    }//GEN-LAST:event_comfirmJBActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        cd.show(mainPanel, "selectWaytoCheck");
    }//GEN-LAST:event_backBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JToggleButton chooseAmiBT;
    private javax.swing.JToggleButton chooseDesmondBT;
    private javax.swing.JToggleButton choosePoppyBT;
    static javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JButton comfirmJB;
    private javax.swing.JLabel fileLB;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
