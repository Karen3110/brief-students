package com.company.commons;

import java.security.SecureRandom;

public class UIDGenerator {
    private static final long MSB = 0x8000000000000000L;
    private static volatile SecureRandom numberGenerator = null;

    public static String getUID() {
        SecureRandom ng = numberGenerator;
        if (ng == null) {
            numberGenerator = ng = new SecureRandom();
        }

        return Long.toHexString(MSB | ng.nextLong()) + Long.toHexString(MSB | ng.nextLong());
    }
}
