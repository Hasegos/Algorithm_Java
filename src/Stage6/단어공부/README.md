# 단어 공부

## 목차
___
1. 문제 주소 : `https://www.acmicpc.net/problem/1157`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [심화 1 목차돌아가기](../README.md)
___

### [해당 코드](./단어공부.java)

## 문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.<br>
단, 대문자와 소문자를 구분하지 않는다.
___
## 입력

첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
___
## 출력

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.<br>
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
___

## 예제 입력 1

Mississipi
___
## 예제 출력 1
?
___

## 예제 입력 2

zZa
___
## 예제 출력 2
Z
___


## 해결방안
**1.모든 문자 소문자 or 대문자 통일** <br>
**2.한글자, 두글자이상 구분** <br>
**3.사용한 글자의 해당 공간에 사용수만큼 더해주기**<br>
**4.이후 최댓값 구하기** <br>

[맨위로 이동하기](#단어-공부)
