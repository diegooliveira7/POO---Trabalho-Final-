/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd;

import java.util.ArrayList;
import java.util.List;


public class Provider {

    private String Cnpj;
    private String name;
    private String reason_social;
    private List<String> telephones;
    private String neighborhood;
    private String street;
    private String number_provider;
    private String email;
    
    public Provider(){
        this.Cnpj = "";
        this.email = "";
        this.name = "";
        this.telephones = new ArrayList<String>();
        this.reason_social = "";
        this.neighborhood = "";
        this.number_provider = "";
        this.street = "";
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getCnpj(){
        return this.Cnpj;
    }
    
    public void setCpf(String newCnpj){
        this.Cnpj = newCnpj;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    public String getNeighborhood(){
       return this.neighborhood;
    }
    
    public void setNeighborhood(String newNeighborhood){
        this.neighborhood = newNeighborhood;
    }
    
    public String getReason_social(){
        return this.reason_social;
    }
    
    public void setReason_social(String newReason_social){
        this.reason_social = newReason_social;
    }
     
    public String getStreet(){
        return this.street;
    }
    
    public void setStreet(String newStreet){
        this.street = newStreet;
    }
    
    public String getNumber_providor(){
        return this.number_provider;
    }
    
    public void setNumber_provider(String newNumber){
        this.number_provider = newNumber;
    }
    
    public void addTelephone(String telephone){
        if(telephone.length() == 11 && telephone != null)
            this.telephones.add(telephone);
    }
    
    public void removeTelefone(String telefone){
        if(this.telephones.contains(telefone))
            this.telephones.remove(telefone);
    }

    @Override
    public String toString() {
        return "Provider{" + "Cnpj=" + Cnpj + ", name=" + name + ", reason_social=" + reason_social + ", telephones=" + telephones + ", neighborhood=" + neighborhood + ", street=" + street + ", number_provider=" + number_provider + ", email=" + email + '}';
    }
    
    
}
