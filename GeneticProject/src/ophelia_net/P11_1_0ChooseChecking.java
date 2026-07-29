/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class P11_1_0ChooseChecking extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    private boolean checked[] = {false,false,false}; // 0=finger , 1=dna , 2=food
    private static final String ADDRESS  = "selectWaytoCheck";
    public P11_1_0ChooseChecking(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        pickKillerBT.setVisible(false);
        pickKillerBT.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        toolLB = new javax.swing.JLabel();
        backBT = new javax.swing.JButton();
        fileLB = new javax.swing.JLabel();
        ingredaintSelected = new javax.swing.JLabel();
        fingerPrintSelected = new javax.swing.JLabel();
        dnaSelected = new javax.swing.JLabel();
        pickKillerBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(coin);
        coin.setBounds(1100, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        add(coinLB);
        coinLB.setBounds(1090, 20, 60, 60);

        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(910, 10, 70, 80);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        backBT.setText("<Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(40, 610, 200, 60);

        fileLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLBMouseClicked(evt);
            }
        });
        add(fileLB);
        fileLB.setBounds(1000, 20, 70, 70);

        ingredaintSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Contamtest.png"))); // NOI18N
        ingredaintSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingredaintSelectedMouseClicked(evt);
            }
        });
        add(ingredaintSelected);
        ingredaintSelected.setBounds(840, 120, 350, 400);

        fingerPrintSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fingerPrintSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Fingtest.png"))); // NOI18N
        fingerPrintSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fingerPrintSelectedMouseClicked(evt);
            }
        });
        add(fingerPrintSelected);
        fingerPrintSelected.setBounds(10, 120, 350, 400);

        dnaSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/DNAtest.png"))); // NOI18N
        dnaSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dnaSelectedMouseClicked(evt);
            }
        });
        add(dnaSelected);
        dnaSelected.setBounds(440, 120, 350, 400);

        pickKillerBT.setBackground(new java.awt.Color(242, 242, 242));
        pickKillerBT.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        pickKillerBT.setText("Pick a killer >");
        pickKillerBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        pickKillerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickKillerBTActionPerformed(evt);
            }
        });
        add(pickKillerBT);
        pickKillerBT.setBounds(950, 610, 200, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/navybg.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents
    
    //Click File Icon
    private void fileLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLBMouseClicked
        // TODO add your handling code here:
        P_Menu_icon.backPage="selectWaytoCheck";
        cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLBMouseClicked
    
    private void fingerPrintSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fingerPrintSelectedMouseClicked
    
        //if player has already checked the fingerprint
        if(checked[0]){JOptionPane.showMessageDialog(this, "You can check it on file", "Success", JOptionPane.WARNING_MESSAGE);}
        //check if there's still coins left
        else if(MainApp.coins>0){
            int result = JOptionPane.showConfirmDialog(null,"you will lost 1 coin. Do you want to continue?","Confirm", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                MainApp.coins-=1;
                if(MainApp.coins == 0){
                    pickKillerBT.setVisible(true);
                    pickKillerBT.setEnabled(true);
                }
                MainApp.setCoins();
                checked[0]=true;
                cd.show(mainPanel, "fingerSelected");
                fingerPrintSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Fingtest_ch.png")));
            }
            
       }else{
            pickKillerBT.setVisible(true);
            pickKillerBT.setEnabled(true);
           JOptionPane.showMessageDialog(this, "You're out of coins.", "conis", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_fingerPrintSelectedMouseClicked

    private void dnaSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dnaSelectedMouseClicked
        // TODO add your handling code here:
        if(checked[1]){JOptionPane.showMessageDialog(this, "You can check it on file", "Success", JOptionPane.WARNING_MESSAGE);}
        else if(MainApp.coins>0){
            int result = JOptionPane.showConfirmDialog(null,"you will lost 1 coin. Do you want to continue?","Confirm", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
            MainApp.coins-=1;
            if(MainApp.coins==0){
                pickKillerBT.setVisible(true);
                pickKillerBT.setEnabled(true);
            }
            MainApp.setCoins();
            checked[1]=true;
            cd.show(mainPanel, "dnaSelected");
            dnaSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/DNAtest_ch.png")));
            }
       }else{
            pickKillerBT.setVisible(true);
            pickKillerBT.setEnabled(true);
           JOptionPane.showMessageDialog(this, "You're out of coins.", "conis", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_dnaSelectedMouseClicked

    private void ingredaintSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingredaintSelectedMouseClicked
        // TODO add your handling code here:
        if(checked[2]){JOptionPane.showMessageDialog(this, "You can check it on file", "Success", JOptionPane.WARNING_MESSAGE);}
        else if(MainApp.coins>0){
            int result = JOptionPane.showConfirmDialog(null,"you will lost 1 coin. Do you want to continue?","Confirm", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
            MainApp.coins-=1;
            if(MainApp.coins==0){
                pickKillerBT.setVisible(true);
                pickKillerBT.setEnabled(true);
            }
            MainApp.setCoins();
            checked[2]=true;
            cd.show(mainPanel, "foodSelected");
            ingredaintSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/Contamtest_ch.png")));
            }
       }else{
            pickKillerBT.setVisible(true);
            pickKillerBT.setEnabled(true);
           JOptionPane.showMessageDialog(this, "You're out of coins.", "conis", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_ingredaintSelectedMouseClicked

    private void pickKillerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickKillerBTActionPerformed
        // TODO add your handling code here:
       cd.show(mainPanel,"pickKiller");
    }//GEN-LAST:event_pickKillerBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        cd.show(mainPanel,"choosetestbg");
    }//GEN-LAST:event_backBTActionPerformed

    private void toolLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolLBMouseClicked
        // TODO add your handling code here:
        P_Hint_page.backPage=ADDRESS;
        cd.show(mainPanel,"toolPage");
    }//GEN-LAST:event_toolLBMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    static javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel dnaSelected;
    private javax.swing.JLabel fileLB;
    private javax.swing.JLabel fingerPrintSelected;
    private javax.swing.JLabel ingredaintSelected;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton pickKillerBT;
    static javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
}
