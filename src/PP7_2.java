import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP7_2 {

    public static void main(String args[])throws FileNotFoundException {
        File file = new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 7\\src\\numberList2.txt");
        Scanner fileSc = new Scanner(file);
        int list [] = new int[1000];
        int betweenPositiveandNegative = 0;
        for(int i = 0;i < 1000;i++ ){
            list[i] = fileSc.nextInt();
            if(list[i] <= 25 && list[i] >= -25){
                betweenPositiveandNegative++;
            }
        }
        int listbetweenPositiveandNegative [] = new int[betweenPositiveandNegative];
        for(int i = 0,j = 0; i < 1000; i++){
            if(list[i] <= 25 && list[i] >= -25){
                listbetweenPositiveandNegative[j] = list[i];
                j++;
            }
        }
        int finalList[][] = new int [51] [2];

        for(int i = -25; i <= 25; i++){
            finalList[i+25][0] = i;
            finalList[i+25][1] = 0;
        }
        for(int i = 0; i <= 50; i++)
        {
            for(int j =0; j < listbetweenPositiveandNegative.length; j++)
            {
                if(finalList[i][0] == listbetweenPositiveandNegative[j]){
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
 * Modify the program from Programming Project 7.1 so that it
 * works for numbers in the range -25 to 25
 * */
