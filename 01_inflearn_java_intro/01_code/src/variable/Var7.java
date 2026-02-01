package variable;

public class Var7 {

    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // true/false
        char d = 'A'; // 문자하나
        String e  = "Hello Java"; // 문자열

//        변수 형에 맞지 않은 값이 들어올 경우 빌드 에러 발생
//        int z = "백원"; // java: incompatible types: java.lang.String cannot be converted to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
