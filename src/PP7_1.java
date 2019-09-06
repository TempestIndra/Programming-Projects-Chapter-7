import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP7_1 {

    public static void main(String args[])throws FileNotFoundException {
        File file = new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 7\\src\\numberList1.txt");
        Scanner fileSc = new Scanner(file);
        int list [] = new int[500];
        int amountBelow50 = 0;
        for(int i = 0;i < 500;i++ ){
          list[i] = fileSc.nextInt();
          if(list[i] <= 50){
              amountBelow50++;
          }
        }
        int listUnder50 [] = new int[amountBelow50];
        for(int i = 0,j = 0; i < 500; i++){
            if(list[i] <=50){
                listUnder50[j] = list[i];
                j++;
            }
        }
        int finalList[][] = new int [51] [2];

        for(int i = 0; i <= 50; i++){
            finalList[i][0] = i;
            finalList[i][1] = 0;
        }
        for(int i = 0; i <= 50; i++)
        {
            for(int j =0; j < listUnder50.length; j++)
            {
                if(finalList[i][0] == listUnder50[j]){
                    finalList[i][1]++;
                }
            }
        }
        for(int i=0; i <= 50;i++){
            System.out.println(finalList[i][0] + " " + finalList[i][1]);
        }
    }
}

/*
* Design and implement an application that reads an arbitrary
* number of integers that are in the range 0 to 50 inclusive and
* counts how many occurrences of each are entered. After all input
* has been processed, print all of the values (with the number of
* occurrences) that were entered one or more times.
*/
