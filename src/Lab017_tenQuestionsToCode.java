package src;

public class Lab017_tenQuestionsToCode {
    public static void primeNumberChecker(int number) {
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter > 2) System.out.println("Not a prime");
        else System.out.println("Prime");
    }

    public static void fizzBuzzForArray() {
        String[] a = new String[101];
        for (int i = 1; i < a.length; i++) {
            a[i] = String.valueOf(i);
            int userArray = Integer.parseInt(a[i]);
            if (userArray % 5 == 0 && userArray % 3 == 0) {
                a[i] = "Fizzbuzz";
            } else if (userArray % 3 == 0) {
                a[i] = "Fizz";
            } else if (userArray % 5 == 0) {
                a[i] = "Buzz";
            }
            System.out.println(a[i]);
        }
    }

    public static void palindromeChecker(String a) {
        String reverse = "";
        for (int i = a.length()-1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }

        if (reverse.equals(a)) {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public static int factorialCalculator(int a) {
        int fact=1;
        for(int i=1; i<=a; i++){
            fact=fact*i;
        }
        return fact;
    }

    public static float temperatureConverter(float temp, char option) {

        System.out.println("'A' option --> Cel to Far");
        System.out.println("'B' option --> Far to Cel");

        float converted=0;
        switch (option) {
            case 'A' -> converted = (temp * 9 / 5) + 32;
            case 'B' -> converted = (temp - 32) * (5 / 9);
            default -> System.out.println("Invalid option selected");
        }
        return converted;
    }

    public static void marksDeveloper(float marks) {

        if(marks>100) System.out.println("Enter marks between 0-100");

        if(marks<=100 && marks>=90) System.out.println("A");
        else if (marks<=89 && marks>=80) System.out.println("B");
        else if (marks<=79 && marks>=70) System.out.println("C");
        else if (marks<=69 && marks>=60) System.out.println("D");
        else if (marks<=59 && marks>=0) System.out.println("E");
        else System.out.println("F");
    }

    public static void multiplicationTablePrinter(int tableNumber, int rangeStart, int rangeEnd){
        for(int i=rangeStart; i<=rangeEnd; i++) {
            System.out.print(tableNumber*i+" ");
        }
    }

    public static void sumOfDigitsInNumber(int number) {

        // Option 1
//        String numUsable = String.valueOf(number);
//        int a=0;
//        for(int i=0; i<numUsable.length(); i++) {
//            a= Integer.parseInt(String.valueOf(numUsable.charAt(i)))+a;
//        }
//        System.out.println(a);

        //Option 2
        int sum=0;
        while(number!=0) {
            int digits = number%10;
            sum = sum+digits;
            number = number/10;
        }
        System.out.println(sum);
    }

    public static void countVowelsAndConsonents(String input) {
        String usable = "aeiou";
        String convertedInput = input.toLowerCase();
        int counterForVowels=0,counterForConsonents=0;

        for(int i=0; i<convertedInput.length(); i++) {
            for(int j=0; j<usable.length(); j++) {
                if(convertedInput.charAt(i)==usable.charAt(j)) {
                    counterForVowels++;
                }
            }
        }
        System.out.println("Number of Vowels --> "+counterForVowels);
        System.out.println("Number of Consonents --> "+(convertedInput.length()-counterForVowels));
    }

    public static double simpleInterestCalculator(double principalBalance, double annualInterestRate, float timeInYears) {
        return ((principalBalance*annualInterestRate*timeInYears)/100);
    }
}