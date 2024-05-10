package InterviewQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BASEPROGRAMM {

    /*

    //sortInDesc();
        //removeRepeatedWordsUsingSet();
        //removeRepeatedWords();
        //countLetters();
        //twoSum();
        //threeSum();
        //fibSeries();
        //appendInBetween();
        //shiftZerosInRight();
        //star1();
        //star2();
        //star3();
        //star4();
        //star5();
        //start6();
        //start7();
        //star8();
        //star9();
        //star10();
        //checkWhichNumberIsMissing();
               //checkIfNoIsPrime();
        //hashMapToArrayList();
        //countAndAppend();
//        fibSeriess();
//        findDuplicates();
//        firstNonRepeatingChara();
//        spiral();

        //banalcedParan();
//        shiftZeroToright();
//        countOcccurance();
//        shiftingZeroTOright();
//        findSubstrings();
//        avgTheArray();
        //joinArray();

     */

    static void sortInDesc() {
        int[] arr = {3, 4, 23, 235, 3645, 756, 9};
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void removeRepeatedWordsUsingSet() {
        String a = "harshal";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        System.out.println(set);
    }

    static void removeRepeatedWords() {
        String a = "harshal";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            boolean repeat = false;
            for (int j = 0; j < sb.length(); j++) {
                char c = a.charAt(j);
                if (b == c) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                sb.append(b);
            }
        }
        System.out.println(sb);
    }

    static void countLetters() {
        String a = "harshal";
        int count = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                continue;
            }
            for (int j = i + 1; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
            System.out.print(a.charAt(i) + "" + count + " ");
            count = 1;
            a = a.replace(a.charAt(i), ' ');
        }
    }

    static void twoSum() {
        int sum = 4;
        int[] arr = {1, 2, 3, 4, 5, 6, 0, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    static void threeSum() {
        int sum = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 0, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    static void fibSeries() {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        int n3;

        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }

    static void appendInBetween() {
        String a = "AccoliteDigital";
        char[] arr = new char[a.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.charAt(i);
        }

        List<Integer> list = new ArrayList<>();
        int pointer = 0;
        for (int i = 0; i < a.length() / 2; i++) {
            list.add(pointer++, i);
        }
        for (int i = (a.length() / 2); i <= a.length(); i++) {
            list.add(i, pointer--);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(list.get(i)).append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }

    static void shiftZerosInRight() {
        int[] arr = {1, 2, 0, 8, 0, 1, 0, 5, 67, 0, 33, 23, 5, 78, 9, 0};
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                while (arr[end] == 0 && end > i) {
                    end--;
                }
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void star1() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("*");
        }
    }

    static void star2() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("*");
        }
    }

    static void star3() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star4() {
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star5() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void start6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void start7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star8() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star9() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void star10() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void checkWhichNumberIsMissing() {
        int[] arr = {1, 2, 3, 5, 7, 8};

        int pointer = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != pointer) {
                System.out.print(pointer);
                break;
            }
            pointer++;
        }
    }

    static void checkIfNoIsPrime() {
        int a = 1;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (20 % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }

    static void hashMapToArrayList() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Harshal");
        map.put(2, "Jaiveek");
        map.put(3, "Devendra");
        map.put(4, "Jyoti");
        map.put(5, "Hitanshu");

        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();

        for (Integer key : keys) {
            System.out.println(key);
        }
        for (String value : values) {
            System.out.println(value);
        }
    }

    static void countAndAppend() {

        //aaaabbccc
        //a4b2c3

        String str = "aaaabbccc";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char a = str.charAt(i);
            if (a == ' ') {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                char b = str.charAt(j);
                if (a == b) {
                    count++;
                }

            }
            System.out.println(count + " " + a);
            str = str.replace(a, ' ');
        }

    }

    static void fibSeriess() {

        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i <= 20; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }

    static void findDuplicates() {
        String a = "harshal";

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    System.out.println(a.charAt(i));
                }
            }
        }

    }

    static void firstNonRepeatingChara() {
        String a = "harshal";

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    a = a.replace(a.charAt(i), ' ');
                }
            }

        }
        System.out.println((a.trim().charAt(0)));
    }

    static void spiral() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int row = arr.length;
        int col = arr[0].length;
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + " ");
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }

            direction = (direction + 1) % 4;

        }


    }

    static void banalcedParan() {
        String a = "{{}}}";

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<a.charAt(i); i++);


    }

    static void shiftZeroToright() {

        int[] arr = {1, 0, 203, 40, 5, 60, 0, 34, 40, 0};
        List<Integer> integerList = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted((a, b) -> b - a)
                .filter(a -> a != 0)
                .toList();
        System.out.println(integerList);


    }

    static void countOcccurance() {

        String a = "harshal";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }


        Set<Character> characters = map.keySet();
        for (char chara : characters) {
            System.out.println((chara) + " " + map.get(chara));
        }


    }

    static void shiftingZeroTOright() {
        int[] arr = {1, 2, 3, 40, 9, 0, 9, 0, 7, 3};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(collect);


        int end = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[end] = arr[i];
                end--;
            }
        }
        while (end >= 0) {
            arr[end] = 0;
            end--;
        }
        System.out.println(Arrays.toString(arr));


        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[start] = arr[i];
                start++;
            }
        }
        while (start <= arr.length - 1) {
            arr[start] = 0;
            start++;
        }
        System.out.println(Arrays.toString(arr));


    }

    static void findSubstrings() {
        String a = "harshal";
        String p = "shz";
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                arr.add(a.substring(i, j));
            }
        }
        for (String SubString : arr) {
            if (SubString.equals(p)) {
                System.out.println("hai bhai");
            } else {
                System.out.println("no");
            }
        }
    }

    static void avgTheArray() {

        int[] arr = {1, 2, 3, 40, 9, 0, 9, 0, 7, 3};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / (arr.length));

    }

    static void joinArray() {
        int[] arr1 = {1, 2, 3, 40, 9, 0, 9, 0, 7, 3};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i];
            if (i == arr1.length - 1) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr3));

    }

    static void star11() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star12() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star13() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star14() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star15() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star16() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void convertDate() {
        String[] str = {"19-01-2001", "18-05-1991", "21-03-2005"};
        /*
        Input format: dd-MM-yyyy
        Output format: MM-dd-yyyy
         */


        DateTimeFormatter inputFormat =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outputFormat =  DateTimeFormatter.ofPattern("MM-dd-yyyy");

        for(int i=0; i< str.length; i++) {
            LocalDate localDate = LocalDate.parse(str[i], inputFormat);
            String parsed = outputFormat.format(localDate);
            System.out.print(parsed+" ");
        }
        System.out.println();

        String a = "{{{}}}}";
        Stack<Character> stack = new Stack<>();
        boolean flag=true;
        for(int i=0; i<a.length(); i++) {
            char x = a.charAt(i);
            if(x=='{') {
                stack.push(x);
            } else if (x=='}') {
                if(stack.isEmpty() || stack.pop()!='{') {
                    flag = false;
                }

            }

        }
        if( stack.isEmpty() && flag) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }






    public static void main(String[] args) {
        //star11();
        //star12();
        //star13();
        //star14();
        // star15();
        //star16();
//        convertDate();


    }

}
