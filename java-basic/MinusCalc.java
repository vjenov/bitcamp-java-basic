import java.util.Scanner;
class MinusCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 수를 입력해주세요 : ");
        int a = scan.nextInt();
        System.out.print("두번째 수를 입력해주세요 : ");
        int b = scan.nextInt();
        int minus = a-b;
        System.out.println("두 수의 차는 " + minus + "입니다.");
        System.out.print(String.format("%d - %d = %d, a, b, minus"));
    }
}