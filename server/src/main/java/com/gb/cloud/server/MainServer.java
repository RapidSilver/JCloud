package com.gb.cloud.server;

import com.gb.cloud.common.MyFile;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8189);
        Socket socket = serverSocket.accept();
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        MyFile mf = (MyFile)ois.readObject();
        System.out.println(mf);
        ois.close();
        socket.close();
        serverSocket.close();
    }
}
