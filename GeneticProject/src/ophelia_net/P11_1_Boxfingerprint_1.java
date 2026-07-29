/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class P11_1_Boxfingerprint_1 extends javax.swing.JPanel {
    
    private CardLayout cd;
    private JPanel mainPanel;
    public static String BACKPAGE;
    public static final String ADDRESS = "BOX1";
    private ButtonGroup group;
    
    public P11_1_Boxfingerprint_1(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        addPage();
        group = new ButtonGroup();
        group.add(chooseRicko);
        group.add(choosePoppy);
        group.add(chooseDesmond);
        group.add(chooseAmi);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileLB1 = new javax.swing.JLabel();
        finger2JL = new javax.swing.JLabel();
        toolLB = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        zoomRickoBT = new javax.swing.JButton();
        zoomPoppyBT = new javax.swing.JButton();
        zoomAmiBT = new javax.swing.JButton();
        zoomDesmondBT = new javax.swing.JButton();
        chooseAmi = new javax.swing.JCheckBox();
        chooseDesmond = new javax.swing.JCheckBox();
        choosePoppy = new javax.swing.JCheckBox();
        chooseRicko = new javax.swing.JCheckBox();
        backBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLB1MouseClicked(evt);
            }
        });
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

        finger2JL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finger2JLMouseClicked(evt);
            }
        });
        add(finger2JL);
        finger2JL.setBounds(320, 140, 190, 90);

        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(980, 10, 70, 80);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1110, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        add(coinLB);
        coinLB.setBounds(1100, 20, 63, 63);

        zoomRickoBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomRickoBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomRickoBT.setText("ZOOM");
        zoomRickoBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomRickoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomRickoBTActionPerformed(evt);
            }
        });
        add(zoomRickoBT);
        zoomRickoBT.setBounds(700, 320, 80, 30);

        zoomPoppyBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomPoppyBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomPoppyBT.setText("ZOOM");
        zoomPoppyBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomPoppyBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomPoppyBTActionPerformed(evt);
            }
        });
        add(zoomPoppyBT);
        zoomPoppyBT.setBounds(990, 320, 80, 30);

        zoomAmiBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomAmiBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomAmiBT.setText("ZOOM");
        zoomAmiBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomAmiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomAmiBTActionPerformed(evt);
            }
        });
        add(zoomAmiBT);
        zoomAmiBT.setBounds(700, 570, 80, 30);

        zoomDesmondBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomDesmondBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomDesmondBT.setText("ZOOM");
        zoomDesmondBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomDesmondBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomDesmondBTActionPerformed(evt);
            }
        });
        add(zoomDesmondBT);
        zoomDesmondBT.setBounds(990, 570, 80, 30);

        chooseAmi.setBackground(new java.awt.Color(143, 60, 18));
        chooseAmi.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseAmi);
        chooseAmi.setBounds(690, 370, 20, 20);

        chooseDesmond.setBackground(new java.awt.Color(143, 60, 18));
        chooseDesmond.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseDesmond);
        chooseDesmond.setBounds(910, 370, 20, 20);

        choosePoppy.setBackground(new java.awt.Color(143, 60, 18));
        choosePoppy.setPreferredSize(new java.awt.Dimension(25, 25));
        add(choosePoppy);
        choosePoppy.setBounds(960, 120, 20, 20);

        chooseRicko.setBackground(new java.awt.Color(143, 60, 18));
        chooseRicko.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseRicko);
        chooseRicko.setBounds(680, 120, 20, 20);

        backBt.setBackground(new java.awt.Color(242, 242, 242));
        backBt.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBt.setText("<Back");
        backBt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        backBt.setVisible(false);
        backBt.setEnabled(false);
        backBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtActionPerformed(evt);
            }
        });
        add(backBt);
        backBt.setBounds(50, 630, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fBox1_base.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void zoomRickoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomRickoBTActionPerformed
        // TODO add your handling code here:
        cd.show(mainPanel, "box1Ricko");
    }//GEN-LAST:event_zoomRickoBTActionPerformed

    private void zoomPoppyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomPoppyBTActionPerformed
        cd.show(mainPanel,"box1Sister");
    }//GEN-LAST:event_zoomPoppyBTActionPerformed

    private void zoomAmiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomAmiBTActionPerformed
        // TODO add your handling code here:
        cd.show(mainPanel,"box1Wife");
    }//GEN-LAST:event_zoomAmiBTActionPerformed

    private void zoomDesmondBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomDesmondBTActionPerformed
        // TODO add your handling code here:
        cd.show(mainPanel,"box1Waiter");
    }//GEN-LAST:event_zoomDesmondBTActionPerformed

    private void fileLB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLB1MouseClicked
        // file Icon
        P_Menu_icon.backPage=ADDRESS;
        cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLB1MouseClicked

    private void toolLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolLBMouseClicked
        // tool Icon
        P_Hint_page.backPage=ADDRESS;
        cd.show(mainPanel,"toolPage");
    }//GEN-LAST:event_toolLBMouseClicked

    private void finger2JLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finger2JLMouseClicked
        if(!chooseAmi.isSelected() && !chooseDesmond.isSelected() && !choosePoppy.isSelected()&& !chooseRicko.isSelected())
            JOptionPane.showMessageDialog(this, "Select at least one", "Select", JOptionPane.WARNING_MESSAGE);
        else{
            cd.show(mainPanel, "BOX2");
        }
    }//GEN-LAST:event_finger2JLMouseClicked

    private void backBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtActionPerformed
        // TODO add your handling code here:
       cd.show(mainPanel,"fingerSelected");
    }//GEN-LAST:event_backBtActionPerformed

    private void addPage(){
        mainPanel.add(new P11_1_Boxfbox1Ricko(mainPanel,ADDRESS),"box1Ricko");
        mainPanel.add(new P11_1_Boxfbox1Sister(mainPanel,ADDRESS),"box1Sister");
        mainPanel.add(new P11_1_Boxfbox1Waiter(mainPanel,ADDRESS),"box1Waiter");
        mainPanel.add(new P11_1_Boxfbox1Wife(mainPanel,ADDRESS),"box1Wife");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JButton backBt;
    private javax.swing.JCheckBox chooseAmi;
    private javax.swing.JCheckBox chooseDesmond;
    private javax.swing.JCheckBox choosePoppy;
    private javax.swing.JCheckBox chooseRicko;
    static javax.swing.JLabel coin;
    static javax.swing.JLabel coinLB;
    static javax.swing.JLabel fileLB1;
    private javax.swing.JLabel finger2JL;
    private javax.swing.JLabel jLabel1;
    static javax.swing.JLabel toolLB;
    private javax.swing.JButton zoomAmiBT;
    private javax.swing.JButton zoomDesmondBT;
    private javax.swing.JButton zoomPoppyBT;
    private javax.swing.JButton zoomRickoBT;
    // End of variables declaration//GEN-END:variables
}
