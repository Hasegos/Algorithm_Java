package Solved.Class.Class3.Silver.집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            set(list,bf,sb);
        }
        System.out.println(sb);
    }
    public static void set(ArrayList<Integer> list, BufferedReader bf,StringBuilder sb) throws IOException{

        String[] split = bf.readLine().split(" ");
        int a = 0;
        String operation = split[0];
        if (split.length != 1) {
            a = Integer.parseInt(split[1]);
        }
        if(operation.equals("add")){
            list.add(a); // 값 추가
        }
        else if(operation.equals("remove")){
            if(!list.contains(a)){ // 포함이 안될경우
                return;
            }else { // 포함된 경우
               int indexA =  list.indexOf(a); // 입력값의 위치를 찾고 해당위치 삭제
               list.remove(indexA);
            }
        }
        else if(operation.equals("check")){
            if(list.contains(a)){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        else if(operation.equals("toggle")){
            if(list.contains(a)){
                int indexA = list.indexOf(a);
                list.remove(indexA);
            }
            else{
                list.add(a);
            }
        }
        else if(operation.equals("all")){
            list.clear();
            for(int  i =0; i < 20; i++){
                list.add(i+1);
            }
        }
        else{
            list.clear();
        }
    }
}