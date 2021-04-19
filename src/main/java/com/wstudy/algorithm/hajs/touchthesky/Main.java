package com.wstudy.algorithm.hajs.touchthesky;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initial value
        long position = 0;
        long maxBalloons = 0;

        // 입력 :: 총 풍선의 개수 :: for 조건
        long balloonsCnt = Long.parseLong(sc.nextLine());
        for (long i=0; i<balloonsCnt; i++) {

            // 입력 :: i번째 풍선의 고도 제한과 용량
            String balloonsExtras = sc.nextLine();
            long balloonsAltitude = Long.parseLong(balloonsExtras.split(" ")[0]);
            long balloonsCapacity = Long.parseLong(balloonsExtras.split(" ")[1]);


            // 상승조건 :: 주어진 고도 이하에서만 풍선을 불 수 있음
            if (position <= balloonsAltitude) {
                maxBalloons++;
                position = balloonsCapacity; // 고도만큼 올라가서 터지므로 현재 내 위치 change
            }
        }

        // print
        System.out.println(maxBalloons);
    }
}
