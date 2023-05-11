package com.nikolanew.testingnew.helper.digitalocean2;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumber {



    static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) { // event false
                return false;
            }
        }

        return true;
    }

    @Test
    public void isPrimeTest() {
        Assert.assertEquals(true, isPrime(19));
        Assert.assertEquals(false, isPrime(49));
        Assert.assertEquals(false, isPrime(1));
    }
}
