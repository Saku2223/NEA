package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    private static File LSOutput = new File("Books.txt");
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CreateFile();
        CreateFile2();
        WriteToFile();
        System.out.println("Do you want to delete this file now? If you do then type 'Y'");
        String userOption = input.next();
        if (userOption.equals("Y")) {
            DeleteFile();
        }
        for (int j = 0; j < 4; j++) {
            ShowMenu();


            switch (menuInt) {

                case 1:
                    int itemsToAdd = Integer.parseInt(input.next("How many items do you wish to add?"));
                    for (int i = 0; i < itemsToAdd; i++) {
                        items.add(getItemDetails());
                    }
                    WriteToFile();
                    break;

                case 2:
                    ReadFile();
                    break;

                case 3:
                    DeleteFile();
                    break;
            }

        }

    }

    ArrayList<Object> item = new ArrayList<>();
    private static ArrayList<String> items = new ArrayList<>();
    private static ArrayList<String> register = new ArrayList<>();
    private static int menuInt = 0;
    private static int loginSys = 0;
    private static String password;
    private static String username;
    private static String userLog;
    private static String userPass;
    private static int itemsToAdd = 1;


    private static final File myObj = new File("itemList.txt");
    private static final File myLogin = new File("userLogins.txt");


    public static void ShowMenu() {
        System.out.println("\n");
        System.out.println("Please choose an option from the menu: ");
        System.out.println("1 - add items ");
        System.out.println("2 - display items ");
        System.out.println("3 - delete file ");

        Scanner input = new Scanner(System.in);
        menuInt = input.nextInt();


    }


    public static void DeleteFile() {
        if (LSOutput.delete()) {
            System.out.println("Deleted the file: " + LSOutput.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }


    public static String getItemDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your book name");
        String productName = input.nextLine();
        System.out.println("Enter your ISBN code");
        Boolean productID = input.nextLine();
        System.out.println("Enter the author name");
        String author = input.nextLine();
        System.out.println("Enter the book genre");
        String genre = input.nextLine();
        return (productName + ", " + productID + ", " + author + ", " + genre);
    }

    public static void CreateFile2() {
        try {
            if (myLogin.createNewFile()) {
                System.out.println("File created: " + myLogin.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void CreateFile() {
        try {
            if (LSOutput.createNewFile()) {
                System.out.println("File created: " + LSOutput.getName());
            } else {
                System.out.println("File already exists."); // Tells you if the file is already made
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void ReadFile() {
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter(LSOutput.getName(), false); //True means append to file contents, False means overwrite
            //System.out.println("This is the contents of the file:");
            System.out.println("Would you like to add a book to the list? Y or N");
            String answer = input.next();

            while (answer.equalsIgnoreCase("Y")) { // Doesn't give a "no" option as anything typed other than "Y" is considered a "no"
                myWriter.write(getItemDetails() + "\n"); // Overwrites everything in the file
                System.out.println("Would you like to add another book to the list? Y or N");
                answer = input.next();
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file."); // Program hasn't crashed
        } catch (IOException e) {
            System.out.println("An error occurred."); // Error catcher
            e.printStackTrace();
        }
    }
}
