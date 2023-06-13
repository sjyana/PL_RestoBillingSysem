
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author julia
 */
public final class AddOrder extends javax.swing.JFrame {
  
    private int M1_qtty = 0; private int M2_qtty = 0; private int M3_qtty = 0; private int M4_qtty = 0; private int M5_qtty = 0;
    private int S1_qtty = 0; private int S2_qtty = 0; private int S3_qtty = 0; private int S4_qtty = 0; private int S5_qtty = 0;
    private int D1_qtty = 0; private int D2_qtty = 0; private int D3_qtty = 0; private int D4_qtty = 0; private int D5_qtty = 0;
    private int B1_qtty = 0; private int B2_qtty = 0; private int B3_qtty = 0; private int B4_qtty = 0; private int B5_qtty = 0;
    private double totalAmount = 0;
    
    public AddOrder() {
        initComponents();
        showDate();
        showTime();
        
    }

      void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }
        }
        ).start();   
    }
    
    int checkTable(String currCode, int qtty, int amt, ImageIcon image, String price, String Foodqtty, String totalAmt) {
        DefaultTableModel tblModel = (DefaultTableModel) ordersTable.getModel();
        ordersTable.getColumnModel().getColumn(1).setCellRenderer(new ImageCellRenderer());

        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String code = String.valueOf(ordersTable.getValueAt(i, 0));
            if (currCode.equals(code)) {
                int new_qtty = Integer.parseInt((String) tblModel.getValueAt(i, 3)) + qtty;
                int new_total = (Integer.parseInt(price) * new_qtty);
                tblModel.setValueAt(String.valueOf(new_qtty), i, 3);
                tblModel.setValueAt(String.valueOf(new_total), i, 4);
                tblModel.fireTableDataChanged();
                if(totalAmount >= 0){
                    DecimalFormat df = new DecimalFormat("#.00");
                    totalAmount = totalAmount + new_total;
                    String strTtlAmt = df.format(totalAmount);
                    lblTotal.setText("" + strTtlAmt);
                }
               
                return new_qtty;
            }
        }

        Object[] tbData = {currCode, image, price, Foodqtty, totalAmt};
        tblModel.addRow(tbData);
        if(totalAmount >= 0){
            DecimalFormat df = new DecimalFormat("#.00");
            totalAmount = totalAmount + Integer.parseInt(totalAmt);
            String strTtlAmt = df.format(totalAmount);
            lblTotal.setText("" + strTtlAmt);
        }
        
        return Integer.parseInt(Foodqtty);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        dishPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        foodMain = new javax.swing.JPanel();
        pic_main1 = new javax.swing.JLabel();
        price_main1 = new javax.swing.JLabel();
        nameMain1 = new javax.swing.JLabel();
        desc_main = new javax.swing.JLabel();
        qtty_main1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addBttn_main = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodMain1 = new javax.swing.JPanel();
        pic_main2 = new javax.swing.JLabel();
        price_main2 = new javax.swing.JLabel();
        nameMain2 = new javax.swing.JLabel();
        qtty_main2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addBttn_main1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        desc_main5 = new javax.swing.JLabel();
        foodMain2 = new javax.swing.JPanel();
        pic_main3 = new javax.swing.JLabel();
        price_main3 = new javax.swing.JLabel();
        nameMain3 = new javax.swing.JLabel();
        addBttn_main6 = new javax.swing.JLabel();
        qtty_main3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        desc_main6 = new javax.swing.JLabel();
        foodMain3 = new javax.swing.JPanel();
        pic_main4 = new javax.swing.JLabel();
        price_main4 = new javax.swing.JLabel();
        nameMain4 = new javax.swing.JLabel();
        qtty_main4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addBttn_main3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        desc_main7 = new javax.swing.JLabel();
        foodMain4 = new javax.swing.JPanel();
        pic_main5 = new javax.swing.JLabel();
        price_main5 = new javax.swing.JLabel();
        nameMain5 = new javax.swing.JLabel();
        qtty_main5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addBttn_main4 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        desc_main8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sidePanel2 = new javax.swing.JPanel();
        foodSides6 = new javax.swing.JPanel();
        pic_side1 = new javax.swing.JLabel();
        nameSide16 = new javax.swing.JLabel();
        desc_side16 = new javax.swing.JLabel();
        qtty_side1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        price_side01 = new javax.swing.JLabel();
        addBttn_side1 = new javax.swing.JLabel();
        foodSides1 = new javax.swing.JPanel();
        pic_side2 = new javax.swing.JLabel();
        nameSide1 = new javax.swing.JLabel();
        qtty_side2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        addBttn_side2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        price_side2 = new javax.swing.JLabel();
        desc_side17 = new javax.swing.JLabel();
        foodSides2 = new javax.swing.JPanel();
        pic_side3 = new javax.swing.JLabel();
        nameSide2 = new javax.swing.JLabel();
        qtty_side3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        addBttn_side3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        price_side3 = new javax.swing.JLabel();
        desc_side18 = new javax.swing.JLabel();
        foodSides3 = new javax.swing.JPanel();
        pic_side4 = new javax.swing.JLabel();
        nameSide3 = new javax.swing.JLabel();
        qtty_side4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        addBttn_side4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price_side4 = new javax.swing.JLabel();
        desc_side19 = new javax.swing.JLabel();
        foodSides4 = new javax.swing.JPanel();
        pic_side5 = new javax.swing.JLabel();
        nameSide4 = new javax.swing.JLabel();
        qtty_side5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        addBttn_side5 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        price_side5 = new javax.swing.JLabel();
        desc_side20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dessertPanel = new javax.swing.JPanel();
        foodDessert2 = new javax.swing.JPanel();
        pic_dessert2 = new javax.swing.JLabel();
        price_dessert2 = new javax.swing.JLabel();
        nameSide5 = new javax.swing.JLabel();
        addBttn_dessert2 = new javax.swing.JLabel();
        qtty_dessert2 = new javax.swing.JTextField();
        desc_side2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        foodDessert = new javax.swing.JPanel();
        pic_dessert1 = new javax.swing.JLabel();
        price_dessert1 = new javax.swing.JLabel();
        nameSide6 = new javax.swing.JLabel();
        desc_side1 = new javax.swing.JLabel();
        qtty_dessert1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        addBttn_dessert1 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        foodDessert3 = new javax.swing.JPanel();
        pic_dessert3 = new javax.swing.JLabel();
        price_dessert3 = new javax.swing.JLabel();
        nameSide7 = new javax.swing.JLabel();
        qtty_dessert3 = new javax.swing.JTextField();
        addBttn_dessert3 = new javax.swing.JLabel();
        desc_side3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        foodDessert4 = new javax.swing.JPanel();
        pic_dessert4 = new javax.swing.JLabel();
        price_dessert4 = new javax.swing.JLabel();
        nameSide8 = new javax.swing.JLabel();
        qtty_dessert4 = new javax.swing.JTextField();
        addBttn_dessert4 = new javax.swing.JLabel();
        desc_side4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        foodDessert5 = new javax.swing.JPanel();
        pic_dessert5 = new javax.swing.JLabel();
        price_dessert5 = new javax.swing.JLabel();
        nameSide9 = new javax.swing.JLabel();
        qtty_dessert5 = new javax.swing.JTextField();
        addBttn_dessert5 = new javax.swing.JLabel();
        desc_side5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        beveragePanel = new javax.swing.JPanel();
        foodBev1 = new javax.swing.JPanel();
        pic_bev1 = new javax.swing.JLabel();
        price_bev1 = new javax.swing.JLabel();
        nameSide10 = new javax.swing.JLabel();
        qtty_bev1 = new javax.swing.JTextField();
        addBttn_bev1 = new javax.swing.JLabel();
        desc_side15 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        foodBev2 = new javax.swing.JPanel();
        pic_bev2 = new javax.swing.JLabel();
        price_bev2 = new javax.swing.JLabel();
        nameSide11 = new javax.swing.JLabel();
        qtty_bev2 = new javax.swing.JTextField();
        addBttn_bev2 = new javax.swing.JLabel();
        desc_side21 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        foodBev3 = new javax.swing.JPanel();
        pic_bev3 = new javax.swing.JLabel();
        price_bev3 = new javax.swing.JLabel();
        nameSide12 = new javax.swing.JLabel();
        qtty_bev3 = new javax.swing.JTextField();
        addBttn_bev3 = new javax.swing.JLabel();
        desc_side22 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        foodBev4 = new javax.swing.JPanel();
        pic_bev4 = new javax.swing.JLabel();
        price_bev4 = new javax.swing.JLabel();
        nameSide13 = new javax.swing.JLabel();
        qtty_bev4 = new javax.swing.JTextField();
        addBttn_bev4 = new javax.swing.JLabel();
        desc_side23 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        foodBev5 = new javax.swing.JPanel();
        pic_bev5 = new javax.swing.JLabel();
        price_bev5 = new javax.swing.JLabel();
        nameSide14 = new javax.swing.JLabel();
        qtty_bev5 = new javax.swing.JTextField();
        addBttn_bev5 = new javax.swing.JLabel();
        desc_side24 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        cartPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        proceed = new javax.swing.JButton();
        deleteOrder = new javax.swing.JButton();
        beverage1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        main = new javax.swing.JLabel();
        sides = new javax.swing.JLabel();
        dessert = new javax.swing.JLabel();
        beverage = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 216, 188));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 241, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        date.setText("date");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, 27));

        time.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        time.setText("time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 100, 27));

        dishPanel.setBackground(new java.awt.Color(255, 204, 204));
        dishPanel.setLayout(new javax.swing.OverlayLayout(dishPanel));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        mainPanel.setBackground(new java.awt.Color(241, 247, 251));

        foodMain.setBackground(new java.awt.Color(247, 236, 240));
        foodMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        foodMain.setToolTipText("");

        pic_main1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/pan fried salmon.png"))); // NOI18N
        pic_main1.setPreferredSize(new Dimension(245, 180));

        price_main1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_main1.setForeground(new java.awt.Color(51, 51, 51));
        price_main1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        price_main1.setText("220");
        price_main1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        price_main1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        nameMain1.setBackground(new java.awt.Color(51, 51, 51));
        nameMain1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameMain1.setForeground(new java.awt.Color(51, 51, 51));
        nameMain1.setText("Pan Fried Salmon");

        desc_main.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        desc_main.setForeground(new java.awt.Color(51, 51, 51));
        desc_main.setText("M1");

        qtty_main1.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_main1.setForeground(new java.awt.Color(251, 101, 99));
        qtty_main1.setText("0");

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Quantity");

        addBttn_main.setBackground(new java.awt.Color(251, 101, 99));
        addBttn_main.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_main.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_main.setText("Add");
        addBttn_main.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_main.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_main.setOpaque(true);
        addBttn_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_mainMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Price");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout foodMainLayout = new javax.swing.GroupLayout(foodMain);
        foodMain.setLayout(foodMainLayout);
        foodMainLayout.setHorizontalGroup(
            foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_main1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodMainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodMainLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtty_main1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(addBttn_main, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                            .addGroup(foodMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(price_main1)
                                .addGap(17, 17, 17)))
                        .addContainerGap())
                    .addGroup(foodMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc_main, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        foodMainLayout.setVerticalGroup(
            foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodMainLayout.createSequentialGroup()
                .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic_main1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(foodMainLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(price_main1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameMain1))
                        .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desc_main)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(foodMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtty_main1)))
                            .addGroup(foodMainLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(addBttn_main, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        foodMain1.setBackground(new java.awt.Color(247, 236, 240));
        foodMain1.setToolTipText("");
        foodMain1.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_main2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/crissy baked chicken.png"))); // NOI18N

        price_main2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_main2.setForeground(new java.awt.Color(51, 51, 51));
        price_main2.setText("160");

        nameMain2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameMain2.setForeground(new java.awt.Color(51, 51, 51));
        nameMain2.setText("Crispy Baked Chicken");

        qtty_main2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_main2.setForeground(new java.awt.Color(251, 101, 99));
        qtty_main2.setText("0");

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Quantity");

        addBttn_main1.setBackground(new java.awt.Color(251, 101, 99));
        addBttn_main1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_main1.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_main1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_main1.setText("Add");
        addBttn_main1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_main1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_main1.setOpaque(true);
        addBttn_main1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_main1MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Price");

        desc_main5.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        desc_main5.setForeground(new java.awt.Color(51, 51, 51));
        desc_main5.setText("M2");

        javax.swing.GroupLayout foodMain1Layout = new javax.swing.GroupLayout(foodMain1);
        foodMain1.setLayout(foodMain1Layout);
        foodMain1Layout.setHorizontalGroup(
            foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_main2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodMain1Layout.createSequentialGroup()
                        .addComponent(nameMain2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_main2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(foodMain1Layout.createSequentialGroup()
                        .addGroup(foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodMain1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtty_main2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(desc_main5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_main1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodMain1Layout.setVerticalGroup(
            foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic_main2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addGroup(foodMain1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameMain2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(price_main2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_main5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(foodMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBttn_main1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtty_main2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap())
        );

        foodMain2.setBackground(new java.awt.Color(247, 236, 240));
        foodMain2.setToolTipText("");
        foodMain2.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_main3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/teriyaki chicken bowl.png"))); // NOI18N

        price_main3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_main3.setForeground(new java.awt.Color(51, 51, 51));
        price_main3.setText("180");

        nameMain3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameMain3.setForeground(new java.awt.Color(51, 51, 51));
        nameMain3.setText("Teriyaki Chicken Bowl");
        nameMain3.setMaximumSize(new java.awt.Dimension(142, 23));
        nameMain3.setMinimumSize(new java.awt.Dimension(142, 23));
        nameMain3.setPreferredSize(new java.awt.Dimension(142, 23));

        addBttn_main6.setBackground(new java.awt.Color(251, 101, 99));
        addBttn_main6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_main6.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_main6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_main6.setText("Add");
        addBttn_main6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_main6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_main6.setOpaque(true);
        addBttn_main6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_main6MouseClicked(evt);
            }
        });

        qtty_main3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_main3.setForeground(new java.awt.Color(251, 101, 99));
        qtty_main3.setText("0");

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Quantity");

        jLabel12.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Price");

        desc_main6.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        desc_main6.setForeground(new java.awt.Color(51, 51, 51));
        desc_main6.setText("M3");

        javax.swing.GroupLayout foodMain2Layout = new javax.swing.GroupLayout(foodMain2);
        foodMain2.setLayout(foodMain2Layout);
        foodMain2Layout.setHorizontalGroup(
            foodMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_main3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodMain2Layout.createSequentialGroup()
                        .addComponent(nameMain3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_main3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(foodMain2Layout.createSequentialGroup()
                        .addComponent(desc_main6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodMain2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_main3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_main6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodMain2Layout.setVerticalGroup(
            foodMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(foodMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameMain3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(price_main3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc_main6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(foodMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(qtty_main3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBttn_main6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addComponent(pic_main3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        foodMain3.setBackground(new java.awt.Color(247, 236, 240));
        foodMain3.setToolTipText("");
        foodMain3.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_main4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/golden shrimp.png"))); // NOI18N

        price_main4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_main4.setForeground(new java.awt.Color(51, 51, 51));
        price_main4.setText("200");

        nameMain4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameMain4.setForeground(new java.awt.Color(51, 51, 51));
        nameMain4.setText("Golden Shrimp");

        qtty_main4.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_main4.setForeground(new java.awt.Color(251, 101, 99));
        qtty_main4.setText("0");

        jLabel10.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Quantity");

        addBttn_main3.setBackground(new java.awt.Color(251, 101, 99));
        addBttn_main3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_main3.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_main3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_main3.setText("Add");
        addBttn_main3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_main3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_main3.setOpaque(true);
        addBttn_main3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_main3MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Price");

        desc_main7.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        desc_main7.setForeground(new java.awt.Color(51, 51, 51));
        desc_main7.setText("M4");

        javax.swing.GroupLayout foodMain3Layout = new javax.swing.GroupLayout(foodMain3);
        foodMain3.setLayout(foodMain3Layout);
        foodMain3Layout.setHorizontalGroup(
            foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_main4)
                .addGap(12, 12, 12)
                .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodMain3Layout.createSequentialGroup()
                        .addComponent(desc_main7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodMain3Layout.createSequentialGroup()
                        .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, foodMain3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtty_main4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameMain4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodMain3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(price_main4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addBttn_main3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        foodMain3Layout.setVerticalGroup(
            foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic_main4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(foodMain3Layout.createSequentialGroup()
                        .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(price_main4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(nameMain4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_main7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBttn_main3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodMain3Layout.createSequentialGroup()
                                .addGroup(foodMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(qtty_main4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)))))
                .addContainerGap())
        );

        foodMain4.setBackground(new java.awt.Color(247, 236, 240));
        foodMain4.setToolTipText("");
        foodMain4.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_main5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/stuffed chicken breast.png"))); // NOI18N

        price_main5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_main5.setForeground(new java.awt.Color(51, 51, 51));
        price_main5.setText("190");

        nameMain5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameMain5.setForeground(new java.awt.Color(51, 51, 51));
        nameMain5.setText("Stuffed Chicken Breast");

        qtty_main5.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_main5.setForeground(new java.awt.Color(251, 101, 99));
        qtty_main5.setText("0");

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Quantity");

        addBttn_main4.setBackground(new java.awt.Color(251, 101, 99));
        addBttn_main4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_main4.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_main4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_main4.setText("Add");
        addBttn_main4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_main4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_main4.setOpaque(true);
        addBttn_main4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_main4MouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Price");

        desc_main8.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        desc_main8.setForeground(new java.awt.Color(51, 51, 51));
        desc_main8.setText("M5");

        javax.swing.GroupLayout foodMain4Layout = new javax.swing.GroupLayout(foodMain4);
        foodMain4.setLayout(foodMain4Layout);
        foodMain4Layout.setHorizontalGroup(
            foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_main5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodMain4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_main5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_main4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodMain4Layout.createSequentialGroup()
                        .addGroup(foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodMain4Layout.createSequentialGroup()
                                .addComponent(nameMain5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(foodMain4Layout.createSequentialGroup()
                                .addComponent(desc_main8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price_main5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodMain4Layout.setVerticalGroup(
            foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodMain4Layout.createSequentialGroup()
                .addGroup(foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodMain4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(price_main5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(foodMain4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameMain5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_main8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtty_main5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(addBttn_main4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(foodMain4Layout.createSequentialGroup()
                .addComponent(pic_main5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foodMain4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodMain3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodMain2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(foodMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodMain2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodMain3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodMain4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(mainPanel);

        dishPanel.add(jScrollPane2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        sidePanel2.setBackground(new java.awt.Color(241, 247, 251));

        foodSides6.setBackground(new java.awt.Color(243, 236, 215));
        foodSides6.setToolTipText("");
        foodSides6.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_side1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/French fries with aoili.png"))); // NOI18N

        nameSide16.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide16.setForeground(new java.awt.Color(51, 51, 51));
        nameSide16.setText("French Fries with Aioli");

        desc_side16.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side16.setForeground(new java.awt.Color(51, 51, 51));
        desc_side16.setText("S1");

        qtty_side1.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_side1.setForeground(new java.awt.Color(174, 142, 49));
        qtty_side1.setText("0");

        jLabel46.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Price");

        price_side01.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_side01.setForeground(new java.awt.Color(51, 51, 51));
        price_side01.setText("80");

        addBttn_side1.setBackground(new java.awt.Color(201, 166, 65));
        addBttn_side1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_side1.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_side1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_side1.setText("Add");
        addBttn_side1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_side1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_side1.setOpaque(true);
        addBttn_side1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_side1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout foodSides6Layout = new javax.swing.GroupLayout(foodSides6);
        foodSides6.setLayout(foodSides6Layout);
        foodSides6Layout.setHorizontalGroup(
            foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_side1)
                .addGap(12, 12, 12)
                .addGroup(foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSides6Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_side1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_side1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodSides6Layout.createSequentialGroup()
                        .addComponent(nameSide16, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_side01, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(foodSides6Layout.createSequentialGroup()
                        .addComponent(desc_side16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        foodSides6Layout.setVerticalGroup(
            foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSides6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(price_side01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodSides6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desc_side16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(foodSides6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addBttn_side1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46)
                                    .addComponent(qtty_side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(foodSides6Layout.createSequentialGroup()
                        .addComponent(pic_side1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        foodSides1.setBackground(new java.awt.Color(243, 236, 215));
        foodSides1.setToolTipText("");
        foodSides1.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_side2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Sautee Collard Greens.png"))); // NOI18N

        nameSide1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide1.setForeground(new java.awt.Color(51, 51, 51));
        nameSide1.setText("Collard Greens");

        qtty_side2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_side2.setForeground(new java.awt.Color(174, 142, 49));
        qtty_side2.setText("0");

        jLabel15.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Quantity");

        addBttn_side2.setBackground(new java.awt.Color(201, 166, 65));
        addBttn_side2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_side2.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_side2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_side2.setText("Add");
        addBttn_side2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_side2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_side2.setOpaque(true);
        addBttn_side2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_side2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Price");

        price_side2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_side2.setForeground(new java.awt.Color(51, 51, 51));
        price_side2.setText("60");

        desc_side17.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side17.setForeground(new java.awt.Color(51, 51, 51));
        desc_side17.setText("S2");

        javax.swing.GroupLayout foodSides1Layout = new javax.swing.GroupLayout(foodSides1);
        foodSides1.setLayout(foodSides1Layout);
        foodSides1Layout.setHorizontalGroup(
            foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_side2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desc_side17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSide1)
                    .addGroup(foodSides1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_side2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_side2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(addBttn_side2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        foodSides1Layout.setVerticalGroup(
            foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides1Layout.createSequentialGroup()
                .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic_side2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(foodSides1Layout.createSequentialGroup()
                        .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodSides1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(price_side2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameSide1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(foodSides1Layout.createSequentialGroup()
                                .addComponent(desc_side17)
                                .addGap(54, 54, 54))
                            .addGroup(foodSides1Layout.createSequentialGroup()
                                .addGroup(foodSides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qtty_side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(addBttn_side2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))))
                .addGap(26, 26, 26))
        );

        foodSides2.setBackground(new java.awt.Color(243, 236, 215));
        foodSides2.setToolTipText("");
        foodSides2.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_side3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Chipotle Mashed Potatoes.png"))); // NOI18N

        nameSide2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide2.setForeground(new java.awt.Color(51, 51, 51));
        nameSide2.setText("Chipotle Mashed Potatoes");

        qtty_side3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_side3.setForeground(new java.awt.Color(174, 142, 49));
        qtty_side3.setText("0");

        jLabel17.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Quantity");

        addBttn_side3.setBackground(new java.awt.Color(201, 166, 65));
        addBttn_side3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_side3.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_side3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_side3.setText("Add");
        addBttn_side3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_side3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_side3.setOpaque(true);
        addBttn_side3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_side3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Price");

        price_side3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_side3.setForeground(new java.awt.Color(51, 51, 51));
        price_side3.setText("75");

        desc_side18.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side18.setForeground(new java.awt.Color(51, 51, 51));
        desc_side18.setText("S3");

        javax.swing.GroupLayout foodSides2Layout = new javax.swing.GroupLayout(foodSides2);
        foodSides2.setLayout(foodSides2Layout);
        foodSides2Layout.setHorizontalGroup(
            foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_side3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_side3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_side3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(foodSides2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desc_side18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(foodSides2Layout.createSequentialGroup()
                                .addComponent(nameSide2)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price_side3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))))
        );
        foodSides2Layout.setVerticalGroup(
            foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic_side3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addGroup(foodSides2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price_side3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameSide2)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side18)
                        .addGap(14, 14, 14)
                        .addGroup(foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBttn_side3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(foodSides2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(foodSides2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(qtty_side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        foodSides3.setBackground(new java.awt.Color(243, 236, 215));
        foodSides3.setToolTipText("");
        foodSides3.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_side4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Pesto Pasta Salad.png"))); // NOI18N

        nameSide3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide3.setForeground(new java.awt.Color(51, 51, 51));
        nameSide3.setText("Pesto Pasta Salad");

        qtty_side4.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_side4.setForeground(new java.awt.Color(174, 142, 49));
        qtty_side4.setText("0");

        jLabel19.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Quantity");

        addBttn_side4.setBackground(new java.awt.Color(201, 166, 65));
        addBttn_side4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_side4.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_side4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_side4.setText("Add");
        addBttn_side4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_side4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_side4.setOpaque(true);
        addBttn_side4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_side4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Price");

        price_side4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_side4.setForeground(new java.awt.Color(51, 51, 51));
        price_side4.setText("90");

        desc_side19.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side19.setForeground(new java.awt.Color(51, 51, 51));
        desc_side19.setText("S4");

        javax.swing.GroupLayout foodSides3Layout = new javax.swing.GroupLayout(foodSides3);
        foodSides3.setLayout(foodSides3Layout);
        foodSides3Layout.setHorizontalGroup(
            foodSides3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_side4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodSides3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSides3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_side4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_side4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodSides3Layout.createSequentialGroup()
                        .addComponent(desc_side19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodSides3Layout.createSequentialGroup()
                        .addComponent(nameSide3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_side4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        foodSides3Layout.setVerticalGroup(
            foodSides3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodSides3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodSides3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(foodSides3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(price_side4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(desc_side19)
                        .addGap(17, 17, 17)
                        .addGroup(foodSides3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtty_side4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pic_side4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addGroup(foodSides3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBttn_side4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        foodSides4.setBackground(new java.awt.Color(243, 236, 215));
        foodSides4.setToolTipText("");
        foodSides4.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_side5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Steamed rice.png"))); // NOI18N

        nameSide4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide4.setForeground(new java.awt.Color(51, 51, 51));
        nameSide4.setText("Steamed Rice");

        qtty_side5.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_side5.setForeground(new java.awt.Color(174, 142, 49));
        qtty_side5.setText("0");

        jLabel21.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Quantity");

        addBttn_side5.setBackground(new java.awt.Color(201, 166, 65));
        addBttn_side5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_side5.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_side5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_side5.setText("Add");
        addBttn_side5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_side5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_side5.setOpaque(true);
        addBttn_side5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_side5MouseClicked(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Price");

        price_side5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_side5.setForeground(new java.awt.Color(51, 51, 51));
        price_side5.setText("35");

        desc_side20.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side20.setForeground(new java.awt.Color(51, 51, 51));
        desc_side20.setText("S5");

        javax.swing.GroupLayout foodSides4Layout = new javax.swing.GroupLayout(foodSides4);
        foodSides4.setLayout(foodSides4Layout);
        foodSides4Layout.setHorizontalGroup(
            foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_side5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameSide4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(foodSides4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(desc_side20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSides4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBttn_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        foodSides4Layout.setVerticalGroup(
            foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSides4Layout.createSequentialGroup()
                .addGroup(foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSides4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(price_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameSide4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc_side20)
                .addGroup(foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSides4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(foodSides4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtty_side5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodSides4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(foodSides4Layout.createSequentialGroup()
                .addComponent(pic_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidePanel2Layout = new javax.swing.GroupLayout(sidePanel2);
        sidePanel2.setLayout(sidePanel2Layout);
        sidePanel2Layout.setHorizontalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foodSides4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodSides3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodSides2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodSides1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodSides6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        sidePanel2Layout.setVerticalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(foodSides6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodSides1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodSides2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodSides3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodSides4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(sidePanel2);

        dishPanel.add(jScrollPane3);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        dessertPanel.setBackground(new java.awt.Color(241, 247, 251));

        foodDessert2.setBackground(new java.awt.Color(235, 219, 218));
        foodDessert2.setToolTipText("");
        foodDessert2.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_dessert2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/cheesecake w berries.png"))); // NOI18N

        price_dessert2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_dessert2.setForeground(new java.awt.Color(51, 51, 51));
        price_dessert2.setText("90");

        nameSide5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide5.setForeground(new java.awt.Color(51, 51, 51));
        nameSide5.setText("Cheesecake with Berries");

        addBttn_dessert2.setBackground(new java.awt.Color(166, 93, 88));
        addBttn_dessert2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_dessert2.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_dessert2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_dessert2.setText("Add");
        addBttn_dessert2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_dessert2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_dessert2.setOpaque(true);
        addBttn_dessert2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_dessert2MouseClicked(evt);
            }
        });

        qtty_dessert2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_dessert2.setForeground(new java.awt.Color(189, 131, 135));
        qtty_dessert2.setText("0");

        desc_side2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side2.setForeground(new java.awt.Color(51, 51, 51));
        desc_side2.setText("D2");

        jLabel26.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Quantity");

        jLabel45.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Price");

        javax.swing.GroupLayout foodDessert2Layout = new javax.swing.GroupLayout(foodDessert2);
        foodDessert2.setLayout(foodDessert2Layout);
        foodDessert2Layout.setHorizontalGroup(
            foodDessert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDessert2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_dessert2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodDessert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodDessert2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodDessert2Layout.createSequentialGroup()
                        .addComponent(nameSide5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(desc_side2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        foodDessert2Layout.setVerticalGroup(
            foodDessert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodDessert2Layout.createSequentialGroup()
                .addGroup(foodDessert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic_dessert2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(foodDessert2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(foodDessert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(price_dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(foodDessert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBttn_dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtty_dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))))
                .addContainerGap())
        );

        foodDessert.setBackground(new java.awt.Color(235, 219, 218));
        foodDessert.setToolTipText("");
        foodDessert.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_dessert1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/tiramisu.png"))); // NOI18N

        price_dessert1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_dessert1.setForeground(new java.awt.Color(51, 51, 51));
        price_dessert1.setText("100");

        nameSide6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide6.setForeground(new java.awt.Color(51, 51, 51));
        nameSide6.setText("Tiramisu");

        desc_side1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side1.setForeground(new java.awt.Color(51, 51, 51));
        desc_side1.setText("D1");

        qtty_dessert1.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_dessert1.setForeground(new java.awt.Color(189, 131, 135));
        qtty_dessert1.setText("0");

        jLabel25.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Quantity");

        addBttn_dessert1.setBackground(new java.awt.Color(166, 93, 88));
        addBttn_dessert1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_dessert1.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_dessert1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_dessert1.setText("Add");
        addBttn_dessert1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_dessert1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_dessert1.setOpaque(true);
        addBttn_dessert1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_dessert1MouseClicked(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("Price");

        javax.swing.GroupLayout foodDessertLayout = new javax.swing.GroupLayout(foodDessert);
        foodDessert.setLayout(foodDessertLayout);
        foodDessertLayout.setHorizontalGroup(
            foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDessertLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_dessert1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodDessertLayout.createSequentialGroup()
                        .addGroup(foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodDessertLayout.createSequentialGroup()
                                .addComponent(nameSide6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(desc_side1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(foodDessertLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodDessertLayout.setVerticalGroup(
            foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodDessertLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(price_dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameSide6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodDessertLayout.createSequentialGroup()
                        .addComponent(desc_side1)
                        .addGap(18, 18, 18)
                        .addGroup(foodDessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(qtty_dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addBttn_dessert1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addComponent(pic_dessert1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        foodDessert3.setBackground(new java.awt.Color(235, 219, 218));
        foodDessert3.setToolTipText("");
        foodDessert3.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_dessert3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Creme caramel.png"))); // NOI18N

        price_dessert3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_dessert3.setForeground(new java.awt.Color(51, 51, 51));
        price_dessert3.setText("80");

        nameSide7.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide7.setForeground(new java.awt.Color(51, 51, 51));
        nameSide7.setText("Creme Caramel");

        qtty_dessert3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_dessert3.setForeground(new java.awt.Color(189, 131, 135));
        qtty_dessert3.setText("0");

        addBttn_dessert3.setBackground(new java.awt.Color(166, 93, 88));
        addBttn_dessert3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_dessert3.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_dessert3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_dessert3.setText("Add");
        addBttn_dessert3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_dessert3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_dessert3.setOpaque(true);
        addBttn_dessert3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_dessert3MouseClicked(evt);
            }
        });

        desc_side3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side3.setForeground(new java.awt.Color(51, 51, 51));
        desc_side3.setText("D3");

        jLabel27.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Quantity");

        jLabel48.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Price");

        javax.swing.GroupLayout foodDessert3Layout = new javax.swing.GroupLayout(foodDessert3);
        foodDessert3.setLayout(foodDessert3Layout);
        foodDessert3Layout.setHorizontalGroup(
            foodDessert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDessert3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_dessert3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodDessert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodDessert3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodDessert3Layout.createSequentialGroup()
                        .addComponent(desc_side3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodDessert3Layout.createSequentialGroup()
                        .addComponent(nameSide7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        foodDessert3Layout.setVerticalGroup(
            foodDessert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDessert3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodDessert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic_dessert3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addGroup(foodDessert3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(foodDessert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addComponent(price_dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(foodDessert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBttn_dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtty_dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addContainerGap())
        );

        foodDessert4.setBackground(new java.awt.Color(235, 219, 218));
        foodDessert4.setToolTipText("");
        foodDessert4.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_dessert4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Blackberry pie.png"))); // NOI18N

        price_dessert4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_dessert4.setForeground(new java.awt.Color(51, 51, 51));
        price_dessert4.setText("85");

        nameSide8.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide8.setForeground(new java.awt.Color(51, 51, 51));
        nameSide8.setText("Blackberry Pie");

        qtty_dessert4.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_dessert4.setForeground(new java.awt.Color(189, 131, 135));
        qtty_dessert4.setText("0");

        addBttn_dessert4.setBackground(new java.awt.Color(166, 93, 88));
        addBttn_dessert4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_dessert4.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_dessert4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_dessert4.setText("Add");
        addBttn_dessert4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_dessert4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_dessert4.setOpaque(true);
        addBttn_dessert4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_dessert4MouseClicked(evt);
            }
        });

        desc_side4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side4.setForeground(new java.awt.Color(51, 51, 51));
        desc_side4.setText("D4");

        jLabel28.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Quantity");

        jLabel49.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Price");

        javax.swing.GroupLayout foodDessert4Layout = new javax.swing.GroupLayout(foodDessert4);
        foodDessert4.setLayout(foodDessert4Layout);
        foodDessert4Layout.setHorizontalGroup(
            foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDessert4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_dessert4)
                .addGap(12, 12, 12)
                .addGroup(foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desc_side4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(foodDessert4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameSide8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodDessert4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodDessert4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(addBttn_dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(368, 368, 368))
        );
        foodDessert4Layout.setVerticalGroup(
            foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodDessert4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic_dessert4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(foodDessert4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))
                        .addGroup(foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodDessert4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(desc_side4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(foodDessert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(qtty_dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(foodDessert4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(addBttn_dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
        );

        foodDessert5.setBackground(new java.awt.Color(235, 219, 218));
        foodDessert5.setToolTipText("");
        foodDessert5.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_dessert5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/Red Velvet cake.png"))); // NOI18N

        price_dessert5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_dessert5.setForeground(new java.awt.Color(51, 51, 51));
        price_dessert5.setText("90");

        nameSide9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide9.setForeground(new java.awt.Color(51, 51, 51));
        nameSide9.setText("Red Velvet Cake");

        qtty_dessert5.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_dessert5.setForeground(new java.awt.Color(189, 131, 135));
        qtty_dessert5.setText("0");

        addBttn_dessert5.setBackground(new java.awt.Color(166, 93, 88));
        addBttn_dessert5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_dessert5.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_dessert5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_dessert5.setText("Add");
        addBttn_dessert5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_dessert5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_dessert5.setOpaque(true);
        addBttn_dessert5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_dessert5MouseClicked(evt);
            }
        });

        desc_side5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side5.setForeground(new java.awt.Color(51, 51, 51));
        desc_side5.setText("D5");

        jLabel29.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Quantity");

        jLabel50.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("Price");

        javax.swing.GroupLayout foodDessert5Layout = new javax.swing.GroupLayout(foodDessert5);
        foodDessert5.setLayout(foodDessert5Layout);
        foodDessert5Layout.setHorizontalGroup(
            foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodDessert5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_dessert5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodDessert5Layout.createSequentialGroup()
                        .addComponent(nameSide9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_dessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(foodDessert5Layout.createSequentialGroup()
                        .addComponent(desc_side5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodDessert5Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_dessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_dessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodDessert5Layout.setVerticalGroup(
            foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodDessert5Layout.createSequentialGroup()
                .addGroup(foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodDessert5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(price_dessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodDessert5Layout.createSequentialGroup()
                                .addComponent(desc_side5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(foodDessert5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(qtty_dessert5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodDessert5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addBttn_dessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pic_dessert5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout dessertPanelLayout = new javax.swing.GroupLayout(dessertPanel);
        dessertPanel.setLayout(dessertPanelLayout);
        dessertPanelLayout.setHorizontalGroup(
            dessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessertPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(dessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodDessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodDessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodDessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodDessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        dessertPanelLayout.setVerticalGroup(
            dessertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessertPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(foodDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodDessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodDessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodDessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodDessert5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(dessertPanel);

        dishPanel.add(jScrollPane4);

        jScrollPane5.setBackground(new java.awt.Color(241, 247, 251));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        beveragePanel.setBackground(new java.awt.Color(226, 227, 227));

        foodBev1.setBackground(new java.awt.Color(231, 234, 218));
        foodBev1.setToolTipText("");
        foodBev1.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_bev1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/soda water.png"))); // NOI18N

        price_bev1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_bev1.setForeground(new java.awt.Color(51, 51, 51));
        price_bev1.setText("30");

        nameSide10.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide10.setForeground(new java.awt.Color(51, 51, 51));
        nameSide10.setText("Soda Water");

        qtty_bev1.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_bev1.setForeground(new java.awt.Color(66, 72, 40));
        qtty_bev1.setText("0");

        addBttn_bev1.setBackground(new java.awt.Color(66, 72, 40));
        addBttn_bev1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_bev1.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_bev1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_bev1.setText("Add");
        addBttn_bev1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_bev1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_bev1.setOpaque(true);
        addBttn_bev1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_bev1MouseClicked(evt);
            }
        });

        desc_side15.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side15.setText("B1");

        jLabel36.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Quantity");

        jLabel55.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Price");

        javax.swing.GroupLayout foodBev1Layout = new javax.swing.GroupLayout(foodBev1);
        foodBev1.setLayout(foodBev1Layout);
        foodBev1Layout.setHorizontalGroup(
            foodBev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_bev1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodBev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodBev1Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(addBttn_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, foodBev1Layout.createSequentialGroup()
                        .addComponent(desc_side15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, foodBev1Layout.createSequentialGroup()
                        .addComponent(nameSide10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        foodBev1Layout.setVerticalGroup(
            foodBev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(foodBev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSide10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc_side15)
                .addGroup(foodBev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(foodBev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(qtty_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(foodBev1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic_bev1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        foodBev2.setBackground(new java.awt.Color(231, 234, 218));
        foodBev2.setToolTipText("");
        foodBev2.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_bev2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/bottled water.png"))); // NOI18N

        price_bev2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_bev2.setForeground(new java.awt.Color(51, 51, 51));
        price_bev2.setText("20");

        nameSide11.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide11.setForeground(new java.awt.Color(51, 51, 51));
        nameSide11.setText("Bottled Mineral Water");

        qtty_bev2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_bev2.setForeground(new java.awt.Color(66, 72, 40));
        qtty_bev2.setText("0");

        addBttn_bev2.setBackground(new java.awt.Color(66, 72, 40));
        addBttn_bev2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_bev2.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_bev2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_bev2.setText("Add");
        addBttn_bev2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_bev2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_bev2.setOpaque(true);
        addBttn_bev2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_bev2MouseClicked(evt);
            }
        });

        desc_side21.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side21.setForeground(new java.awt.Color(51, 51, 51));
        desc_side21.setText("B2");

        jLabel38.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Quantity");

        jLabel57.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Price");

        javax.swing.GroupLayout foodBev2Layout = new javax.swing.GroupLayout(foodBev2);
        foodBev2.setLayout(foodBev2Layout);
        foodBev2Layout.setHorizontalGroup(
            foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_bev2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev2Layout.createSequentialGroup()
                        .addComponent(nameSide11, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_bev2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(foodBev2Layout.createSequentialGroup()
                        .addComponent(desc_side21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodBev2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_bev2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_bev2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodBev2Layout.setVerticalGroup(
            foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev2Layout.createSequentialGroup()
                        .addComponent(pic_bev2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodBev2Layout.createSequentialGroup()
                        .addGroup(foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_bev2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameSide11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side21)
                        .addGroup(foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodBev2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(foodBev2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(qtty_bev2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBttn_bev2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))))
        );

        foodBev3.setBackground(new java.awt.Color(231, 234, 218));
        foodBev3.setToolTipText("");
        foodBev3.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_bev3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/orange juice.png"))); // NOI18N

        price_bev3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_bev3.setForeground(new java.awt.Color(51, 51, 51));
        price_bev3.setText("55");

        nameSide12.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide12.setForeground(new java.awt.Color(51, 51, 51));
        nameSide12.setText("Fresh Orange Juice");

        qtty_bev3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_bev3.setForeground(new java.awt.Color(66, 72, 40));
        qtty_bev3.setText("0");

        addBttn_bev3.setBackground(new java.awt.Color(66, 72, 40));
        addBttn_bev3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_bev3.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_bev3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_bev3.setText("Add");
        addBttn_bev3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_bev3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_bev3.setOpaque(true);
        addBttn_bev3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_bev3MouseClicked(evt);
            }
        });

        desc_side22.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side22.setForeground(new java.awt.Color(51, 51, 51));
        desc_side22.setText("B3");

        jLabel40.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Quantity");

        jLabel58.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Price");

        javax.swing.GroupLayout foodBev3Layout = new javax.swing.GroupLayout(foodBev3);
        foodBev3.setLayout(foodBev3Layout);
        foodBev3Layout.setHorizontalGroup(
            foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_bev3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameSide12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_side22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(foodBev3Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_bev3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev3Layout.createSequentialGroup()
                        .addComponent(addBttn_bev3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev3Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_bev3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        foodBev3Layout.setVerticalGroup(
            foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide12)
                            .addComponent(jLabel58)
                            .addComponent(price_bev3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBttn_bev3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(foodBev3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(foodBev3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(qtty_bev3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(pic_bev3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap())
        );

        foodBev4.setBackground(new java.awt.Color(231, 234, 218));
        foodBev4.setToolTipText("");
        foodBev4.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_bev4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/milkshake.png"))); // NOI18N

        price_bev4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_bev4.setForeground(new java.awt.Color(51, 51, 51));
        price_bev4.setText("80");

        nameSide13.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide13.setForeground(new java.awt.Color(51, 51, 51));
        nameSide13.setText("Milkshake");

        qtty_bev4.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_bev4.setForeground(new java.awt.Color(66, 72, 40));
        qtty_bev4.setText("0");

        addBttn_bev4.setBackground(new java.awt.Color(66, 72, 40));
        addBttn_bev4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_bev4.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_bev4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_bev4.setText("Add");
        addBttn_bev4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_bev4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_bev4.setOpaque(true);
        addBttn_bev4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_bev4MouseClicked(evt);
            }
        });

        desc_side23.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side23.setForeground(new java.awt.Color(51, 51, 51));
        desc_side23.setText("B4");

        jLabel51.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Quantity");

        jLabel59.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Price");

        javax.swing.GroupLayout foodBev4Layout = new javax.swing.GroupLayout(foodBev4);
        foodBev4.setLayout(foodBev4Layout);
        foodBev4Layout.setHorizontalGroup(
            foodBev4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_bev4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodBev4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev4Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_bev4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_bev4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodBev4Layout.createSequentialGroup()
                        .addComponent(desc_side23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodBev4Layout.createSequentialGroup()
                        .addComponent(nameSide13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_bev4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        foodBev4Layout.setVerticalGroup(
            foodBev4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev4Layout.createSequentialGroup()
                .addComponent(pic_bev4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(foodBev4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSide13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_bev4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGroup(foodBev4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side23)
                        .addGap(18, 18, 18)
                        .addGroup(foodBev4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(qtty_bev4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodBev4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_bev4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        foodBev5.setBackground(new java.awt.Color(231, 234, 218));
        foodBev5.setToolTipText("");
        foodBev5.setPreferredSize(new java.awt.Dimension(503, 120));

        pic_bev5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food_pics/iced tea.png"))); // NOI18N

        price_bev5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        price_bev5.setText("40");

        nameSide14.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        nameSide14.setForeground(new java.awt.Color(51, 51, 51));
        nameSide14.setText("Iced Tea");

        qtty_bev5.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        qtty_bev5.setForeground(new java.awt.Color(66, 72, 40));
        qtty_bev5.setText("0");

        addBttn_bev5.setBackground(new java.awt.Color(66, 72, 40));
        addBttn_bev5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addBttn_bev5.setForeground(new java.awt.Color(255, 255, 255));
        addBttn_bev5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBttn_bev5.setText("Add");
        addBttn_bev5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBttn_bev5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn_bev5.setOpaque(true);
        addBttn_bev5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttn_bev5MouseClicked(evt);
            }
        });

        desc_side24.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        desc_side24.setForeground(new java.awt.Color(51, 51, 51));
        desc_side24.setText("B5");

        jLabel53.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Quantity");

        jLabel60.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Price");

        javax.swing.GroupLayout foodBev5Layout = new javax.swing.GroupLayout(foodBev5);
        foodBev5.setLayout(foodBev5Layout);
        foodBev5Layout.setHorizontalGroup(
            foodBev5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic_bev5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodBev5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev5Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtty_bev5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn_bev5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodBev5Layout.createSequentialGroup()
                        .addComponent(desc_side24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(foodBev5Layout.createSequentialGroup()
                        .addComponent(nameSide14, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_bev5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        foodBev5Layout.setVerticalGroup(
            foodBev5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodBev5Layout.createSequentialGroup()
                .addGroup(foodBev5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodBev5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic_bev5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(foodBev5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(foodBev5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSide14)
                            .addComponent(price_bev5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_side24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(foodBev5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBttn_bev5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtty_bev5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))))
                .addContainerGap())
        );

        javax.swing.GroupLayout beveragePanelLayout = new javax.swing.GroupLayout(beveragePanel);
        beveragePanel.setLayout(beveragePanelLayout);
        beveragePanelLayout.setHorizontalGroup(
            beveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beveragePanelLayout.createSequentialGroup()
                .addGroup(beveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(beveragePanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(foodBev5, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(beveragePanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(beveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodBev2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodBev1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodBev3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodBev4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        beveragePanelLayout.setVerticalGroup(
            beveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beveragePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(foodBev1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodBev2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodBev3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodBev4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodBev5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(beveragePanel);

        dishPanel.add(jScrollPane5);

        jPanel1.add(dishPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 620, 770));

        cartPanel.setBackground(new java.awt.Color(232, 216, 188));
        cartPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ordersTable.setBackground(new java.awt.Color(245, 239, 228));
        ordersTable.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader Theader = ordersTable.getTableHeader();

        //Theader.setBackground(Color.red); // change the Background color
        Theader.setForeground(new Color(16,75,157)); // change the Foreground

        Theader.setFont(new Font("Corbel", Font.BOLD, 18));
        ordersTable.setGridColor(new java.awt.Color(153, 153, 255));
        ordersTable.setRowHeight(50);
        ordersTable.setRowMargin(5);
        jScrollPane1.setViewportView(ordersTable);
        if (ordersTable.getColumnModel().getColumnCount() > 0) {
            ordersTable.getColumnModel().getColumn(0).setMinWidth(30);
        }

        cartPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 550, 770));
        cartPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 6, -1, -1));

        jPanel2.setBackground(new java.awt.Color(226, 237, 252));

        proceed.setBackground(new java.awt.Color(247, 236, 240));
        proceed.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        proceed.setText("Proceed to Payment");
        proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proceed.setIconTextGap(2);
        proceed.setOpaque(true);
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        deleteOrder.setBackground(new java.awt.Color(247, 236, 240));
        deleteOrder.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        deleteOrder.setText("Delete Order");
        deleteOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteOrder.setOpaque(true);
        deleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderActionPerformed(evt);
            }
        });

        beverage1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        beverage1.setForeground(new java.awt.Color(51, 51, 51));
        beverage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beverage1.setText("Total Amount:");
        beverage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beverage1.setIconTextGap(0);
        beverage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beverage1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beverage1MouseEntered(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(51, 51, 51));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("0.00");
        lblTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTotal.setIconTextGap(0);
        lblTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTotalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTotalMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(deleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(beverage1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addComponent(proceed)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(beverage1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal))
                    .addComponent(deleteOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cartPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 90));

        jPanel1.add(cartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 550, 860));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Keep on Truckin", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 72, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Order");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 40));

        jPanel3.setBackground(new java.awt.Color(247, 236, 240));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 189, 189), 1, true));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        main.setBackground(new java.awt.Color(188, 214, 249));
        main.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        main.setForeground(new java.awt.Color(51, 51, 51));
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/main.png"))); // NOI18N
        main.setText("Main Dishes");
        main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 214, 249), 2));
        main.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        main.setOpaque(true);
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMouseEntered(evt);
            }
        });

        sides.setBackground(new java.awt.Color(247, 236, 240));
        sides.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        sides.setForeground(new java.awt.Color(51, 51, 51));
        sides.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sides.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/sides.png"))); // NOI18N
        sides.setText("Sides");
        sides.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 214, 249), 2));
        sides.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sides.setOpaque(true);
        sides.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidesMouseEntered(evt);
            }
        });

        dessert.setBackground(new java.awt.Color(247, 236, 240));
        dessert.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        dessert.setForeground(new java.awt.Color(51, 51, 51));
        dessert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dessert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/dessert.png"))); // NOI18N
        dessert.setText("Desserts");
        dessert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 214, 249), 2));
        dessert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dessert.setOpaque(true);
        dessert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dessertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dessertMouseEntered(evt);
            }
        });

        beverage.setBackground(new java.awt.Color(247, 236, 240));
        beverage.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        beverage.setForeground(new java.awt.Color(51, 51, 51));
        beverage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beverage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/beverage.png"))); // NOI18N
        beverage.setText("Beverages");
        beverage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 214, 249), 2));
        beverage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beverage.setIconTextGap(0);
        beverage.setOpaque(true);
        beverage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beverageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beverageMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sides, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(main)
                    .addComponent(sides)
                    .addComponent(dessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 620, 90));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Keep on Truckin", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(213, 91, 68));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("La Vie en Rose");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 1040));

        jPanel4.setBackground(new java.awt.Color(229, 184, 106));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(1102, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelExit)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseClicked
        jScrollPane2.setVisible(true);
        jScrollPane3.setVisible(false);
        jScrollPane4.setVisible(false);
        jScrollPane5.setVisible(false);
        
        main.setBackground(new java.awt.Color(188,214,249));
        sides.setBackground(new java.awt.Color(247,236,240));
        dessert.setBackground(new java.awt.Color(247,236,240));
        beverage.setBackground(new java.awt.Color(247,236,240));
    }//GEN-LAST:event_mainMouseClicked

    private void mainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseEntered
       
    }//GEN-LAST:event_mainMouseEntered

    private void sidesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidesMouseEntered
       
    }//GEN-LAST:event_sidesMouseEntered

    private void dessertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dessertMouseEntered
        
    }//GEN-LAST:event_dessertMouseEntered

    private void beverageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beverageMouseEntered
        
    }//GEN-LAST:event_beverageMouseEntered

    private void addBttn_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_mainMouseClicked
        
        String m1_code = "M1";
        
        String strprice = price_main1.getText();
        String strqtty = qtty_main1.getText();
        int m1price = Integer.parseInt(strprice);
        int m1qtty = Integer.parseInt(strqtty);
        
        int m1Total = m1price * m1qtty;
        String total = String.valueOf(m1Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_main1.getIcon());
       
        if(m1qtty != 0){
            M1_qtty = this.checkTable(m1_code, m1qtty, m1Total, imageIcon, strprice, strqtty, total);
            qtty_main1.setText("" + '0');
        }
        
        
    }//GEN-LAST:event_addBttn_mainMouseClicked

    private void addBttn_main1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_main1MouseClicked
        String m2_code = "M2";
        
        String strprice = price_main2.getText();
        String strqtty = qtty_main2.getText();
        int m2price = Integer.parseInt(strprice);
        int m2qtty = Integer.parseInt(strqtty);
        
        int m2Total = m2price * m2qtty;
        String total = String.valueOf(m2Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_main2.getIcon());
       
        if(m2qtty != 0){
            M2_qtty = this.checkTable(m2_code, m2qtty, m2Total, imageIcon, strprice, strqtty, total);
            qtty_main2.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_main1MouseClicked

    private void addBttn_main3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_main3MouseClicked
        String m4_code = "M4";
        
        String strprice = price_main4.getText();
        String strqtty = qtty_main4.getText();
        int m4price = Integer.parseInt(strprice);
        int m4qtty = Integer.parseInt(strqtty);
        
        int m4Total = m4price * m4qtty;
        String total = String.valueOf(m4Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_main4.getIcon());
       
        if(m4qtty != 0){
            M4_qtty = this.checkTable(m4_code, m4qtty, m4Total, imageIcon, strprice, strqtty, total);
            qtty_main4.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_main3MouseClicked

    private void addBttn_main4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_main4MouseClicked
       String m5_code = "M5";
        
        String strprice = price_main5.getText();
        String strqtty = qtty_main5.getText();
        int m5price = Integer.parseInt(strprice);
        int m5qtty = Integer.parseInt(strqtty);
        
        int m5Total = m5price * m5qtty;
        String total = String.valueOf(m5Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_main5.getIcon());
       
        if(m5qtty != 0){
            M5_qtty = this.checkTable(m5_code, m5qtty, m5Total, imageIcon, strprice, strqtty, total);
            qtty_main5.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_main4MouseClicked

    private void sidesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidesMouseClicked
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(false);
        jScrollPane5.setVisible(false);
        
        sides.setBackground(new java.awt.Color(188,214,249));
        main.setBackground(new java.awt.Color(247,236,240));
        dessert.setBackground(new java.awt.Color(247,236,240));
        beverage.setBackground(new java.awt.Color(247,236,240));
    }//GEN-LAST:event_sidesMouseClicked

    private void dessertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dessertMouseClicked
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        jScrollPane4.setVisible(true);
        jScrollPane5.setVisible(false);
        
        dessert.setBackground(new java.awt.Color(188,214,249));
        sides.setBackground(new java.awt.Color(247,236,240));
        main.setBackground(new java.awt.Color(247,236,240));
        beverage.setBackground(new java.awt.Color(247,236,240));
    }//GEN-LAST:event_dessertMouseClicked

    private void beverageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beverageMouseClicked
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        jScrollPane4.setVisible(false);
        jScrollPane5.setVisible(true);
        
        beverage.setBackground(new java.awt.Color(188,214,249));
        sides.setBackground(new java.awt.Color(247,236,240));
        dessert.setBackground(new java.awt.Color(247,236,240));
        main.setBackground(new java.awt.Color(247,236,240));
    }//GEN-LAST:event_beverageMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void addBttn_main6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_main6MouseClicked
        // TODO add your handling code here:
        String m3_code = "M3";
        
        String strprice = price_main3.getText();
        String strqtty = qtty_main3.getText();
        int m3price = Integer.parseInt(strprice);
        int m3qtty = Integer.parseInt(strqtty);
        
        int m3Total = m3price * m3qtty;
        String total = String.valueOf(m3Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_main3.getIcon());
       
        if(m3qtty != 0){
            M3_qtty = this.checkTable(m3_code, m3qtty, m3Total, imageIcon, strprice, strqtty, total);
            qtty_main3.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_main6MouseClicked

    private void addBttn_side1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_side1MouseClicked
        String s1_code = "S1";
        
        String strprice = price_side01.getText();
        String strqtty = qtty_side1.getText();
        int s1price = Integer.parseInt(strprice);
        int s1qtty = Integer.parseInt(strqtty);
        
        int s1Total = s1price * s1qtty;
        String total = String.valueOf(s1Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_side1.getIcon());
       
        if(s1qtty != 0){
            S1_qtty = this.checkTable(s1_code, s1qtty, s1Total, imageIcon, strprice, strqtty, total);
            qtty_side1.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_side1MouseClicked

    private void addBttn_side2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_side2MouseClicked
        String s2_code = "S2";
        
        String strprice = price_side2.getText();
        String strqtty = qtty_side2.getText();
        int s2price = Integer.parseInt(strprice);
        int s2qtty = Integer.parseInt(strqtty);
        
        int s2Total = s2price * s2qtty;
        String total = String.valueOf(s2Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_side2.getIcon());
       
        if(s2qtty != 0){
            S2_qtty = this.checkTable(s2_code, s2qtty, s2Total, imageIcon, strprice, strqtty, total);
            qtty_side2.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_side2MouseClicked

    private void addBttn_side3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_side3MouseClicked
        String s3_code = "S3";
        
        String strprice = price_side3.getText();
        String strqtty = qtty_side3.getText();
        int s3price = Integer.parseInt(strprice);
        int s3qtty = Integer.parseInt(strqtty);
        
        int s3Total = s3price * s3qtty;
        String total = String.valueOf(s3Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_side3.getIcon());
       
        if(s3qtty != 0){
            S3_qtty = this.checkTable(s3_code, s3qtty, s3Total, imageIcon, strprice, strqtty, total);
            qtty_side3.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_side3MouseClicked

    private void addBttn_side4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_side4MouseClicked
       String s4_code = "S4";
        
        String strprice = price_side4.getText();
        String strqtty = qtty_side4.getText();
        int s4price = Integer.parseInt(strprice);
        int s4qtty = Integer.parseInt(strqtty);
        
        int s4Total = s4price * s4qtty;
        String total = String.valueOf(s4Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_side4.getIcon());
       
        if(s4qtty != 0){
            S4_qtty = this.checkTable(s4_code, s4qtty, s4Total, imageIcon, strprice, strqtty, total);
            qtty_side4.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_side4MouseClicked

    private void addBttn_side5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_side5MouseClicked
        String s5_code = "S5";
        
        String strprice = price_side5.getText();
        String strqtty = qtty_side5.getText();
        int s5price = Integer.parseInt(strprice);
        int s5qtty = Integer.parseInt(strqtty);
        
        int s5Total = s5price * s5qtty;
        String total = String.valueOf(s5Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_side5.getIcon());
       
        if(s5qtty != 0){
            S5_qtty = this.checkTable(s5_code, s5qtty, s5Total, imageIcon, strprice, strqtty, total);
            qtty_side5.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_side5MouseClicked

    private void addBttn_dessert1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_dessert1MouseClicked
        String d1_code = "D1";
        
        String strprice = price_dessert1.getText();
        String strqtty = qtty_dessert1.getText();
        int d1price = Integer.parseInt(strprice);
        int d1qtty = Integer.parseInt(strqtty);
        
        int d1Total = d1price * d1qtty;
        String total = String.valueOf(d1Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_dessert1.getIcon());
       
        if(d1qtty != 0){
            D1_qtty = this.checkTable(d1_code, d1qtty, d1Total, imageIcon, strprice, strqtty, total);
            qtty_dessert1.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_dessert1MouseClicked

    private void addBttn_dessert3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_dessert3MouseClicked
        String d3_code = "D3";
        
        String strprice = price_dessert3.getText();
        String strqtty = qtty_dessert3.getText();
        int d3price = Integer.parseInt(strprice);
        int d3qtty = Integer.parseInt(strqtty);
        
        int d3Total = d3price * d3qtty;
        String total = String.valueOf(d3Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_dessert3.getIcon());
       
        if(d3qtty != 0){
            D3_qtty = this.checkTable(d3_code, d3qtty, d3Total, imageIcon, strprice, strqtty, total);
            qtty_dessert3.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_dessert3MouseClicked

    private void addBttn_dessert4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_dessert4MouseClicked
       String d4_code = "D4";
        
        String strprice = price_dessert4.getText();
        String strqtty = qtty_dessert4.getText();
        int d4price = Integer.parseInt(strprice);
        int d4qtty = Integer.parseInt(strqtty);
        
        int d4Total = d4price * d4qtty;
        String total = String.valueOf(d4Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_dessert4.getIcon());
       
        if(d4qtty != 0){
           D4_qtty = this.checkTable(d4_code, d4qtty, d4Total, imageIcon, strprice, strqtty, total);
           qtty_dessert4.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_dessert4MouseClicked

    private void addBttn_dessert5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_dessert5MouseClicked
        String d5_code = "D5";
        
        String strprice = price_dessert5.getText();
        String strqtty = qtty_dessert5.getText();
        int d5price = Integer.parseInt(strprice);
        int d5qtty = Integer.parseInt(strqtty);
        
        int d5Total = d5price * d5qtty;
        String total = String.valueOf(d5Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_dessert5.getIcon());
       
        if(d5qtty != 0){
            D5_qtty = this.checkTable(d5_code, d5qtty, d5Total, imageIcon, strprice, strqtty, total);
            qtty_dessert5.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_dessert5MouseClicked

    private void addBttn_bev2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_bev2MouseClicked
        String b2_code = "B2";
        
        String strprice = price_bev2.getText();
        String strqtty = qtty_bev2.getText();
        int b2price = Integer.parseInt(strprice);
        int b2qtty = Integer.parseInt(strqtty);
        
        int b2Total = b2price * b2qtty;
        String total = String.valueOf(b2Total);
        
        var imageIcon = ((ImageIcon) pic_bev2.getIcon());
       
        if(b2qtty != 0){
            B2_qtty = this.checkTable(b2_code, b2qtty, b2Total, imageIcon, strprice, strqtty, total);
            qtty_bev2.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_bev2MouseClicked

    private void addBttn_bev3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_bev3MouseClicked
        String b3_code = "B3";
        
        String strprice = price_bev3.getText();
        String strqtty = qtty_bev3.getText();
        int b3price = Integer.parseInt(strprice);
        int b3qtty = Integer.parseInt(strqtty);
        
        int b3Total = b3price * b3qtty;
        String total = String.valueOf(b3Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_bev3.getIcon());
       
        if(b3qtty != 0){
            B3_qtty = this.checkTable(b3_code, b3qtty, b3Total, imageIcon, strprice, strqtty, total);
            qtty_bev3.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_bev3MouseClicked

    private void addBttn_bev4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_bev4MouseClicked
        String b4_code = "B4";
        
        String strprice = price_bev4.getText();
        String strqtty = qtty_bev4.getText();
        int b4price = Integer.parseInt(strprice);
        int b4qtty = Integer.parseInt(strqtty);
        
        int b4Total = b4price * b4qtty;
        String total = String.valueOf(b4Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_bev4.getIcon());
       
        if(b4qtty != 0){
            B4_qtty = this.checkTable(b4_code, b4qtty, b4Total, imageIcon, strprice, strqtty, total);
            qtty_bev4.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_bev4MouseClicked

    private void addBttn_bev5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_bev5MouseClicked
        String b5_code = "B5";
        
        String strprice = price_bev5.getText();
        String strqtty = qtty_bev5.getText();
        int b5price = Integer.parseInt(strprice);
        int b5qtty = Integer.parseInt(strqtty);
        
        int b5Total = b5price * b5qtty;
        String total = String.valueOf(b5Total);
        
        ImageIcon imageIcon = ((ImageIcon) pic_bev5.getIcon());
       
        if(b5qtty != 0){
            B5_qtty = this.checkTable(b5_code, b5qtty, b5Total, imageIcon, strprice, strqtty, total);
            qtty_bev5.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_bev5MouseClicked

    private void addBttn_dessert2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_dessert2MouseClicked
        String d2_code = "D2";

        String strprice = price_dessert2.getText();
        String strqtty = qtty_dessert2.getText();
        int d2price = Integer.parseInt(strprice);
        int d2qtty = Integer.parseInt(strqtty);

        int d2Total = d2price * d2qtty;
        String total = String.valueOf(d2Total);

        ImageIcon imageIcon = ((ImageIcon) pic_dessert2.getIcon());

        if(d2qtty != 0){
            D2_qtty = this.checkTable(d2_code, d2qtty, d2Total, imageIcon, strprice, strqtty, total);
            qtty_dessert2.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_dessert2MouseClicked

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed

        if (ordersTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose an order.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else{
            UserInfo user = new UserInfo();
        
            int orderCode = ((int)(Math.random()*9000)+1000);
            user.lblorderNum.setText(String.valueOf(orderCode));

            double subTotal = totalAmount;
            double vat = subTotal * 0.12;
            double totalAmt = subTotal + vat;

            DecimalFormat df = new DecimalFormat("#.00");
            String strSub = df.format(subTotal);
            String strVat = df.format(vat);
            String strTotal = df.format(totalAmt);

            user.lblVat.setText(strVat);
            user.lblTotal.setText(strTotal);
            user.lblSubTotal.setText(strSub);

            user.txtM1.setText(String.valueOf(M1_qtty)); user.txtM2.setText(String.valueOf(M2_qtty)); user.txtM3.setText(String.valueOf(M3_qtty)); user.txtM4.setText(String.valueOf(M4_qtty)); user.txtM5.setText(String.valueOf(M5_qtty));
            user.txtS1.setText(String.valueOf(S1_qtty)); user.txtS2.setText(String.valueOf(S2_qtty)); user.txtS3.setText(String.valueOf(S3_qtty)); user.txtS4.setText(String.valueOf(S4_qtty)); user.txtS5.setText(String.valueOf(S5_qtty));
            user.txtD1.setText(String.valueOf(D1_qtty)); user.txtB2.setText(String.valueOf(B2_qtty)); user.txtD3.setText(String.valueOf(D3_qtty)); user.txtD4.setText(String.valueOf(D4_qtty)); user.txtD5.setText(String.valueOf(D5_qtty));
            user.txtB1.setText(String.valueOf(B1_qtty)); user.txtD2.setText(String.valueOf(D2_qtty)); user.txtB3.setText(String.valueOf(B3_qtty)); user.txtB4.setText(String.valueOf(B4_qtty)); user.txtB5.setText(String.valueOf(B5_qtty));

            user.setVisible(true);
            user.pack();
            user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        
    }//GEN-LAST:event_proceedActionPerformed

    private void deleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) ordersTable.getModel();
        
        if (ordersTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (ordersTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please choose one order to be deleted.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            int selRow = ordersTable.getSelectedRow();
            int delAmt = Integer.parseInt((String) ordersTable.getValueAt(selRow, 4));
            totalAmount = Double.parseDouble((String) lblTotal.getText());

            DecimalFormat df = new DecimalFormat("#.00");
            totalAmount = totalAmount - delAmt;
            String strTtlAmt = df.format(totalAmount);
            lblTotal.setText("" + strTtlAmt);
            tblModel.removeRow(ordersTable.getSelectedRow());
        }
        
        
        
        
        
        /*
       if (ordersTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (ordersTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please choose one order to be deleted.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            tblModel.removeRow(ordersTable.getSelectedRow());
        }*/
        
        if(ordersTable.getSelectedRowCount() == 1){
            tblModel.removeRow(ordersTable.getSelectedRow());
        }
    }//GEN-LAST:event_deleteOrderActionPerformed

    private void beverage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beverage1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_beverage1MouseClicked

    private void beverage1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beverage1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_beverage1MouseEntered

    private void lblTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalMouseClicked

    private void lblTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalMouseEntered

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void addBttn_bev1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttn_bev1MouseClicked
        String b1_code = "B1";

        String strprice = price_bev1.getText();
        String strqtty = qtty_bev1.getText();
        int b1price = Integer.parseInt(strprice);
        int b1qtty = Integer.parseInt(strqtty);

        int b1Total = b1price * b1qtty;
        String total = String.valueOf(b1Total);

        ImageIcon imageIcon = ((ImageIcon) pic_bev1.getIcon());

        if(b1qtty != 0){
            B1_qtty = this.checkTable(b1_code, b1qtty, b1Total, imageIcon, strprice, strqtty, total);
            qtty_bev1.setText("" + '0');
        }
    }//GEN-LAST:event_addBttn_bev1MouseClicked
    

// Custom cell renderer to set image size
    private class ImageCellRenderer extends JLabel implements TableCellRenderer {
        public ImageCellRenderer() {
            setOpaque(true);
            setHorizontalAlignment(JLabel.CENTER);
            setVerticalAlignment(JLabel.CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            // Set the image icon in the second column
            if (column == 1 && value instanceof ImageIcon) {
                setIcon((ImageIcon) value);
            } else {
                setIcon(null);
            }
 
            ordersTable.setRowHeight(80);
            return this;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddOrder().setVisible(true);
                
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBttn_bev1;
    private javax.swing.JLabel addBttn_bev2;
    private javax.swing.JLabel addBttn_bev3;
    private javax.swing.JLabel addBttn_bev4;
    private javax.swing.JLabel addBttn_bev5;
    private javax.swing.JLabel addBttn_dessert1;
    private javax.swing.JLabel addBttn_dessert2;
    private javax.swing.JLabel addBttn_dessert3;
    private javax.swing.JLabel addBttn_dessert4;
    private javax.swing.JLabel addBttn_dessert5;
    private javax.swing.JLabel addBttn_main;
    private javax.swing.JLabel addBttn_main1;
    private javax.swing.JLabel addBttn_main3;
    private javax.swing.JLabel addBttn_main4;
    private javax.swing.JLabel addBttn_main6;
    private javax.swing.JLabel addBttn_side1;
    private javax.swing.JLabel addBttn_side2;
    private javax.swing.JLabel addBttn_side3;
    private javax.swing.JLabel addBttn_side4;
    private javax.swing.JLabel addBttn_side5;
    private javax.swing.JLabel beverage;
    private javax.swing.JLabel beverage1;
    private javax.swing.JPanel beveragePanel;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteOrder;
    private javax.swing.JLabel desc_main;
    private javax.swing.JLabel desc_main5;
    private javax.swing.JLabel desc_main6;
    private javax.swing.JLabel desc_main7;
    private javax.swing.JLabel desc_main8;
    private javax.swing.JLabel desc_side1;
    private javax.swing.JLabel desc_side15;
    private javax.swing.JLabel desc_side16;
    private javax.swing.JLabel desc_side17;
    private javax.swing.JLabel desc_side18;
    private javax.swing.JLabel desc_side19;
    private javax.swing.JLabel desc_side2;
    private javax.swing.JLabel desc_side20;
    private javax.swing.JLabel desc_side21;
    private javax.swing.JLabel desc_side22;
    private javax.swing.JLabel desc_side23;
    private javax.swing.JLabel desc_side24;
    private javax.swing.JLabel desc_side3;
    private javax.swing.JLabel desc_side4;
    private javax.swing.JLabel desc_side5;
    private javax.swing.JLabel dessert;
    private javax.swing.JPanel dessertPanel;
    private javax.swing.JPanel dishPanel;
    private javax.swing.JPanel foodBev1;
    private javax.swing.JPanel foodBev2;
    private javax.swing.JPanel foodBev3;
    private javax.swing.JPanel foodBev4;
    private javax.swing.JPanel foodBev5;
    private javax.swing.JPanel foodDessert;
    private javax.swing.JPanel foodDessert2;
    private javax.swing.JPanel foodDessert3;
    private javax.swing.JPanel foodDessert4;
    private javax.swing.JPanel foodDessert5;
    private javax.swing.JPanel foodMain;
    private javax.swing.JPanel foodMain1;
    private javax.swing.JPanel foodMain2;
    private javax.swing.JPanel foodMain3;
    private javax.swing.JPanel foodMain4;
    private javax.swing.JPanel foodSides1;
    private javax.swing.JPanel foodSides2;
    private javax.swing.JPanel foodSides3;
    private javax.swing.JPanel foodSides4;
    private javax.swing.JPanel foodSides6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel main;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameMain1;
    private javax.swing.JLabel nameMain2;
    private javax.swing.JLabel nameMain3;
    private javax.swing.JLabel nameMain4;
    private javax.swing.JLabel nameMain5;
    private javax.swing.JLabel nameSide1;
    private javax.swing.JLabel nameSide10;
    private javax.swing.JLabel nameSide11;
    private javax.swing.JLabel nameSide12;
    private javax.swing.JLabel nameSide13;
    private javax.swing.JLabel nameSide14;
    private javax.swing.JLabel nameSide16;
    private javax.swing.JLabel nameSide2;
    private javax.swing.JLabel nameSide3;
    private javax.swing.JLabel nameSide4;
    private javax.swing.JLabel nameSide5;
    private javax.swing.JLabel nameSide6;
    private javax.swing.JLabel nameSide7;
    private javax.swing.JLabel nameSide8;
    private javax.swing.JLabel nameSide9;
    private javax.swing.JTable ordersTable;
    private javax.swing.JLabel pic_bev1;
    private javax.swing.JLabel pic_bev2;
    private javax.swing.JLabel pic_bev3;
    private javax.swing.JLabel pic_bev4;
    private javax.swing.JLabel pic_bev5;
    private javax.swing.JLabel pic_dessert1;
    private javax.swing.JLabel pic_dessert2;
    private javax.swing.JLabel pic_dessert3;
    private javax.swing.JLabel pic_dessert4;
    private javax.swing.JLabel pic_dessert5;
    private javax.swing.JLabel pic_main1;
    private javax.swing.JLabel pic_main2;
    private javax.swing.JLabel pic_main3;
    private javax.swing.JLabel pic_main4;
    private javax.swing.JLabel pic_main5;
    private javax.swing.JLabel pic_side1;
    private javax.swing.JLabel pic_side2;
    private javax.swing.JLabel pic_side3;
    private javax.swing.JLabel pic_side4;
    private javax.swing.JLabel pic_side5;
    private javax.swing.JLabel price_bev1;
    private javax.swing.JLabel price_bev2;
    private javax.swing.JLabel price_bev3;
    private javax.swing.JLabel price_bev4;
    private javax.swing.JLabel price_bev5;
    private javax.swing.JLabel price_dessert1;
    private javax.swing.JLabel price_dessert2;
    private javax.swing.JLabel price_dessert3;
    private javax.swing.JLabel price_dessert4;
    private javax.swing.JLabel price_dessert5;
    private javax.swing.JLabel price_main1;
    private javax.swing.JLabel price_main2;
    private javax.swing.JLabel price_main3;
    private javax.swing.JLabel price_main4;
    private javax.swing.JLabel price_main5;
    private javax.swing.JLabel price_side01;
    private javax.swing.JLabel price_side2;
    private javax.swing.JLabel price_side3;
    private javax.swing.JLabel price_side4;
    private javax.swing.JLabel price_side5;
    private javax.swing.JButton proceed;
    private javax.swing.JTextField qtty_bev1;
    private javax.swing.JTextField qtty_bev2;
    private javax.swing.JTextField qtty_bev3;
    private javax.swing.JTextField qtty_bev4;
    private javax.swing.JTextField qtty_bev5;
    private javax.swing.JTextField qtty_dessert1;
    private javax.swing.JTextField qtty_dessert2;
    private javax.swing.JTextField qtty_dessert3;
    private javax.swing.JTextField qtty_dessert4;
    private javax.swing.JTextField qtty_dessert5;
    private javax.swing.JTextField qtty_main1;
    private javax.swing.JTextField qtty_main2;
    private javax.swing.JTextField qtty_main3;
    private javax.swing.JTextField qtty_main4;
    private javax.swing.JTextField qtty_main5;
    private javax.swing.JTextField qtty_side1;
    private javax.swing.JTextField qtty_side2;
    private javax.swing.JTextField qtty_side3;
    private javax.swing.JTextField qtty_side4;
    private javax.swing.JTextField qtty_side5;
    private javax.swing.JPanel sidePanel2;
    private javax.swing.JLabel sides;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
