# 🧶 Projeto Artesanando - Sistema de Gerenciamento de Artesanatos 🪡

O projeto **Artesanando** é uma aplicação de gerenciamento de artesanatos, com funcionalidades para adicionar, excluir e atualizar artesanados, dentre outras. Com isso, o objetivo principal do desenvolvimento deste sistema foi aplicar conceitos de POO e boas práticas em Java, utilizando classes, métodos, e manipulação de dados.
******

<div align='center'/>

  ![Java](https://a11ybadges.com/badge?logo=java)
  ![Spring](https://a11ybadges.com/badge?logo=spring)
</div>


******
### Tabela de Conteúdo 
 1. [Conhecimentos Mobilizados](#conhecimentosMobilizados)
 2. [Estrutura do Projeto](#estruturaDoProjeto)
 3. [Código Desenvolvido](#codigoDesenvolvido)
 4. [Tecnologias Utilizadas](#tecnologiasUtilizadas)
******

<div id='conhecimentosMobilizados'/> 
  
## 💡 Conhecimentos Mobilizados
- **Programação Orientada a Objetos (POO):** Utilização de conceitos como classes, objetos, herança, polimorfismo e encapsulamento.
- **Manipulação de dados:** Métodos para depósitos, saques e transferências entre contas.
- **Tratamento de exceções:** Implementação de validações para garantir a segurança nas transações.
- **Entrada e saída de dados:** Interação com o usuário via console.
- **Collections Framework:** Uso de ArrayList para gerenciar múltiplas contas.

<div id='estruturaDoProjeto'/> 
  
## 🏗️ Estrutura do Projeto
```
artesanato/
├── controller/
│   └── ArtesanatoController.java
├── model/
│   ├── ArtesanatoDecorativo.java
│   └── ArtesanatoFuncional.java
├── util/
│   └── Cores.java
└── Menu.java
```
<div id='codigoDesenvolvido'/> 
  
## 📂 Código Desenvolvido

Para melhor visualização, aqui estão os links para os códigos principais:  

- **[Menu](src/artesanato/Menu.java)**: Arquivo principal que executa o menu de navegação.
- **[ArtesanatoController](src/artesanato/controller/ArtesanatoController.java)**: Controlador que gerencia as operações de adicionar, listar, buscar, atualizar, excluir e visualizar novidades.
- **[ArtesanatoDecorativo.java](src/artesanato/model/ArtesanatoDecorativo.java)** e **[ArtesanatoFuncional.java](src/artesanato/model/ArtesanatoFuncional.java)**: Modelos que representam os tipos de artesanatos.
- **[ArtesanatoRepository](src/artesanato/repository/ArtesanatoRepository.java)**: Classe responsável por gerenciar a persistência de dados dos artesanatos, garantindo a integridade e o armazenamento adequado das informações no sistema.
- **[Cores.java](src/artesanato/util/Cores.java)**: Classe utilitária para controle de cores no terminal.

<div id='tecnologiasUtilizadas'/> 

## 🛠️ Tecnologias Utilizadas  

- **Linguagem:** Java
- **Framework:** Collections Framework  
- **Paradigma:** Programação Orientada a Objetos (POO)  
- **IDE utilizada:** Spring Tools Suite 4  
