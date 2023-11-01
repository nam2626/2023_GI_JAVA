package step02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoMultiServer {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("에코 서버 오픈 완료....");

			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				EchoServerWorker worker = new EchoServerWorker(client);
				worker.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







