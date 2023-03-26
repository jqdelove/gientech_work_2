package com.ross.service;

import com.ross.entity.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: jinqi
 * @create: 2023-03-26 09:22
 **/
@Service
public class UserService {
    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<User> getUsers() {
        String url = "http://localhost:8080/users";
        ResponseEntity<List<User>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() {});
        return response.getBody();
    }

    public List<User> getUsersAsXml() {
        String url = "http://localhost:8080/users";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<List<User>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<User>>() {});
        return response.getBody();
    }

    public User getUserById(int id) {
        String url = "http://localhost:8080/users/" + id;
        ResponseEntity<User> response = restTemplate.getForEntity(url, User.class);
        return response.getBody();
    }

    public User getUserByIdAsXml(int id) {
        String url = "http://localhost:8080/users/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<User> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                User.class);
        return response.getBody();
    }
}
