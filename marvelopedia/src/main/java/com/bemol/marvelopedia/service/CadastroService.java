package com.bemol.marvelopedia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bemol.marvelopedia.models.Cadastro;


@Service
public class CadastroService{

  /*   simulando percistencia criando uma lista em memória de Registro   */
  List<Cadastro> cadastros = new ArrayList<>();

  public List<Cadastro> create(Cadastro cadastro){

    if(cadastros.contains(cadastro)){
      throw new RuntimeException();
    }

    cadastros.add(cadastro);
    return cadastros;
  
  }
}
