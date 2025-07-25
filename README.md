# Livraria
Projeto individual, desenvolvido no curso de Java Foundations  
Este projeto é um sistema simples de biblioteca Livraria desenvolvido em Java. Ele exibe um catálogo de livros, permite que o usuário adicione livros a um "carrinho" e, ao final, calcula o valor total da compra.

# Funcionalidades
Exibição de um catálogo com 20 livros pré-cadastrados, contendo:

Gênero

Nome do livro

ID do livro

Preço

Disponibilidade

Busca por ID: O usuário seleciona livros pelo número identificador.

Carrinho de compras: Permite adicionar múltiplos livros.

Checkout: Exibe todos os livros adicionados ao carrinho e o preço total.

# Estrutura do Projeto
Aula07Senac.java

Classe principal.

Exibe os livros cadastrados.

Interage com o usuário para adicionar livros ao carrinho.

Chama o método checkout() para finalizar a compra.

## Livro.java 

Classe que representa um livro com atributos:

Gênero

Nome

ID

Preço

Disponibilidade

Quantidade disponível

Métodos para getters e setters.

Método toString() para exibição formatada dos livros.

Método estático checkout() para exibir os livros comprados e calcular o total.

## Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/seu-repositorio.git
Compile os arquivos Java:

bash
Copiar
Editar
javac aula07senac/*.java
Execute o programa:

bash
Copiar
Editar
java aula07senac.Aula07Senac

## Exemplo de Uso
rust
Copiar
Editar
---------------------------------Bem vindo a biblioteca!------------------------------------------
Número:1 ----> Gênero:Romance ---->  Livro:Uma curva na estrada ----> Preço: R$20 ---->  Disponibilidade:Sim
Número:2 ----> Gênero:Romance ---->  Livro:Como eu era antes de você ----> Preço: R$30 ---->  Disponibilidade:Não
...
Adicione o número do livro ao carrinho:
1
Quer adicionar outro livro? (Sim/Não)
Sim
Adicione o número do livro ao carrinho:
12
Quer adicionar outro livro? (Sim/Não)
Não
"----------------- Livros Adicionados----------------- "
Uma curva na estrada
Animal farm
"-----------------Obrigado pela visita!----------------- " 
O seu total é: R$120

## Tecnologias Utilizadas
Java 8+

Scanner para entrada de dados do usuário.

ArrayList para manipulação dinâmica dos livros adicionados.
