package UMS.Controller;

import java.util.Scanner;

public class Login {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String uName = sc.next();
        System.out.print("Enter your password : ");
        String pass = sc.next();

        Admin.Menu();
    }
}
