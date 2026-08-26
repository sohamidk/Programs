package FTP_Server;

import java.io.*;
import java.net.*;

public class program921 
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9001);

            System.out.println("----------------------------------------------");
            System.out.println("---------Marvellous Server Started------------");
            System.out.println("----------------------------------------------");

            System.out.println("Server is waiting for cliend request");

            Socket clientssocket = serversocket.accept();
            
            System.out.println("Client connected successfully");

            // Thread gets created for client
            Thread t = new Thread(() -> HandleClientRequest(clientssocket));

            t.start();
            
        }
        catch(Exception e)
        {
            System.out.println("Exception occured" + e);
        }

    }// End of main

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous server");
        }
        catch(Exception e)
        {
            System.out.println("Exception Error : " + e);
        }
    }

}// End of class
