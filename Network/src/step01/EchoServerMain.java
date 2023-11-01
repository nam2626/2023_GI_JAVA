package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(1234);){
			System.out.println("에코 서버 오픈 완료....");
			
			try(Socket client = server.accept();
					BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream())){
			
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				
				while(true) {
					String msg = br.readLine();
					if(msg.equals("exit")) break;
					pw.println(msg);
					pw.flush();
				}
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}





