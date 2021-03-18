#Exercício de automação de teste

O que você deve fazer
Você deve criar um projeto baseado em Maven na sua IDE desenvolvimento favorita utilizando a linguagem de
programação Java.
Tempo para entregar o desafio
Você tem até 5 dias corridos para entregar a solução.
Forma de entrega
• Crie um repositório no GitHub com o nome prova_sicredi
• Efetue o commit de seu projeto neste repositório
• Não adicione ao repositório a pasta de projeto que sua IDE de desenvolvimento gera de forma automatica
• Informe o nome do repositório na resposta do e-mail
• Adicione qualquer outra informação que você julge relevante no e-mail
O que será avaliado
Vai depender muito do seu perfil e conhecimento prévio sobre automação como, por exemplo, se você já usa o
Selenium WebDriver há algum tempo, entre outros aspectos.
Mas temos análises comuns, que são:
• O script deve executar com sucesso seguindo os passos descritos para o teste
• Uso dos locators
• Boas práticas de desenvolvimento aplicado ao script de teste
Desafio 1
Observação
O script deve executar no browser Google Chrome
Passos
1. Acesse a página https://www.grocerycrud.com/demo/bootstrap_theme
2. Mude o valor da combo Select version para "Bootstrap V4 Theme"
3. Clique no botão Add Customer
4. Preencha os campos do formulário com as seguintes informações:
▪ Name: Teste Sicredi
▪ Last name: Teste
▪ ContactFirstName: seu nome
▪ Phone: 51 9999-9999
▪ AddressLine1: Av Assis Brasil, 3970
▪ AddressLine2: Torre D
▪ City: Porto Alegre
▪ State: RS
▪ PostalCode: 91000-000
▪ Country: Brasil

Classificação da informação: Uso Interno

▪ from Employeer: Fixter
▪ CreditLimit: 200
5. Clique no botão Save
6. Validar a mensagem "Your data has been successfully stored into the database. Edit Customer or Go back to
list" através de uma asserção
7. Feche o browser web

Desafio 2
Observação
O script deve executar no browser Google Chrome
Pré-condição
Execute todos os passos do Desafio 1
Passos
1. Clique no link Go back to list
2. Clique no icone da lupa (pesquisa) e digite o conteúdo do Name (Teste Sicredi)
3. Clicar no checkbox abaixo da palavra Actions
4. Clicar no botão Delete
5. Validar o texto "Are you sure that you want to delete this 1 item?" através de uma asserção para a popup
que será apresentada
6. Clicar no botão Delete da popup
7. Aparecerá uma mensagem dentro de um box verde na parte superior direito da tela. Adicione uma asserção
na mensagem "Your data has been successfully deleted from the database."
8. Feche o driver web
