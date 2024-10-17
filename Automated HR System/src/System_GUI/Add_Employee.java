package System_GUI;

import Java_classes.Employee_Details;
import Java_classes.Employee_Details_FileHandler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Add_Employee extends javax.swing.JFrame {

        private String EmployeeName;
        private String EmployeeId;
        private String Gender;
        private String EPFNumber;
        private String DateofBirth;
        private String  Address;
        private String Deparment;
        private String Designation;

   
    public Add_Employee() {
        initComponents();
        
        List<String> departments = FileHandler.readDepartmentsFromFile("departments.txt");
        List<String> designations = FileHandler.readDesignationsFromFile("designations.txt");

        
        for (String department : departments) {
            cmbDepartment.addItem(department);
        }
        for (String designation : designations) {
            cmbDesignation.addItem(designation);
        }
    }

    

public class FileHandler {
    public static List<String> readDepartmentsFromFile(String filename) {
        List<String> departments = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                departments.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return departments;
    }

    
    public static List<String> readDesignationsFromFile(String filename) {
        List<String> designations = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                designations.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return designations;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGender = new javax.swing.JPanel();
        txtAddEmployee = new javax.swing.JLabel();
        txtEmp_Name = new javax.swing.JLabel();
        txtEmp_Id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEPF = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cmbDepartment = new javax.swing.JComboBox<>();
        add_employee = new javax.swing.JButton();
        btnPervious = new javax.swing.JButton();
        cmbDesignation = new javax.swing.JComboBox<>();
        txtDOB = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtGender.setBackground(new java.awt.Color(255, 255, 153));

        txtAddEmployee.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddEmployee.setForeground(new java.awt.Color(0, 0, 204));
        txtAddEmployee.setText("Add Employee Details");

        txtEmp_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmp_Name.setText("Employee Name");

        txtEmp_Id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmp_Id.setText("Employee Id");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Gender");

        txtEPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEPF.setText("EPF Number");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAddress.setText("Address");

        txtDepartment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDepartment.setText("Department");

        txtDesignation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDesignation.setText("Designation");

        cmbGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        cmbDepartment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        add_employee.setBackground(new java.awt.Color(153, 255, 102));
        add_employee.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        add_employee.setText("Add");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });

        btnPervious.setBackground(new java.awt.Color(255, 204, 255));
        btnPervious.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPervious.setText("Pervoius");
        btnPervious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerviousActionPerformed(evt);
            }
        });

        txtDOB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDOB.setText("Date of Birth");

        javax.swing.GroupLayout txtGenderLayout = new javax.swing.GroupLayout(txtGender);
        txtGender.setLayout(txtGenderLayout);
        txtGenderLayout.setHorizontalGroup(
            txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtGenderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(txtGenderLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtGenderLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnPervious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_employee)
                        .addGap(138, 138, 138))
                    .addGroup(txtGenderLayout.createSequentialGroup()
                        .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmp_Name)
                            .addComponent(txtEmp_Id)
                            .addComponent(jLabel4)
                            .addComponent(txtAddress)
                            .addComponent(txtEPF)
                            .addGroup(txtGenderLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDepartment)
                                    .addComponent(txtDesignation)))
                            .addComponent(txtDOB))
                        .addGap(76, 76, 76)
                        .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addGroup(txtGenderLayout.createSequentialGroup()
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField3)
                            .addComponent(jScrollPane1)
                            .addComponent(cmbDesignation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        txtGenderLayout.setVerticalGroup(
            txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtGenderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtAddEmployee)
                .addGap(29, 29, 29)
                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmp_Name)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtGenderLayout.createSequentialGroup()
                        .addComponent(txtEmp_Id)
                        .addGap(18, 18, 18)
                        .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEPF))
                .addGap(18, 18, 18)
                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDOB)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtGenderLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDepartment)
                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesignation)
                            .addComponent(cmbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(txtGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPervious, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(txtGenderLayout.createSequentialGroup()
                        .addComponent(txtAddress)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerviousActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"Go HR  Manager Dashboard");
         HR_Manager_Dashboard M1= new HR_Manager_Dashboard();
        M1.setVisible(true);
        this.dispose();
                        
    }//GEN-LAST:event_btnPerviousActionPerformed

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed
              if (
                jTextField1.getText().isEmpty() || 
                jTextField2.getText().isEmpty() || 
                cmbGender.getSelectedItem().toString().isEmpty() ||
                jTextField3.getText().isEmpty() || 
                jTextField4.getText().isEmpty() || 
                jTextArea1.getText().isEmpty()||
                cmbDepartment.getSelectedItem().toString().isEmpty()||
                cmbDesignation.getSelectedItem().toString().isEmpty()) {
JOptionPane.showMessageDialog(null,"Fileds cannot be empty" ,
                    "Add a new Employee", JOptionPane.WARNING_MESSAGE);
        }
       else 
       {
            String EmployeeName = jTextField1.getText();
            String EmployeeId = jTextField2.getText();
            String Gender = cmbGender.getSelectedItem().toString();
            String EPFNumber = jTextField3.getText();
            String DateofBirth = jTextField4.getText();
            String Address = jTextArea1.getText();
            String Department = cmbDepartment.getSelectedItem().toString();
            String Designation = cmbDesignation.getSelectedItem().toString();
            
     Employee_Details newEmp = new Employee_Details(EmployeeName,EmployeeId,Gender,EPFNumber,DateofBirth, Address,Department,Designation);
            
      boolean success = newEmp.addEmployee();
      
           if (success) {
                 try (FileWriter writer = new FileWriter("Employee.txt", true)) {
                writer.write("EPF Number = " + EPFNumber + System.getProperty("line.separator"));
                writer.write("Employee Name = " + EmployeeName + System.getProperty("line.separator"));
                writer.write(" Address = " + Address + System.getProperty("line.separator"));
                writer.write("Employee Id  = " + EmployeeId + System.getProperty("line.separator"));
                writer.write(" Gender = " + Gender + System.getProperty("line.separator"));
                writer.write("Department = " + Department + System.getProperty("line.separator"));
                writer.write("Designation = " + Designation + System.getProperty("line.separator"));
                writer.write("------------------------------------------" + System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            
                JOptionPane.showMessageDialog(null,"Employee Added successfully" ,
                        "Add a new Employee", JOptionPane.INFORMATION_MESSAGE);       
            } else {
JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application"
   ,"Add a new Employee", JOptionPane.WARNING_MESSAGE);
            }
       }
        
        javax.swing.JOptionPane.showMessageDialog(this,"Go HR Manager Dashboard");
        
         HR_Manager_Dashboard D1= new HR_Manager_Dashboard ();
        D1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_employeeActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee;
    private javax.swing.JButton btnPervious;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbDesignation;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel txtAddEmployee;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtDOB;
    private javax.swing.JLabel txtDepartment;
    private javax.swing.JLabel txtDesignation;
    private javax.swing.JLabel txtEPF;
    private javax.swing.JLabel txtEmp_Id;
    private javax.swing.JLabel txtEmp_Name;
    private javax.swing.JPanel txtGender;
    // End of variables declaration//GEN-END:variables
}
