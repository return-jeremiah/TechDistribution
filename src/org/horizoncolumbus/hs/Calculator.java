package org.horizoncolumbus.hs;

public class Calculator {

    public static void main(String[] args) {
// write your code here
        boolean isJunior = false; // true // false
        boolean isSenior = false;
        boolean isTeacher = false;
        boolean isAdmin = false;
        boolean isCTE = false;
        boolean isHome = false;

        if (isJunior || (isSenior && isCTE)) {
            System.out.println("Give Windows Laptop");
        } else if (isTeacher || (isAdmin && isHome)) {
            System.out.println("Give MacBook");
        } else{
            System.out.println("Give Chromebook");
        }
    }
}