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

import com.bemol.marvelopedia.models.LoginUser;
import com.bemol.marvelopedia.service.LoginService;






@ExtendWith(MockitoExtension.class)
public class LoginServiceTest {

  @InjectMocks
  LoginUser loginUser;

  @Mock
  LoginService loginService;

  @BeforeEach
  public void setUp(){
    loginUser = new LoginUser("UserTrail@gmail.com", "123456");
  }

  @Test
  public void LoginComSucesso(){
    when(loginService.logando(loginUser)).thenReturn(Collections.singletonList(loginUser));
    List<LoginUser> loginUsers =  loginService.logando(loginUser);

    //comparar dado esperado com dados  ja cadastrados
    assertEquals(Collections.singletonList(loginUser), loginUsers);
    
    //verifica se e chamado apenas uma vez
    verify(loginService).logando(loginUser);
    //verfica  se e chamado mais de uma vez
    verifyNoMoreInteractions(loginService);
   
  }

  @Test
  public void loginNaoCadastrado(){
     when(loginService.logando(loginUser));

    //verifica e aplica execeção
    assertThrows(RuntimeException.class, () -> loginService.logando(loginUser));

    //verifica se e chamado apenas uma vez
    verify(loginService).logando(loginUser);
    //verfica  se e chamado mais de uma vez
    verifyNoMoreInteractions(loginService);

  }
  
}
