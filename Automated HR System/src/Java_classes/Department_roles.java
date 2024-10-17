package Java_classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Department_roles {

    public static void saveDepartment(String departmentName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("departments.txt", true))) {
            writer.write(departmentName);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   

    public class Designation_roles {
        
    public static void saveDesignation(String designationName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("designations.txt", true))) {
            writer.write(designationName);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}

