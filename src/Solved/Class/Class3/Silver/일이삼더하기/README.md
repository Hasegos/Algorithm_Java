# 1, 2, 3 더하기

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/9095`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 3 목차 돌아가기](../README.md)
___

### [해당 코드](./일이삼더하기.java)

## 통과

<img src="https://github.com/user-attachments/assets/d9f57757-b8fb-4c27-a761-d74e6a1ffbbd">

## 문제

정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

+ 1+1+1+1
+ 1+1+2
+ 1+2+1
+ 2+1+1
+ 2+2
+ 1+3
+ 3+1

정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

___

## 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

___

## 출력

각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

___

## 예제 입력 1

3 <br>
4 <br>
7 <br>
10

---

## 예제 출력 1

7 <br>
44 <br>
274

---

## 해결방안
**1.문제에서 규칙을 보면 1를 만드는 경우는 1가지, 2를 만드는 경우는 2가지, 3을 만드는 경우는 4가지이다.** <br>
**이걸 쭉 나열하면 1 -> 2 -> 4 -> 7 -> 13 이렇게된다.**<br>
**즉, 7은 1,2,4의 합으로 13은 7,4,2의 합으로 만들어진다.**<br>
**이러한 규칙을 활용해서 누적된 합을 배열에넣고 입력받은 N까지 배열을 만든뒤 해당 N 자릿수의 배열값을 출력해주면 정답을 구할 수 있다.**<br>

[맨위로 이동하기](#1-2-3-더하기)