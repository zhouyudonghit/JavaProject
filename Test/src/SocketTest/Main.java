package SocketTest;

import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocketServer socketServer = new SocketServer();
//		socketServer.startServer();
		String str = "{\r\n" + 
				"    	\"sn_device_id\":	\"SNTEST194143aca1ba41\",\r\n" + 
				"    	\"sn_model_id\":	\"0078009200010000\",\r\n" + 
				"    	\"sn_wifi_mac\":	\"c8478cfa7e9f\",\r\n" + 
				"    	\"sn_tcp_port\":	8866,\r\n" + 
				"    	\"sn_cmd_id\":	1\r\n" + 
				"    }";
		try {
			byte[] bytes = str.getBytes("utf-8");
			System.out.print("legnth = "+bytes.length);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(null instanceof String);
	}

}
