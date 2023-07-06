package networkclient;

import networkclient.model.RechnerClient;

public class AppClient {

	public static void main(String[] args) {
		RechnerClient rc = new RechnerClient(4242, 10, 5);
		
		rc.add();
		rc.sub();
		rc.mul();
		rc.div();

	}

}
