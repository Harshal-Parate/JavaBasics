package src;

public class Lab009 {
    public static void main(String[] args) {
        // ADVANCED SWITCH LOOP
        int a=1;
        switch (a){
            case 1,2 -> System.out.println("Yes");
            default -> System.out.println("No");
            // no need to write break after avery condition
        }
    }
}
