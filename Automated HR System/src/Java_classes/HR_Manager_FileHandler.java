package Java_classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HR_Manager_FileHandler {
    private static final String HR_MANAGER_FILE = "hr_manager_details.txt";

    public static void addHRManager(String hrManagerName, String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(HR_MANAGER_FILE, true))) {
            writer.write("HR Manager Name: " + hrManagerName + "\n");
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("------------\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


