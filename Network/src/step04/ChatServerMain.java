package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	public static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("에코 서버 오픈 완료....");

			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.printf("현재 %d명 접속중입니다.\n",list.size());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class ServerWorker extends Thread{
		private Socket client;

		public ServerWorker(Socket client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream())){
				while(true) {
					String msg = br.readLine();
					if(msg.equals("exit")) break;
					pw.println(msg);
					pw.flush();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(client.getInetAddress() + "님이 접속을 종료하셨습니다.");
			EchoMultiServer.list.remove(this);//접속중인 사용자 관리하는 리스트에서 해당 스레드 객체를 제거
			System.out.printf("현재 %d명 접속중입니다.\n",EchoMultiServer.list.size());
		}

	}
}
