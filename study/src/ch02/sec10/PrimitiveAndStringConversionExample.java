package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        
        // string에서 primitive 타입으로 변환 시, "타입.parse타입" 형태로 변환 
        int value1=Integer.parseInt("10");
        double value2=Double.parseDouble("3.14");
        boolean value3=Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        
        // primitive 타입에서 String으로 변환 시 String.valueOf()를 사용
        String str1=String.valueOf(10);
        String str2=String.valueOf(3.14);
        String str3=String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
