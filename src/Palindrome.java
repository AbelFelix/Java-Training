public class Palindrome {

    public static void main(String[] args) {
        Palindrome pal = new Palindrome();

        //String palindrome
        pal.isPalindrome("anita lava la tina");

        //Number Palindrome
        pal.isPalindromeNum(3553);
    }

    //Verify if the input is a word, phrase, or sequence that reads the same backward as forward
    public boolean isPalindrome(String str){
        //Remove whitespaces and convert to lowercase the string
        String clean = str.replaceAll(" ","").toLowerCase();

        int length = clean.length();
        int forward = 0;
        int backward = length - 1;

        //Loop backwards until the length equals 0
        while(backward > forward){
            //Obtain next first and last char of the string
            char charForward = clean.charAt(forward++);
            char charBackward = clean.charAt(backward--);

            //Compare next first and last char of the string
            if(charForward != charBackward){
                System.out.println(clean + " is NOT Palindrome");
                return false;
            }
        }
        System.out.println(clean + " is Palindrome");
        return true;
    }

    //Verify if the input number remains the same when its digits are reversed
    public void isPalindromeNum(int num){
        int reversedNum = 0, remainder;
        int originalNum = num;

        //Loop while the input number is not 0
        while (num != 0) {
            //Obtain the next last number, ex: 123 - 3, 2, 1
            remainder = num % 10;
            //Add the obtained number
            reversedNum = reversedNum * 10 + remainder;
            //Divide in 10 the input number
            num /= 10;
        }
        //Compare the input number with the reversed in the loop
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
