import java.util.Scanner;
class Calc{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        String c = new String();
        System.out.println("연산종류를 선택하세요 + , - , *,  /");
        c = scan.nextLine();
        System.out.println("첫번째 숫자를 입력하세요 : ");
        a = scan.nextInt();
        System.out.println("두번째 숫자를 입력하세요 : ");
        b = scan.nextInt();

        if(c.equals("+")) {
            System.out.println(a + b);
        }else if(c.equals("-")) {
            System.out.println(a - b);
        }else if(c.equals("*")) {
            System.out.println(a * b);
        }else if(c.equals("/")) {
            System.out.println(a / b);
        }else {
            System.out.printf("잘못 누르셨습니다.");
        }
    }
}