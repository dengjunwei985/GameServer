package config;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerConfig {

    private static final int PORT=6573;
    private static final int MAX_NUM=20;

    private ServerSocket serverSocket;
    private ExecutorService threadPool;

    public ServerConfig(){
        try {
            serverSocket=new ServerSocket(PORT);
            threadPool= Executors.newFixedThreadPool(MAX_NUM);
            System.out.println("the server start");
            System.out.println("----------------------------");
        } catch (IOException e) {
            System.out.println("创建服务器实例失败："+e.getMessage());
            e.printStackTrace();
        }
    }


    public void start() {
        while(true){
            
        }

    }
}
