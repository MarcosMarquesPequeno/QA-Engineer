Funcionalidade: Perfil

Esquema de Cenário: Verificar pedidos

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "Perfil"
E acesso "Pedidos"
Então exibe todos os pedidos


Esquema de Cenário: Mudar senha

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "<nome_tela>"
E acesso "<nome_tela>" apresenta opção mudar senha
E clico em mudar senha
E digito nova senha 
E repito a nova senha
Quando clico em alterar
Então exibe mensagem de sucesso

Exmplos:

  | nome_tela       | nova senha   | 
  | Senha           |  123456      |
  


Esquema de Cenário: Mudar senha para menos de 6 digitos

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "<nome_tela>"
E acesso "<nome_tela>" apresenta opção mudar senha
E clico em mudar senha
E digito nova senha 
E repito a nova senha
Quando clico em alterar
Então exibe mensagem de falha


Exmplos:

  | nome_tela       | Nova Senha   | 
  | Senha           |  12345       |
  

Esquema de Cenário: Mudar Senha apenas para caracter especiais

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "<nome_tela>"
E acesso "<nome_tela>" apresenta opção mudar senha
E clico em mudar senha
E digito nova senha 
E repito a nova senha
Quando clico em alterar
Então mostra mensagem falha

Exmplos:

  | nome_tela       | Nova Senha    | 
  | Senha           |  !@#$!%$      |


