import java.util.Scanner;
class Divide{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 수를 입력해주세요 : ");
        double a = scan.nextDouble();
        System.out.print("두번째 수를 입력해주세요 : ");
        double b = scan.nextDouble();
        double divide = a / b;
        System.out.print(String.format("%f / %f = %f입니다.", a, b, divide));
    }
}