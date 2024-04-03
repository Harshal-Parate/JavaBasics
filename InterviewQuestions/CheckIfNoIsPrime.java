package InterviewQuestions;

public class CheckIfNoIsPrime {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {

        CheckIfNoIsPrime c = new CheckIfNoIsPrime();
        c.setNumber(11);
        int count = 0;

        for(int i=1; i<=c.getNumber(); i++) {
            if(c.getNumber()%1==0){
                count++;
            }
        }
        if(count<2) {
            System.out.println("Prime - "+c.getNumber());
        }
        else System.out.println("Not Prime - "+c.getNumber());




    }
}
