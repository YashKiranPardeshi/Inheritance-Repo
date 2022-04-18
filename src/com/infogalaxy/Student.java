package com.infogalaxy;

import java.util.Scanner;
public class Student {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;

        void setStudent() {
            //System.out.println("Enter The ");
            System.out.println("Enter the ID  :");
            id = sc.nextInt();
            System.out.println("Enter the Name :");
            name = sc.next();
        }
    }
    class Internal extends Student{
        int m1 ;
        int m2 ;
        void setInternal(){
            System.out.println("Entre the Marks M1 :");
            m1 = sc.nextInt();
            System.out.println("Enter the Marks M2 :");
            m2 = sc.nextInt();
        }
        void getInternal(){
            System.out.println("ID "+id);
            System.out.println("Name"+name);
            System.out.println("eM1"+m1);
            System.out.println("eM2"+m2);
        }
    }
    class External extends Internal {
        int em1;
        int em2;

        void setExternal(){
                System.out.println("Enter the EM1 Mark: ");
                em1 = sc.nextInt();
                System.out.println("Enter the EM2 Mark: ");
                em2 = sc.nextInt();

    }
    void getExternal(){
        System.out.println("ID :"+ id);
        System.out.println("Name:"+name);
        System.out.println("eM1:"+em1);
        System.out.println("eM2:"+em2);
        }
    }
    class Main{
        public static void main(String[] args){
            Internal internal = new Internal();
            External external = new External();
            internal.setStudent();
            internal.setInternal();
            external.setStudent();
            external.setExternal();
            internal.getInternal();
            external.getExternal();
        }
    }
