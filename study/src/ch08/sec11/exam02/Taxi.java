package ch08.sec11.exam02;

public class Taxi implements Vehicle{
    // 추상 메소드 재정의
    @Override
    public void run(){
        System.out.println("Taxi 달립니다");
    }
}
