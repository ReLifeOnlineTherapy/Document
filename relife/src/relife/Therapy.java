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
public class Therapy {

    public int id;
    public String name;
    public String type;
    public String desc;
    
    public Therapy(int id, String name, String type, String desc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
