package FTP_Server;

import java.io.*;
import java.net.*;
import java.util.*;


public class program926
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
           
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
                System.out.println("FTP commands");
                System.out.println("----------------------------------------------");


                System.out.println("LIST");
                System.out.println("EXISTs <filename>");
                System.out.println("INFO <filename>");
                System.out.println("SIZE <filename>");
                System.out.println("GET <filename>");
                System.out.println("PUT <filename>");
                System.out.println("DELETE <filename>");
                System.out.println("RENAME <oldfilename> <newfilename>");
                System.out.println("QUIT");

                System.out.println("----------------------------------------------");

                System.out.println("Enter command : ");

                //RENAME Demo.txt DemoX.txt
                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("GET"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : GET <filename>");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("PUT"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : PUT <filename>");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("INFO"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : INFO <filename>");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("SIZE"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : SIZE <filename>");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("EXISTS"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : EXISTS <filename>");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("RENAME"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Usage : RENAME <Oldfilename> <Newfilename>");
                        continue;
                    }   

                    dos.writeUTF(command);
                }
                else if(operation.equals("DELETE"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : DELETE <filename>");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("LIST"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Usage : LIST");
                        continue;
                    }

                    dos.writeUTF(command);
                }
                else if(operation.equals("QUIT"))
                {
                    System.out.println("Thank you for using Marvellous FTP Server");
                    dos.writeUTF(operation);

                    String response = dis.readUTF();
                    System.out.println(response);

                    //It will terminate the client loop
                    break;
                }
                else 
                {
                    System.out.println("There is no such command");
                    continue;
                }

            }// End of while

            socket.close();
            dis.close();
            sobj.close();
            dos.close();

        }// End of try
        catch(Exception e)
        {
            System.out.println("Exception occured" + e);
        }

    }// End of main

}// End of class
