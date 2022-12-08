import java.util.Random;

public class Coin {
    char heads = 'H';
    char tails = 'T';

    public Coin() {
    }

    public char flip(){
        Random randint = new Random();

        if(randint.nextInt(2) == 0){
            return heads;
        }
        else{
            return tails;
        }
    }
}
