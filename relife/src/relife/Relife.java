/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relife;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tigra Gaizka
 */
public class Relife {
    
    static ArrayList<Admin> adminList = new ArrayList();
    static ArrayList<Therapist> therapistList = new ArrayList();
    static ArrayList<Customer> customerList = new ArrayList();
    static ArrayList<Therapy> therapyList = new ArrayList();
    static ArrayList<PHS> phsList = new ArrayList();
    static ArrayList<Medicine> medicineList = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int option, optionA;
        int idA = 0;
        int idT = 0; 
        int idC = 0;
        int idTp = 0;
        int idP = 0;
        int idM = 0;

        do {
            System.out.println("1. Admin");
            System.out.println("2. Therapist");
            System.out.println("3. User");
            System.out.println("4. Therapy");
            System.out.println("5. PHS");
            System.out.println("6. Medicine");
            System.out.println("7. Exit");
            System.out.println("-------------");
            System.out.print("Option : ");
            option = input.nextInt();
            System.out.println("");
            
            if (option == 1) { //Admin
                do {
                    System.out.println("1. Input Data");
                    System.out.println("2. View Data");
                    System.out.println("3. Back");
                    System.out.println("-------------");
                    System.out.print("Option : ");
                    optionA = input.nextInt();
                    System.out.println("");
                    
                    if (optionA == 1) {
                        System.out.print("Enter Username: "); String username = input.next();
                        System.out.print("Enter Password: "); String password = input.next();
                        System.out.print("Enter Name    : "); String name = input.next();
                        System.out.print("Enter Age     : "); int age = input.nextInt();
                        System.out.print("Enter Gender  : "); String gender = input.next();
                        System.out.print("Enter Phone   : "); String phone = input.next();
                        System.out.print("Enter Email   : "); String email = input.next();
                        System.out.println("");
                        idA++;
                        adminList.add(new Admin(idA, username, password, name, age, gender, phone, email));
                    }
                    
                    else if (optionA == 2) {
                        for (int i=0;i<adminList.size();i++){
                            System.out.println("ID       : A"+adminList.get(i).getId());
                            System.out.println("Username : "+adminList.get(i).getUsername());
                            System.out.println("Password : "+adminList.get(i).getPassword());
                            System.out.println("Name     : "+adminList.get(i).getName());
                            System.out.println("Age      : "+adminList.get(i).getAge());
                            System.out.println("Gender   : "+adminList.get(i).getGender());
                            System.out.println("Phone    : "+adminList.get(i).getPhone());
                            System.out.println("Email    : "+adminList.get(i).getEmail());
                            System.out.println("--------------------------------");
                            System.out.println("");
                        }
                    }
                } while (optionA != 3);
            }
            
            else if (option == 2) { //Therapist
                do {
                    System.out.println("1. Input Data");
                    System.out.println("2. View Data");
                    System.out.println("3. Back");
                    System.out.println("-------------");
                    System.out.print("Option : ");
                    optionA = input.nextInt();
                    System.out.println("");
                    
                    if (optionA == 1) {
                        System.out.print("Enter Username: "); String username = input.next();
                        System.out.print("Enter Password: "); String password = input.next();
                        System.out.print("Enter Name    : "); String name = input.next();
                        System.out.print("Enter Age     : "); int age = input.nextInt();
                        System.out.print("Enter Gender  : "); String gender = input.next();
                        System.out.print("Enter Phone   : "); String phone = input.next();
                        System.out.print("Enter Email   : "); String email = input.next();
                        System.out.println("");
                        idT++;
                        therapistList.add(new Therapist(idT, username, password, name, age, gender, phone, email));
                    }
                    
                    else if (optionA == 2) {
                        for (int i=0;i<therapistList.size();i++){
                            System.out.println("ID       : T"+therapistList.get(i).getId());
                            System.out.println("Username : "+therapistList.get(i).getUsername());
                            System.out.println("Password : "+therapistList.get(i).getPassword());
                            System.out.println("Name     : "+therapistList.get(i).getName());
                            System.out.println("Age      : "+therapistList.get(i).getAge());
                            System.out.println("Gender   : "+therapistList.get(i).getGender());
                            System.out.println("Phone    : "+therapistList.get(i).getPhone());
                            System.out.println("Email    : "+therapistList.get(i).getEmail());
                            System.out.println("--------------------------------");
                            System.out.println("");
                        }
                    }
                } while (optionA != 3);
            }
            
            else if (option == 3) { //User
                do {
                    System.out.println("1. Input Data");
                    System.out.println("2. View Data");
                    System.out.println("3. Back");
                    System.out.println("-------------");
                    System.out.print("Option : ");
                    optionA = input.nextInt();
                    System.out.println("");
                    
                    if (optionA == 1) {
                        System.out.print("Enter Username: "); String username = input.next();
                        System.out.print("Enter Password: "); String password = input.next();
                        System.out.print("Enter Name    : "); String name = input.next();
                        System.out.print("Enter Age     : "); int age = input.nextInt();
                        System.out.print("Enter Gender  : "); String gender = input.next();
                        System.out.print("Enter Phone   : "); String phone = input.next();
                        System.out.print("Enter Email   : "); String email = input.next();
                        System.out.println("");
                        idC++;
                        customerList.add(new Customer(idC, username, password, name, age, gender, phone, email));
                    }
                    
                    else if (optionA == 2) {
                        for (int i=0;i<customerList.size();i++){
                            System.out.println("ID       : C"+customerList.get(i).getId());
                            System.out.println("Username : "+customerList.get(i).getUsername());
                            System.out.println("Password : "+customerList.get(i).getPassword());
                            System.out.println("Name     : "+customerList.get(i).getName());
                            System.out.println("Age      : "+customerList.get(i).getAge());
                            System.out.println("Gender   : "+customerList.get(i).getGender());
                            System.out.println("Phone    : "+customerList.get(i).getPhone());
                            System.out.println("Email    : "+customerList.get(i).getEmail());
                            System.out.println("--------------------------------");
                            System.out.println("");
                        }
                    }
                } while (optionA != 3);
            }
            
            else if (option == 4) { //Therapy
                do {
                    System.out.println("1. Input Data");
                    System.out.println("2. View Data");
                    System.out.println("3. Back");
                    System.out.println("-------------");
                    System.out.print("Option : ");
                    optionA = input.nextInt();
                    System.out.println("");
                    
                    if (optionA == 1) {
                        System.out.print("Enter Name        : "); String name = input.next();
                        System.out.print("Enter Type        : "); String type = input.next();
                        System.out.print("Enter Description : "); String desc = input.next();
                        System.out.println("");
                        idTp++;
                        therapyList.add(new Therapy(idTp, name, type, desc));
                    }
                    
                    else if (optionA == 2) {
                        for (int i=0;i<therapyList.size();i++){
                            System.out.println("ID   : TP"+therapyList.get(i).getId());
                            System.out.println("Name : "+therapyList.get(i).getName());
                            System.out.println("Type : "+therapyList.get(i).getType());
                            System.out.println("");
                            System.out.println("Description : \n"+therapyList.get(i).getDesc());
                            System.out.println("--------------------------------");
                            System.out.println("");
                        }
                    }
                } while (optionA != 3);
            }
            
            else if (option == 5) { //PHS
                do {
                    System.out.println("1. Input Data");
                    System.out.println("2. View Data");
                    System.out.println("3. Back");
                    System.out.println("-------------");
                    System.out.print("Option : ");
                    optionA = input.nextInt();
                    System.out.println("");
                    
                    if (optionA == 1) {
                        System.out.print("Enter Name        : "); String name = input.next();
                        System.out.print("Enter Description : "); String desc = input.next();
                        System.out.println("");
                        idP++;
                        phsList.add(new PHS(idP, name, desc));
                    }
                    
                    else if (optionA == 2) {
                        for (int i=0;i<phsList.size();i++){
                            System.out.println("ID   : P"+phsList.get(i).getId());
                            System.out.println("Name : "+phsList.get(i).getName());
                            System.out.println("");
                            System.out.println("Description : \n"+phsList.get(i).getDesc());
                            System.out.println("--------------------------------");
                            System.out.println("");
                        }
                    }
                } while (optionA != 3);
            }
            
            else if (option == 6) { //Medicine
                do {
                    System.out.println("1. Input Data");
                    System.out.println("2. View Data");
                    System.out.println("3. Back");
                    System.out.println("-------------");
                    System.out.print("Option : ");
                    optionA = input.nextInt();
                    System.out.println("");
                    
                    if (optionA == 1) {
                        System.out.print("Enter Name        : "); String name = input.next();
                        System.out.print("Enter Type        : "); String type = input.next();
                        System.out.print("Enter Unit        : "); String unit = input.next();
                        System.out.print("Enter Description : "); String desc = input.next();
                        System.out.println("");
                        idM++;
                        medicineList.add(new Medicine(idM, name, type, unit, desc));
                    }
                    
                    else if (optionA == 2) {
                        for (int i=0;i<medicineList.size();i++){
                            System.out.println("ID   : M"+medicineList.get(i).getId());
                            System.out.println("Name : "+medicineList.get(i).getName());
                            System.out.println("Type : "+medicineList.get(i).getType());
                            System.out.println("Unit : "+medicineList.get(i).getUnit());
                            System.out.println("");
                            System.out.println("Description : \n"+medicineList.get(i).getDesc());
                            System.out.println("--------------------------------");
                            System.out.println("");
                        }
                    }
                } while (optionA != 3);
            }
            
        } while (option != 7);

    }
    
}
