#language: pt
#Author: giovanna@serverest.com
@ServeRestAPI
Funcionalidade: ServeRestAPI
  Minha feature para os testes da serverestAPI

  @CT001 @POST
  Cenario: Validar cadastro de carrinho na rota /carrinhos
    Dado que eu faca uma requisicao POST na rota /carrinhos com requestBody valido
    Entao valido status code 201
    E mensagem "Cadastro realizado com sucesso"

  @CT002 @POST
  Cenario: Validar cadastro de carrinho na rota /carrinhos sem o requestBody
    Dado que eu faca uma requisicao POST na rota /carrinhos SEM o requestBody
    Entao valido status code 400
    E mensagem "Não é permitido possuir produto duplicado | Não é permitido ter mais de 1 carrinho | Produto não encontrado | Produto não possui quantidade suficiente"

  @CT003 @POST
  Cenario: Validar cadastro de carrinho na rota /carrinhos sem o campo idProduto
    Dado que eu faca uma requisicao POST na rota /carrinhos SEM o campo idProduto
    Entao valido status code 400
    E mensagem "Não é permitido possuir produto duplicado | Não é permitido ter mais de 1 carrinho | Produto não encontrado | Produto não possui quantidade suficiente"

  @CT004 @POST
  Cenario: Validar cadastro de carrinho na rota /carrinhos com idProduto com valor int
    Dado que eu faça uma requisição POST na rota /carrinhos com o campo idProduto com valor int
    Entao valido status code 400
    E mensagem "Não é permitido possuir produto duplicado | Não é permitido ter mais de 1 carrinho | Produto não encontrado | Produto não possui quantidade suficiente"

  @CT005 @POST
  Cenario: Validar cadastro de carrinho na rota /carrinhos sem o campo quantidade
    Dado que eu faca uma requisicao POST na rota /carrinhos sem o campo quantidade
    Entao valido status code 400
    E mensagem "Não é permitido possuir produto duplicado | Não é permitido ter mais de 1 carrinho | Produto não encontrado | Produto não possui quantidade suficiente"

  @CT006 @POST
  Cenario: Validar cadastro de carrinho na rota /carrinhos com quantidade com valor string
    Dado que eu faca uma requisicao POST na rota /carrinhos com o campo quantidade com valor string
    Entao valido status code 400
    E mensagem "Não é permitido possuir produto duplicado | Não é permitido ter mais de 1 carrinho | Produto não encontrado | Produto não possui quantidade suficiente"
