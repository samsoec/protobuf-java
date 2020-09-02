package com.github.samsoec;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello");

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        builder.setId(42)
                .setIsSimple(true)
                .setName("Rizal");

        builder.addSimpleList(1)
                .addSimpleList(2);

        builder.addAllSimpleList(Arrays.asList(4, 5, 6));

        System.out.println(builder.toString());

        SimpleMessage message = builder.build();

        // write proto buffer binary to file
        try {
            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");

            message.writeTo(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // send as byte array
        // byte [] bytes = message.toByteArray()

        try {
            System.out.println("Read from file");
            FileInputStream fileInputStream = new FileInputStream("simple_message.bin");

            SimpleMessage simpleMessage = SimpleMessage.parseFrom(fileInputStream);

            System.out.println(simpleMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
