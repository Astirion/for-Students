package ru.testproject.tasks;

public class Loop7_EasyNumber {

    public static void main(String[] args) {

        int m = 61;
        boolean easy = true;
        for(int i = 2; i < m; i++) {
            if( (m % i) == 0) {
                easy=false;
                break;
            }
        }
        if(easy) {
            System.out.print(m);
        }
        else {
            System.out.print("dont easy");
        }
    }



    }


