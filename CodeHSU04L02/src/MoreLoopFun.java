public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 6
        for(int start = 1; start < 7; start++ ){
            System.out.println(start);
        }

        //a for loop that prints the integer powers of two up to 100
        //can you have an infinite for loop?
        System.out.println("Powers of 2");
        for(int start = 1 ; start <= 100 ; start *= 2 ){
            System.out.print(start + " ");
        }
        System.out.println();
        System.out.println("Counting by 4s");
        //write a for loop that counts by 4s from 5 up to 50
        for(int i = 5; i <= 50; i += 4){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Summing 1 through 10");
        //write a for loop that sums the numbers from 1 to 10
        int total = 0;
        for(int i = 1; i <= 10 ; i++){
            total += i;
        }
        System.out.println("The sum of the integers 1 through 10 is: " + total);

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        System.out.println("Finished!");

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }
        System.out.println("Finished!");

        System.out.println();
        System.out.println("While loop");
        String name = "Mr. Smith";
        int j = 0;
        while(j < name.length()){
            System.out.println(name.charAt(j));
            j++;
        }
        System.out.println();
        System.out.println("For loop");
        for(int i = 0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
