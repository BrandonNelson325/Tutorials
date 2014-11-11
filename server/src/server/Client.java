package server;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
 
public class Client implements Serializable
{
    public static void main(String[] args)
    {
        new Client();
    }
     
    public Client()
    {
        Scanner scanner = new Scanner(System.in);
        
        try {
            Socket socket = new Socket("localhost",4444);
          //open the streams
            JSONOutputStream stringOut = new JSONOutputStream(socket.getOutputStream());
            JSONInputStream JsonFromServer = new JSONInputStream(socket.getInputStream());
            // get input from the user.
            System.out.println("Send a message to the server: ");
            String userInput = "";
            String objectFromServer = "";
            
            do{
            	userInput = scanner.nextLine();
            try{
    			stringOut.writeObject(userInput);
    		}
    		catch(Exception E){
    			E.printStackTrace();
    		}
            
            try{
            	
            	objectFromServer = (String)JsonFromServer.readObject();
            	System.out.println("The Server Says: " + objectFromServer );
            	
            	} catch(Exception E){
        			E.printStackTrace();
        		} 
            }
            while(!userInput.equalsIgnoreCase("bye"));
            socket.close();
            
        } catch (IOException exception) {
           System.out.println("Error: " + exception);
        }
        
        
    }
}


