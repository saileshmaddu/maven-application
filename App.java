package com.result;
public class App{
    public static String[] calculateResult(int[]marks){
        int total=0;
        for( int m : marks){
            total += m;
        }
        double percentage=total/5.0;
        String grade;
        if(percentage>=90){
            grade="s";

        }
        else if(percentage>=80){
            grade="A";
        }
        else if(percentage>=70){
            grade="B";
        }
        else if(percenatge>=60){
            grade="C";
        }
        else if(percentage>=50){
            grade="D";
        }
        else{
            grade="F";
        }
        String result=(percenatge>=50)? "pass" : "fail";
       return new String[]{
        String.valueOf(total),
        String.valueOf(percentage),
        grade,
        result
        };

    }
}