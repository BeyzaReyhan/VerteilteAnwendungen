package a03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TimeServiceMultithreaded {

	public static void main(String[] args) throws IOException {

		Socket client = new Socket("localhost", 7);
		System.out.println("Socket gestartet");

     BufferedWriter out =
             new BufferedWriter(
             		new OutputStreamWriter(client.getOutputStream()));
     BufferedReader in =
             new BufferedReader(
                 new InputStreamReader(client.getInputStream()));
     System.out.println(in.readLine());
     Scanner scn = new Scanner(System.in);
     while (true) {
     	String input = scn.nextLine();
     	System.out.println(input);
     	if (input.equals("ende")) {
     		out.flush();
     		scn.close();
     		in.close();
     		out.close();
     		break;
     	} else if(input.contentEquals("date")) {
     		Clock c = new Clock();
     		out.write(c.date());
     		out.newLine();
     		out.flush();
     		String recv = in.readLine();
     		System.out.println(recv);
     	} else if(input.contentEquals("time")) {
     		Clock c = new Clock();
     		out.write(c.time());
     		out.newLine();
     		out.flush();
     		String recv = in.readLine();
     		System.out.println(recv);
     	}
     } // end while
     
     System.out.println("Ende Echo-Tester");
     client.close();
	}
}