package com.bemol.marvelopedia.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.bemol.marvelopedia.models.LoginUser;

@Service
public class LoginService {

    /*   simulando percistencia criando uma lista em memória de Registro   */
   List<LoginUser> loginUsers = new ArrayList<>();

   public List<LoginUser> logando(LoginUser loginUser){
  
    if(loginUsers.contains(loginUser)){
       return loginUsers;
    }
    
     throw new RuntimeException();

   }
  }
  

