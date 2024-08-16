package com.java.solid.dry;

import org.apache.commons.codec.binary.Base64;
import org.jsoup.Jsoup;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringUtil {

    public static String sanitizeString(String content) throws UnsupportedEncodingException {
        String sanitized = content.trim();
        sanitized = Jsoup.parse(sanitized).text();
        // convert to base64
        sanitized = new String(Base64.encodeBase64(sanitized.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        return sanitized;
    }
}