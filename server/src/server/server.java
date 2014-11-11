package server;
import java.net.*;
import java.util.*;
import java.io.*;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
 
public class server
{
    public static void main(String[] args) throws Exception {
        int port = 4444;
        
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("The socket was created and it is using port " + port);
        
        System.out.println("Waiting for connection from client.");
    	Socket ClientSocket = serverSocket.accept();
    	String objectIn = "";
    	JSONInputStream JsonIn = new JSONInputStream(ClientSocket.getInputStream());
    	JSONOutputStream stringOut = new JSONOutputStream(ClientSocket.getOutputStream());
        
        //this will create a loop that continually waits for a client to connect to the socket.
        while(!objectIn.equalsIgnoreCase("bye")){
        	System.out.println("the connection from client has been accepted.");
        	
        	try{
        	
        	objectIn = (String)JsonIn.readObject();
        	//System.out.println(objectIn);
        	
        	stringOut.writeObject(objectIn);
        	} catch(Exception E) {
        		E.printStackTrace();
        	}
                System.out.println();
            }
        System.out.println("the connection has been closed");
        	
        }
    }
