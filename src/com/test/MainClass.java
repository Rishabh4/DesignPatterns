package com.test;

import com.test.tga.creational.builder.Address;
import com.test.tga.creational.builder.User;
import com.test.tga.creational.builder.UserDTO;

import java.time.LocalDate;

public class MainClass {

    public static void main(String[] args) {
        UserDTO userDTO = directBuild(UserDTO.builder(), createUser());
        System.out.println(userDTO);
    }

    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user){
        return UserDTO.builder()
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    private static User createUser() {
        User user = new User();
        user.setFirstName("Rishabh");
        user.setLastName("Jain");
        user.setAddress(getAddress());
        user.setBirthday(LocalDate.of(1992, 1, 4));
        return user;
    }

    private static Address getAddress(){
        Address address = new Address();
        address.setHouseNumber("7/1112");
        address.setStreet("Bartala Yadgar");
        address.setCity("Saharanpur");
        address.setState("Uttar Pradesh");
        address.setZipCode("247001");
        return address;
    }

}
