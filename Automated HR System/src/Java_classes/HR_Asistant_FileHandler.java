/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_classes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HR_Asistant_FileHandler {
    private static final String HR_ASISTANT_FILE = "hr_asistant_details.txt";

    public static void addHRAsistant(String hrAsistantName, String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(HR_ASISTANT_FILE, true))) {
            writer.write("HR Asistant Name: " + hrAsistantName + "\n");
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("------------\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
