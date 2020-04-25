import java.net.*;
import java.io.*;
import java.util.*;
class InetDemo1
   {
     public static void main(String args[]) throws Exception
         {
              ServerSocket ss=new ServerSocket(2222);
	Socket sc=ss.accept();
	DataInputStream din=new DataInputStream(sc.getInputStream());
	DataOutputStream don=new DataOutputStream(sc.getOutputStream());
	Scanner s1=new Scanner(System.in);
             String get=" ",put=" ";
             while(!get.equals("stop"))
                 {
 		get=din.readUTF();      
		System.out.println("Client Says:"+get); 
		put=s1.next();	               
		 don.writeUTF(put);	
                } 
	ss.close();
        }
 }
