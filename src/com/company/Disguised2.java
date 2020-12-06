package com.company;

import java.math.BigInteger;

public class Disguised2 {
    public static BigInteger u1(int n, int p) {
        return uEff( n, p );
    }

    public static BigInteger v1(int n, int p) {
        return vEff( n, p );
    }

    public static BigInteger uEff(int n, int p) {
        return BigInteger.valueOf( n ).add( BigInteger.ONE ).multiply( BigInteger.valueOf( p ) );
    }

    public static BigInteger vEff(int n, int p) {
        return BigInteger.valueOf( n ).multiply( BigInteger.valueOf( 2 ) ).add( BigInteger.ONE ).multiply( BigInteger.valueOf( p ) );
    }
}
