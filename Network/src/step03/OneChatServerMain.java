package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(1234);
				Socket client = server.accept();
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				Scanner sc = new Scanner(System.in)){

			Worker worker = new Worker(client);
			worker.start();
			
			while(true) {
				System.out.println("메세지 입력>");
				String str = sc.nextLine();
				if(str.equals("exit") || client.isClosed()) break;
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class Worker extends Thread{
		private Socket socket;

		public Worker(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()))){
				String str = null;
				while((str = br.readLine()) != null) {
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}








