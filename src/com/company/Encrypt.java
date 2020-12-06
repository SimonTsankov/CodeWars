package com.company;

public class Encrypt {
    static String encrypt(String plainText, String password) {
        if (password.isEmpty()) return plainText;
        var chars = plainText.toCharArray();
        for (int i = 0; i < plainText.length(); i++) {
            chars[i] = (char) (plainText.charAt(i) ^ password.charAt(i % password.length()) << 8);
        }
        return new String(chars);
    }
    public static String decrypt(String encrypted) {
        char[] r=encrypted.toCharArray();
        for(int i=0; i<r.length; i++) r[i]&=255;
        return String.valueOf(r);
    }

    public static void main(String[] args) {
        char[] expected = {17011, 20336, 20345, 19744, 17003, 20329, 20340};
        System.out.println(String.valueOf(expected));
        System.out.println(encrypt("spy kit","BOOM"));
        System.out.println(decrypt(String.valueOf(expected)));
        System.out.println(Character.toString(17011&255));
    }

}
