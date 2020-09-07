package pro.edu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world ");

        byte a = 5;
        short b = 5000;
        int c = 12000000;
        long d =1000;
        float e = 2.5f;
        double f = 1.9;
        char g = '#';
        boolean h = true;
        String str = "Hello world";

        int myAge = 20;
        System.out.println("  My age is " + myAge + " years.");
        int hisAge = 20;

        //------------------------------------------------------------------------
        if (myAge >= 18){
            System.out.println(" Совершеннолетний");
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }

          //  Palindrom

        String word = "шалашa";
        boolean isPalindrom = true;

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                isPalindrom = false;
                break;
            }
        }

        System.out.println(isPalindrom);

    }
}
