import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP7_5 {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 7\\src\\numberList3.txt");
        Scanner fileSC1 = new Scanner( file );
        Scanner fileSc2 = new Scanner( file );
        int amountNum = 0;
        int total = 0;
        while(fileSC1.hasNextLine()){
            fileSC1.nextLine();
            amountNum++;
        }
        int listNum [] = new int [amountNum];
        for(int i = 0; i < amountNum;i++){
            listNum [i] = fileSc2.nextInt();
        }
        for(int i = 0; i < amountNum;i++){
            total += listNum[i];
        }
        long mean = total/amountNum;
        long standardDeviation = 0;
        System.out.println("mean = " + mean);
        for(int i = 0; i< amountNum; i ++){
            standardDeviation += Math.pow((listNum[i] - mean) ,2 );
        }
        System.out.println("standard deviation = " + Math.sqrt(standardDeviation/amountNum ));
    }
}


/*
* Design and implement and application that computes and prints
* the mean and standard deviation of a list of integers x1 through
* xn. Assume that there will be no more than 50 input values
* compute both the mean and standard deviation as floating
* point values, using the following formulas.
*
* mean =  n
*       Sig ma X1 /n
*        i = 1
*
* standard deviation = sqrt((   n
*                            Sig ma (X1 - mean)^2
*                             i = 1 )/ n-1)
*
* */
