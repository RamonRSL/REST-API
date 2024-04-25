package com.example.RestAPI.controller;

import com.example.RestAPI.model.UserEntity;
import com.example.RestAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/noticias")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public List<UserEntity> obterNoticia(){ return userService.obterNoticia();}

    @GetMapping("/{id}")
    public UserEntity obterPorId(@PathVariable String id) {
        return userService.obterPorId(id);
    }
    @PostMapping
    public UserEntity inserir(@RequestBody UserEntity user) { return userService.inserir(user); }

    @PutMapping("/{id}")
    public UserEntity atualizar(@PathVariable String id, @RequestBody UserEntity user) {
        return userService.atualizar(id, user);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        userService.excluir(id);
    }
}
