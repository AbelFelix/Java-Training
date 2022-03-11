public class FizzBuzz {

    public static void main(String[] args) {
        int fizzbuzz = 15;
        FizzBuzz(fizzbuzz);
    }

    public static void FizzBuzz(int fz){

        for(int i=1; i<= fz; i++){
            if(( (i % 5) == 0) && ( (i % 3) == 0) ){
                System.out.println("FizzBuzz");
            }
            else if(( (i % 5) == 0)){
                System.out.println("Fizz");
            }
            else if(( (i % 3) == 0)){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }


    }


}
