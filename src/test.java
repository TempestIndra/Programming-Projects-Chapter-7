public class test {

    public static void main(String[] args){
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print1(testArray);
        System.out.println();
        print2(testArray);

    }
    private static void print1(int[] num) {
        for( int i : num){
            System.out.print(num[i-1] + ", ");
        }
    }
    private static void print2(int ... num){
        for( int i : num){
            System.out.print(num[i-1] + ", ");
        }
    }
}
