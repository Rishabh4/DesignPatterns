package com.java.solid.encapsulation.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.solid.encapsulation.entity.User;
import com.java.solid.encapsulation.service.UserPermissionService;
import com.java.solid.encapsulation.service.UserPersistenceService;
import com.java.solid.encapsulation.service.UserStorageService;

import java.io.IOException;

//Handles user request
public class UserController {

    private final UserPersistenceService persistenceService = new UserPersistenceService();

    private final UserStorageService storageService = new UserStorageService();

    private final UserPermissionService permissionService = new UserPermissionService();

    //creates user
    public String createUser(String request) {
        ObjectMapper mapper = new ObjectMapper();

        User usr;
        try {
            usr = mapper.readValue(request, User.class);
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR";
        }

        persistenceService.saveUser(usr);
        if (usr.getTier() == null || usr.getTier().trim().length() == 0) {
            usr.setTier("BASIC");
        }
        if (usr.getTier().equalsIgnoreCase("basic")) {
            storageService.allocateStorage(usr, 100);
            permissionService.grantPermission(usr, "RECEIVE_EMAIL");
        } else if (usr.getTier().equalsIgnoreCase("premium")) {
            storageService.allocateStorage(usr, 200);
            permissionService.grantPermission(usr, "RECEIVE_EMAIL");
            permissionService.grantPermission(usr, "SEND_EMAIL");
        } else {
            return "ERROR";
        }
        return "SUCCESS";
    }

}