package ch02.sec13;

// Scanner 만들면 자동으로 import 문 생성됨
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner 클래스 이용해서 새로운 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 다음 칸에 바로 입력받기 위해 print로 입력문 출력
        System.out.print("x값 입력 : ");
        // 스캐너로 한 줄을 입력받아서 strX에 저장
        String strX = scanner.nextLine();

        // 받아온 strX를 int로 형변환 (String -> int)
        int x= Integer.parseInt(strX);

        System.out.print("y값 입력 : ");
//        String strY = scanner.next();
        String strY = scanner.nextLine();
        int y= Integer.parseInt(strY);
        // int strY=scanner.nextInt(); 를 이용하면 한번에 int로 받아올 수 있다
        
//        next로 받고 x값 입력 시 값 2개 넣으면, y값 입력 안받고 바로 연산결과로 건너뜀
//        String strX = scanner.next();
        int result = x+y;
        System.out.println("x+y = "+result);
        System.out.println();
        
        // 무한루프
        while (true){
            System.out.printf("입력 문자열 : ");
            String data = scanner.nextLine();
//            문자열의 값을 비교할 때 equals 사용
            if (data.equals("q")){
//                무한 루프문은 보통 break와 함께 쓰인다 (반복 종료)
                break;
            }
            System.out.println("출력 문자열 : " +data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
