import java.util.Scanner;
class Plus{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, plus;
        System.out.print("첫번째 숫자를 입력하세요 : ");
        a = scan.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        b = scan.nextInt();
        plus = a + b;
        System.out.print("두 수의 합은 " + plus + "입니다.");
        System.out.print(String.format("%d + %d = %d", a , b, plus));
    }
}