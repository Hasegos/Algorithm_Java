# 단지번호붙이기

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/2667`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 3 목차 돌아가기](../README.md)
___

### [해당 코드](./단지번호붙이기.java)

## 통과

<img src="https://github.com/user-attachments/assets/c2b33f94-8b0d-43b7-a40d-2dd5d8ac7a61">

## 문제

<그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다.<br>
철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다.<br>
여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다.<br>
대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다.<br>
지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.

<br>

<img src="https://github.com/user-attachments/assets/b131e1ec-4038-4f5e-a09e-5426e2b0b3eb" width=300>

<br>

___

## 입력

첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.

___

## 출력

첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.

___

## 예제 입력 1

7 <br>
0110100 <br>
0110101 <br>
1110101 <br>
0000111 <br>
0100000 <br>
0111110 <br>
0111000

---

## 예제 출력 1

3 <br>
7 <br>
8 <br>
9

---

## 해결방안
**1.각 좌표마다 상하좌우로 움직인뒤 연동이 되어있는지를 판단한다.** <br>
**즉,"얼마나 깊이 있게 연동되어있는지"를 판단하기에 DFS 를 사용해야된다.**<br>
**DFS 를 이용해 판단하면서 몇개가 연동이 되어있는지 확인(집의 수), 연동이 된다 판단되면 체크(단지 수)를 해준다.**<br>

[맨위로 이동하기](#단지번호붙이기)