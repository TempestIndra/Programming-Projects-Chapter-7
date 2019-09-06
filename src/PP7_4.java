import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP7_4 {

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File( "C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 7\\src\\numberList1.txt" );
        Scanner fileSc = new Scanner(file);
        int numberList [] = new int [500];
        for(int i = 0; i < 500; i++){
            numberList[i] = fileSc.nextInt();
        }
        int finalNumber [][] = new int [10][2];
        for(int i = 0; i < 10; i ++){
            finalNumber[i][0] = i;
            finalNumber[i][1] = 0;
        }
        for(int i = 0; i < 500; i++){
            if(numberList[i] >= 1 && numberList[i] <= 10){
                finalNumber[0][1]++;
            }
            else if(numberList[i] >= 11 && numberList[i] <= 20){
                finalNumber[1][1]++;
            }
            else if(numberList[i] >= 21 && numberList[i] <= 30){
                finalNumber[2][1]++;
            }
            else if(numberList[i] >= 31 && numberList[i] <= 40){
                finalNumber[3][1]++;
            }
            else if(numberList[i] >= 41 && numberList[i] <= 50){
                finalNumber[4][1]++;
            }
            else if(numberList[i] >= 51 && numberList[i] <= 60){
                finalNumber[5][1]++;
            }
            else if(numberList[i] >= 61 && numberList[i] <= 70){
                finalNumber[6][1]++;
            }
            else if(numberList[i] >= 71 && numberList[i] <= 80){
                finalNumber[7][1]++;
            }
            else if(numberList[i] >= 81 && numberList[i] <= 90){
                finalNumber[8][1]++;
            }
            else if(numberList[i] >= 91 && numberList[i] <= 100){
                finalNumber[9][1]++;
            }
        }
        System.out.print(" 1 - 10 | " );
        for(int i = 0; i <finalNumber[0][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("11 - 20 | " );
        for(int i = 0; i <finalNumber[1][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("21 - 30 | " );
        for(int i = 0; i <finalNumber[2][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("31 - 40 | " );
        for(int i = 0; i <finalNumber[3][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("41 - 50 | " );
        for(int i = 0; i <finalNumber[4][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("51 - 60 | " );
        for(int i = 0; i <finalNumber[5][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("61 - 70 | " );
        for(int i = 0; i <finalNumber[6][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("71 - 80 | " );
        for(int i = 0; i <finalNumber[7][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("81 - 90 | " );
        for(int i = 0; i <finalNumber[8][1]/5;i++)System.out.print("*");
        System.out.println("");
        System.out.print("91 - 100| " );
        for(int i = 0; i <finalNumber[9][1]/5;i++)System.out.print("*");
    }

}

/*
* The lines in the histogram Programming Project 7.3 will be too
* long if a large number of values are entered. Modify the program
* so that it prints an asterisk for every five values in each category.
* Ignore leftovers. For example, if a category had 17 values, print
* three asterisks in that row. If a category had 4 values, do not
* print any asterisk in that row.
* */