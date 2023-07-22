package com.devmedeiros.api.auth;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security {

    public static String getSHA512hash(String input){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashBytes = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Converter o array de bytes em uma representação hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
