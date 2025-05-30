# 숫자의 개수

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/2577`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 1 목차 돌아가기](../README.md)
___

### [해당 코드](./숫자의개수.java)

## 통과

<img src="https://github.com/user-attachments/assets/da86c9fc-b777-4ee9-8830-db838d42a938">

## 문제

세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.<br>
예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,<br>
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

___

## 입력

첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

___
## 출력

첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.<br>
마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

___

## 예제 입력 1

150 <br>
266 <br>
427

---

## 예제 출력 1

3 <br>
1 <br>
0 <br>
2 <br>
0 <br>
0 <br>
0 <br>
2 <br>
0 <br>
0

---

## 해결방안
**1.String.valueOf() 를 사용하면 문자열로 바꿀 수 있다.** <br>
**2.숫자 0 ~ 9 까지 아스키코드는 48부터 시작이다.** <br>

[맨위로 이동하기](#숫자의-개수)