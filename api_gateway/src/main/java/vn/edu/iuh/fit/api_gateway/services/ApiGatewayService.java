package vn.edu.iuh.fit.api_gateway.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

@Service
public class ApiGatewayService {
    private final String apiGetAllProduct = "http://localhost:8081/products";
    private final String apiGetAllUser = "http://localhost:8082/users";

    RestTemplate restTemplate = new RestTemplate();

    public List<Map<String, Object>> getAllProducts(){
        ResponseEntity<List<Map<String, Object>>> responseEntity = restTemplate.exchange(
                apiGetAllProduct,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Map<String,Object>>>() {}
        );
        return responseEntity.getBody();
    }
    public List<Map<String, Object>> getAllUsers(){
        ResponseEntity<List<Map<String, Object>>> responseEntity = restTemplate.exchange(
                apiGetAllUser,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Map<String,Object>>>() {}
        );
        return responseEntity.getBody();
    }
}
