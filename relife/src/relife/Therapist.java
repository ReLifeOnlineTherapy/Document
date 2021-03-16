/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relife;

/**
 *
 * @author Tigra Gaizka
 */
public class Therapist extends User {
    
    public Therapist(int id, String username, String password, String name, int age, String gender, String phone, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }
    
}
