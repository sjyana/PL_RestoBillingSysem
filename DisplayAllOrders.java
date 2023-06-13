
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */
public class DisplayAllOrders extends javax.swing.JFrame {
    
    private SecretKeySpec secretKey;
    private Cipher cipher;
    
    public DisplayAllOrders() {
        // Set the encryption key
        String encryptionKey = "MyEncryptionKey"; // Change this key for more secure encryption
        try {
            byte[] key = encryptionKey.getBytes(StandardCharsets.UTF_8);
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); // AES-128 uses a 16-byte key
            secretKey = new SecretKeySpec(key, "AES");
            cipher = Cipher.getInstance("AES");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error initializing encryption: " + ex.getMessage());
        }
        initComponents();
        retrieveDataFromFile();
        amtOfAllOrders();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtD1 = new javax.swing.JTextField();
        txtD2 = new javax.swing.JTextField();
        txtD3 = new javax.swing.JTextField();
        txtD4 = new javax.swing.JTextField();
        txtD5 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtM1 = new javax.swing.JTextField();
        txtM2 = new javax.swing.JTextField();
        txtM3 = new javax.swing.JTextField();
        txtM4 = new javax.swing.JTextField();
        txtM5 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtS1 = new javax.swing.JTextField();
        txtS2 = new javax.swing.JTextField();
        txtS3 = new javax.swing.JTextField();
        txtS4 = new javax.swing.JTextField();
        txtS5 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        txtB2 = new javax.swing.JTextField();
        txtB3 = new javax.swing.JTextField();
        txtB4 = new javax.swing.JTextField();
        txtB5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblMop = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblVat = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bttnDelete = new javax.swing.JButton();
        bttUpdate = new javax.swing.JButton();
        allOrders = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(229, 184, 106));

        jLabelMin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMin.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelExit.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setText("x");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(1102, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelExit)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jPanel1.setBackground(new java.awt.Color(247, 241, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Keep on Truckin", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(213, 91, 68));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("La Vie en Rose");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Keep on Truckin", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 72, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Orders");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 40));

        orderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order", "Name", "Date", "Time", "Total", "Mode of Payment", "M1", "M2", "M3", "M4", "M5", "S1", "S2", "S3", "S4", "S5", "D1", "D2", "D3", "D4", "D5", "B1", "B2", "B3", "B4", "B5", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1170, 220));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 91, 68), 3, true));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mode of Payment:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Customer's Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 30));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Time:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 30));

        lblStatus.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 90, 30));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Status:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 80, 30));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Subtotal:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 80, 30));

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Total Amount:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 120, 30));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("12% VAT:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 80, 30));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Beverages");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 130, 30));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 72, 40), 2, true));
        jPanel6.setOpaque(false);

        jLabel23.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("D1");

        jLabel24.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("D5");

        jLabel25.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("D2");

        jLabel26.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("D3");

        jLabel27.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("D4");

        txtD1.setEditable(false);
        txtD1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD1.setText("0");
        txtD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD1ActionPerformed(evt);
            }
        });

        txtD2.setEditable(false);
        txtD2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtD2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD2.setText("0");
        txtD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD2ActionPerformed(evt);
            }
        });

        txtD3.setEditable(false);
        txtD3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtD3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD3.setText("0");
        txtD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD3ActionPerformed(evt);
            }
        });

        txtD4.setEditable(false);
        txtD4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtD4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD4.setText("0");
        txtD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD4ActionPerformed(evt);
            }
        });

        txtD5.setEditable(false);
        txtD5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtD5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtD5.setText("0");
        txtD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtD5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtD5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtD4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtD4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtD5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 130, 150));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 72, 40), 2, true));
        jPanel7.setOpaque(false);

        jLabel28.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("M1");

        jLabel29.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("M5");

        jLabel30.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("M2");

        jLabel31.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("M3");

        jLabel32.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("M4");

        txtM1.setEditable(false);
        txtM1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtM1.setText("0");
        txtM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM1ActionPerformed(evt);
            }
        });

        txtM2.setEditable(false);
        txtM2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtM2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtM2.setText("0");
        txtM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM2ActionPerformed(evt);
            }
        });

        txtM3.setEditable(false);
        txtM3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtM3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtM3.setText("0");
        txtM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM3ActionPerformed(evt);
            }
        });

        txtM4.setEditable(false);
        txtM4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtM4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtM4.setText("0");
        txtM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM4ActionPerformed(evt);
            }
        });

        txtM5.setEditable(false);
        txtM5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtM5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtM5.setText("0");
        txtM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtM5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtM4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtM4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtM5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 130, 150));

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 72, 40), 2, true));
        jPanel8.setOpaque(false);

        jLabel33.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("S1");

        jLabel34.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("S5");

        jLabel35.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("S2");

        jLabel36.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("S3");

        jLabel37.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("S4");

        txtS1.setEditable(false);
        txtS1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtS1.setText("0");
        txtS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtS1ActionPerformed(evt);
            }
        });

        txtS2.setEditable(false);
        txtS2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtS2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtS2.setText("0");
        txtS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtS2ActionPerformed(evt);
            }
        });

        txtS3.setEditable(false);
        txtS3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtS3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtS3.setText("0");
        txtS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtS3ActionPerformed(evt);
            }
        });

        txtS4.setEditable(false);
        txtS4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtS4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtS4.setText("0");
        txtS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtS4ActionPerformed(evt);
            }
        });

        txtS5.setEditable(false);
        txtS5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtS5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtS5.setText("0");
        txtS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtS5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtS5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtS1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtS2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtS3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtS4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtS1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtS2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtS3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtS4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtS5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 130, 150));

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 72, 40), 2, true));
        jPanel9.setOpaque(false);

        jLabel38.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("B1");

        jLabel39.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("B5");

        jLabel40.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("B2");

        jLabel41.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("B3");

        jLabel42.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("B4");

        txtB1.setEditable(false);
        txtB1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB1.setText("0");
        txtB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB1ActionPerformed(evt);
            }
        });

        txtB2.setEditable(false);
        txtB2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB2.setText("0");
        txtB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB2ActionPerformed(evt);
            }
        });

        txtB3.setEditable(false);
        txtB3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB3.setText("0");
        txtB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB3ActionPerformed(evt);
            }
        });

        txtB4.setEditable(false);
        txtB4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB4.setText("0");
        txtB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB4ActionPerformed(evt);
            }
        });

        txtB5.setEditable(false);
        txtB5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txtB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB5.setText("0");
        txtB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 130, 150));

        jLabel18.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Main Dishes");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, 30));

        jLabel19.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Sides");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 130, 30));

        jLabel20.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Desserts");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 130, 30));

        lblOrder.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, 30));

        lblName.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, 30));

        lblDate.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, 30));

        lblTime.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 30));

        lblMop.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblMop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblMop, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, 30));

        lblSub.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblSub.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 90, 30));

        lblVat.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblVat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 100, 30));

        lblTotal.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 90, 30));

        jLabel43.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Order Number:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1130, 200));

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, 120, 40));

        bttnDelete.setText("Delete Order");
        bttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bttnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 120, 40));

        bttUpdate.setText("Update Status");
        bttUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(bttUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 120, 40));

        allOrders.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        allOrders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(allOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 160, 40));

        jLabel44.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Total Amount of Orders:");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 260, 40));

        jLabel45.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Total Amount of Orders:");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1170, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
