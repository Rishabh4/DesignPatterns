package com.java.solid.dry;

import org.apache.commons.codec.binary.Base64;
import org.jsoup.Jsoup;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class UserController {

    public boolean saveUser(User user) throws UnsupportedEncodingException {
        if (user.getTagline() != null && user.getTagline().trim().length() > 0) {
            String tagline = user.getTagline().trim();
            tagline = Jsoup.parse(tagline).text();
            tagline = new String(Base64.encodeBase64(tagline.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            user.setTagline(tagline);
        }
        return true;
    }
}