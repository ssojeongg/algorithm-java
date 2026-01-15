package baekjoon.step01_input_output;

import java.util.Scanner;

public class B10869 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b;
        a = scn.nextInt();
        b = scn.nextInt();

        scn.close();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}

// 자바에서 Scanner 객체 사용 후에는
// 메모리 누수 방지와 시스템 자원 해제를 위해
// 반드시 scanner.close() 를 호출해야함