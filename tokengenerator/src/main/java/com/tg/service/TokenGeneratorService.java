package com.tg.service;

import java.security.SecureRandom;

public class TokenGeneratorService {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(1000);
        System.out.println("random number : "+num);
    }
}
