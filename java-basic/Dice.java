import java.util.Scanner;
import java.util.Random;
class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int dice;
        dice = ran.nextInt(6)+1;
        String pair = new String();
        if((dice%2) == 0) {
            pair = "짝";
        }else if((dice%2) == 1) {
            pair = "홀";
        }
        String c = new String();
        System.out.println("주사위 홀짝게임입니다. 홀짝을 맞춰주세요.\n1. 홀, 2. 짝");
        c = scan.nextLine();
        System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        if(c.equals(pair)) {
            System.out.println("정답입니다.");
        }else if(!c.equals(pair)) {
            System.out.println("틀렸습니다.");
        }else {
            System.out.println("잘못된 값을 입력하셨습니다.");
        }
    }
}