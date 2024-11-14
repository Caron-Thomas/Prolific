package main;

public class TestConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);


        System.out.println(2 + 2 + "hello" + 3 + 5);

    }
}
