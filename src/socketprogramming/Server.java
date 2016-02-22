

package socketprogramming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dragonslayer
 */
public class Server {
    
    public static void main (String[] args){
        try {
            ServerSocket ss = new ServerSocket(54321);
            Socket connectionServerSide = ss.accept();
            PrintStream toClient = new PrintStream(connectionServerSide.getOutputStream());
            
            System.out.println("Enter data to send:");
            Scanner read = new Scanner(System.in);
            String msg = read.nextLine();
            toClient.println(msg);
            //toClient.println("Howdy, Client!");
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
