package SocketTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPServer {
	public final static String UDP_BROADCAST_IP = "225.0.0.112";
	private MulticastSocket sock;
    private InetAddress multicastInet;
    private Thread serverThread;
    private int mUserDataMaxLen;
    private volatile boolean mOpenFlag;
    private int port = 7912;
    
	/**
     * 打开
     * 即可以上线
     */
    public synchronized boolean init() {
        try {
            sock = new MulticastSocket(port);
            multicastInet = InetAddress.getByName(UDP_BROADCAST_IP);
            sock.joinGroup(multicastInet);
            sock.setLoopbackMode(false);// 必须是false才能开启广播功能
        } catch (IOException e) {
            e.printStackTrace();
            close();
            return false;
        }

        serverThread = new Thread(new Runnable() {
            @Override
            public void run() {
                receiveAndSend();
            }
        });
        mOpenFlag = true;
        serverThread.start();
        return true;
    }
    
    public void receiveAndSend() {
        byte[] buf = new byte[2024];
        DatagramPacket recePack = new DatagramPacket(buf, buf.length);

        if (sock == null || sock.isClosed() || recePack == null) {
            return;
        }

        while (mOpenFlag) {
            try {
                // waiting for search from host
                sock.receive(recePack);
                System.out.println("server after =receive,recePack.getLength() = "+recePack.getLength());
                // verify the data
                if (verifySearchReq(recePack)) {
                	
                    ResponseBean rb = new ResponseBean();
                    rb.setSn_cmd_id(0);
                    rb.setSn_device_id("test_device_id");
                    rb.setSn_tcp_port(5666);
                    rb.setSn_model_id("test_model_id");
                    rb.setSn_wifi_mac("test_wifi_mac");

                    new Gson()
                    byte[] sendData = Utils.packData(curSeq, SearchConst
                            .PACKET_TYPE_FIND_DEVICE_RSP, userData);
                    if (sendData == null) {
                        return;
                    }

                    DatagramPacket sendPack = new DatagramPacket(sendData, sendData.length,
                            recePack.getAddress(), recePack.getPort());
                    sock.send(sendPack);
                }

            } catch (IOException e) {
                break;
            }
        }
    }
    
    /**
     * 关闭
     */
    public synchronized void close() {
       
        mOpenFlag = false;
        if (serverThread != null) {
            serverThread.interrupt();
        }

        if (sock != null) {
            try {
                sock.leaveGroup(multicastInet);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                sock.close();
                sock = null;
            }
        }
    }
    
    private boolean verifySearchReq(DatagramPacket pack) {
       

        
        return true;
    }

}
