# 📃 Projeto Agenda de Contatos em Java

Este é um projeto simples de uma **Agenda de Contatos** feita em Java. Você pode adicionar, remover e listar contatos. O projeto possui duas versões: uma para **linha de comando (console)** e outra com uma interface gráfica usando **Swing**.

## ⚒️ Funcionalidades

- **Adicionar Contato**: Você pode adicionar um novo contato à agenda.
- **Remover Contato**: Você pode remover um contato já existente.
- **Listar Contatos**: Você pode ver todos os contatos cadastrados.

## ❗Como Usar

### 1. Instalar o Java

Antes de rodar o código, é necessário ter o **Java** instalado no seu computador. Para verificar se você já tem o Java, basta rodar esse comando no terminal:

```bash
java -version
```

Se aparecer algo como "java version 17" ou superior, está tudo certo. Caso contrário, você precisará instalar o [Java JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

### 2. Clonar o Repositório

Para baixar o projeto, você precisa clonar o repositório para o seu computador. Abra o terminal e execute:

```bash
git clone https://github.com/rafaellsilva17/projeto-agenda-de-contatos-java.git
cd projeto-agenda-de-contatos-java
```

### 3. Compilar o Código

No terminal, na pasta onde você clonou o repositório, digite o seguinte comando para compilar os arquivos:

```bash
javac *.java
```

Isso vai gerar os arquivos `.class` necessários para rodar o programa.

### 4. Executar o Programa

Você pode rodar o programa de duas formas: **linha de comando (console)** ou com **interface gráfica (Swing)**.

#### **Console (Linha de Comando)**

1. Para rodar o programa no terminal, digite:

   ```bash
   java AgendaConsole
   ```

2. No terminal, aparecerá um menu com opções para adicionar, remover ou listar contatos.

#### **Interface Gráfica (Swing)**

1. Para rodar o programa com a interface gráfica, digite:

   ```bash
   java AgendaSwing
   ```

2. Uma janela será aberta, onde você pode adicionar, remover e visualizar os contatos de forma mais visual.

### 5. Exemplo de Uso

#### **No Console**:

1. Após rodar o programa, você verá o menu:

   ```
   Menu:
   1. Adicionar Contato
   2. Remover Contato
   3. Listar Contatos
   4. Sair
   Escolha uma opção:
   ```

2. Para adicionar um contato, escolha a opção 1 e digite o nome e o telefone.
3. Para remover um contato, escolha a opção 2 e digite o nome do contato.
4. Para ver a lista de contatos, escolha a opção 3.

#### **Na Interface Gráfica (Swing)**:

1. Abra a janela, insira o nome e o telefone nos campos de texto.
2. Clique nos botões **Adicionar Contato** ou **Remover Contato**.
3. A lista de contatos será exibida na tela.

## Como o Projeto Está Organizado

O projeto tem 4 arquivos principais:

- `Contato.java`: Define a classe `Contato` (nome e telefone).
- `Agenda.java`: Gerencia os contatos (adicionar, remover, listar).
- `AgendaConsole.java`: Interface de linha de comando (terminal).
- `AgendaSwing.java`: Interface gráfica (janela) usando Swing.
