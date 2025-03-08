# 너의 평점은

## 목차
___
 1. [문제 주소](https://www.acmicpc.net/problem/25206)
 2. [문제 시작](#문제)
 2. [해결방안](#해결방안)
___
## 문제
인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. <br>
그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!

치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.<br>
전공평점은 **전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.**<br>

인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

| A+ | 4.5 |
|----|-----|
| A0 | 4.0 |
| B+ | 3.5 |
| B0 | 3.0 |
| C+ | 2.5 |
| C0 | 2.0 |
| D+ | 1.5 |
| D0 | 1.0 |
| F  | 0.0 |


P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

과연 치훈이는 무사히 졸업할 수 있을까?

___
## 입력

20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
___
## 출력

치훈이의 전공평점을 출력한다.

정답과의 절대오차 또는 상대오차가 10<sup>-4</sup> 이하이면 정답으로 인정한다.
___
## 제한 

+ 1 ≤ 과목명의 길이 ≤ 50 
+ 과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다.
+ 입력으로 주어지는 모든 과목명은 서로 다르다.
+ 학점은 1.0,2.0,3.0,4.0중 하나이다. 
+ 등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다. 
+ 적어도 한 과목은 등급이 P가 아님이 보장된다.
___
## 예시 

ObjectOrientedProgramming1 3.0 A+ <br>
IntroductiontoComputerEngineering 3.0 A+ <br>
ObjectOrientedProgramming2 3.0 A0 <br>
CreativeComputerEngineeringDesign 3.0 A+ <br>
AssemblyLanguage 3.0 A+ <br>
InternetProgramming 3.0 B0 <br>
ApplicationProgramminginJava 3.0 A0 <br>
SystemProgramming 3.0 B0 <br>
OperatingSystem 3.0 B0 <br>
WirelessCommunicationsandNetworking 3.0 C+ <br>
LogicCircuits 3.0 B0 <br>
DataStructure 4.0 A+ <br>
MicroprocessorApplication 3.0 B+ <br>
EmbeddedSoftware 3.0 C0 <br>
ComputerSecurity 3.0 D+ <br>
Database 3.0 C+ <br>
Algorithm 3.0 B0 <br>
CapstoneDesigninCSE 3.0 B+ <br>
CompilerDesign 3.0 D0 <br>
ProblemSolving 4.0 P <br>
___
## 출력
3.284483
___

## 해결방안
**각 과목의 등급(학점평균) * 학점 값을 모두 더한뒤 각과목의 학점의 총합으로 나누면 끝!**

[맨위로 이동하기](#너의-평점은)