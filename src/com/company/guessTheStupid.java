package com.company;
import java.security.MessageDigest;
public class guessTheStupid {
    public static String F(String s) {

        // Reject if not printable ASCII
        for (char c : s.toCharArray()) {
            if (c < 32 || c > 127) return "";
        }

        // Perform MD5 encoding
        final StringBuilder sb = new StringBuilder(s);
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        md.update(s.getBytes());
        final byte byteData[] = md.digest();
        final StringBuffer hexString = new StringBuffer();
        for (byte b : byteData) {
            final String hex=Integer.toHexString(0xff & b);
            if (hex.length()==1) hexString.append('0');
            hexString.append(hex);
        }

        // Return the encoding reversed
        return hexString.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(F("")
        +"\n"+F("123")
        +"\n"+F("@#$%!")
        +"\n"+F("example")
        );
    }
}
