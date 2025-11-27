package Stage6.너의평점은;

import java.util.Scanner;

public class BOJ_25206_너의평점은 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0; // 최종 평점
        double gradeResult = 0.0; // 학점의 총합
        for(int i = 0; i < 20; i++){
            String[] subject;
            subject = sc.nextLine().split(" "); // 공백을 기준으로 나누기
            double unit = Double.parseDouble(subject[1]); // 학점
            String grade = subject[2]; // 등급
            switch (grade){
                case "A+":
                    result += unit * 4.5;
                    gradeResult += unit;
                    break;
                case "A0":
                    result += unit * 4.0;
                    gradeResult += unit;
                    break;
                case "B+":
                    result += unit * 3.5;
                    gradeResult += unit;
                    break;
                case "B0":
                    result += unit * 3.0;
                    gradeResult += unit;
                    break;
                case "C+":
                    result += unit * 2.5;
                    gradeResult += unit;
                    break;
                case "C0":
                    result += unit * 2.0;
                    gradeResult += unit;
                    break;
                case "D+":
                    result += unit * 1.5;
                    gradeResult += unit;
                    break;
                case "D0":
                    result += unit;
                    gradeResult += unit;
                    break;
                case "F":
                    result += unit * 0.0;
                    gradeResult += unit;
                    break;
                default:
                    break;
            }
        }
        System.out.println(result / gradeResult );
    }
}
