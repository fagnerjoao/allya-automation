# language: pt
@cadastrar
Funcionalidade: Cadastrar Usuário
   

  @cadastrarUsuario
  Cenário: Cadastro Básico
   Dado que eu esteja na página inicial
   Quando veirifico as abas  Colaborador, Empresas e Parceiro
   E faço o cdastro inicial
   Então valido a tela CPF e CNPJ
   