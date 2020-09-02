package com.github.samsoec;

import example.enumeration.Enum;
import example.enumeration.Enum.EnumMessage;

public class EnumMain {
    public static void main(String[] args) {

        System.out.println("Hello");

        EnumMessage.Builder builder = EnumMessage.newBuilder();

        builder.setId(2)
                .setDayName(Enum.DayName.MONDAY); // enums

        EnumMessage enumMessage = builder.build();

        System.out.println(enumMessage);
    }
}
