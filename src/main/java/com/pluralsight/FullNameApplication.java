package com.pluralsight;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FullNameApplication {
    static void main() {
start();
    }

    static void start(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        String[] prompts = {"First Name: ", "Enter Middle Name (Press Enter To Skip:) ", "Enter Last Name: ", "Enter Suffix (Press Enter To Skip:) "};

        System.out.println("Please enter your name");

        for (String prompt : prompts){
            System.out.print(prompt);
            String content = scanner.nextLine();

            names.add(content);
        }

        IO.println();
        IO.println("---------------- Your Name ---------------------");

//        Loop through
        for (int i =0; i < names.size(); i++){

            String name = names.get(i);
            switch (i){

                case 0 -> IO.println("First Name: " + name);
                case 1 -> IO.println("Middle Name: " + (name.isEmpty() ? "No Middle Name" : name));
                case 2 -> IO.println("Last Name: " + name );
                case 3 -> IO.println("Suffix: " + (name.isEmpty() ? "" : name));

            }

        }






    }
}
