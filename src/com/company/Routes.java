package com.company;

public class Routes {
    public static long calculateRoutes(int n) {
        long result = 1L;
        if(n <= 0){
            result = 0L;
        }
        else{
            for(int i = 1; i <= n; i++){
                result = result*(n+i)/i;}
        }
        return result;
    }
}
