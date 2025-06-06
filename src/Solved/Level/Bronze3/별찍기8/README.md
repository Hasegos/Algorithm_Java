# 별찍기 - 8

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/2445`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Bronze 3 돌아가기](../README.md)
___

### [해당 코드](./별찍기8.java)

## 통과

<img src="https://github.com/user-attachments/assets/2518884a-f70b-4e07-bab3-61c1dbc149ea">

## 문제

예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

___

## 입력

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

___
## 출력

첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

___

## 예제 입력 1

5

---

## 예제 출력 1

```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

---

## 해결방안
**1.빈칸은 순서에 따라서 (전체의 개수 - i - 1) 개만큼 줄어들고 2개씩 찍으면된다.** <br>
**2.별은 각 순서에따라서 1개씩 증가한다. 이를 밑에 구간 위에 구간 나눠서 생각하면된다.** <br>
**즉, 위에구간은 앞서 말했던것처럼 하고 밑에 구간은 위에 구간의 반대의 순서로 생각한다.** <br>

[맨위로 이동하기](#별찍기---8)