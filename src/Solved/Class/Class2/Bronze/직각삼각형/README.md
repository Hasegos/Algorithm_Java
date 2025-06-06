# 직각삼각형

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/4153`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 2 목차 돌아가기](../README.md)
___

### [해당 코드](./직각삼각형.java)

## 통과

<img src="https://github.com/user-attachments/assets/5570c9a0-b22e-4a47-a2c2-97761bfd36bd">

## 문제

과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.<br>
주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

<img src="https://github.com/user-attachments/assets/8a7945b9-2354-4995-9668-caf42a1cddfe">

___

## 입력

입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.<br>
각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

___
## 출력

각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

___

## 예제 입력 1

6 8 10 <br>
25 52 60 <br>
5 12 13 <br>
0 0 0

---

## 예제 출력 1

right <br>
wrong <br>
right

---
## 해결방안
**1.입력받은 3개의 수중 가장 큰수를 찾고 "가장 큰 변 ^2 = 나머지 두변의 제곱의 합" 을 사용해서 직각삼각형인지 판단하면된다.** <br>

[맨위로 이동하기](#직각삼각형)