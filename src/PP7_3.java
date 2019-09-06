import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP7_3  {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File( "C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 7\\src\\numberList1.txt" );
        Scanner fileSc = new Scanner(file);
        int numberList [] = new int [500];
        for(int i = 0; i < 500; i++){
            numberList[i] = fileSc.nextInt();
        }
        int finalNumber [] = new int [10];
        for(int i :finalNumber){
            finalNumber[i] = 0;
        }
        for(int i = 0; i < 500; i++){
            if(numberList[i] >= 1 && numberList[i] <= 10){
                finalNumber[0]++;
            }
            else if(numberList[i] >= 11 && numberList[i] <= 20){
                finalNumber[1]++;
            }
            else if(numberList[i] >= 21 && numberList[i] <= 30){
                finalNumber[2]++;
            }
            else if(numberList[i] >= 31 && numberList[i] <= 40){
                finalNumber[3]++;
            }
            else if(numberList[i] >= 41 && numberList[i] <= 50){
                finalNumber[4]++;
            }
            else if(numberList[i] >= 51 && numberList[i] <= 60){
                finalNumber[5]++;
            }
            else if(numberList[i] >= 61 && numberList[i] <= 70){
                finalNumber[6]++;
            }
            else if(numberList[i] >= 71 && numberList[i] <= 80){
                finalNumber[7]++;
            }
            else if(numberList[i] >= 81 && numberList[i] <= 90){
                finalNumber[8]++;
            }
            else if(numberList[i] >= 91 && numberList[i] <= 100){
                finalNumber[9]++;
            }
        }
        System.out.print(" 1 - 10 | " );
        for(int i = 0; i <finalNumber[0];i++)System.out.print("*");
        System.out.println("");
        System.out.print("11 - 20 | " );
        for(int i = 0; i <finalNumber[1];i++)System.out.print("*");
        System.out.println("");
        System.out.print("21 - 30 | " );
        for(int i = 0; i <finalNumber[2];i++)System.out.print("*");
        System.out.println("");
        System.out.print("31 - 40 | " );
        for(int i = 0; i <finalNumber[3];i++)System.out.print("*");
        System.out.println("");
        System.out.print("41 - 50 | " );
        for(int i = 0; i <finalNumber[4];i++)System.out.print("*");
        System.out.println("");
        System.out.print("51 - 60 | " );
        for(int i = 0; i <finalNumber[5];i++)System.out.print("*");
        System.out.println("");
        System.out.print("61 - 70 | " );
        for(int i = 0; i <finalNumber[6];i++)System.out.print("*");
        System.out.println("");
        System.out.print("71 - 80 | " );
        for(int i = 0; i <finalNumber[7];i++)System.out.print("*");
        System.out.println("");
        System.out.print("81 - 90 | " );
        for(int i = 0; i <finalNumber[8];i++)System.out.print("*");
        System.out.println("");
        System.out.print("91 - 100| " );
        for(int i = 0; i <finalNumber[9];i++)System.out.print("*");
    }
}

/*
* Design and implement an application that creates a histogram
* that allows you to visually inspect the frequency distribution of
* a set of values. The program should read in an arbitrary number
* of integers that are in the range 1 to 100 inclusive; then it should
* produce a chart similar to the following one that indicates how
* many input values fell int he range 1 to 10, 11 to 20, and so on.
* Print one asterisk for each value entered.
*  1 - 10 | *****
* 11 - 20 | **
* 21 - 30 | *******************
* 31 - 40 |
* 41 - 50 | ***
* 51 - 60 | ********
* 61 - 70 | **
* 71 - 80 | *****
* 81 - 90 | *******
* 91 - 100| *********
* */