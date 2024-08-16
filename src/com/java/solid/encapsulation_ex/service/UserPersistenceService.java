package com.java.solid.encapsulation_ex.service;

import com.java.solid.encapsulation_ex.entity.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserPersistenceService {

    private static final Map<String, User> storage = new HashMap<>();

    static {
        storage.put("DUMMY1", new User("DUMMY1", "dummy1@email.com"));
        storage.put("DUMMY2", new User("DUMMY2", "dummy2@email.com"));
        storage.put("DUMMY3", new User("DUMMY3", "dummy3@email.com"));
    }

    public void saveUser(User user) {
        synchronized (storage) {
            storage.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized (storage) {
            return storage.get(name);
        }
    }

    public Collection<User> getAll() {
        synchronized (storage) {
            return storage.values();
        }
    }
}