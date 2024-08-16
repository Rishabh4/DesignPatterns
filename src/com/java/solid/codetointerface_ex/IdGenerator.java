package com.java.solid.codetointerface_ex;

import com.java.solid.codetointerface_ex.entity.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class IdGenerator {

    public static void generateId(User user) {

        LocalDateTime created = user.getCreatedOn() != null ? user.getCreatedOn() : LocalDateTime.now(ZoneId.of("UTC"));

        String id = created.format(DateTimeFormatter.BASIC_ISO_DATE) + "-" + UUID.randomUUID();

        user.setId(id);
    }
}