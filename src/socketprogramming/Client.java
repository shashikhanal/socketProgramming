
package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dragonslayer
 */
public class Client {
    
    public static void main (String[] args){
        try {
            Socket connectionClientSide = new Socket("localhost",54321);
            BufferedReader fromServer = new BufferedReader(
            new InputStreamReader(connectionClientSide.getInputStream()));
            String greetings = fromServer.readLine();
            System.out.println(greetings);
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
