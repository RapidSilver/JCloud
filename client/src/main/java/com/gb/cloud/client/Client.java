package com.gb.cloud.client;


import com.gb.cloud.common.MyFile;

import io.netty.handler.codec.serialization.ObjectEncoderOutputStream;


import java.io.IOException;

import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Client {
    public static void main(String[] args) {
        ObjectEncoderOutputStream oeos = null;

        try (Socket socket = new Socket("localhost", 8189)) {
            Path file= Paths.get("/home/kira/Dropbox/Cod/Jcloud/client/src/main/java/com/gb/cloud/client/testfile.txt");
            oeos = new ObjectEncoderOutputStream(socket.getOutputStream());
            String fileName = String.valueOf(file.getFileName());
            MyFile myFile = new MyFile(fileName, Files.readAllBytes(file));
            oeos.writeObject(myFile);
            oeos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oeos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
