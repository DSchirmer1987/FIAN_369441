package networkclient.model;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RechnerClient {
	private Integer port;
	private Scanner scanner;
	private Writer writer;
	private PrintWriter printWriter;
	private Integer zahlEins;
	private Integer zahlZwei;
	
	public RechnerClient(Integer port, Integer zahlEins, Integer zahlZwei) {
		this.port = port;
		this.zahlEins = zahlEins;
		this.zahlZwei = zahlZwei;
	}
	
	private void connect(String operation) {
		try(Socket socket = new Socket("localhost", this.port)){
			scanner = new Scanner(socket.getInputStream(), "UTF-8");
			writer = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
			printWriter = new PrintWriter(this.writer, true);
			printWriter.println(this.zahlEins);
			printWriter.println(this.zahlZwei);
			printWriter.println(operation);
			System.out.println(scanner.nextLine());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void add() {
		this.connect("add");
	}
	
	public void sub() {
		this.connect("sub");
	}
	
	public void div() {
		this.connect("div");
	}
	
	public void mul() {
		this.connect("mul");
	}
}
