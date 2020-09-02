package com.github.samsoec;

import com.example.tutorial.AddressBookProtos;

import java.util.Arrays;

public class ExerciseMain {
    public static void main(String[] args) {

        System.out.println("Hello");

        AddressBookProtos.AddressBook.Builder addressBook = AddressBookProtos.AddressBook.newBuilder();

        addressBook.addPeople(newPerson(1, "rizal", "sam.fauzy@gmail.com"));

        addressBook.addPeople(newPerson(2, "bgst", "bgst@gmail.com",
                newPhoneNumber("031", AddressBookProtos.Person.PhoneType.HOME),
                newPhoneNumber("081", AddressBookProtos.Person.PhoneType.MOBILE),
                newPhoneNumber("021", AddressBookProtos.Person.PhoneType.WORK)
        ));

        System.out.println(addressBook);
    }

    public static AddressBookProtos.Person newPerson (int id, String name, String email, AddressBookProtos.Person.PhoneNumber ...number) {
        return AddressBookProtos.Person.newBuilder()
                .setId(id)
                .setName(name)
                .setEmail(email)
                .addAllPhones(Arrays.asList(number))
                .build();
    }

    public static AddressBookProtos.Person.PhoneNumber newPhoneNumber (String number, AddressBookProtos.Person.PhoneType phoneType) {
        return AddressBookProtos.Person.PhoneNumber.newBuilder()
                .setNumber(number)
                .setType(phoneType)
                .build();
    }
}
