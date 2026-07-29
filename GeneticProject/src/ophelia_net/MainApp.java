/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ophelia_net;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author LENOVO
 */
public class MainApp extends JFrame {
    public static int coins=3;
    public MainApp() {
        JPanel mainPanel = new JPanel(new CardLayout());

        P1StartPage start = new P1StartPage(mainPanel);
        P2WarningPage warning = new P2WarningPage(mainPanel);
        P3Story story = new P3Story(mainPanel);
        P4Evidence evidence = new P4Evidence(mainPanel);
        P4_2Timeline timeline = new P4_2Timeline(mainPanel);
        P4_3informationRicko inforRicko = new P4_3informationRicko(mainPanel);
        P4_4Instruction instruction = new P4_4Instruction(mainPanel);
        P5testimonyBG testbg = new P5testimonyBG(mainPanel);
        P7AmiTestimony amitest = new P7AmiTestimony(mainPanel);
        P8DesmondTestimony desmondtest = new P8DesmondTestimony(mainPanel);
        P9PoppyTestimony poppytest = new P9PoppyTestimony(mainPanel);
        P10chooseTestimony choosetestbg = new P10chooseTestimony(mainPanel);
        P10_1chooseT1  choose1 = new P10_1chooseT1(mainPanel);
        P10_2chooseT2  choose2 = new P10_2chooseT2(mainPanel);
        P10_3chooseT3 choose3 = new P10_3chooseT3(mainPanel);
        P11_1_0ChooseChecking selectWaytoCheck = new P11_1_0ChooseChecking(mainPanel);
        P11_2_1dna dnaSelected = new P11_2_1dna(mainPanel);
        P_Menu_icon menuBtn = new P_Menu_icon(mainPanel);

        
        mainPanel.add( start, "start");
        mainPanel.add(warning, "warning");
        mainPanel.add(story, "story");
        mainPanel.add(evidence ,"evidence");
        mainPanel.add(timeline, "timeline");
        mainPanel.add(inforRicko, "informationRicko");
        mainPanel.add(instruction, "instruction");
        mainPanel.add(testbg, "testbg");
        mainPanel.add(amitest, "amitest");
        mainPanel.add(desmondtest, "desmondtest");
        mainPanel.add(poppytest, "poppytest");
        mainPanel.add(choosetestbg, "choosetestbg");
        mainPanel.add(choose1, "choose1");
        mainPanel.add(choose2, "choose2");
        mainPanel.add(choose3, "choose3");
        mainPanel.add(selectWaytoCheck,"selectWaytoCheck");
        mainPanel.add(dnaSelected,"dnaSelected");
        mainPanel.add(new P11_1_1chooseFingerEvi(mainPanel),"fingerSelected");
        mainPanel.add(new P11_3_1food(mainPanel),"foodSelected");
        
        mainPanel.add(new P11_3_2format(mainPanel),"foodFormat");
        mainPanel.add(new P11_3_2_1formatmatk(mainPanel),"format1");
        mainPanel.add(new P11_3_2_2formatCOI(mainPanel),"format2");
        mainPanel.add(new P11_3_2_3format16S(mainPanel),"format3");
        
        mainPanel.add(new P_Hint_page(mainPanel),"toolPage");
        mainPanel.add(new P11_2_2dnanega(mainPanel),"adjust");
        mainPanel.add(menuBtn,"menuBtn");
        mainPanel.add(new P4_2Timeline2(mainPanel),"timelineLookBack");
        mainPanel.add(new P4Evidence2(mainPanel),"evidenceLookBack");
        mainPanel.add(new testimonyPageLookBack(mainPanel),"testimonyPageLookBack");
        
        mainPanel.add(new P11_1_Winefingerprint(mainPanel),"Wine");
        mainPanel.add(new P11_1_Spoonfingerprint_1(mainPanel),"Spoon1");
        mainPanel.add(new P11_1_Spoonfingerprint_2(mainPanel),"Spoon2");
        mainPanel.add(new P11_1_Boxfingerprint_1(mainPanel),"BOX1");
        mainPanel.add(new P11_1_Boxfingerprint_2(mainPanel),"BOX2");
        mainPanel.add(new P11_1_Liquorfingerprint(mainPanel),"Liquor");
        mainPanel.add(new P11_1_Waterfingerprint(mainPanel),"Water");
        mainPanel.add(new P11_1_PlatefingerprintPlate(mainPanel),"Plate");
        mainPanel.add(new P11_1_MedfingerprintPot_1(mainPanel),"MedF1");
        mainPanel.add(new P11_1_MedfingerprintPot_2(mainPanel),"MedF2");
//        mainPanel.add()
        
        mainPanel.add(new P12ChooseSuspect(mainPanel),"pickKiller");
        
        mainPanel.add(new P13Newspaper(mainPanel),"Newspaper");
        mainPanel.add(new Choose_WrongSuspect(mainPanel),"ChooseWrong");
        mainPanel.add(new Answer_AllTest(mainPanel),"AllTestAnswer");
        mainPanel.add(new True_criminal(mainPanel),"Newspaper_detail");
        
        
        
        this.setContentPane(mainPanel);
        this.setSize(1216,740);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new MainApp();
    }
    public static void setCoins(){
        try{
            P10chooseTestimony.coin.setText("   "+MainApp.coins);
            P11_1_0ChooseChecking.coin.setText("   "+MainApp.coins);
            P11_1_1chooseFingerEvi.coin.setText("   "+MainApp.coins);
            P11_2_1dna.coin.setText("   "+MainApp.coins);
            P11_2_2dnanega.coin.setText("   "+MainApp.coins);
            P11_3_1food.coin.setText("   "+MainApp.coins);
            P11_3_2format.coin.setText("   "+MainApp.coins);
            P11_3_2_1formatmatk.coin.setText("   "+MainApp.coins);
            P11_3_2_1formatmatk.coin.setText("   "+MainApp.coins);
            P11_3_2_2formatCOI.coin.setText("   "+MainApp.coins);
            P11_3_2_3format16S.coin.setText("   "+MainApp.coins);
            P11_1_Boxfingerprint_1.coin.setText("   "+MainApp.coins);
            P11_1_Boxfingerprint_2.coin.setText("   "+MainApp.coins);
            P11_1_Liquorfingerprint.coin.setText("   "+MainApp.coins);
            P11_1_MedfingerprintPot_1.coin.setText("   "+MainApp.coins);
            P11_1_MedfingerprintPot_2.coin.setText("   "+MainApp.coins);
            P11_1_PlatefingerprintPlate.coin.setText("   "+MainApp.coins);
            P11_1_Spoonfingerprint_1.coin.setText("   "+MainApp.coins);
            P11_1_Spoonfingerprint_2.coin.setText("   "+MainApp.coins);
            P11_1_Waterfingerprint.coin.setText("   "+MainApp.coins);
            P11_1_Winefingerprint.coin.setText("   "+MainApp.coins);
            
            P12ChooseSuspect.coin.setText("   "+MainApp.coins);
        }catch(Exception err){
            System.out.print(err);
        }
    }
    
    
}
