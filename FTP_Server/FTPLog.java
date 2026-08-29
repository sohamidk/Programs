package FTP_Server;

import java.io.*;
import java.net.*;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;
import java.util.logging.SimpleFormatter;

public class FTPLog
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
                LogFile(socket, command);

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
                else if(operation.equals("MULT"))
                {
                    result = no1 * no2;
                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("DIV"))
                {
                    result = no1 / no2;
                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("MOD"))
                {
                    result = no1 % no2;
                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("MAX"))
                {
                    if(no1 > no2)
                    {
                        dos.writeUTF("Maximum Number is : " + no1);
                    }
                    else
                    {
                        dos.writeUTF("Maximum Number is : " + no2);
                    }
                }
                else if(operation.equals("MIN"))
                {
                    if(no1 < no2)
                    {
                        dos.writeUTF("Minimum Number is : " + no1);
                    }
                    else
                    {
                        dos.writeUTF("Minimum Number is : " + no2);
                    }
                }
                

                if(Part.length != 2)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double no = Double.parseDouble(Part[1]);

                if(operation.equals("EVEN"))
                {
                    if(no % 2 == 0)
                    { 
                        dos.writeUTF(no + " is Even number");
                    }
                    else
                    {
                        dos.writeUTF(no + " is not Even number");
                    }
                }
                else if(operation.equals("ODD"))
                {
                    if(no % 2 != 0)
                    {
                        dos.writeUTF(no + " is Odd number");
                    }
                    else
                    {
                        dos.writeUTF(no + " is not Odd number");
                    }
                }
                else if(operation.equals("PRIME"))
                {
                   boolean bFlag = true;

                   if(no <= 1)
                   {
                        bFlag = false;
                   }
                   else
                   {
                        int i = 0;
                        for(i = 2; i <= no / 2; i++)
                        {
                            if(no % i == 0)
                            {
                                bFlag = false;
                                break;
                            }
                        }
                        if(bFlag == true)
                        {
                            dos.writeUTF(no + "Is Prime number");
                        }
                        else
                        {
                            dos.writeUTF(no + "Is not Prime number");
                        }
                   }
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

    public static void LogFile(Socket socket, String command)
    {
        try
        {

           Logger logger = Logger.getLogger("FTP server");

           FileHandler fhobj = new FileHandler("Server.log", true);
            fhobj.setFormatter(new SimpleFormatter());

            logger.addHandler(fhobj);

            System.out.println("Log of clients : ");

            logger.info("Client connected : " + socket.getInetAddress());

            logger.info("Command recieved : " + command);

            fhobj.close();

        }
        catch(Exception e)
        {
            System.out.println("Exception Error : " + e);
        }

    }
}// End of class
