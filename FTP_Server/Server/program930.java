package FTP_Server;

import java.io.*;
import java.net.*;

public class program930
{
    public static int ClientCount = 1;
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
        System.out.println("New thread gets created for client : " + ClientCount);
        ClientCount++;
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous server");

            while(true)
            {
                // Read command from client
                String command = dis.readUTF();

                System.out.println("Command recieved from client : " + command);

                String Part[] = command.split(" ");

                String operation = Part[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    if(Part.length != 1)
                    {
                        dos.writeUTF("Usage : QUIT");
                        continue;
                    }
                    dos.writeUTF("Disconnected from server");
                    ClientCount--;
                    break;
                    
                }

                if(operation.equals("GET"))
                {
                    if(Part.length != 2)
                    {
                        dos.writeUTF("Usage : GET <filename>");
                        continue;
                    }
                }
                    
                else if(operation.equals("PUT"))
                {
                    if(Part.length != 2)
                    {
                        dos.writeUTF("Usage : PUT <filename>");
                        continue;
                    }
                }
                else if(operation.equals("INFO"))
                {
                    if(Part.length != 2)
                    {
                        dos.writeUTF("Usage : INFO <filename>");
                        continue;
                    }

                    File file = new File(Part[1]);

                    if(file.exists())
                    {
                        String info = "";

                        info = info + "File Name : " + file.getName() + "\n";
                        info = info + "File Size : " + file.length() +  "\n";
                        info = info + "Readable : " + file.canRead() +  "\n";
                        info = info + "Writable : " + file.canWrite() +  "\n";

                        dos.writeUTF(info);

                    }
                    else
                    {
                        dos.writeUTF("File Does not exist");
                    }
                }
                // SIZE Demo.txt
                else if(operation.equals("SIZE"))
                {
                    if(Part.length != 2)
                    {
                        dos.writeUTF("Usage : SIZE <filename>");
                        continue;
                    }

                    File file = new File(Part[1]);

                    if(file.exists() && file.isFile())
                    {
                        dos.writeUTF("File Size is : " + file.length() + " bytes");
                    }
                    else
                    {
                        dos.writeUTF("File Does not exist");
                    }
                }
                else if(operation.equals("EXISTS"))
                {
                    if(Part.length != 2)
                    {
                        dos.writeUTF("Usage : EXISTS <filename>");
                        continue;
                    }

                    File file = new File(Part[1]);

                    if(file.exists() && file.isFile())
                    {
                        dos.writeUTF("File Exist");
                    }
                    else
                    {
                        dos.writeUTF("File Does not exist");
                    }
                }

                // RENAME Demo.txt DemoX.txt
                else if(operation.equals("RENAME"))
                {
                    if(Part.length != 3)
                    {
                        dos.writeUTF("Usage : RENAME <Oldfilename> <Newfilename>");
                        continue;
                    }

                    File oldFile = new File(Part[1]);
                    File newfile = new File(Part[2]);

                    if(oldFile.exists())
                    {
                        dos.writeUTF("Source file does not exist");
                        continue;
                    }

                    if(oldFile.renameTo(newfile))
                    {
                        dos.writeUTF("File renamed successfully");
                    }
                    else
                    {
                        dos.writeUTF("Unable to rename file");
                    }
                }
                else if(operation.equals("DELETE"))
                {
                    if(Part.length != 2)
                    {
                        dos.writeUTF("Usage : DELETE <filename>");
                        continue;
                    }

                    File file = new File(Part[1]);

                    if(file.exists() == false)
                    {
                        dos.writeUTF("There is no such file");
                        continue;
                    }

                    if(file.delete())
                    {
                        dos.writeUTF("File deleted successfully");
                    }
                    else
                    {
                        dos.writeUTF("Unable to delete the file");
                    }

                }
                else if(operation.equals("LIST"))
                {
                    if(Part.length != 1)
                    {
                        dos.writeUTF("Usage :LIST");
                        continue;
                    }

                    // Current directory's object
                    File folder = new File(".");

                    File files[] = folder.listFiles();

                    String result = "";

                    if(files != null)
                    {
                        for(File f : files)
                        {
                           if(f.isFile())
                           {
                                result = result + f.getName() + "\n";
                           }
                        }
                    }
                    if(result.length() == 0)
                    {
                        result = "No files available";
                       
                    }

                    dos.writeUTF(result);
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
