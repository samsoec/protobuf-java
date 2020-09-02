package com.github.samsoec;

import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

import java.util.Arrays;

public class ComplexMain {

    public static void main(String[] args) {
        System.out.println("Hello");

        DummyMessage oneDummy = newDummyMessage(1, "Rizal");

        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        builder.setOneDummy(oneDummy);

        builder.addMultipleDummy(newDummyMessage(2, "samsoec"))
                .addMultipleDummy(newDummyMessage(3, "awikwok"));

        builder.addAllMultipleDummy(Arrays.asList(
                newDummyMessage(4, "wkwkwk"),
                newDummyMessage(5, "hahaha")
        ));

        ComplexMessage complexMessage = builder.build();

        System.out.println(complexMessage);
    }

    public static DummyMessage newDummyMessage(int id, String name) {

        DummyMessage.Builder builder = DummyMessage.newBuilder();

        return builder.setId(id)
                .setName(name)
                .build();

    }
}
