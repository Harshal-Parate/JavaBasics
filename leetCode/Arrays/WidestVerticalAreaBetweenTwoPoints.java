package leetCode.Arrays;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPoints {
    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0])); //sorting the array in ascending order in x- coordinate as, Integer.compare(a[0], b[0]) sort in x and Integer.compare(a[1], b[1]) sorts in y
        int maxDist = 0;

        for(int i=1; i<points.length; i++) {
            int width = points[i][0] - points[i-1][0];
            maxDist = Math.max(width, maxDist);
        }
        return maxDist;
    }

    // This below solution is easy

    public int maxWidthOfVerticalArea1(int[][] points) {
        int max=0;
        int x[] = new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            x[i]=points[i][0];
        }
        Arrays.sort(x);
        for(int i=0;i<points.length-1;i++)
        {
            int diff=x[i+1]-x[i];
            max= Math.max(max,diff);
        }
        return max;

    }

    public static void main(String[] args) {
        int[][] arr = {{3,1}, {9,0}, {1,0}, {1,4}, {5,3}, {8,8}};
        System.out.println(maxWidthOfVerticalArea(arr));
    }
}
