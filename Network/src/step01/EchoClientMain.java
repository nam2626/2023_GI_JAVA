package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		try(Socket server = new Socket("192.168.5.101",1234);
				BufferedReader br = new BufferedReader(
						new InputStreamReader(server.getInputStream()));
				PrintWriter pw = new PrintWriter(server.getOutputStream());
				Scanner sc = new Scanner(System.in)){
			
			while(true) {
				System.out.print("전송할 메세지 입력 : ");
				String msg = sc.nextLine();
				pw.println(msg);
				pw.flush();
				if(msg.equals("exit")) break;
				msg = br.readLine();
				System.out.println(msg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







