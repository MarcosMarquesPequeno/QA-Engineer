Funcionalidade: Carrinho


Esquema de Cenário: Adicionar produtos no carrinho de compras

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "Quadrinhos"
E seleciono produto
E adiociono a quantidade que vou comprar
Quando clico no botao adicionar
Então mostra meu carrinho com os produtos


Esquema de Cenário: Realizar pagamento

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "Carrinho"
E tenho produtos no meu carrinho
E clico em Fazer pagamento
E me pede inserir dados de cartao
Quando clico em realizar pagamento
Então mostra mensagem de sucesso



Esquema de Cenário: Realizar pagamento com dados falsos

Dado que estou com  aplicativo "Marvelopédia" aberto na tela "Carrinho"
E tenho produtos no meu carrinho
E clico em Fazer pagamento
E me pede inserir dados de cartao
E uso dados falsos
Quando clico em realizar pagamento
Então mostra mensagem de falha