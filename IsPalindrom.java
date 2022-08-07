import java.util.Scanner;

public class IsPalindrom{
    public static void main(String[] args) {
        //calling a recusion function
        Scanner sc = new Scanner(System.in);
        String uinput = sc.nextLine();
        sc.close();
        System.out.println(palindromRecursion(uinput, 0, uinput.length()-1));
    }

    private static boolean palindromRecursion(String uinput, int s, int l) {
        if(s>l) return false;
        if(uinput.charAt(s)==uinput.charAt(l)) return true;
        return palindromRecursion(uinput, s+1, l-1);
    }
}