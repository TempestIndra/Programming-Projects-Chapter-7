import java.util.Scanner;

public class PP7_8 {

    public static void main (String arg[]){
        String [] firstName = new String [25];
        String [] lastName = new String [25];
        int [] zipCode = new int[25];
        int id = 0;
        Scanner sc = new Scanner( System.in );
        Boolean run = true;
        while(run){
            String text = sc.nextLine();
            if(text.equals("stop")){
                run = false;
            }else if(firstName[24] != null) {
                System.out.println("full list");
                run = false;
            }else {
                String[] list = text.split(" ");
                firstName[id] = list[0];
                lastName[id] = list[1];
                zipCode[id] = Integer.valueOf(list[2]);
            }
            id++;
        }
        for(int i = 0; i < id-1; i++){
            System.out.println(firstName[i] + " " + lastName[i] + " "+ zipCode[i]);
        }
     }
}
/*
* Design and implement an application that reads sequence of up
* to 25 pairs of names and postal (ZIP) codes for individuals. Store
* the data in an object designed to store a first name (string), last
* name (string), and postal code(integer). Assume that each line of
* input will contain two strings followed by an integer value, each
* separated by a tab character. Then, after the input has been read
* in, print the list in an appropriate format to the screen.
* */