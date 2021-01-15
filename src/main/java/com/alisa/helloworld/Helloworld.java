package com.alisa.helloworld;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Helloworld {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("E:/output",true);
        System.setOut(new PrintStream(outputStream));
        System.out.println("hello world");
        System.out.println("XXXXXXxxx");
    }
}
