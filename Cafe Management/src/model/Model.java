/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class Model extends javax.swing.JFrame {

    private double Total = 0,tax = 0;
    private int x = 0;
    public Model() {
        initComponents();
        init();
        setTime();
        setLocationRelativeTo(null);
        setTitle("Cofe Management");
    }

    public void init() {
        setImages();
    }
    
    public void setImages() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/coldcoffee.jpg"));
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/image/cappuccinocoffee.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/image/chocolatecoffee.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/image/greentea.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/image/mineralswater.png"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/image/strawberrycake.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/image/chocolatecake.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/image/fruitscake.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/image/rainbow.jpg"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/image/coke.jpg"));
        ImageIcon icon10 = new ImageIcon(getClass().getResource("/image/7up.jpg"));
        ImageIcon icon11 = new ImageIcon(getClass().getResource("/image/chickenburger.jpg"));
        ImageIcon icon12 = new ImageIcon(getClass().getResource("/image/chickennoodles.jpg"));
        ImageIcon icon13 = new ImageIcon(getClass().getResource("/image/vegetarianpizza.jpg"));
        ImageIcon icon14 = new ImageIcon(getClass().getResource("/image/orange_juice.jpg"));
        Image img = icon.getImage().getScaledInstance(jLabel7Images15.getWidth(), jLabel7Images15.getHeight(), Image.SCALE_SMOOTH);
        Image img1 = icon1.getImage().getScaledInstance(jLabel7Images1.getWidth(), jLabel7Images1.getHeight(), Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(jLabel7Images2.getWidth(), jLabel7Images2.getHeight(), Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(jLabel7Images3.getWidth(), jLabel7Images3.getHeight(), Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(jLabel7Images.getWidth(), jLabel7Images.getHeight(), Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(jLabel7Images5.getWidth(), jLabel7Images5.getHeight(), Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(jLabel7Images9.getWidth(), jLabel7Images9.getHeight(), Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(jLabel7Images11.getWidth(), jLabel7Images11.getHeight(), Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(jLabel7Images13.getWidth(), jLabel7Images13.getHeight(), Image.SCALE_SMOOTH);
        Image img9 = icon9.getImage().getScaledInstance(jLabel7Images14.getWidth(), jLabel7Images14.getHeight(), Image.SCALE_SMOOTH);
        Image img10 = icon10.getImage().getScaledInstance(jLabel7Images8.getWidth(), jLabel7Images8.getHeight(), Image.SCALE_SMOOTH);
        Image img11 = icon11.getImage().getScaledInstance(jLabel7Images10.getWidth(), jLabel7Images10.getHeight(), Image.SCALE_SMOOTH);
        Image img12 = icon12.getImage().getScaledInstance(jLabel7Images12.getWidth(), jLabel7Images12.getHeight(), Image.SCALE_SMOOTH);
        Image img13 = icon13.getImage().getScaledInstance(jLabel7Images16.getWidth(), jLabel7Images16.getHeight(), Image.SCALE_SMOOTH);
        Image img14 = icon14.getImage().getScaledInstance(jLabel7Images17.getWidth(), jLabel7Images17.getHeight(), Image.SCALE_SMOOTH);
        jLabel7Images15.setIcon(new ImageIcon(img));
        jLabel7Images1.setIcon(new ImageIcon(img1));
        jLabel7Images2.setIcon(new ImageIcon(img2));
        jLabel7Images3.setIcon(new ImageIcon(img3));
        jLabel7Images.setIcon(new ImageIcon(img4));
        jLabel7Images5.setIcon(new ImageIcon(img5));
        jLabel7Images9.setIcon(new ImageIcon(img6));
        jLabel7Images11.setIcon(new ImageIcon(img7));
        jLabel7Images13.setIcon(new ImageIcon(img8));
        jLabel7Images14.setIcon(new ImageIcon(img9));
        jLabel7Images8.setIcon(new ImageIcon(img10));
        jLabel7Images10.setIcon(new ImageIcon(img11));
        jLabel7Images12.setIcon(new ImageIcon(img12));
        jLabel7Images16.setIcon(new ImageIcon(img13));
        jLabel7Images17.setIcon(new ImageIcon(img14));

    }
    public boolean qtyIsZero(int qty){
        if(qty==0){
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;
        }
        return true;
    }
    public void reset() {
        jButton5Total.setEnabled(true);
        Total = 0;
        tax = 0;
        x = 0;
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jTextField1Tax.setText("0.0");
        jTextField7SubTotal.setText("0.0");
        jTextField3ToTal.setText("0.0");
        jTextArea1.setText("");
        jCheckBox1PurcheseColdCF.setSelected(false);
        jCheckBox1PurcheseCappu.setSelected(false);
        jCheckBox1PurcheseChocolateCF.setSelected(false);
        jCheckBox1PurcheseGreen.setSelected(false);
        jCheckBox1Purchese4.setSelected(false);
        jCheckBox1Purchese5.setSelected(false);
        jCheckBox1PurcheseCake.setSelected(false);
        jCheckBox1Purchese8.setSelected(false);
        jCheckBox1Purchese9.setSelected(false);
        jCheckBox1Purchese10.setSelected(false);
        jCheckBox1Purchese11.setSelected(false);
        jCheckBox1Purchese12.setSelected(false);
        jCheckBox1Purchese13.setSelected(false);
        jCheckBox1Purchese14.setSelected(false);

    }
    public void DuDate(){
        getTax(Total);
        jTextField1Tax.setText(String.valueOf(tax));
        jTextField7SubTotal.setText(String.valueOf(Total));
        jTextField3ToTal.setText(String.valueOf(Total+tax));   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_RoyalCF = new javax.swing.JLabel();
        jLabel1Time = new javax.swing.JLabel();
        jLabel2Date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1MenuItem = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2price1 = new javax.swing.JLabel();
        jLabel3Quantity1 = new javax.swing.JLabel();
        jLabel4Purchese1 = new javax.swing.JLabel();
        jLabel5Cappu = new javax.swing.JLabel();
        jLabel6_priceCappu = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox1PurcheseCappu = new javax.swing.JCheckBox();
        jLabel7Images1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2price2 = new javax.swing.JLabel();
        jLabel3Quantity2 = new javax.swing.JLabel();
        jLabel4Purchese2 = new javax.swing.JLabel();
        jLabel5ChocolateCF = new javax.swing.JLabel();
        jLabel6_priceChocolateCF = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jCheckBox1PurcheseChocolateCF = new javax.swing.JCheckBox();
        jLabel7Images2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2price3 = new javax.swing.JLabel();
        jLabel3Quantity3 = new javax.swing.JLabel();
        jLabel4Purchese3 = new javax.swing.JLabel();
        jLabel5ColdCF3 = new javax.swing.JLabel();
        jLabel6_15003 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jCheckBox1PurcheseGreen = new javax.swing.JCheckBox();
        jLabel7Images3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2price4 = new javax.swing.JLabel();
        jLabel3Quantity4 = new javax.swing.JLabel();
        jLabel4Purchese4 = new javax.swing.JLabel();
        jLabel5ColdCF4 = new javax.swing.JLabel();
        jLabel6_15004 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox1Purchese4 = new javax.swing.JCheckBox();
        jLabel7Images = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2price5 = new javax.swing.JLabel();
        jLabel3Quantity5 = new javax.swing.JLabel();
        jLabel4Purchese5 = new javax.swing.JLabel();
        jLabel5ColdCF5 = new javax.swing.JLabel();
        jLabel6_15005 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox1Purchese5 = new javax.swing.JCheckBox();
        jLabel7Images5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2price8 = new javax.swing.JLabel();
        jLabel3Quantity8 = new javax.swing.JLabel();
        jLabel4Purchese8 = new javax.swing.JLabel();
        jLabel5ColdCF8 = new javax.swing.JLabel();
        jLabel6_15008 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jCheckBox1Purchese11 = new javax.swing.JCheckBox();
        jLabel7Images8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2price9 = new javax.swing.JLabel();
        jLabel3Quantity9 = new javax.swing.JLabel();
        jLabel4Purchese9 = new javax.swing.JLabel();
        jLabel5ColdCF9 = new javax.swing.JLabel();
        jLabel6_15009 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jCheckBox1PurcheseCake = new javax.swing.JCheckBox();
        jLabel7Images9 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2price10 = new javax.swing.JLabel();
        jLabel3Quantity10 = new javax.swing.JLabel();
        jLabel4Purchese10 = new javax.swing.JLabel();
        jLabel5ColdCF10 = new javax.swing.JLabel();
        jLabel6_15010 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox1Purchese12 = new javax.swing.JCheckBox();
        jLabel7Images10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2price11 = new javax.swing.JLabel();
        jLabel3Quantity11 = new javax.swing.JLabel();
        jLabel4Purchese11 = new javax.swing.JLabel();
        jLabel5ColdCF11 = new javax.swing.JLabel();
        jLabel6_15011 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox1Purchese8 = new javax.swing.JCheckBox();
        jLabel7Images11 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2price12 = new javax.swing.JLabel();
        jLabel3Quantity12 = new javax.swing.JLabel();
        jLabel4Purchese12 = new javax.swing.JLabel();
        jLabel5ColdCF12 = new javax.swing.JLabel();
        jLabel6_15012 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jCheckBox1Purchese13 = new javax.swing.JCheckBox();
        jLabel7Images12 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel2price13 = new javax.swing.JLabel();
        jLabel3Quantity13 = new javax.swing.JLabel();
        jLabel4Purchese13 = new javax.swing.JLabel();
        jLabel5ColdCF13 = new javax.swing.JLabel();
        jLabel6_15013 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jCheckBox1Purchese9 = new javax.swing.JCheckBox();
        jLabel7Images13 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel2price14 = new javax.swing.JLabel();
        jLabel3Quantity14 = new javax.swing.JLabel();
        jLabel4Purchese14 = new javax.swing.JLabel();
        jLabel5ColdCF14 = new javax.swing.JLabel();
        jLabel6_15014 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox1Purchese10 = new javax.swing.JCheckBox();
        jLabel7Images14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel2price15 = new javax.swing.JLabel();
        jLabel3Quantity15 = new javax.swing.JLabel();
        jLabel4Purchese15 = new javax.swing.JLabel();
        jLabel5ColdCF15 = new javax.swing.JLabel();
        jLabel6_15015 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1PurcheseColdCF = new javax.swing.JCheckBox();
        jLabel7Images15 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel2price16 = new javax.swing.JLabel();
        jLabel3Quantity16 = new javax.swing.JLabel();
        jLabel4Purchese16 = new javax.swing.JLabel();
        jLabel5ColdCF16 = new javax.swing.JLabel();
        jLabel6_15016 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jCheckBox1Purchese14 = new javax.swing.JCheckBox();
        jLabel7Images16 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel2price17 = new javax.swing.JLabel();
        jLabel3Quantity17 = new javax.swing.JLabel();
        jLabel4Purchese17 = new javax.swing.JLabel();
        jLabel5ColdCF17 = new javax.swing.JLabel();
        jLabel6_15017 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jCheckBox1Purchese15 = new javax.swing.JCheckBox();
        jLabel7Images17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2Receipt = new javax.swing.JButton();
        jButton3Reset = new javax.swing.JButton();
        jButton4Exit = new javax.swing.JButton();
        jButton5Total = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jTextField1Tax = new javax.swing.JTextField();
        jTextField3ToTal = new javax.swing.JTextField();
        jLabel1Tax = new javax.swing.JLabel();
        jLabel5SubToTal = new javax.swing.JLabel();
        jLabel6ToTal = new javax.swing.JLabel();
        jTextField7SubTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 231, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1_RoyalCF.setFont(new java.awt.Font("Snap ITC", 1, 30)); // NOI18N
        jLabel1_RoyalCF.setText(" Royal Cafe");

        jLabel1Time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1_RoyalCF, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1Time, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2Date, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1_RoyalCF)
                .addGap(0, 5, Short.MAX_VALUE))
            .addComponent(jLabel1Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1MenuItem.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1MenuItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1MenuItem.setText("Menu Item");

        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price1.setText("Price:");

        jLabel3Quantity1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity1.setText("Quantity:");

        jLabel4Purchese1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese1.setText("Purchese:");

        jLabel5Cappu.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5Cappu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5Cappu.setText("Cappuccino Coffee");

        jLabel6_priceCappu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_priceCappu.setText("25.000đ");

        jSpinner2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1PurcheseCappu.setText("jCheckBox1");
        jCheckBox1PurcheseCappu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1PurcheseCappuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3Quantity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4Purchese1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1PurcheseCappu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6_priceCappu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5Cappu)
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7Images1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5Cappu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price1)
                    .addComponent(jLabel6_priceCappu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese1)
                    .addComponent(jCheckBox1PurcheseCappu)))
        );

        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price2.setText("Price:");

        jLabel3Quantity2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity2.setText("Quantity:");

        jLabel4Purchese2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese2.setText("Purchese:");

        jLabel5ChocolateCF.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ChocolateCF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ChocolateCF.setText("Chocolate Coffee");

        jLabel6_priceChocolateCF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_priceChocolateCF.setText("20.000đ");

        jSpinner3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1PurcheseChocolateCF.setText("jCheckBox1");
        jCheckBox1PurcheseChocolateCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1PurcheseChocolateCFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_priceChocolateCF)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1PurcheseChocolateCF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5ChocolateCF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7Images2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ChocolateCF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price2)
                    .addComponent(jLabel6_priceChocolateCF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese2)
                    .addComponent(jCheckBox1PurcheseChocolateCF)))
        );

        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price3.setText("Price:");

        jLabel3Quantity3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity3.setText("Quantity:");

        jLabel4Purchese3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese3.setText("Purchese:");

        jLabel5ColdCF3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF3.setText("Green Tea");

        jLabel6_15003.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15003.setText("15.000đ");

        jSpinner4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1PurcheseGreen.setText("jCheckBox1");
        jCheckBox1PurcheseGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1PurcheseGreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15003)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1PurcheseGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5ColdCF3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7Images3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price3)
                    .addComponent(jLabel6_15003))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese3)
                    .addComponent(jCheckBox1PurcheseGreen)))
        );

        jPanel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price4.setText("Price:");

        jLabel3Quantity4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity4.setText("Quantity:");

        jLabel4Purchese4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese4.setText("Purchese:");

        jLabel5ColdCF4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF4.setText("Minerals Water");

        jLabel6_15004.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15004.setText("20.000đ");

        jSpinner5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese4.setText("jCheckBox1");
        jCheckBox1Purchese4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5ColdCF4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15004)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7Images, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price4)
                    .addComponent(jLabel6_15004))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese4)
                    .addComponent(jCheckBox1Purchese4)))
        );

        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price5.setText("Price:");

        jLabel3Quantity5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity5.setText("Quantity:");

        jLabel4Purchese5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese5.setText("Purchese:");

        jLabel5ColdCF5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF5.setText("Strawberry Cake");

        jLabel6_15005.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15005.setText("15.000đ");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese5.setText("jCheckBox1");
        jCheckBox1Purchese5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15005)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5ColdCF5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel7Images5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price5)
                    .addComponent(jLabel6_15005))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese5)
                    .addComponent(jCheckBox1Purchese5)))
        );

        jPanel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price8.setText("Price:");

        jLabel3Quantity8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity8.setText("Quantity:");

        jLabel4Purchese8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese8.setText("Purchese:");

        jLabel5ColdCF8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF8.setText("7Up");

        jLabel6_15008.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15008.setText("10.000đ");

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese11.setText("jCheckBox1");
        jCheckBox1Purchese11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15008)
                            .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5ColdCF8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel7Images8, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price8)
                    .addComponent(jLabel6_15008))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese8)
                    .addComponent(jCheckBox1Purchese11)))
        );

        jPanel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price9.setText("Price:");

        jLabel3Quantity9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity9.setText("Quantity:");

        jLabel4Purchese9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese9.setText("Purchese:");

        jLabel5ColdCF9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF9.setText("Chocolate Cake");

        jLabel6_15009.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15009.setText("15.000đ");

        jSpinner7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1PurcheseCake.setText("jCheckBox1");
        jCheckBox1PurcheseCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1PurcheseCakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15009)
                            .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1PurcheseCake, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5ColdCF9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel7Images9, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price9)
                    .addComponent(jLabel6_15009))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese9)
                    .addComponent(jCheckBox1PurcheseCake)))
        );

        jPanel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price10.setText("Price:");

        jLabel3Quantity10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity10.setText("Quantity:");

        jLabel4Purchese10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese10.setText("Purchese:");

        jLabel5ColdCF10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF10.setText("Chicken Burger");

        jLabel6_15010.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15010.setText("25.000đ");

        jSpinner12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese12.setText("jCheckBox1");
        jCheckBox1Purchese12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15010)
                            .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5ColdCF10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel7Images10, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price10)
                    .addComponent(jLabel6_15010))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese10)
                    .addComponent(jCheckBox1Purchese12)))
        );

        jPanel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price11.setText("Price:");

        jLabel3Quantity11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity11.setText("Quantity:");

        jLabel4Purchese11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese11.setText("Purchese:");

        jLabel5ColdCF11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF11.setText("Fruits Cake");

        jLabel6_15011.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15011.setText("15.000đ");

        jSpinner8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese8.setText("jCheckBox1");
        jCheckBox1Purchese8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15011)
                            .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5ColdCF11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel7Images11, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price11)
                    .addComponent(jLabel6_15011))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese11)
                    .addComponent(jCheckBox1Purchese8)))
        );

        jPanel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price12.setText("Price:");

        jLabel3Quantity12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity12.setText("Quantity:");

        jLabel4Purchese12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese12.setText("Purchese:");

        jLabel5ColdCF12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF12.setText("Chicken Noodles");

        jLabel6_15012.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15012.setText("25.000đ");

        jSpinner13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese13.setText("jCheckBox1");
        jCheckBox1Purchese13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15012)
                            .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5ColdCF12)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel7Images12, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price12)
                    .addComponent(jLabel6_15012))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese12)
                    .addComponent(jCheckBox1Purchese13)))
        );

        jPanel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price13.setText("Price:");

        jLabel3Quantity13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity13.setText("Quantity:");

        jLabel4Purchese13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese13.setText("Purchese:");

        jLabel5ColdCF13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF13.setText("Rainbow Cake");

        jLabel6_15013.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15013.setText("15.000đ");

        jSpinner9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese9.setText("jCheckBox1");
        jCheckBox1Purchese9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15013)
                            .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5ColdCF13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel7Images13, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price13)
                    .addComponent(jLabel6_15013))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese13)
                    .addComponent(jCheckBox1Purchese9)))
        );

        jPanel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price14.setText("Price:");

        jLabel3Quantity14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity14.setText("Quantity:");

        jLabel4Purchese14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese14.setText("Purchese:");

        jLabel5ColdCF14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF14.setText("Coca Cola");

        jLabel6_15014.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15014.setText("10.000đ");

        jSpinner10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese10.setText("jCheckBox1");
        jCheckBox1Purchese10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15014)
                            .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5ColdCF14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel7Images14, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price14)
                    .addComponent(jLabel6_15014))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese14)
                    .addComponent(jCheckBox1Purchese10)))
        );

        jPanel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price15.setText("Price:");

        jLabel3Quantity15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity15.setText("Quantity:");

        jLabel4Purchese15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese15.setText("Purchese:");

        jLabel5ColdCF15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF15.setText("Cold Coffee");

        jLabel6_15015.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15015.setText("15.000đ");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1PurcheseColdCF.setText("jCheckBox1");
        jCheckBox1PurcheseColdCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1PurcheseColdCFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15015)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1PurcheseColdCF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5ColdCF15)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel7Images15, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price15)
                    .addComponent(jLabel6_15015))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese15)
                    .addComponent(jCheckBox1PurcheseColdCF)))
        );

        jPanel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price16.setText("Price:");

        jLabel3Quantity16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity16.setText("Quantity:");

        jLabel4Purchese16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese16.setText("Purchese:");

        jLabel5ColdCF16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF16.setText("Vegetarian Pizza");

        jLabel6_15016.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15016.setText("40.000đ");

        jSpinner14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese14.setText("jCheckBox1");
        jCheckBox1Purchese14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5ColdCF16)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15016)
                            .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel7Images16, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price16)
                    .addComponent(jLabel6_15016))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese16)
                    .addComponent(jCheckBox1Purchese14)))
        );

        jPanel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2price17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2price17.setText("Price:");

        jLabel3Quantity17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3Quantity17.setText("Quantity:");

        jLabel4Purchese17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4Purchese17.setText("Purchese:");

        jLabel5ColdCF17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5ColdCF17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ColdCF17.setText("Orange_Juice");

        jLabel6_15017.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_15017.setText("15.000đ");

        jSpinner15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1Purchese15.setText("jCheckBox1");
        jCheckBox1Purchese15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Purchese15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7Images17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3Quantity17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4Purchese17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2price17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_15017)
                            .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1Purchese15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5ColdCF17)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel7Images17, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ColdCF17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2price17)
                    .addComponent(jLabel6_15017))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quantity17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4Purchese17)
                    .addComponent(jCheckBox1Purchese15)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1MenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1MenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton2Receipt.setBackground(new java.awt.Color(153, 255, 255));
        jButton2Receipt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jButton2Receipt.setText("Receipt");
        jButton2Receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ReceiptActionPerformed(evt);
            }
        });

        jButton3Reset.setBackground(new java.awt.Color(255, 255, 153));
        jButton3Reset.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jButton3Reset.setText("Reset");
        jButton3Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ResetActionPerformed(evt);
            }
        });

        jButton4Exit.setBackground(new java.awt.Color(255, 102, 102));
        jButton4Exit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jButton4Exit.setText("Exit");
        jButton4Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ExitActionPerformed(evt);
            }
        });

        jButton5Total.setBackground(new java.awt.Color(0, 204, 102));
        jButton5Total.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jButton5Total.setText("Total");
        jButton5Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5TotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton5Total, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5Total, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));

        jTextField1Tax.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1Tax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1Tax.setText("0.0");

        jTextField3ToTal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3ToTal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3ToTal.setText("0.0");

        jLabel1Tax.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1Tax.setText("Tax");

        jLabel5SubToTal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5SubToTal.setText("Sub Total");

        jLabel6ToTal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6ToTal.setText("Total");

        jTextField7SubTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7SubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7SubTotal.setText("0.0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6ToTal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5SubToTal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3ToTal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5SubToTal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3ToTal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6ToTal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ExitActionPerformed

    private void jButton3ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ResetActionPerformed
        reset();
    }//GEN-LAST:event_jButton3ResetActionPerformed
    public void RoyalCafe(){
        int purchaseId = 15020 + (int) (Math.random()*80800);
        jTextArea1.setText("********************************Royal Cafe******************************\n"
                        + "Time: "+ jLabel1Time.getText()+"         Date: "+jLabel2Date.getText() +"\n"
                        + "Purchase ID: "+ purchaseId+"\n"        
                        + "**************************************************************************"
                        + "\n Item Name:\t\t\t"+"Price(đ)  "+" Quantity:\n");
    }
    private void jCheckBox1PurcheseColdCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1PurcheseColdCFActionPerformed
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1PurcheseColdCF.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }          
            double price = qty*15000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF15.getText()+"\t\t\t"+price+"\t"+jSpinner1.getValue()+"\n");               
            DuDate();
        }else {
            jCheckBox1PurcheseColdCF.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1PurcheseColdCFActionPerformed

    private void jCheckBox1PurcheseCappuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1PurcheseCappuActionPerformed
        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1PurcheseCappu.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*25000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5Cappu.getText()+"\t\t"+price+"\t"+jSpinner2.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1PurcheseCappu.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1PurcheseCappuActionPerformed

    private void jCheckBox1PurcheseChocolateCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1PurcheseChocolateCFActionPerformed
        int qty = Integer.parseInt(jSpinner3.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1PurcheseChocolateCF.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*20000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ChocolateCF.getText()+"\t\t"+price+"\t"+jSpinner3.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1PurcheseChocolateCF.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1PurcheseChocolateCFActionPerformed

    private void jCheckBox1PurcheseGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1PurcheseGreenActionPerformed
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1PurcheseGreen.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*15000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF3.getText()+"\t\t\t"+price+"\t"+jSpinner4.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1PurcheseGreen.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1PurcheseGreenActionPerformed

    private void jCheckBox1Purchese4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese4ActionPerformed
        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese4.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*20000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF4.getText()+"\t\t"+price+"\t"+jSpinner5.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese4ActionPerformed

    private void jCheckBox1Purchese5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese5ActionPerformed
        int qty = Integer.parseInt(jSpinner6.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese5.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*15000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF5.getText()+"\t\t"+price+"\t"+jSpinner6.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese5ActionPerformed

    private void jCheckBox1PurcheseCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1PurcheseCakeActionPerformed
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1PurcheseCake.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*15000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF9.getText()+"\t\t"+price+"\t"+jSpinner7.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1PurcheseCake.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1PurcheseCakeActionPerformed

    private void jCheckBox1Purchese8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese8ActionPerformed
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese8.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*15000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF11.getText()+"\t\t\t"+price+"\t"+jSpinner8.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese8ActionPerformed

    private void jCheckBox1Purchese9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese9ActionPerformed
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese9.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*15000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF13.getText()+"\t\t"+price+"\t"+jSpinner9.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese9ActionPerformed

    private void jCheckBox1Purchese10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese10ActionPerformed
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese10.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*10000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF14.getText()+"\t\t\t"+price+"\t"+jSpinner10.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese10ActionPerformed

    private void jCheckBox1Purchese11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese11ActionPerformed
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese11.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*10000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF8.getText()+"\t\t\t"+price+"\t"+jSpinner11.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese11ActionPerformed

    private void jCheckBox1Purchese12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese12ActionPerformed
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese12.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*25000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF10.getText()+"\t\t"+price+"\t"+jSpinner12.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese12ActionPerformed

    private void jCheckBox1Purchese13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese13ActionPerformed
        int qty = Integer.parseInt(jSpinner13.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese13.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*25000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF12.getText()+"\t\t"+price+"\t"+jSpinner13.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese13ActionPerformed

    private void jCheckBox1Purchese14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese14ActionPerformed
        int qty = Integer.parseInt(jSpinner14.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese14.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*40000;
            Total+=price;
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF16.getText()+"\t\t"+price+"\t"+jSpinner14.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese14ActionPerformed

    private void jCheckBox1Purchese15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Purchese15ActionPerformed
        int qty = Integer.parseInt(jSpinner15.getValue().toString());
        if(qtyIsZero(qty)&&jCheckBox1Purchese15.isSelected()){
            x++;
            if(x==1){
                RoyalCafe();
            }
            double price = qty*15000;
            Total+=price;           
            jTextArea1.setText(jTextArea1.getText()+x+"."+jLabel5ColdCF17.getText()+"\t\t\t"+price+"\t"+jSpinner15.getValue()+"\n");     
            DuDate();
        }else {
            jCheckBox1Purchese15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1Purchese15ActionPerformed

    private void jButton5TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5TotalActionPerformed
        if(Total==0){
            JOptionPane.showMessageDialog(null, "You haven't selected any Item");
        }else{
            getTax(Total);
            jTextArea1.setText(jTextArea1.getText()+
                    "\n\"**************************************************************************\n"+
                    "Tax:\t\t\t"+tax+"\n"+
                    "Sub Total:\t\t\t"+Total+"\n"+
                    "Total:\t\t\t"+(Total+tax)+"\n"+
                    "******************************Thank You*********************************\n");
            jButton5Total.setEnabled(false);
        }
    }//GEN-LAST:event_jButton5TotalActionPerformed

    private void jButton2ReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ReceiptActionPerformed
        if (Total != 0) {
            if (!jButton5Total.isEnabled()) {
                try {
                    jTextArea1.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "First,You should calculator the Total");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any product");
        }
    }//GEN-LAST:event_jButton2ReceiptActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*for (double i = 0.0; i <= 1.0; i+=0.1) {
        String s = i+"";
        float f = Float.valueOf(s);
        this.setOpacity(f);
        try {
        Thread.sleep(40);
        } catch (InterruptedException ex) {
        Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        }*/
    }//GEN-LAST:event_formWindowOpened
    
    public void getTax(double t) {
        if (t >= 10000 && t <= 50000) {
            tax = 5000;
        } else if (t > 50000 && t <= 100000) {
            tax = 10000;
        } else if (t > 100000) {
            tax = 15000;
        }
    }

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm:ss aa");
                    SimpleDateFormat DateFormat = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = TimeFormat.format(date);
                    jLabel1Time.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                    jLabel2Date.setText(DateFormat.format(date));
                }
            }
        }).start();
    }
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
            java.util.logging.Logger.getLogger(Model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Receipt;
    private javax.swing.JButton jButton3Reset;
    private javax.swing.JButton jButton4Exit;
    private javax.swing.JButton jButton5Total;
    private javax.swing.JCheckBox jCheckBox1Purchese10;
    private javax.swing.JCheckBox jCheckBox1Purchese11;
    private javax.swing.JCheckBox jCheckBox1Purchese12;
    private javax.swing.JCheckBox jCheckBox1Purchese13;
    private javax.swing.JCheckBox jCheckBox1Purchese14;
    private javax.swing.JCheckBox jCheckBox1Purchese15;
    private javax.swing.JCheckBox jCheckBox1Purchese4;
    private javax.swing.JCheckBox jCheckBox1Purchese5;
    private javax.swing.JCheckBox jCheckBox1Purchese8;
    private javax.swing.JCheckBox jCheckBox1Purchese9;
    private javax.swing.JCheckBox jCheckBox1PurcheseCake;
    private javax.swing.JCheckBox jCheckBox1PurcheseCappu;
    private javax.swing.JCheckBox jCheckBox1PurcheseChocolateCF;
    private javax.swing.JCheckBox jCheckBox1PurcheseColdCF;
    private javax.swing.JCheckBox jCheckBox1PurcheseGreen;
    private javax.swing.JLabel jLabel1MenuItem;
    private javax.swing.JLabel jLabel1Tax;
    private javax.swing.JLabel jLabel1Time;
    private javax.swing.JLabel jLabel1_RoyalCF;
    private javax.swing.JLabel jLabel2Date;
    private javax.swing.JLabel jLabel2price1;
    private javax.swing.JLabel jLabel2price10;
    private javax.swing.JLabel jLabel2price11;
    private javax.swing.JLabel jLabel2price12;
    private javax.swing.JLabel jLabel2price13;
    private javax.swing.JLabel jLabel2price14;
    private javax.swing.JLabel jLabel2price15;
    private javax.swing.JLabel jLabel2price16;
    private javax.swing.JLabel jLabel2price17;
    private javax.swing.JLabel jLabel2price2;
    private javax.swing.JLabel jLabel2price3;
    private javax.swing.JLabel jLabel2price4;
    private javax.swing.JLabel jLabel2price5;
    private javax.swing.JLabel jLabel2price8;
    private javax.swing.JLabel jLabel2price9;
    private javax.swing.JLabel jLabel3Quantity1;
    private javax.swing.JLabel jLabel3Quantity10;
    private javax.swing.JLabel jLabel3Quantity11;
    private javax.swing.JLabel jLabel3Quantity12;
    private javax.swing.JLabel jLabel3Quantity13;
    private javax.swing.JLabel jLabel3Quantity14;
    private javax.swing.JLabel jLabel3Quantity15;
    private javax.swing.JLabel jLabel3Quantity16;
    private javax.swing.JLabel jLabel3Quantity17;
    private javax.swing.JLabel jLabel3Quantity2;
    private javax.swing.JLabel jLabel3Quantity3;
    private javax.swing.JLabel jLabel3Quantity4;
    private javax.swing.JLabel jLabel3Quantity5;
    private javax.swing.JLabel jLabel3Quantity8;
    private javax.swing.JLabel jLabel3Quantity9;
    private javax.swing.JLabel jLabel4Purchese1;
    private javax.swing.JLabel jLabel4Purchese10;
    private javax.swing.JLabel jLabel4Purchese11;
    private javax.swing.JLabel jLabel4Purchese12;
    private javax.swing.JLabel jLabel4Purchese13;
    private javax.swing.JLabel jLabel4Purchese14;
    private javax.swing.JLabel jLabel4Purchese15;
    private javax.swing.JLabel jLabel4Purchese16;
    private javax.swing.JLabel jLabel4Purchese17;
    private javax.swing.JLabel jLabel4Purchese2;
    private javax.swing.JLabel jLabel4Purchese3;
    private javax.swing.JLabel jLabel4Purchese4;
    private javax.swing.JLabel jLabel4Purchese5;
    private javax.swing.JLabel jLabel4Purchese8;
    private javax.swing.JLabel jLabel4Purchese9;
    private javax.swing.JLabel jLabel5Cappu;
    private javax.swing.JLabel jLabel5ChocolateCF;
    private javax.swing.JLabel jLabel5ColdCF10;
    private javax.swing.JLabel jLabel5ColdCF11;
    private javax.swing.JLabel jLabel5ColdCF12;
    private javax.swing.JLabel jLabel5ColdCF13;
    private javax.swing.JLabel jLabel5ColdCF14;
    private javax.swing.JLabel jLabel5ColdCF15;
    private javax.swing.JLabel jLabel5ColdCF16;
    private javax.swing.JLabel jLabel5ColdCF17;
    private javax.swing.JLabel jLabel5ColdCF3;
    private javax.swing.JLabel jLabel5ColdCF4;
    private javax.swing.JLabel jLabel5ColdCF5;
    private javax.swing.JLabel jLabel5ColdCF8;
    private javax.swing.JLabel jLabel5ColdCF9;
    private javax.swing.JLabel jLabel5SubToTal;
    private javax.swing.JLabel jLabel6ToTal;
    private javax.swing.JLabel jLabel6_15003;
    private javax.swing.JLabel jLabel6_15004;
    private javax.swing.JLabel jLabel6_15005;
    private javax.swing.JLabel jLabel6_15008;
    private javax.swing.JLabel jLabel6_15009;
    private javax.swing.JLabel jLabel6_15010;
    private javax.swing.JLabel jLabel6_15011;
    private javax.swing.JLabel jLabel6_15012;
    private javax.swing.JLabel jLabel6_15013;
    private javax.swing.JLabel jLabel6_15014;
    private javax.swing.JLabel jLabel6_15015;
    private javax.swing.JLabel jLabel6_15016;
    private javax.swing.JLabel jLabel6_15017;
    private javax.swing.JLabel jLabel6_priceCappu;
    private javax.swing.JLabel jLabel6_priceChocolateCF;
    private javax.swing.JLabel jLabel7Images;
    private javax.swing.JLabel jLabel7Images1;
    private javax.swing.JLabel jLabel7Images10;
    private javax.swing.JLabel jLabel7Images11;
    private javax.swing.JLabel jLabel7Images12;
    private javax.swing.JLabel jLabel7Images13;
    private javax.swing.JLabel jLabel7Images14;
    private javax.swing.JLabel jLabel7Images15;
    private javax.swing.JLabel jLabel7Images16;
    private javax.swing.JLabel jLabel7Images17;
    private javax.swing.JLabel jLabel7Images2;
    private javax.swing.JLabel jLabel7Images3;
    private javax.swing.JLabel jLabel7Images5;
    private javax.swing.JLabel jLabel7Images8;
    private javax.swing.JLabel jLabel7Images9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1Tax;
    private javax.swing.JTextField jTextField3ToTal;
    private javax.swing.JTextField jTextField7SubTotal;
    // End of variables declaration//GEN-END:variables
}
