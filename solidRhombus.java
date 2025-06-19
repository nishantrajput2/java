import java.util.*;
public class solidRhombus{
    public static void solidRhombus(int n){/* |    *****|
                                              |   ***** |
                                              |  *****  |
                                              | *****   |
                                              |*****    | if n = 5,   i = 1 , spaces = 4, (n-i)*/
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            solidRhombus(a);
        }
    }

