import java.util.Scanner;
import java.util.Random;

class RPS{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int side;
        String b = new String();
        side = ran.nextInt(3);
        if(side == 0) {
            b = "가위";
        }else if(side == 1) {
            b = "바위"; 
        }else if(side == 2) {
            b = "보";
        }
        System.out.println("가위바위보 게임");
        System.out.println("1 : 가위, 2 : 바위, 3 : 보");
        String a = new String();
        a = scan.nextLine();
        System.out.println("컴퓨터가 낸 것은 " + b);
        if(a.equals(b)) {
            System.out.println("무승부");
        }else if(a.equals("가위") && b.equals("바위")) {
            System.out.println("COM WIN");
        }else if(a.equals("가위") && b.equals("보")) {
            System.out.println("YOU WIN");
        }else if(a.equals("바위") && b.equals("가위")) {
            System.out.println("YOU WIN");
        }else if(a.equals("바위") && b.equals("보")) {
            System.out.println("COM WIN");
        }else if(a.equals("보") && b.equals("가위")) {
            System.out.println("COM WIN");
        }else if(a.equals("보") && b.equals("바위")) {
            System.out.println("YOU WIN");
        }else {
            System.out.println("잘못 누르셨습니다.");
        }
    }
}