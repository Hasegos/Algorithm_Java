# 집합

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/11723`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 3 목차 돌아가기](../README.md)
___

### [해당 코드](./집합.java)

## 통과

<img src="https://github.com/user-attachments/assets/278bedbb-f543-47d1-b365-0b8e6cf47805">

## 문제

비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

+ add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
+ remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
+ check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
+ toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
+ all: S를 {1, 2, ..., 20} 으로 바꾼다.
+ empty: S를 공집합으로 바꾼다.

___

## 입력

첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.

둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.

___
## 출력

check 연산이 주어질때마다, 결과를 출력한다.

___

## 예제 입력 1

26 <br>
add 1 <br>
add 2 <br>
check 1 <br>
check 2 <br>
check 3 <br>
remove 2 <br>
check 1 <br>
check 2 <br>
toggle 3 <br>
check 1 <br>
check 2 <br>
check 3 <br>
check 4 <br>
all <br>
check 10 <br>
check 20 <br>
toggle 10 <br>
remove 20 <br>
check 10 <br>
check 20 <br>
empty <br>
check 1 <br>
toggle 1 <br>
check 1 <br>
toggle 1 <br>
check 1 <br>

---

## 예제 출력 1

1 <br>
1 <br>
0 <br> 
1 <br>
0 <br>
1 <br>
0 <br>
1 <br>
0 <br>
1 <br>
1 <br>
0 <br>
0 <br>
0 <br>
1 <br>
0 <br>

---

## 해결방안
**1.비어있는 집합 (배열)을 통해서 입력값을 문자에 따라서 추가/ 삭제를 해줘야한다.** <br>
**즉, 동적인 배열이 필요하다.** <br>
**2.동적 배열을 통해서 시간복잡도를 잘 게산해서 문제를 해결하면된다.** <br>
ArrayList 가 삽입/삭제 시간이 O(n)이 걸리지만, 조회하는데있어서 O(1) 이다.<br>
반면에 LinkedList 는 삽입/삭제 시간이 O(1)이 걸리지만, 조회하는데 있어서 O(n) 이 걸린다. 

[맨위로 이동하기](#집합)