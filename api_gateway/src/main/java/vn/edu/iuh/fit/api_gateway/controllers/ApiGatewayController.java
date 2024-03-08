package vn.edu.iuh.fit.api_gateway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.api_gateway.services.ApiGatewayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ApiGatewayController {
    @Autowired
    private ApiGatewayService apiGatewayService;

    @GetMapping("/product-list")
    public List<Map<String, Object>> getAllProduct(){
        List<Map<String, Object>> products = apiGatewayService.getAllProducts();
        return products;
    }

    @GetMapping("/user-list")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> users = apiGatewayService.getAllUsers();
        return users;
    }

    @GetMapping("/users-and-products")
    public List<Map<String, Object>> getAllUsersAndProducts(){
        List<Map<String, Object>> users = apiGatewayService.getAllUsers();
        List<Map<String, Object>> products = apiGatewayService.getAllProducts();
        for (Map<String, Object> product: products){
            users.add(product);
        }
        return users;
    }
}
