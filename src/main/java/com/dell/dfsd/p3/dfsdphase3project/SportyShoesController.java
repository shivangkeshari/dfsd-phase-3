package com.dell.dfsd.p3.dfsdphase3project;

import com.dell.dfsd.p3.dfsdphase3project.models.Order;
import com.dell.dfsd.p3.dfsdphase3project.models.Product;
import com.dell.dfsd.p3.dfsdphase3project.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/sportyShoes")
public class SportyShoesController {

    String adminUserName = new String("admin");
    String adminPassword = new String("admin");
    boolean isAdmin=false;
    List<Users> usersList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Order> orderList = new ArrayList<>();

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String loginAdmin(@RequestBody Users users){
        if(users.getUserName().equals(adminUserName) && users.getPassword().equals(adminPassword)){
            isAdmin=true;
            return "Login SuccessFull !!";
        }
        else{
            return "Login Failed !!";
        }
    }

    @RequestMapping(value = "/admin/passChg", method = RequestMethod.POST)
    public String chgPassAdmin(@RequestBody Users users){
        if(isAdmin){
            adminUserName=users.getUserName();
            adminPassword=users.getPassword();
            isAdmin=false;
            return "Password Updated, Please Login Again as Admin !!";
        }
        else{
            return "Unauthorized Operation !!";
        }
    }

    @RequestMapping(value = "/admin/getAllUsers", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        if(isAdmin){
            return usersList;
        }
        else{
            return null;
        }
    }

    @RequestMapping(value = "/admin/addUser", method = RequestMethod.POST)
    public Users addUser(@RequestBody Users users){
        if(isAdmin){
            usersList.add(users);

            return users;
        }
        else{
            return null;
        }
    }

    @RequestMapping(value = "/admin/updateUser/{userId}", method = RequestMethod.PUT)
    public String modifyUsersById(@PathVariable("userId") long id, @RequestBody Users users) {

        if(isAdmin){
            usersList.removeIf(u -> u.getUserId() == id);
            usersList.add(users);
            return "User Data Updated !!";
        }
        else{
            return "Unauthorized Operation !!";
        }
    }

    @RequestMapping(value = "/admin/deleteUser/{userId}", method = RequestMethod.DELETE)
    public String deleteUsersById(@PathVariable("userId") long id) {
        if(isAdmin){
            usersList.removeIf(u -> u.getUserId() == id);
            return "User Data Deleted !!";
        }
        else{
            return "Unauthorized Operation !!";
        }
    }

    @RequestMapping(value = "/admin/getAllProducts", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        if(isAdmin){
            return productList;
        }
        else{
            return null;
        }

    }

    @RequestMapping(value = "/admin/addProduct", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product products){
        if(isAdmin){
            productList.add(products);

            return products;
        }
        else{
            return null;
        }
    }

    @RequestMapping(value = "/admin/updateProduct/{productId}", method = RequestMethod.PUT)
    public String modifyProductsById(@PathVariable("productId") long id, @RequestBody Product products) {
        if(isAdmin){
            productList.removeIf(p -> p.getProductId() == id);
            productList.add(products);
            return "Product Data Updated !!";
        }
        else{
            return "Unauthorized Operation !!";
        }

    }

    @RequestMapping(value = "/admin/deleteProduct/{productId}", method = RequestMethod.DELETE)
    public String deleteProductById(@PathVariable("productId") long id) {
        if(isAdmin){
            productList.removeIf(p -> p.getProductId() == id);
            return "Product Data Deleted !!";
        }
        else{
            return "Unauthorized Operation !!";
        }

    }

    @RequestMapping(value = "/customer/findProducts/productId/{productId}/productName/{productName}", method = RequestMethod.GET)
    public List<Product> findProducts(@PathVariable("productId") long id, @PathVariable("productName") String name) {

        List<Product> filteredProductList = new ArrayList<>();

        for(Product p:productList){
            if(p.getProductId()==id || p.getName().matches(name)){
                filteredProductList.add(p);
            }
        }

        return filteredProductList;
    }

    @RequestMapping(value = "/customer/createOrder", method = RequestMethod.POST)
    public Order createOrder(@RequestBody Order order){

        orderList.add(order);

        return order;
    }



}
