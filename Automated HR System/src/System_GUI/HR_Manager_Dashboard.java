/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System_GUI;

/**
 *
 * @author pathi
 */
public class HR_Manager_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form HR_Manager_Dashboard
     */
    public HR_Manager_Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd_Employee = new javax.swing.JButton();
        btnSearch_Employee = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAdd_Depart_and_Desig = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtManagerDashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd_Employee.setBackground(new java.awt.Color(255, 204, 204));
        btnAdd_Employee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd_Employee.setText("Add Employee");
        btnAdd_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_EmployeeActionPerformed(evt);
            }
        });

        btnSearch_Employee.setBackground(new java.awt.Color(255, 153, 204));
        btnSearch_Employee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch_Employee.setText("Search Employee");
        btnSearch_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_EmployeeActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 204));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAdd_Depart_and_Desig.setBackground(new java.awt.Color(255, 204, 153));
        btnAdd_Depart_and_Desig.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd_Depart_and_Desig.setText("Add Departments and Designations");
        btnAdd_Depart_and_Desig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Depart_and_DesigActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtManagerDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtManagerDashboard.setForeground(new java.awt.Color(0, 51, 255));
        txtManagerDashboard.setText("HR Manager Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtManagerDashboard)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAdd_Employee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnSearch_Employee)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd_Depart_and_Desig)
                        .addGap(122, 122, 122)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtManagerDashboard)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd_Employee)
                    .addComponent(btnSearch_Employee))
                .addGap(69, 69, 69)
                .addComponent(btnAdd_Depart_and_Desig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(32, 32, 32))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_EmployeeActionPerformed
         javax.swing.JOptionPane.showMessageDialog(this,"Go Add Employee");
         Add_Employee A1= new Add_Employee();
        A1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdd_EmployeeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"Go Admin Dashboard");
        Admin_Dashboard A1= new Admin_Dashboard();
        A1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSearch_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_EmployeeActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"Go Search Employee");
         Search_Employee_Details S1= new Search_Employee_Details();
        S1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearch_EmployeeActionPerformed

    private void btnAdd_Depart_and_DesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Depart_and_DesigActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"Go Add Department & Designation Dsahboard");
         Add_dep_desig_Dashboard D1= new Add_dep_desig_Dashboard ();
        D1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdd_Depart_and_DesigActionPerformed

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
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HR_Manager_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_Depart_and_Desig;
    private javax.swing.JButton btnAdd_Employee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch_Employee;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtManagerDashboard;
    // End of variables declaration//GEN-END:variables
}
