package FTP_Server;

import java.io.*;
import java.net.*;

public class program924
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

                if(Part.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double no1 = Double.parseDouble(Part[1]);
                double no2 = Double.parseDouble(Part[2]);

                double result = 0.0;

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;
                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;
                    dos.writeUTF("Result is : " + result);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }

            }// End of while

            socket.close();

            System.out.println("Client Disconnected.");
        }

        catch(Exception e)
        {
            System.out.println("Exception Error : " + e);
        }
    }

}// End of class
