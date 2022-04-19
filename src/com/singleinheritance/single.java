package com.singleinheritance;

import java.util.Scanner;

    public class single {
        Scanner sc = new Scanner(System.in);
        int id ;
        String name ;
        void setStudent(){
            System.out.println("Enter The ID And NAME :");
            id = sc.nextInt();
            name = sc.next();
        }
    }
    class Result extends single{
        int perc ;
        void setPerc(){
            System.out.println("Enter The Percentage");
            perc = sc.nextInt();
        }
        void getResult(){
            System.out.println("ID:"+id);
            System.out.println("Name:"+name);
            System.out.println("Percentage:"+perc);
        }
    }
    class Main{
        public static void main(String[] args){
            Result result = new Result();
            result.setStudent();
            result.setPerc();
            result.getResult();
        }
    }

