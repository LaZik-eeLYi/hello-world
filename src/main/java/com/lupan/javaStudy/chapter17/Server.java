package com.lupan.javaStudy.chapter17;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TODO socket编程服务器端
 *
 * @author lupan
 * @version 2016/1/19 0019
 */
public class Server {

    public static void main(String[] args) throws Exception{

        //创建用于监听的socket
        ServerSocket ss = new ServerSocket(30000);

        while(true){
            Socket s = ss.accept();

            PrintStream ps = new PrintStream(s.getOutputStream());

            ps.println("服务器端收到信息！");

            ps.close();

            s.close();

        }
    }
}
