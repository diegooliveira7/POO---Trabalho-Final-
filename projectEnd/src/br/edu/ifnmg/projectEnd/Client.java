/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private int id;
    private String name;
    private String cpf;
    private String email;
    private Sex sex;
    private List<String> telephones;
    private String neighborhood;
    private String street;
    private String number_house;

    public Client(){
        this.id = 0;
        this.name = "";
        this.cpf = "";
        this.email = "";
        this.sex = Sex.F;
        this.neighborhood = "";
        this.number_house = "";
        this.street = "";
        this.telephones = new ArrayList<String>();
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int newId){
        this.id = newId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String newCpf){
        this.cpf = newCpf;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public String getNeighborhood(){
       return this.neighborhood;
    }
    
    public void setNeighborhood(String newNeighborhood){
        this.neighborhood = newNeighborhood;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    public void setStreet(String newStreet){
        this.street = newStreet;
    }
    
    public String getNumber_house(){
        return this.number_house;
    }
    
    public void setNumber(String newNumber){
        this.number_house = newNumber;
    }
    
    public List<String> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<String> telephones) {
        this.telephones = telephones;
    }
    
    public void addTelefone(String telephone){
        if(telephone.length() == 11 && telephone != null)
            this.telephones.add(telephone);
    }
    
    public void removeTelefone(String telephone){
        if(this.telephones.contains(telephone))
            this.telephones.remove(telephone);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", cpf=" + cpf + ", email=" + email + ", telephones=" + telephones + ", neighborhood=" + neighborhood + ", street=" + street + ", number_house=" + number_house + '}';
    }
    
    
    
}
