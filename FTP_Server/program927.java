package FTP_Server;

import java.io.*;
import java.net.*;

public class program927
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9001);

            System.out.println("----------------------------------------------");
            System.out.println("---------Marvellous Server Started------------");
            System.out.println("----------------------------------------------");

            // Loop for Multiple client request
            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientssocket = serversocket.accept();
                
                System.out.println("Client connected successfully");

                // Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientssocket));

                t.start();

            }// End of while
            
        }
        catch(Exception e)
        {
            System.out.println("Exception occured" + e);
        }

    }// End of main

    // Request handler for each client request
    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command recieved from client : " + command);

                String Part[] = command.split(" ");

                String operation = Part[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(operation.equals("GET"))
                {
                
                }
                    
                else if(operation.equals("PUT"))
                {

                }
                else if(operation.equals("INFO"))
                {

                }
                else if(operation.equals("SIZE"))
                {

                }
                else if(operation.equals("EXISTS"))
                {

                }
                else if(operation.equals("RENAME"))
                {

                }
                else if(operation.equals("DELETE"))
                {

                }
                else if(operation.equals("LIST"))
                {

                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }

            }// End of while

            socket.close();
            dis.close();
            dos.close();

            System.out.println("Client Disconnected.");
            
        }// End of try

        catch(Exception e)
        {
            System.out.println("Exception Error : " + e);
        }

    }// End of HandleClientRequest

}// End of class
