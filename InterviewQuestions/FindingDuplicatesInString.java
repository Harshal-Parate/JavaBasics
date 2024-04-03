package InterviewQuestions;


public class FindingDuplicatesInString {
    public static void main(String[] args) {

        String a = "HarsHalparate";


        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(a.charAt(i) + "-->" + count);
                a = a.replace(a.charAt(i), ' ');
            }
        }


    }
}
