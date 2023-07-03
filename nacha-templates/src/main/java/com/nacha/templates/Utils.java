package com.nacha.templates;

import java.util.Random;

public class Utils {
    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
