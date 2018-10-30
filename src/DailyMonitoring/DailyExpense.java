package DailyMonitoring;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

public class DailyExpense extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DailyExpense() {
        initComponents();
        showTableData();
        showDate();
      
    }

    public void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MMMM dd, YYYY");
        lblDate.setText(s.format(d));
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBfast = new javax.swing.JTextField();
        btnAddBfast = new javax.swing.JButton();
        txtSnack = new javax.swing.JTextField();
        btnAddSnack = new javax.swing.JButton();
        txtTrans = new javax.swing.JTextField();
        btnAddLunch = new javax.swing.JButton();
        txtLunch = new javax.swing.JTextField();
        btnAddTrans = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUtil = new javax.swing.JTextField();
        btnAddUtil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDinner = new javax.swing.JTextField();
        btnAddDinner = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMisc = new javax.swing.JTextField();
        btnAddMisc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnAddAll = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExp = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtTotSnack = new javax.swing.JTextField();
        txtTotBfast = new javax.swing.JTextField();
        txtTotLunch = new javax.swing.JTextField();
        txtTotDinner = new javax.swing.JTextField();
        txtTotMisc = new javax.swing.JTextField();
        txtTotUtil = new javax.swing.JTextField();
        txtTotTrans = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        icClose = new javax.swing.JLabel();
        icMin = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(1280, 1280));
        setMinimumSize(new java.awt.Dimension(1280, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1274, 585));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Daily Expense Monitoring");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1250, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBfast.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBfast.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtBfast, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 139, -1));

        btnAddBfast.setText("Add");
        btnAddBfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBfastActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddBfast, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        txtSnack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSnack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtSnack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 139, 32));

        btnAddSnack.setText("Add");
        btnAddSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSnackActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddSnack, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        txtTrans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransActionPerformed(evt);
            }
        });
        jPanel3.add(txtTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 139, -1));

        btnAddLunch.setText("Add");
        btnAddLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLunchActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        txtLunch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLunch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 139, -1));

        btnAddTrans.setText("Add");
        btnAddTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Breakfast");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Snack");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Transportation");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Util");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtUtil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUtil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUtilActionPerformed(evt);
            }
        });
        jPanel3.add(txtUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 139, -1));

        btnAddUtil.setText("Add");
        btnAddUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUtilActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Dinner");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtDinner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDinner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDinnerActionPerformed(evt);
            }
        });
        jPanel3.add(txtDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 139, -1));

        btnAddDinner.setText("Add");
        btnAddDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDinnerActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Lunch");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtMisc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMisc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiscActionPerformed(evt);
            }
        });
        jPanel3.add(txtMisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 139, -1));

        btnAddMisc.setText("Add");
        btnAddMisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMiscActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddMisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Misc");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Misc");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblDate.setBackground(new java.awt.Color(51, 51, 51));
        lblDate.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("dd/mm/yyyy hh:mm AM/PM");

        btnAddAll.setText("Add All");
        btnAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAllActionPerformed(evt);
            }
        });

        lblTime.setBackground(new java.awt.Color(51, 51, 51));
        lblTime.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("dd/mm/yyyy hh:mm AM/PM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddAll, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddAll)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 460, 450));

        tblExp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Breakfast", "Snack", "Lunch", "Dinner", "Transportation", "Misc", "Util", "Date_Added"
            }
        ));
        jScrollPane1.setViewportView(tblExp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 780, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setToolTipText("");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("TOTAL");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Breakfast");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Util");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Lunch");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Dinner");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Transportation");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Misc");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Snack");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 100, 50));

        txtTotSnack.setEditable(false);
        txtTotSnack.setBackground(new java.awt.Color(204, 204, 204));
        txtTotSnack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotSnack.setForeground(new java.awt.Color(60, 63, 65));
        txtTotSnack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotSnack.setText("0.00");
        jPanel4.add(txtTotSnack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 139, -1));

        txtTotBfast.setEditable(false);
        txtTotBfast.setBackground(new java.awt.Color(204, 204, 204));
        txtTotBfast.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotBfast.setForeground(new java.awt.Color(60, 63, 65));
        txtTotBfast.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotBfast.setText("0.00");
        txtTotBfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotBfastActionPerformed(evt);
            }
        });
        jPanel4.add(txtTotBfast, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 139, -1));

        txtTotLunch.setEditable(false);
        txtTotLunch.setBackground(new java.awt.Color(204, 204, 204));
        txtTotLunch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotLunch.setForeground(new java.awt.Color(60, 63, 65));
        txtTotLunch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotLunch.setText("0.00");
        jPanel4.add(txtTotLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 139, -1));

        txtTotDinner.setEditable(false);
        txtTotDinner.setBackground(new java.awt.Color(204, 204, 204));
        txtTotDinner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotDinner.setForeground(new java.awt.Color(60, 63, 65));
        txtTotDinner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotDinner.setText("0.00");
        jPanel4.add(txtTotDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 139, -1));

        txtTotMisc.setEditable(false);
        txtTotMisc.setBackground(new java.awt.Color(204, 204, 204));
        txtTotMisc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotMisc.setForeground(new java.awt.Color(60, 63, 65));
        txtTotMisc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotMisc.setText("0.00");
        jPanel4.add(txtTotMisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 139, -1));

        txtTotUtil.setEditable(false);
        txtTotUtil.setBackground(new java.awt.Color(204, 204, 204));
        txtTotUtil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotUtil.setForeground(new java.awt.Color(60, 63, 65));
        txtTotUtil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotUtil.setText("0.00");
        jPanel4.add(txtTotUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 139, -1));

        txtTotTrans.setEditable(false);
        txtTotTrans.setBackground(new java.awt.Color(204, 204, 204));
        txtTotTrans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotTrans.setForeground(new java.awt.Color(60, 63, 65));
        txtTotTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotTrans.setText("0.00");
        jPanel4.add(txtTotTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 139, -1));

        btnBack.setText("Back");
        jPanel4.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 100, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 780, 260));

        icClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Shutdown_25px.png"))); // NOI18N
        icClose.setToolTipText("Close Window");
        icClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icCloseMouseClicked(evt);
            }
        });
        getContentPane().add(icClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        icMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Compress_25px.png"))); // NOI18N
        icMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                icMinMouseReleased(evt);
            }
        });
        getContentPane().add(icMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, -1, -1));

        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        getContentPane().add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSnackActionPerformed
        Double Snack;
        Snack = Double.parseDouble(txtSnack.getText());
        Double Snackamt = Double.parseDouble(txtTotSnack.getText());
        if (Snackamt == 0.00) {
            txtTotSnack.setText(String.format("%.2f", Snack));
        } else {
            Double TotSnackAmt = Snack + Snackamt;
            String dispSnack = String.format("%.2f", TotSnackAmt);
            txtTotSnack.setText(dispSnack);
        }
        txtSnack.setText("");
    }//GEN-LAST:event_btnAddSnackActionPerformed

    private void btnAddBfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBfastActionPerformed
        Double Bfast;
        Bfast = Double.parseDouble(txtBfast.getText());
        Double Bfastamt = Double.parseDouble(txtTotBfast.getText());
        if (Bfastamt == 0.00) {
            txtTotBfast.setText(String.format("%.2f", Bfast));
        } else {
            Double TotBfastAmt = Bfast + Bfastamt;
            String dispBfast = String.format("%.2f", TotBfastAmt);
            txtTotBfast.setText(dispBfast);
        }
        txtBfast.setText("");
    }//GEN-LAST:event_btnAddBfastActionPerformed

    private void btnAddLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLunchActionPerformed
        Double Lunch;
        Lunch = Double.parseDouble(txtLunch.getText());
        Double Lunchamt = Double.parseDouble(txtTotLunch.getText());
        if (Lunchamt == 0.00) {
            txtTotLunch.setText(String.format("%.2f", Lunch));
        } else {
            Double TotLunchAmt = Lunch + Lunchamt;
            String dispLunch = String.format("%.2f", TotLunchAmt);
            txtTotLunch.setText(dispLunch);
        }
        txtLunch.setText("");
    }//GEN-LAST:event_btnAddLunchActionPerformed

    private void txtTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransActionPerformed

    private void btnAddTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransActionPerformed
        Double Trans;
        Trans = Double.parseDouble(txtTrans.getText());
        Double Transamt = Double.parseDouble(txtTotTrans.getText());
        if (Transamt == 0.00) {
            txtTotTrans.setText(String.format("%.2f", Trans));
        } else {
            Double TotTransAmt = Trans + Transamt;
            String dispTrans = String.format("%.2f", TotTransAmt);
            txtTotTrans.setText(dispTrans);
        }
        txtTrans.setText("");
    }//GEN-LAST:event_btnAddTransActionPerformed

    private void txtUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUtilActionPerformed

    }//GEN-LAST:event_txtUtilActionPerformed

    private void btnAddUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUtilActionPerformed
        Double Utilz;
        Utilz = Double.parseDouble(txtUtil.getText());
        Double Utilzamt = Double.parseDouble(txtTotUtil.getText());
        if (Utilzamt == 0.00) {
            txtTotUtil.setText(String.format("%.2f", Utilz));
        } else {
            Double TotUtilzAmt = Utilz + Utilzamt;
            String dispUtilz = String.format("%.2f", TotUtilzAmt);
            txtTotUtil.setText(dispUtilz);
        }
        txtUtil.setText("");
    }//GEN-LAST:event_btnAddUtilActionPerformed

    private void txtDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDinnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDinnerActionPerformed

    private void btnAddDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDinnerActionPerformed
        Double Dinner;
        Dinner = Double.parseDouble(txtDinner.getText());
        Double Dinneramt = Double.parseDouble(txtTotDinner.getText());
        if (Dinneramt == 0.00) {
            txtTotDinner.setText(String.format("%.2f", Dinner));
        } else {
            Double TotDinnerAmt = Dinner + Dinneramt;
            String dispDinner = String.format("%.2f", TotDinnerAmt);
            txtTotDinner.setText(dispDinner);
        }
        txtDinner.setText("");
    }//GEN-LAST:event_btnAddDinnerActionPerformed

    private void txtMiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMiscActionPerformed

    private void btnAddMiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMiscActionPerformed
        Double Misc;
        Misc = Double.parseDouble(txtMisc.getText());
        Double Miscamt = Double.parseDouble(txtTotMisc.getText());
        if (Miscamt == 0.00) {
            txtTotMisc.setText(String.format("%.2f", Misc));
        } else {
            Double TotMiscAmt = Misc + Miscamt;
            String dispMisc = String.format("%.2f", TotMiscAmt);
            txtTotMisc.setText(dispMisc);
        }
        txtMisc.setText("");
    }//GEN-LAST:event_btnAddMiscActionPerformed

    private void txtTotBfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotBfastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotBfastActionPerformed

    private void btnAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAllActionPerformed

    }//GEN-LAST:event_btnAddAllActionPerformed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void icMinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icMinMouseReleased
        this.setState(DailyExpense.ICONIFIED);
    }//GEN-LAST:event_icMinMouseReleased

    private void icCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_icCloseMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String sql = "INSERT INTO Daily_Expense"
                    + "(Breakfast,Snack,Lunch,Dinner,Transportation,Misc,Util)"
                    + "values (?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/DExpdb", "root", "");
            pst = con.prepareStatement(sql);

            if (txtTotBfast.getText().equals("")) {
                txtTotBfast.setText("0");
                pst.setString(1, txtTotBfast.getText());
            } else {
                pst.setString(1, txtTotBfast.getText());
            }

            if (txtTotSnack.getText().equals("")) {
                txtTotSnack.setText("0");
                pst.setString(2, txtTotSnack.getText());
            } else {
                pst.setString(2, txtTotSnack.getText());
            }

            if (txtTotLunch.getText().equals("")) {
                txtTotLunch.setText("0");
                pst.setString(3, txtTotLunch.getText());
            } else {
                pst.setString(3, txtTotLunch.getText());
            }

            if (txtTotDinner.getText().equals("")) {
                txtTotDinner.setText("0");
                pst.setString(4, txtTotDinner.getText());
            } else {
                pst.setString(4, txtTotDinner.getText());
            }

            if (txtTotTrans.getText().equals("")) {
                txtTotTrans.setText("0");
                pst.setString(5, txtTotTrans.getText());
            } else {
                pst.setString(5, txtTotTrans.getText());
            }

            if (txtTotMisc.getText().equals("")) {
                txtTotMisc.setText("0");
                pst.setString(6, txtTotMisc.getText());
            } else {
                pst.setString(6, txtTotMisc.getText());
            }

            if (txtTotUtil.getText().equals("")) {
                txtTotUtil.setText("0");
                pst.setString(7, txtTotUtil.getText());
            } else {
                pst.setString(7, txtTotUtil.getText());
            }

            pst.executeUpdate();

            txtBfast.setText("");
            txtSnack.setText("");
            txtLunch.setText("");
            txtDinner.setText("");
            txtTrans.setText("");
            txtMisc.setText("");
            txtUtil.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Input Error. No connection" + ex);
        }
        showTableData();
    }//GEN-LAST:event_btnSaveActionPerformed

    public void showTableData() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/DExpdb", "root", "");
            String sql = "SELECT * FROM Daily_Expense";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tblExp.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input Error. No connection" + ex);

        }
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
            java.util.logging.Logger.getLogger(DailyExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyExpense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JButton btnAddAll;
    private javax.swing.JButton btnAddBfast;
    private javax.swing.JButton btnAddDinner;
    private javax.swing.JButton btnAddLunch;
    private javax.swing.JButton btnAddMisc;
    private javax.swing.JButton btnAddSnack;
    private javax.swing.JButton btnAddTrans;
    private javax.swing.JButton btnAddUtil;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel icClose;
    private javax.swing.JLabel icMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblExp;
    private javax.swing.JTextField txtBfast;
    private javax.swing.JTextField txtDinner;
    private javax.swing.JTextField txtLunch;
    private javax.swing.JTextField txtMisc;
    private javax.swing.JTextField txtSnack;
    private javax.swing.JTextField txtTotBfast;
    private javax.swing.JTextField txtTotDinner;
    private javax.swing.JTextField txtTotLunch;
    private javax.swing.JTextField txtTotMisc;
    private javax.swing.JTextField txtTotSnack;
    private javax.swing.JTextField txtTotTrans;
    private javax.swing.JTextField txtTotUtil;
    private javax.swing.JTextField txtTrans;
    private javax.swing.JTextField txtUtil;
    // End of variables declaration//GEN-END:variables
}
