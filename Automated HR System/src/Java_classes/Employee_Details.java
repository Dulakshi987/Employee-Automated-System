
package Java_classes;

import Java_classes.Employee_Details_FileHandler;
import Java_classes.Department_roles.Designation_roles;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Employee_Details {
   private String  EmployeeName;
    private String  EmployeeId;
    private String Gender;
    private String EPFNumber;
    private String DateofBirth;
    private String  Address;
    private String Deparment;
    private String Designation;
    
    private int EmployeeCount;
    Employee_Details_FileHandler Employee_FILE = new Employee_Details_FileHandler("Employee.txt");
  
     public static void Employee_Details(String Employee) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Employee.txt", true))) {
            writer.write(Employee);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     public Employee_Details(){}
    
    public Employee_Details(String EmployeeName, String EmployeeId, String Gender, String EPFNumber, String DateofBirth, String Address, String Deparment, String Designation) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.Gender = Gender;
        this.EPFNumber = EPFNumber;
        this.DateofBirth = DateofBirth;
        this.Address = Address;
        this.Deparment = Deparment;
        this.Designation = Designation;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }
 
    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }


    public String getEPFNumber() {
        return EPFNumber;
    }
    
    public void setEPFNumber(String EPFNumber) {
        this.EPFNumber = EPFNumber;
    }
    
    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDeparment() {
        return Deparment;
    }

    public void setDeparment(String Deparment) {
        this.Deparment = Deparment;
    }    
    
    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int EmployeeCount) {
        this.EmployeeCount = EmployeeCount;
    }

    

           public boolean addEmployee() {
        
        if(!Employee_FILE.create_NewFile())
        {
String record =  EmployeeName + " " + EmployeeId + " " + EPFNumber +" " +DateofBirth + " "+ Gender + " "
        +  Address+" "  +Deparment+ " "+Designation + " ";
System.err.println(EmployeeId + " " + EmployeeName + " " + EPFNumber +" " +DateofBirth+ " " 
        + Gender + " " +  Address+" "  +Deparment+ " "+Designation + " ");
            return Employee_FILE.writeDataToFile(record);
        }
        return false;
    }
    
   public static void SearchEmployee(String Employee) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Employee.txt", true))) {
            writer.write(Employee);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
         public boolean searchEmployee(String keyword) 
      {
        boolean isFound = false;   
        try {
            String[] words =null ;          
            BufferedReader bufferedReader = Employee_FILE.readAFile();
            String employee;       
            outerloop:
            while ((employee = bufferedReader.readLine()) != null) 
                
            {              
                words = employee.split(" ");          
                for (String word : words) 
                {
                    if (word.equals(keyword)) 
                    {
                        isFound = true;                      
                        this.setEmployeeId(words[0]);
                        this.setEmployeeName(words[1]);
                        this.setEPFNumber(words[2]);
                  this.setDateofBirth(words[3]);
                    this.setGender(words[4]);
                 this.setDepartment(words[6]);
                    this.setDesignation(words[7]);
                        
                        break outerloop;
                    }
                }
            }
        } catch (Exception e) {
             System.err.println("Something went wrong searching Employee" + e);
        } 
        return isFound;
    }
    
       public String viewAllEmployee () 
      {
        String Employee, allEmployee = " ";
        String[] words = null;
        int count = 1;
        BufferedReader bufferedReader = Employee_FILE.readAFile();
        try {
            while ((Employee = bufferedReader.readLine()) != null) {     
                words = Employee.split(" ");
allEmployee = allEmployee + words[1] + "\t" + words[2] + "\t" + 
        words[3] + "\n";
                count++;               
            }
        } catch (Exception e) {
            System.err.println("Something went wrong when vewing Employees" + e);
        }
        setEmployeeCount(count);
        return allEmployee;
    }

    public String getDepartment() {
           return Deparment;
    }

    public String getDesignation() {
           return Designation;

    }

    public String getGender() {
        return Gender;
    }

    private void setDesignation(String Designation) {
       this.Designation = Designation;
    }

    private void setGender(String Gender) {
        this.Gender = Gender;
    }

    private void setDepartment(String Department) {
        this.Deparment =Department;
    }
}
       
     
    
  