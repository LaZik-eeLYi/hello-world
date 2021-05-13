package com.lupan.javaStudy.chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * TODO socket编程客户端
 *
 * @author lupan
 * @version 2016/1/19 0019
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1",30000);

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line =  br.readLine();

        System.out.println("服务器端数据："+line);

        br.close();

        s.close();
    }
}
