package MutliThreading.Programmss;

import java.util.*;

public class ClassA {
    public static void main(String[] args) {
        String a = "harshal";
        String b = "parate";
        List<Integer> listInteger = List.of(1,2,3,4,5,6,7,8,9,10,11,15);
        int[] arr = {1,2,3,4,5,6,7,0,8,9,0,10,0,11,15,0};


        System.out.println("--------------------------------------------------");

        char[] A1 = a.toCharArray();
        Arrays.sort(A1);
        char[] A2 = b.toCharArray();
        Arrays.sort(A2);
        if(Arrays.equals(A1,A2)) {
            System.out.println("anagram");
        }
        else{
            System.out.println("no anagram");
        }
        System.out.println("--------------------------------------------------");

        //harshalparate

        char[] arr1 = new char[a.length()];
        for(int i=0; i<a.length(); i++) {
            arr1[i] = a.charAt(i);
        }

        int pointer = 5;
        List<Integer> integers = new ArrayList<>();
        for(int i=0; i<(a.length()/2); i++) {
            integers.add(i, pointer);
            pointer=pointer+5;
        }
        System.out.println(integers);
        for(int i=a.length()/2; i<a.length(); i++) {
            integers.add(i, pointer);
            pointer=pointer-5;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr1.length; i++) {
            sb.append(arr1[i]).append(integers.get(i)).append(" ");
        }
        System.out.println(sb);
        System.out.println("--------------------------------------------------");

        int s = 153;
        int result = 0;
        while(s!=0) {
            int temp = s%10;
            result = result+ (int)Math.pow(temp,3);
            s = s/10;
        }
        System.out.println(result);
        System.out.println("--------------------------------------------------");

        int pointer1=arr[0];
        for(int i=0; i< arr.length; i++) {
            if(arr[i]!=pointer1) {
                System.out.println(pointer1);
                break;
            }
            pointer1++;
        }
        System.out.println("--------------------------------------------------");


        int p = 20;
        int count = 0;
        for(int i=1; i<=20; i++) {
            if(20%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prome");
        }

        System.out.println("--------------------------------------------------");

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<a.length(); i++) {
            char q = a.charAt(i);
            if(map.containsKey(q)) {
                map.put(q, map.get(q)+1);
            }
            else {
                map.put(q, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for(Character key : keys) {
            System.out.print(key+" "+map.get(key));
        }

        System.out.println("--------------------------------------------------");


        int n1=0, n2=1, n3;
        for(int i=1; i<=10; i++) {
            n3=n1+n2;
            System.out.print(n3);
            n1=n2;
            n2=n3;
        }

        System.out.println("--------------------------------------------------");

        String k = "harshal";
        for(int i=0; i<k.length(); i++) {
            for(int j=i+1; j<k.length(); j++) {
                if(k.charAt(i)==k.charAt(j)) {
                    System.out.println(k.charAt(i));
                }
            }
        }

        System.out.println("--------------------------------------------------");

        for(int i=0; i<k.length(); i++) {
            for(int j=i+1; j<k.length(); j++) {
                if(k.charAt(i)==k.charAt(j)) {
                    k = k.replace(k.charAt(i), ' ');
                }
            }
        }

        System.out.println(k.trim().charAt(0));
        System.out.println("--------------------------------------------------");

        int[] qq = {1,2,2,3,4,5,6,7,8,7,0,6,5,5,0,3,0,9};

        Arrays.stream(qq)
                .distinct().forEach(e -> {
                    System.out.print(e+" ");
                });

        System.out.println("--------------------------------------------------");

        int[] qw = {1, 2, 2, 3, 4, 5, 6, 7, 8, 7, 0, 6, 5, 5, 0, 3, 0, 9};

        int end = qw.length-1;
        for (int i = qw.length - 1; i >= 0; i--) {
            if (qw[i] != 0) {
                qw[end] = qw[i];
                end--;
            }
        }
        while (end >= 0) {
            qw[end] = 0;
            end--;
        }
        System.out.println(Arrays.toString(qw));

        int[] qe = {1, 2, 2, 3, 4, 5, 6, 7, 8, 7, 0, 6, 5, 5, 0, 3, 0, 9};

        int start = 0;
        for(int i=0; i< qe.length; i++) {
            if(qe[i]!=0) {
                qe[start] = qe[i];
                start++;
            }
        }
        while(start< qe.length) {
            qe[start] = 0;
            start++;
        }
        System.out.println(Arrays.toString(qe));

        System.out.println("--------------------------------------------------");

        int l =10687;
        int rev = 0;
        while(l!=0) {
            int temp = l%10;
            rev=rev*10+temp;
            l = l/10;
        }
        System.out.println(rev);
        System.out.println("--------------------------------------------------");


        int[] aa = {1, 2, 2, 3, 4, 5, 6, 7, 8, 7, 0, 6, 5, 5, 0, 3, 0, 9};

        int start1 = 0;
        int end1 = aa.length-1;
        while(start1<=end1) {
            int temp = aa[start1];
            aa[start1]= aa[end1];
            aa[end1] = temp;
            start1++;
            end1--;
        }
        System.out.println(Arrays.toString(aa));

        System.out.println("--------------------------------------------------");


        String c = "{{}}}";

        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for(int i=0; i<c.length(); i++) {
            char q = c.charAt(i);
            if(q=='{') {
                stack.push(q);
            } else if (q=='}'){
                if (stack.isEmpty() || stack.pop()!='{') {
                    flag = false;
                }
            }
        }
        if(stack.isEmpty() && flag==true) {
            System.out.println("valid");
        }
        else {
            System.out.println("false");
        }

        System.out.println("--------------------------------------------------");

        int ii = 1;
        int kk = 2;

        ii=ii+kk;
        kk=ii-kk;
        ii=ii-kk;
        System.out.println(ii+" "+kk);

        System.out.println("--------------------------------------------------");


        int[][] arr11 = {{1,2,3},{4,5,6},{7,8,9}};

        int row = arr11.length;
        int col = arr11[0].length;
        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;
        int direction = 0;

        while(top<=bottom && left<=right) {
            if(direction==0) {
                for(int i=left; i<=right; i++) {
                    System.out.print(arr11[top][i]);
                }
                top++;
            } else if (direction==1) {
                for(int i = top; i<=bottom; i++) {
                    System.out.print(arr11[i][right]);
                }
                right--;
            } else if (direction==2) {
                for(int i=right; i>=left; i--) {
                    System.out.print(arr11[bottom][i]);
                }
                bottom--;
            }
            else if (direction==3) {
                for(int i=bottom; i>=top; i--) {
                    System.out.print(arr11[i][left]);
                }
                left++;
            }

            direction=(direction+1)%4;


        }









    }
}
