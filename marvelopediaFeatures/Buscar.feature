Funcionalidade: Busca

Esquema de Cénario: Validar busca por um produto 

Dado que estou no aplicativo "Marvelopédia" na tela "<nome_tela>"
E eu faço uma busca pelo produto "<termo_busca>"
Então apresenta a mensagem de sucesso

Exmplos:

  | nome_tela     |  termo_busca |
  | Quadrinhos    |  1872        |
  | Quadrinhos    |  Hulk        |



Esquema de Cénario: Validar busca por um produto inválido

Dado que estou no aplicativo "Marvelopédia" na tela "<nome_tela>"
E eu faço uma busca pelo produto "<termo_busca>"
Então apresenta mensagem de produto não encontrado

Exmplos:

  | nome_tela     |  termo_busca |
  | Quadrinhos    |  #$#$%#$     |
  | Quadrinhos    |  Pão F34!    |



Esquema de Cénario: Validar busca por herói

Dado que estou no aplicativo "Marvelopédia" na tela "<nome_tela>"
E eu faço uma busca pelo produto "<termo_busca>"
Então apresenta a mensagem de sucesso

Exmplos:

  | nome_tela     |  termo_busca |
  | Heróis        |  Abyss       |
  | Heróis        |  Hulk        |


Esquema de Cénario: Validar busca por um herói inválido

Dado que estou no aplicativo "Marvelopédia" na tela "<nome_tela>"
E eu faço uma busca pelo produto "<termo_busca>"
Então apresenta mensagem de herói não encontrado

Exmplos:

  | nome_tela     |  termo_busca |
  | Heróis        |  #$#$%#$     |
  | Heróis        |  Pão F34!    |


