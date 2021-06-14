package com.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyPtUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        System.out.println(username+"\n"+password);

    }
}
