package leetCode.Arrays;

public class NumberOfEmployeesWhoMeetTheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i=0; i<hours.length; i++) {
            if(hours[i]>=target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        System.out.println(numberOfEmployeesWhoMetTarget(arr,2));
    }
}
