package com.WorkingPlace;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        System.out.println("Добро пожаловать в систему поиска и размещения вакансий");
        System.out.println("Если вы хотите разместить резюме, нажмите 1:");
        System.out.println("Если вы хотите опубликовать вакансию, нажмите 2:");
        System.out.println("Если вы являетесь зарегистрированным пользователем, нажмите 3:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        chooseSpecific cS = new chooseSpecific();
        cS.chech(x);
        System.out.println("Finish program. THX for using ;)");
    }
}