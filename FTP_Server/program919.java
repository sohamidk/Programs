package FTP_Server;

import java.io.*;
import java.net.*;
import java.util.*;


public class program919
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("----------------------------------------------");
            System.out.println("---------Marvellous Client Started------------");
            System.out.println("----------------------------------------------");

            Socket socket = new Socket(
                                       "127.0.0.1",
                                        9001
                                        );
            
            System.out.println("Connection with server is successful");

            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception occured" + e);
        }
    }
}
