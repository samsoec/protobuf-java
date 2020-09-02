package com.github.samsoec;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple;

import java.util.Arrays;

public class ToJSONMain {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        System.out.println("Hello");

        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();

        builder.setId(42)
                .setIsSimple(true)
                .setName("Rizal");

        builder.addSimpleList(1)
                .addSimpleList(2);

        builder.addAllSimpleList(Arrays.asList(4, 5, 6));

        String jsonString = JsonFormat.printer().print(builder);

        System.out.println(jsonString);

        Simple.SimpleMessage.Builder otherBuilder = Simple.SimpleMessage.newBuilder();

        JsonFormat.parser().ignoringUnknownFields()
                .merge(jsonString, otherBuilder);

        System.out.println(otherBuilder);
    }

}
