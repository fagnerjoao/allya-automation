# language: pt
@cadastrar
Funcionalidade: Cadastrar Usuário


  @cadastrarUsuario
  Cenário: Cadastro Básico
    Dado que eu esteja na paginal inicial
    Quando veirifico as abas  Colaborador, Empresas e Parceiro
    Quando faço o cdastro
    Então valido a mensagem se sucesso a "Você finalizou o cadastro básico."
