package leetCode.Arrays;


public class DefangingAnArray {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String a = "1.1.1.1";
        System.out.println(defangIPaddr(a));
    }

}
