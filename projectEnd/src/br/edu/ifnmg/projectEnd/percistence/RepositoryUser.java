/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.projectEnd.percistence;

import br.edu.ifnmg.projectEnd.Sex;
import br.edu.ifnmg.projectEnd.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class RepositoryUser {
    private Database db;
    
    public RepositoryUser(){
        db = new Database();
    }
    
    public boolean Save(User objeto){
        try{
            if(objeto.getId() == 0){
                PreparedStatement sql = db.getConnection().prepareStatement("insert into user(name,cpf,password,sex,user,status) value(?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
                sql.setString(1, objeto.getName());
                sql.setString(2, objeto.getCpf().replace("-","").replace(".",""));
                sql.setString(3, objeto.getPassword());
                sql.setString(4, objeto.getSex().name());
                sql.setString(5, objeto.getUser());
                sql.setInt(6, objeto.getStatus());

                if (sql.executeUpdate() > 0){
                    ResultSet id = sql.getGeneratedKeys();
                    id.next();
                    objeto.setId(id.getInt(1));
                    return true;
                }else{
                    return false;
                }
                
            }else{
                PreparedStatement sql = db.getConnection().prepareStatement("update user set name = ?, cpf = ?, password = ?, sex = ?, user = ? where id = ?");
                sql.setString(1, objeto.getName());
                sql.setString(2, objeto.getCpf().replace("-","").replace(".",""));
                sql.setString(3, objeto.getPassword());
                sql.setString(4, objeto.getSex().name());
                sql.setString(5, objeto.getUser());
                sql.setInt(6, objeto.getId());
                
                if(sql.executeUpdate() > 0)
                    return true;
                
            }                                                               

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public User Open(int id){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("select * from user where id = ?");
            sql.setInt(1, id);
            ResultSet result = sql.executeQuery();
            result.next();
            
            User user = new User();
            
            try{
                user.setCpf(result.getString("cpf"));
                user.setName(result.getString("name"));
                user.setId(result.getInt("id"));
                user.setPassword(result.getString("password"));
                user.setSex(Sex.valueOf(result.getString("sex")));
                user.setUser(result.getString("user"));
                user.setStatus(result.getInt("status"));
            }catch(Exception ex){
                user = null;
                System.out.println("Deu problema nas especifiações do banco: " + ex.getMessage());
            }
            
            return user;
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public List<User> OpenList(String consult){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement(consult);
            ResultSet result = sql.executeQuery();
            
            List<User> users = new ArrayList();
            
            while(result.next()){
                User user = new User();
                
                try{
                    user.setCpf(result.getString("cpf"));
                    user.setId((result.getInt("id")));
                    user.setName(result.getString("name"));
                    user.setSex(Sex.valueOf(result.getString("sex")));
                    user.setUser(result.getString("user"));
                }catch(SQLException ex){
                    user = null;
                }
                users.add(user);
                
            }
            return users;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public boolean Delete(int id){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("delete from user where id = ?");
            sql.setInt(1,id);
            
            if(sql.executeUpdate() > 0){
                return true;
            }else return false;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean SaveTelephoneUni(int id, String telephone){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("insert into user_telephone(user_fk,telephone) value(?,?)");
            sql.setInt(1, id);
            sql.setString(2, telephone);
            
            if(sql.executeUpdate() > 0){
                return true;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public void OpenTelephone(User user){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("select telephone from user_telephone where id = ?");
            sql.setInt(1, user.getId());
            
            ResultSet result = sql.executeQuery();
            
            while(result.next()){
                user.addTelephone(result.getString("telephone"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public User CheckUser(User filter){
        User  user = new User();
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("select * from user where user = ? and password = ?");
            sql.setString(1, filter.getUser());
            sql.setString(2, filter.getPassword());
            ResultSet resul = sql.executeQuery();
            if(resul.next() == false){
                user = null;
                return user;
            }else{
                user.setId(resul.getInt("id"));
                user.setCpf(resul.getString("cpf"));
                user.setName(resul.getString("name"));
                user.setPassword(resul.getString("password"));
                user.setSex(Sex.valueOf(resul.getString("sex")));
                user.setUser(resul.getString("user"));
                user.setStatus(resul.getInt("status"));
                return user;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return user;
    }
    
    public boolean CheckUserId(int id){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("select * from user where id = ?");
            sql.setInt(1, id);
            ResultSet result = sql.executeQuery();
            if(result.next() == false){
                return false;
            }else{
                return true;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean CheckStatus(int id){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement("select * from user where id = ?");
            sql.setInt(1, id);
            ResultSet result = sql.executeQuery();
            result.next();
            if(result.getInt("status") == 1){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean Status(int id, String consult){
        try{
            PreparedStatement sql = db.getConnection().prepareStatement(consult + " ? ");
            sql.setInt(1, id);
            if(sql.executeUpdate() > 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
}
