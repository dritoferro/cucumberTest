#language: pt

  Funcionalidade: Meu primeiro teste com Cucumber

    Esquema do Cenario: Testar o cucumber
      Dado que eu insira meu <cpf>
      E clique no botao enviar
      Entao meu <cpf> sera exibido

Exemplos:
  | cpf           |
  | "12345678910" |
  | "15935741010" |