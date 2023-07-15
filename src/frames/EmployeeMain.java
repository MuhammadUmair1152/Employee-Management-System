package frames;

import java.sql.*;

public class EmployeeMain extends javax.swing.JFrame {

    public EmployeeMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("By");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("HUM SOLUTIONS");

        searchbtn.setBackground(new java.awt.Color(204, 204, 204));
        searchbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(51, 51, 51));
        searchbtn.setText("SEARCH EMPLOYEE");
        searchbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(204, 204, 204));
        updatebtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(51, 51, 51));
        updatebtn.setText("UPDATE EMPLOYEE");
        updatebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        viewbtn.setBackground(new java.awt.Color(204, 204, 204));
        viewbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(51, 51, 51));
        viewbtn.setText("VIEW ALL EMPLOYEES");
        viewbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(204, 204, 204));
        deletebtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(51, 51, 51));
        deletebtn.setText("DELETE EMPLOYEE");
        deletebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("WELCOME TO");

        addbtn.setBackground(new java.awt.Color(204, 204, 204));
        addbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(51, 51, 51));
        addbtn.setText("ADD EMPLOYEE");
        addbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        addbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addbtnKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("\"EMPLOYEE MANAGEMENT SYSTEM\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        search ser = new search(this, true);
        ser.setVisible(true);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        update up = new update(this, true);
        up.setVisible(true);
    }//GEN-LAST:event_updatebtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        view p = new view();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPS", "root", "admin12");
            System.out.println("Connection successful");

            String selectQuery = "SELECT * FROM Employee";
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectQuery);

            while (resultSet.next()) {
                int empNo = resultSet.getInt("emp_no");
                String empName = resultSet.getString("emp_name");
                String designation = resultSet.getString("desig");
                String department = resultSet.getString("dept");
                int salary = resultSet.getInt("salary");

                p.jLabel1.setText(department);
                p.setVisible(true);
            }

            resultSet.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_viewbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        delete del = new delete(this, true);
        del.setVisible(true);
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        add ad = new add(this, true);
        ad.setVisible(true);
    }//GEN-LAST:event_addbtnActionPerformed

    private void addbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbtnKeyPressed

    }//GEN-LAST:event_addbtnKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMain().setVisible(true);

            }
        });
    }

   public static Connection getDBConnection() throws Exception {
        //System.out.println(oracle.jdbc.driver.OracleDriver.BUILD_DATE);
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish the connection
        String url = "jdbc:mysql://localhost:3306/EMPS?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "admin12";

        Connection myConnection = DriverManager.getConnection(url, username, password);
        return myConnection;
        //load the driver

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
