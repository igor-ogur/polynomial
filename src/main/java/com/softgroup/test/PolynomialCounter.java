package com.softgroup.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolynomialCounter {
    public static void main( String[] args ) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        int a = 0, b = 0, n = 0;
        while (loop) {
            try {
                System.out.println("Enter first integer number, a");
                a = Integer.parseInt(reader.readLine());
                System.out.println("Enter second integer number, b");
                b = Integer.parseInt(reader.readLine());
                System.out.println("Enter the power of the polynomial, natural number, n");
                n = Integer.parseInt(reader.readLine());
                loop = false;
            } catch (NumberFormatException e){
                System.out.println("Wrong entered data!");

            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            int t = getPascalTriangleElement(n, i);
            sum += t*Math.pow(a, n-i)*Math.pow(b, i);
        }

        System.out.println(printFormula(n)+sum);

    }

    public static String printFormula (int n){
        if (n == 0) return "";
        if (n == 1) return "a+b";
        if (n == 2) return "a^2+a*b+b^2";
        String s = "a^"+n+"+"+n+"*a^"+(n-1)+"*b+";
        for (int i = 2; i < n-1 ; i++) {
            int t = getPascalTriangleElement(n, i);
            s += t+"*a^"+(n-i)+"*b^"+i+"+";
        }
        s += n+"*a*b^"+(n-1)+"+b^"+n+"=";
        return s;
    }

    public static int getPascalTriangleElement (int n, int k){
        if (k == 0 || k == n) return 1;
        return getPascalTriangleElement(n-1, k-1) + getPascalTriangleElement(n-1, k);
    }
}
