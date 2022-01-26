package com.codegym;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Đọc dữ liệu của file A và sau đó copy sang B
        //Để copy thì đọc file A
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("demo.txt");//đọc file đã tồn tại
            DataInputStream dis = new DataInputStream(inputStream);
            OutputStream outputStream = new FileOutputStream("demo1.txt");//Nếu file chưa tồn tại sẽ tự tạo
            DataOutputStream dos = new DataOutputStream(outputStream);
            //Copy sang file B
            dos.writeBytes(dis.readLine());
        } catch (EOFException e) {
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeToFile(String path) throws IOException {
        OutputStream outputStream = new FileOutputStream(path);//Nếu file chưa tồn tại sẽ tự tạo
        DataOutputStream dos = new DataOutputStream(outputStream);
        dos.writeBytes("Nguyễn Minh Quân\n");
        dos.writeBytes("Nguyễn Minh Quân\n");
        dos.writeBytes("Nguyễn Minh Quân\n");
        dos.writeBytes("Nguyễn Minh Quân");
        dos.close();
        outputStream.close();
    }

    public static void readFile(String path) throws IOException {
        InputStream inputStream = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(inputStream);
        System.out.println(dis.readLine());
    }
}
