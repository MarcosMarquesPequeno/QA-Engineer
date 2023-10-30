package com.bemol.marvelopedia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bemol.marvelopedia.models.Cadastro;
import com.bemol.marvelopedia.service.CadastroService;

@ExtendWith(MockitoExtension.class)
public class CadastroServiceTest {

 
  @InjectMocks
  Cadastro cadastro;

  @Mock
   CadastroService cadastroService;

  @BeforeEach
  public void setUp(){
    cadastro = new Cadastro("paaao@gmail.com","123456");
  }

  @Test
  public void criandoCadastroComSucesso(){
    when(cadastroService.create(cadastro)).thenReturn(Collections.singletonList(cadastro));
    List<Cadastro> cadastros =  cadastroService.create(cadastro);

    // comparar dado esperado Collections com cadastros para ver se os dados sao iguais
    assertEquals(Collections.singletonList(cadastro), cadastros);
    //verifica se e chamado apenas uma vez
    verify(cadastroService).create(cadastro);
    //verfica  se e chamado mais de uma vez
    verifyNoMoreInteractions(cadastroService);

  }

  @Test
  public void naoCadastrarDadosJaCadastrados(){ 
     when(cadastroService.create(cadastro));

     //verificar aplica a exececao de dados ja cadastrados
     assertThrows(RuntimeException.class,() -> cadastroService.create(cadastro)); 
     //verifica se e chamado apenas uma vez
    verify(cadastroService).create(cadastro);
    //verfica  se e chamado mais de uma vez
    verifyNoMoreInteractions(cadastroService);
   
  }

    

}
