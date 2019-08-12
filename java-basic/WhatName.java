/**
 * 값을 입력받아 출력하는 예제(comment)
 */
import java.util.Scanner;
class WhatName{
    /// IV, CV
    public static void main(String[] args) {
        System.out.println("이름이 뭐니?"); // 한줄주석, line = ln
        String name = ""; // 변수선언
        //값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println(String.format("이름은 %s입니다.", name));
        System.out.println("나이는 몇살이니?");
        int age = 0;
        age = scanner.nextInt();
        System.out.printf("나이는 %d살이다.", age);
    }
}