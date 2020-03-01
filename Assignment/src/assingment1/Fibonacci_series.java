/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Fibonacci_series {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
    System.out.print ("enter how many numbers:");
    int n=input.nextInt();
    int a,b,f,i;
    a=0;
    b=1;
    if(n==0)
    {
        System.out.println(a);
    }else if(n==1){
        System.out.println(b);
    }else{
        System.out.println(a+" ");
        System.out.println(b+" ");
        for(i=0;i<n;i++){
            f=a+b;
            a=b;
            b=f;
            System.out.print(f+" ");
        }
        System.out.print("\n");
    }
       
    }
    
    
    
    
}
