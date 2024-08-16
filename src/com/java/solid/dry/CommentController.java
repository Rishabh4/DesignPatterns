package com.java.solid.dry;

import org.apache.commons.codec.binary.Base64;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class CommentController {

    public boolean saveComment(Comment comment) throws IOException {
        if (comment.getContent() == null || comment.getContent().trim().length() == 0) {
            return false;
        }
        String content = comment.getContent().trim();
        content = Jsoup.parse(content).text();
        // convert to base64
        content = new String(Base64.encodeBase64(content.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        comment.setContent(content);
        //save comment
        return true;
    }
}