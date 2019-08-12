import java.util.Scanner;
class WhereULive {
    public static void main(String[] args) {
        System.out.println("어디에 사세요?");
        Scanner scan = new Scanner(System.in);
        String home = new String();
        home = scan.nextLine();
        System.out.print(String.format("나는 %s에 살아요.", home));
    }
}