package InterviewQuestions;

public class OccurenceOfCharactersInString {
    public static void main(String[] args) {

        String s = "Harshal Parate";

        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            int count =0;
            if(a==' ') {
                continue;
            }
            for(int j=i+1; j<s.length(); j++) {
                char b = s.charAt(j);
                if(a==b) {
                    count++;
                }
            }
            System.out.println(s.charAt(i)+" - "+(count+1));
            s = s.replace(s.charAt(i), ' ');
        }


    }
}
