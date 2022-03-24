package JavaAssignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

class Ping
{
        public void runSystemCommand(String command) {

            try {
                Process p = Runtime.getRuntime().exec(command);
                BufferedReader inputStream = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));

                String s = "";

                while ((s = inputStream.readLine()) != null) {
                    System.out.println(s);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
}

public class JavaAssignment3 {
    public static void main(String[] args) {
        String ipAddress;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ipAddress =scan.nextLine();

        Ping ping = new Ping();
        ping.runSystemCommand("ping " + ipAddress);
    }
}
