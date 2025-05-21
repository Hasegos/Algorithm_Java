# 체스판 다시 칠하기

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/1018`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 2 목차 돌아가기](../README.md)
___

### [해당 코드](./체스판다시칠하기.java)

## 통과

<img src="https://github.com/user-attachments/assets/9325e8cc-b3f2-48b7-9c61-e957f1bce909">

## 문제

지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.<br>
어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.<br>
지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.<br>
따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.<br>
당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

___

## 입력

첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.<br>
둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

___

## 출력

첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.

---

## 예제 입력 1

8 8 <br>
WBWBWBWB <br>
BWBWBWBW <br>
WBWBWBWB <br>
BWBBBWBW <br>
WBWBWBWB <br>
BWBWBWBW <br>
WBWBWBWB <br>
BWBWBWBW

---

## 예제 출력 1

1


---

## 예제 입력 2

10 13 <br>
BBBBBBBBWBWBW <br>
BBBBBBBBBWBWB <br>
BBBBBBBBWBWBW <br>
BBBBBBBBBWBWB <br>
BBBBBBBBWBWBW <br>
BBBBBBBBBWBWB <br>
BBBBBBBBWBWBW <br>
BBBBBBBBBWBWB <br>
WWWWWWWWWWBWB <br>
WWWWWWWWWWBWB

---

## 예제 출력 2

12

---

## 예제 입력 3

8 8 <br>
BWBWBWBW <br>
WBWBWBWB <br>
BWBWBWBW <br>
WBWBWBWB <br>
BWBWBWBW <br>
WBWBWBWB <br>
BWBWBWBW <br>
WBWBWBWB

---

## 예제 출력 3

0

---

## 예제 입력 4

9 23 <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBB <br>
BBBBBBBBBBBBBBBBBBBBBBW

---

## 예제 출력 4

31

---

## 예제 입력 5

10 10 <br>
BBBBBBBBBB <br>
BBWBWBWBWB <br>
BWBWBWBWBB <br>
BBWBWBWBWB <br>
BWBWBWBWBB <br>
BBWBWBWBWB <br>
BWBWBWBWBB <br>
BBWBWBWBWB <br>
BWBWBWBWBB <br>
BBBBBBBBBB

---

## 예제 출력 5

0

---

## 예제 입력 6

8 8 <br>
WBWBWBWB <br>
BWBWBWBW <br> 
WBWBWBWB <br>
BWBBBWBW <br>
WBWBWBWB <br>
BWBWBWBW <br>
WBWBWWWB <br>
BWBWBWBW

---

## 예제 출력 6

2

---

## 예제 입력 7

11 12 <br>
BWWBWWBWWBWW <br>
BWWBWBBWWBWW <br>
WBWWBWBBWWBW <br>
BWWBWBBWWBWW <br>
WBWWBWBBWWBW <br>
BWWBWBBWWBWW <br>
WBWWBWBBWWBW <br>
BWWBWBWWWBWW <br>
WBWWBWBBWWBW <br>
BWWBWBBWWBWW <br>
WBWWBWBBWWBW 

---

## 예제 출력 7

15

---

## 해결방안
**1.boolean 을 통해 다음칸이 예상한 색깔과 다르다면 카운트 횟수 추가**<br>
**2.8x8 경우의수에서는 하나밖에없다.**<br>
**3.전체 경우의수는 (N-7) x (N-7) 수이다. 전체 경우의 수가 1이기때문이다.**<br>
**4.전체 타일은 전체 경우의수를 넘겨주고 확인하면된다.**<br>

[맨위로 이동하기](#체스판-다시-칠하기)