package FTP_Server;

import java.io.*;
import java.net.*;
import java.util.*;


public class program925
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            ServerSocket serversocket = new ServerSocket(9001);

            System.out.println("----------------------------------------------");
            System.out.println("---------Marvellous Client Started------------");
            System.out.println("----------------------------------------------");

            Socket socket = new Socket(
                                       "127.0.0.1",
                                        9001
                                        );
            
            System.out.println("Connection with server is successful");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            
            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("----------------------------------------------");
                System.out.println("Mathematical commands");
                System.out.println("----------------------------------------------");

                System.out.println("Enter command : ");
                String command = sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println(response);
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Exception occured" + e);
        }
    }
}
