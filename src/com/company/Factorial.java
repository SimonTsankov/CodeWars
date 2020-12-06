package com.company;

import java.math.*;class Factorial{static String f(int n){return n<1?"1":new BigDecimal(n).multiply(new BigDecimal(f(n-1)))+"";}}