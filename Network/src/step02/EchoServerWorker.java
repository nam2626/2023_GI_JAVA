package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoServerWorker extends Thread{
	private Socket client;

	public EchoServerWorker(Socket client) {
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
	}

}
