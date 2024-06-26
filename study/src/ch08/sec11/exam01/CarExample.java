package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car myCar = new Car();

        // run() 메소드 실행
        myCar.run();

        // 타이어 객체 교체
        // 기존에 있던 한국 타이어를 금호타이어로 교체시킴
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        // run() 메소드 실행
        // 위 코드와 같은 코드이지만 결과 값이 다르다 => 다형성
        myCar.run();
    }
}
