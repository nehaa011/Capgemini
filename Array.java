import java.util.ArrayList;
import java.util.Scanner;
public class Array{
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void add(int a){
        arr.add(a);
    }

    public static void remove(int a){
        arr.remove(a);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
add(a);
        System.out.println(arr);
    }
}