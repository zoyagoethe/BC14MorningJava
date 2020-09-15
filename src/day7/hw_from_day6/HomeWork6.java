package day7.hw_from_day6;

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars")); // ожидаем"ls"
        System.out.println(lastChars("yo", "java")); // ожидаем "ya"

        System.out.println(makeAbba("Hi", "Bye")); // "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice")); // "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up")); // "WhatUpUpWhat"
    }

    private static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    private static String lastChars(String s1, String s2) {
        return s1.substring(0, 1) + s2.substring(s2.length() - 1);
    }
}
