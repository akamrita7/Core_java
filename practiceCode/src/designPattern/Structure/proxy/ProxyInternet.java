package designPattern.Structure.proxy;

import java.util.ArrayList;

public class ProxyInternet implements Internet{
    private RealInternet realInternet = new RealInternet();
    private static ArrayList<String>  bannedServer = new ArrayList<>() ;
    static {
        bannedServer.add("abc");
        bannedServer.add("xyy");
        bannedServer.add("abx");
        bannedServer.add("ban");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedServer.contains(serverHost)){
            throw new Exception("Access Denied to " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }
}
