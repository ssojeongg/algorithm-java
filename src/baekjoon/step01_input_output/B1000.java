package baekjoon.step01_input_output;

import java.util.Scanner;

public class B1000 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        a = scn.nextInt();
        b = scn.nextInt();
        System.out.println(a+b);
    }
}

// Scanner : 자바에서 입력 받을 때 가장 많이 씀
// nextInt() : 정수, 실수를 입력 받음