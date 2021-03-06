package com.jnx.cmd.hashing.example_01;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordSha256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String password = "123456";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

        // bytes to hex
        StringBuilder sb = new StringBuilder();
        for(byte b: hashInBytes) {
            sb.append(String.format("%02x",b));
        }
        System.out.println(sb.toString());
    }
}