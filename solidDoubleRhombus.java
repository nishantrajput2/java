import java.util.*;
public class solidDoubleRhombus{                     
    public static void solidDoubleRhombus(int n){/* |    **********     |
                                                    |   *****  *****    |
                                                    |  *****    *****   |
                                                    | *****      *****  |
                                                    |*****        ***** | if n = 5, i = 1, spaces = 4  (n-i)   stars=5  (n)   spaces = (n-i)-2; stars = 5 */
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= 2*(i-1); j++) {
                System.out.print(" ");
            }  
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }     
            System.out.println();
        }       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            solidDoubleRhombus(a);
        }
    }


    
