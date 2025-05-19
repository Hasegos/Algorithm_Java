# 단어 정렬

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/1181`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 2 목차 돌아가기](../README.md)
___

### [해당 코드](./단어정렬.java)

## 통과

<img src="https://github.com/user-attachments/assets/3a58e88d-923c-4ac6-95e8-04e40a120f8b">

## 문제

알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

1. 길이가 짧은 것부터
2. 길이가 같으면 사전 순으로

단, 중복된 단어는 하나만 남기고 제거해야 한다.

___

## 입력

첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.<br>
주어지는 문자열의 길이는 50을 넘지 않는다.

___

## 출력

조건에 따라 정렬하여 단어들을 출력한다.

___

## 예제 입력 1

13 <br>
but <br>
i <br>
wont <br>
hesitate <br>
no <br>
more <br>
no <br>
more <br>
it <br>
cannot <br>
wait <br>
im <br>
yours

---

## 예제 출력 1

i <br>
im <br>
it <br>
no <br>
but <br>
more <br>
wait <br>
wont <br>
yours <br>
cannot <br>
hesitate

---
## 해결방안
**1.정렬할때 Scanner 로 입력받는건 시간이 에매할 수 있다.**<br>
**2.Array.sort()를 Array.sort(배열, new Comparator<타입>()){} 를 통해 커스텀이 가능하다.**<br>
**3.public 타입 compare(파라미터){} 형태로 배열을 정렬하면된다.**<br>

[맨위로 이동하기](#단어-정렬)