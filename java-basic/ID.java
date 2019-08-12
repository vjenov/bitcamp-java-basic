import java.util.Scanner;

class ID{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = new String();
        System.out.println("주민번호를 -없이 입력하세요");
        ssn = scan.nextLine();
        String num = ssn.substring(6,7);
        if(num.equals("9")) {
            System.out.println("1800 ~ 1899년에 태어난 남성");
        }else if(num.equals("0")) {
            System.out.println("1800 ~ 1899년에 태어난 여성");
        }else if(num.equals("1")) {
            System.out.println("1900 ~ 1999년에 태어난 남성");
        }else if(num.equals("2")) {
            System.out.println("1900 ~ 1999년에 태어난 여성");
        }else if(num.equals("3")) {
            System.out.println("2000 ~ 2099년에 태어난 남성");
        }else if(num.equals("4")) {
            System.out.println("2000 ~ 2099년에 태어난 여성");
        }else if(num.equals("5")) {
            System.out.println("1900 ~ 1999년에 태어난 외국인 남성");
        }else if(num.equals("6")) {
            System.out.println("1900 ~ 1999년에 태어난 외국인 여성");
        }else if(num.equals("7")) {
            System.out.println("2000 ~ 2099년에 태어난 외국인 남성");
        }else if(num.equals("8")) {
            System.out.println("2000 ~ 2099년에 태어난 외국인 여성");
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}