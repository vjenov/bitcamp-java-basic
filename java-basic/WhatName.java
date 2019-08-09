/**
 * 값을 입력받아 출력하는 예제(comment)
 */
import java.util.Scanner;
class WhatName{
    public static void main(String[] args) {
        System.out.println("What's your Name?"); // 한줄주석, line = ln
        String name = ""; // 변수선언
        int age = 0;
        //값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.print("이름은 " + name + (" 이고\n나이는" + age + "살 이다."));
    }
}