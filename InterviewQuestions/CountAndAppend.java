package InterviewQuestions;

public class CountAndAppend {
    public static void main(String[] args) {


        //aaabbccc --> a3b2c3

        String s = "aaabbccc";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            int count=0;
            char ofI = s.charAt(i);

            if(i>=1 && ofI==s.charAt(i-1)){
                continue;
            }

            for(int j =i; j<s.length(); j++) {
                char ofJ = s.charAt(j);
                if(ofI!=ofJ){
                    break;
                }
                else {
                    count++;
                }
            }
            sb.append(ofI).append(count);
        }
        System.out.println(sb);




    }
}
