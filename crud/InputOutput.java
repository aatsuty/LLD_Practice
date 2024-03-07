package crud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutput {
    public static void main(String args[]){
        // Using Scanner library to take input
        // new is keyword
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList list = new ArrayList<>();
            for(int i=0; i<n; i++){
                int a  = sc.nextInt();
                list.add(a);
            }
            list.remove(4);
            System.out.println(list);

        }catch(Exception e){
            System.out.println("Getting Exception in UserInput"+e);
        }
    }
}