private void retrieveDataFromFile() {
    String fileName = "ordersData.txt"; // Name of the text file

    try {
        FileReader fileReader = new FileReader(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            DefaultTableModel tableModel = (DefaultTableModel) orderList.getModel();
            // Clear the existing table data
            tableModel.setRowCount(0);
            String line;
            // Read each line from the file until the end is reached
            while ((line = bufferedReader.readLine()) != null) {
                // Decrypt the data
                String decryptedData = decrypt(line);
                
                // Check if decryption was successful and decryptedData is not null or empty
                if (decryptedData != null && !decryptedData.isEmpty()) {
                    // Split the decrypted data by comma to separate the fields
                    String[] data = decryptedData.split(",");
                    
                    // Add the data to the table model
                    tableModel.addRow(data);
                }
            }
            // Close the reader
            //JOptionPane.showMessageDialog(this, "Data has been retrieved from the file.");
        }

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error reading the file: " + ex.getMessage());
    }
}

     private String decrypt(String encryptedData) {
        try {
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException ex) {
            JOptionPane.showMessageDialog(this, "Error decrypting data: " + ex.getMessage());
            return null;
        }
    }
     
     private void amtOfAllOrders(){
         double sum = 0;
        for(int i = 0; i < orderList.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(orderList.getValueAt(i, 4).toString());
        }
        
        DecimalFormat df = new DecimalFormat("#.00");
        String totalSum = df.format(sum); 
        allOrders.setText(totalSum);
     }
     
    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void txtD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD1ActionPerformed

    private void txtD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD2ActionPerformed

    private void txtD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD3ActionPerformed

    private void txtD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD4ActionPerformed

    private void txtD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtD5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtD5ActionPerformed

    private void txtM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM1ActionPerformed

    private void txtM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM2ActionPerformed

    private void txtM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM3ActionPerformed

    private void txtM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM4ActionPerformed

    private void txtM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM5ActionPerformed

    private void txtS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtS1ActionPerformed

    private void txtS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtS2ActionPerformed

    private void txtS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtS3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtS3ActionPerformed

    private void txtS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtS4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtS4ActionPerformed

    private void txtS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtS5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtS5ActionPerformed

    private void txtB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB1ActionPerformed

    private void txtB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB2ActionPerformed

    private void txtB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB3ActionPerformed

    private void txtB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB4ActionPerformed

    private void txtB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB5ActionPerformed

    private void orderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseClicked
        //initialize the food quantity labels
        txtM1.setText("0"); txtM2.setText("0"); txtM3.setText("0"); txtM4.setText("0"); txtM5.setText("0");
        txtS1.setText("0"); txtS2.setText("0"); txtS3.setText("0"); txtS4.setText("0"); txtS5.setText("0");
        txtD1.setText("0"); txtD2.setText("0"); txtD3.setText("0"); txtD4.setText("0"); txtD5.setText("0");
        txtB1.setText("0"); txtB2.setText("0"); txtB3.setText("0"); txtB4.setText("0"); txtB5.setText("0");
       
        DefaultTableModel tblModel = (DefaultTableModel) orderList.getModel();
        
        String orderNum = tblModel.getValueAt(orderList.getSelectedRow(), 0).toString();
        String name = tblModel.getValueAt(orderList.getSelectedRow(), 1).toString();
        String date = tblModel.getValueAt(orderList.getSelectedRow(), 2).toString();
        String time = tblModel.getValueAt(orderList.getSelectedRow(), 3).toString();
        String total = tblModel.getValueAt(orderList.getSelectedRow(), 4).toString();
        String MoP = tblModel.getValueAt(orderList.getSelectedRow(), 5).toString();
        String m1_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 6).toString();
        String m2_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 7).toString();
        String m3_qtty = tblModel.getValueAt(orderList.getSelectedRow(),8).toString();
        String m4_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 9).toString();
        String m5_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 10).toString();
        String s1_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 11).toString();
        String s2_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 12).toString();
        String s3_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 13).toString();
        String s4_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 14).toString();
        String s5_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 15).toString();
        String d1_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 16).toString();
        String d2_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 17).toString();
        String d3_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 18).toString();
        String d4_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 19).toString();
        String d5_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 20).toString();
        String b1_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 21).toString();
        String b2_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 22).toString();
        String b3_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 23).toString();
        String b4_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 24).toString();
        String b5_qtty = tblModel.getValueAt(orderList.getSelectedRow(), 25).toString();
        String status = tblModel.getValueAt(orderList.getSelectedRow(), 26).toString();
        
        double totalAmt = Double.parseDouble(total);
        double subTotal =  totalAmt / (1+0.12);
        double vat = subTotal * 0.12;
        
        DecimalFormat df = new DecimalFormat("#.00");
        String strSub = df.format(subTotal);
        String strVat = df.format(vat);
        
        lblOrder.setText(orderNum);
        lblName.setText(name);
        lblDate.setText(date);
        lblTime.setText(time);
        lblTotal.setText(total);
        lblMop.setText(MoP);
        lblVat.setText(strVat);
        lblSub.setText(strSub);
        lblStatus.setText(status);
        txtM1.setText(m1_qtty); txtM2.setText(m2_qtty); txtM3.setText(m3_qtty); txtM4.setText(m4_qtty); txtM5.setText(m5_qtty);
        txtS1.setText(s1_qtty); txtS2.setText(s2_qtty); txtS3.setText(s3_qtty); txtS4.setText(s4_qtty); txtS5.setText(s5_qtty);
        txtD1.setText(d1_qtty); txtD2.setText(d2_qtty); txtD3.setText(d3_qtty); txtD4.setText(d4_qtty); txtD5.setText(d5_qtty);
        txtB1.setText(b1_qtty); txtB2.setText(b2_qtty); txtB3.setText(b3_qtty); txtB4.setText(b4_qtty); txtB5.setText(b5_qtty);
    }//GEN-LAST:event_orderListMouseClicked

    private void bttUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttUpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) orderList.getModel();
        
        String currStatus = tblModel.getValueAt(orderList.getSelectedRow(),26).toString();
        if(currStatus.equals("Pending")){
            int a = JOptionPane.showConfirmDialog((Component) null, "Do you want to update status?", "DELETE", JOptionPane.YES_NO_OPTION);
            if (a == 0){
                tblModel.setValueAt("Complete",orderList.getSelectedRow(), 26);
                lblStatus.setText("Complete");
            }
        }else{
            int a = JOptionPane.showConfirmDialog((Component) null, "Do you want to update status?", "DELETE", JOptionPane.YES_NO_OPTION);
            if (a == 0){
                 tblModel.setValueAt("Pending",orderList.getSelectedRow(), 26);
                 lblStatus.setText("Pending");
            }
        }
    }//GEN-LAST:event_bttUpdateActionPerformed

    private void bttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) orderList.getModel();
        
        if (orderList.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (orderList.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please choose one order to be deleted.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            int a = JOptionPane.showConfirmDialog((Component) null, "Do you want to delete order?", "DELETE", JOptionPane.YES_NO_OPTION);
            if(a==0){
                tblModel.removeRow(orderList.getSelectedRow());
                amtOfAllOrders();
                lblOrder.setText(null); lblName.setText(null); lblDate.setText(null); lblTime.setText(null); lblMop.setText(null);
                lblSub.setText(null); lblTotal.setText(null); lblVat.setText(null); lblStatus.setText(null);
                txtM1.setText("0"); txtM2.setText("0"); txtM3.setText("0"); txtM4.setText("0"); txtM5.setText("0");
                txtS1.setText("0"); txtS2.setText("0"); txtS3.setText("0"); txtS4.setText("0"); txtS5.setText("0");
                txtD1.setText("0"); txtD2.setText("0"); txtD3.setText("0"); txtD4.setText("0"); txtD5.setText("0");
                txtB1.setText("0"); txtB2.setText("0"); txtB3.setText("0"); txtB4.setText("0"); txtB5.setText("0");
            }
        }
    }//GEN-LAST:event_bttnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.pack();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayAllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allOrders;
    private javax.swing.JButton bttUpdate;
    private javax.swing.JButton bttnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMop;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVat;
    public javax.swing.JTable orderList;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtD1;
    private javax.swing.JTextField txtD2;
    private javax.swing.JTextField txtD3;
    private javax.swing.JTextField txtD4;
    private javax.swing.JTextField txtD5;
    private javax.swing.JTextField txtM1;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM3;
    private javax.swing.JTextField txtM4;
    private javax.swing.JTextField txtM5;
    private javax.swing.JTextField txtS1;
    private javax.swing.JTextField txtS2;
    private javax.swing.JTextField txtS3;
    private javax.swing.JTextField txtS4;
    private javax.swing.JTextField txtS5;
    // End of variables declaration//GEN-END:variables
}
