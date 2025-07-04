# 회의실 배정

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/9461`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 3 목차 돌아가기](../README.md)
___

### [해당 코드](./회의실배정.java)

## 통과

<img src="https://github.com/user-attachments/assets/ba8733ea-8960-48a1-ba33-01c85d4ade9b">

## 문제

한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.<br>
각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.<br>
단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다.<br>
이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

___

## 입력

첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다.<br>
시작 시간과 끝나는 시간은 231-1보다 작거나 같은 자연수 또는 0이다.

___

## 출력

첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.

___

## 예제 입력 1

11 <br>
1 4 <br>
3 5 <br>
0 6 <br>
5 7 <br>
3 8 <br>
5 9 <br>
6 10 <br>
8 11 <br>
8 12 <br>
2 13 <br>
12 14

---

## 예제 출력 1

4

---

## 해결방안
**1.이 문제에서 잘생각해보면 회의 시간이 길이가 짧으면 최대로 사용할 수가 있다.** <br>
**그래서 끝나는 시간 기준으로 정렬을 한다. 단, 같다면 종료시간을 기준으로 정렬을한다.** <br>
**정렬을 하고나서 순차적으로 돌며 끝나는 시간이 다음 회의 시작시간이라면 해당 회의를 끝나는 시간으로 다시설정한다.** <br>
**이를 반복해서 count 해주면 회의실 개수를 구할 수 가 있다.** <br>

[맨위로 이동하기](#회의실-배정)