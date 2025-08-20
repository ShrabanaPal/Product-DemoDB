//package com.dona.Product_DemoDB.DBConnection;
//
//import com.dona.Product_DemoDB.model.Product;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductDB {
//    Connection con = null;
//
//    //in service class we will add as
//    //Product p = new Product;
//    //db.save(p); //to save all product into datbase
//    //to get all the product
//    //return db.getAll();
//    public  ProductDB(){
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product" , "mysql" , "Dona@1234#");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void save(Product p){
//            String  query = "insert into product (name , type , place , warrenty) values (?,?,?,?)";
//        try {
//            PreparedStatement pt = con.prepareStatement(query);
//            pt.setString(1, p.getName());
//            pt.setString(2, p.getType());
//            pt.setString(3, p.getPlace());
//            pt.setString(4, p.getWarrenty());
//            pt.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public List<Product> getAll(){
//        List<Product> products = new ArrayList<>();
//        String query = "Select name , type , place , warrenty from product";
//        try {
//            PreparedStatement pt = con.prepareStatement(query);
//            ResultSet rs = pt.executeQuery();
//            while(rs.next()){
//                Product p= new Product();
//                p.setName(rs.getString(1));
//                p.setType(rs.getString(2));
//                p.setPlace(rs.getString(3));
//                p.setWarrenty(rs.getString(4));
//                products.add(p);
//            }
//        }catch(SQLException e){
//            throw new RuntimeException(e);
//        }
//        return products;
//    }
//}
