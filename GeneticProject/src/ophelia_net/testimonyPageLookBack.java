package ophelia_net;


import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 // testimonyPageLookBack.addImage(new ImageIcon(getClass().getResource("/ophelia_net/informationRicko.jpg")).getImage());  // Static call to add the image 

/**
 * TestimonyPageLookBack class for displaying images and navigation.
 * 
 * Author: Chotika
 */
public class testimonyPageLookBack extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    private static JScrollPane scrollPane;
    private static JPanel imagePanel = new JPanel();
    private static ArrayList<Image> images = new ArrayList<>();
    public static String backPage;
    private final String ADDRESS = "testimonyPageLookBack";
    static JButton dnaSelBtn; 
    static JButton fingerSelBtn; 
    static JButton foodSelBtn; 
    /**food
     * Creates new form TestimonyPageLookBack
     */
    public testimonyPageLookBack(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }

    /**
     * Static method to add an image and display it immediately.
     * 
     * @param image the image to be added
     */
    public static void addImage(Image image) {
        // Resize the image to desired dimensions (e.g., 200x150)
        Image scaledImage = image.getScaledInstance(1000,600, Image.SCALE_SMOOTH);
        
        // Add the scaled image to the list
        images.add(scaledImage);
        
        // Create a label for the new scaled image and add it to the panel
        JLabel label = new JLabel(new ImageIcon(scaledImage));
        imagePanel.add(label);
        
        // Refresh the UI to show the new image
        imagePanel.revalidate();
        imagePanel.repaint();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        b_exit = new javax.swing.JLabel();
        base_img = new javax.swing.JLabel();
        imagePanel = new JPanel();
        scrollPane = new JScrollPane(imagePanel);

        //Tab - Analize DNA
        dnaSelBtn = new JButton("<html>DNA<br>Marker</html>"); // Create a new button
        dnaSelBtn.setBackground(Color.black);
        dnaSelBtn.setForeground(Color.WHITE);
        dnaSelBtn.setFont(new Font("Arial", Font.BOLD, 15));
        dnaSelBtn.setFocusPainted(false); // Remove focus border
        dnaSelBtn.setBounds(1060, 150, 130, 50); // Set bounds for the yellow button
        dnaSelBtn.setEnabled(false);
        dnaSelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cd.show(mainPanel,"adjust");
            }
        });
        add(dnaSelBtn);
        
        //Tab - Analize Finferprint
        fingerSelBtn = new JButton("<html>Finger<br>print</html>"); // Create a new button
        fingerSelBtn.setBackground(Color.black);
        fingerSelBtn.setForeground(Color.WHITE);
        fingerSelBtn.setFont(new Font("Arial", Font.BOLD, 15));
        fingerSelBtn.setFocusPainted(false); // Remove focus border
        fingerSelBtn.setBounds(1060, 220, 130, 50); // Set bounds for the yellow button
        fingerSelBtn.setEnabled(false);
        fingerSelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cd.show(mainPanel,"fingerSelected");
            }
        });
        add(fingerSelBtn);
        
        //Tab - Analize Food 
        foodSelBtn = new JButton("<html>Contaminated<br>food</html>"); // Create a new button
        foodSelBtn.setBackground(Color.black);
        foodSelBtn.setForeground(Color.WHITE);
        foodSelBtn.setFont(new Font("Arial", Font.BOLD, 15));
        foodSelBtn.setFocusPainted(false); // Remove focus border
        foodSelBtn.setBounds(1060, 290, 130, 50); // Set bounds for the yellow button
        foodSelBtn.setEnabled(false);//change to "true" when finish food identification(choose Matk)
        //when click tab
        foodSelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                P11_3_2_1formatmatk.backPageFromMenu=ADDRESS;
                cd.show(mainPanel,"format1");
            }
        });
        add(foodSelBtn);
        
        // Configure image panel layout
        imagePanel.setLayout(new javax.swing.BoxLayout(imagePanel, javax.swing.BoxLayout.Y_AXIS));
        // Configure scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        setLayout(null);

        // Exit button setup
        b_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/exit_icon.png"))); // NOI18N
        b_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_exitMouseClicked(evt);
            }
        });
        add(b_exit);
        b_exit.setBounds(1070, 40, 80, 80);

        // Add the scrollPane to this panel
        scrollPane.setBounds(50, 50, 1000, 600); // Adjust bounds as needed
        add(scrollPane);

        // Set base image (background)
        add(base_img);
        base_img.setBounds(0, 0, 1200, 700);
    }

    private void b_exitMouseClicked(java.awt.event.MouseEvent evt) {
        cd.show(mainPanel, backPage);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel b_exit;
    private javax.swing.JLabel base_img;
    // End of variables declaration                   
}
