package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10) || (second < 10))
            return -1;
        int GCD = 0;
        if(first > second){
            GCD = second;
        } else
            GCD = first;
            while(GCD > 0){
                if(first % GCD == 0 && second % GCD == 0)
                    return GCD;
                    GCD --;
            }
            return -1;
    }
}
