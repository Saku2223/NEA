package com.company;

import java.io.File;
import java.util.ArrayList;

public class Login {

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

}
