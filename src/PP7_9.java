import java.util.Scanner;

public class PP7_9 {
    public static void main (String arg[]){
        String [] firstName = new String [25];
        String [] lastName = new String [25];
        String [] streetAddress = new String [25];
        String [] city = new String [25];
        String [] state = new String [25];
        int [] zipCode = new int[25];
        long [] phoneNumber = new long [25];
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
                streetAddress[id] = list[2];
                city[id] = list[3];
                state [id] = list[4];
                zipCode[id] = Integer.valueOf(list[5]);
                phoneNumber[id] = Long.valueOf(list[6]);
            }
            id++;
        }
        for(int i = 0; i < id-1; i++){
            System.out.println(firstName[i] + " " + lastName[i] + " " + streetAddress[i] + " "
                    + city[i] + " " + state[i] + " " + zipCode[i] + " +"+ phoneNumber[i]);
        }
    }
}

/*
* Modify the program you created in Programming Project 7.8 to
* support the storing of additional user information: street address
* (string), city(string), state(string), and 10-digit phone number
* (long integer, contains area code and does not include special
* characters such as (,), or -).
* */
