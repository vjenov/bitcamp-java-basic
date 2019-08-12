import java.util.Scanner;
class MultiCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 수를 입력해주세요 : ");
        int a = scan.nextInt();
        System.out.print("두번째 수를 입력해주세요 : ");
        int b = scan.nextInt();
        int multi = a * b;
        System.out.print(String.format("%d * %d = %d입니다.", a, b, multi));
    }
}