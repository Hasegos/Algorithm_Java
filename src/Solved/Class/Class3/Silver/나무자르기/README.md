# 나무 자르기

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/2805`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 3 목차 돌아가기](../README.md)
___

### [해당 코드](./나무자르기.java)

## 통과

<img src="https://github.com/user-attachments/assets/785464b4-3d97-425d-b288-efbac7ec3346">

## 문제

상근이는 나무 M미터가 필요하다. 근처에 나무를 구입할 곳이 모두 망해버렸기 때문에, 정부에 벌목 허가를 요청했다.<br>
정부는 상근이네 집 근처의 나무 한 줄에 대한 벌목 허가를 내주었고, 상근이는 새로 구입한 목재절단기를 이용해서 나무를 구할것이다.

목재절단기는 다음과 같이 동작한다. 먼저, 상근이는 절단기에 높이 H를 지정해야 한다.<br>
높이를 지정하면 톱날이 땅으로부터 H미터 위로 올라간다. 그 다음, 한 줄에 연속해있는 나무를 모두 절단해버린다.<br>
따라서, 높이가 H보다 큰 나무는 H 위의 부분이 잘릴 것이고, 낮은 나무는 잘리지 않을 것이다.<br>
예를 들어, 한 줄에 연속해있는 나무의 높이가 20, 15, 10, 17이라고 하자.<br>
상근이가 높이를 15로 지정했다면, 나무를 자른 뒤의 높이는 15, 15, 10, 15가 될 것이고, 상근이는 길이가 5인 나무와 2인 나무를 들고 집에 갈 것이다.<br>
(총 7미터를 집에 들고 간다) 절단기에 설정할 수 있는 높이는 양의 정수 또는 0이다.

상근이는 환경에 매우 관심이 많기 때문에, 나무를 필요한 만큼만 집으로 가져가려고 한다.<br>
이때, 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 구하는 프로그램을 작성하시오.

___

## 입력

첫째 줄에 나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M이 주어진다. (1 ≤ N ≤ 1,000,000, 1 ≤ M ≤ 2,000,000,000)

둘째 줄에는 나무의 높이가 주어진다. 나무의 높이의 합은 항상 M보다 크거나 같기 때문에, 상근이는 집에 필요한 나무를 항상 가져갈 수 있다.<br>
높이는 1,000,000,000보다 작거나 같은 양의 정수 또는 0이다.

___

## 출력

적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 출력한다.

___

## 예제 입력 1

4 7 <br>
20 15 10 17

---

## 예제 출력 1

15

---

## 예제 입력 2

5 20 <br>
4 42 40 26 46

---

## 예제 출력 2

36

---

## 해결방안
**1.여러개의 나무들 중 최대 길이로 짤른후 더해서 M 미터를 만들어야한다.**<br>
**그럼으로 입력받은 제일 긴 나무를 기준으로 이진탐색을 진행후 최대길이를 구한다.** <br>
**이후에 최대길이를 기준으로 짤라 M 미터가 만들어지는지 확인하면된다.**<br>
**추가로 타입도 잘확인해야된다 21억이 넘는다.**<br>

[맨위로 이동하기](#나무-자르기)