Funcionalidade: Login

Esquema de Cenário: Realizar login com usuario válido

Dado que estou com  aplicativo "Marvelopédia" aberto na tela de login
E preencho todos os campos necessários com dados válidos
Quando clico no botão de login 
Então ele deve ser redirecionado para a página inicial logado


Esquema de Cenário: Realizar login com usuário inexistente

Cenário: Realiza login com usuário inexistente
Dado que estou com aplicativo "Marvelopédia" aberto na tela de login
E preencho os campos com dados de usuário inexistente
Quando clico no botão de login
Então é apresenta mensagem de falha