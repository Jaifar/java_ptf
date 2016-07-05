package ru.stqa.pft.Tests2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Owner on 7/2/2016.
 */
public class PrimeTests {

  @Test
  public void testPrimes(){
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }


  @Test(enabled = false)
  public void testPrimesLong() {
    long n = Integer.MAX_VALUE;

      Assert.assertTrue(Primes.isPrime(n));
    }

    @Test
    public void testNonprime() {
      Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }

  }

