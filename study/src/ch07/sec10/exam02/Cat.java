package ch07.sec10.exam02;

public class Cat extends Animal{
    @Override
    // 추상메소드는 자식 클래스에서 무조건 재정의를 해줘야 한다.
    // 부모 클래스에 구현부가 없기 때문에
    public void sound(){
        System.out.println("야옹");
    }
}
