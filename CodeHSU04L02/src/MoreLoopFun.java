public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        //a for loop that prints the powers of two up to 100
        //can you have an infinite for loop?
        for(int i = 2; i < 100; i *=2 ){
            System.out.println(i);
        }

        //write a for loop that counts by 4s from 5 up to 50


        //write a for loop that sums the numbers from 1 to 10
        int total = 0;

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

    }
}
