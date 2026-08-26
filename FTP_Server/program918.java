package FTP_Server;

import java.io.*;
import java.net.*;

public class program918 
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


            
        }
        catch(Exception e)
        {
            System.out.println("Exception occured" + e);
        }
    }
}
