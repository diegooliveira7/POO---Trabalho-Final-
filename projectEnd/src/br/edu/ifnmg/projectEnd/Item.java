/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd;



public class Item {
    private Product product;
    //A minha unidade deve ter uma enumeração
    private int amount;
    private float value;
    
    public Item(){
        this.product = new Product();
        // Inicializar a unidade
        this.amount = 0;
        this.value = 0;
    }
    
    public Product getProduct(){
        return this.product;
    }
    
    public void setProduct(Product newProduct){
        this.product = newProduct;
    }
    
    public int getAmount(){
        return this.amount;
    }
    
    public void setAmount(int newAmount){
        this.amount = newAmount;
    }
    
    public float getValue(){
        return this.value;
    }
    
    public void setValue(float newValue){
        this.value = newValue;
    }
}