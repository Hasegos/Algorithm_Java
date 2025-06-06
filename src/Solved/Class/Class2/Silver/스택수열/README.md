# 스택 수열

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/1874`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 2 목차 돌아가기](../README.md)
___

### [해당 코드](./스택수열.java)

## 통과

<img src="https://github.com/user-attachments/assets/f2c5a3a8-58e8-4b59-bfde-f46a6f9109ab">

## 문제

스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.<br>
스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.

1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.<br>
이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.<br>
임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지,<br>
있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. <br>
이를 계산하는 프로그램을 작성하라.

___

## 입력

첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다.<br>
둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다.<br>
물론 같은 정수가 두 번 나오는 일은 없다.

___
## 출력

입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다.<br>
push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.

___

## 예제 입력 1

8 <br>
4 <br>
3 <br>
6 <br>
8 <br>
7 <br>
5 <br>
2 <br>
1

---

## 예제 출력 1

+<br>
+<br>
+<br>
+<br>
-<br>
-<br>
+<br>
+<br>
-<br>
+<br>
+<br>
-<br>
-<br>
-<br>
-<br>
-<br>

---

## 예제 입력 2

5 <br>
1 <br>
2 <br>
5 <br>
3 <br>
4

---

## 예제 출력 2

NO

---

## 해결방안
**1.1 ~ N 까지의 수를 오름차순으로 먼저 정렬후 push 와 pop 을 통해 입력받은 수열이랑 같아야한다.** <br>
**2.새로운 Stack 을 만들고 입력받은 N 값 까지 수를 배열을 넣고 이미 넣어진 값보다 작을 경우에는 추가를 하지않는다.**<br>
**3.케이스마다 수를 빼내고 그 수가 입력 받은 수랑 같지않다면 그건 수열을 만들 수 없다.**<br>

[맨위로 이동하기](#스택-수열)