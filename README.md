# JogoDaForca

Bem-vindo ao repositório JogoDaForca! Este projeto é um jogo da forca desenvolvido em Java, onde os jogadores tentam adivinhar uma palavra secreta.

---

## Descrição

O JogoDaForca é uma aplicação simples que permite aos usuários jogar o clássico jogo da forca. As principais funcionalidades incluem:

- **Escolha de palavras**: O jogo seleciona uma palavra aleatória para o jogador adivinhar.
- **Tentativas**: O jogador tem um número limitado de tentativas para adivinhar a palavra.
- **Feedback**: O jogo fornece feedback sobre as letras adivinhadas e o progresso do jogador.

---

## Estrutura do Projeto

A estrutura do repositório é a seguinte:

```
/JogoDaForca
│
├── /.idea              # Configurações do IDE
├── /gradle/wrapper     # Wrapper do Gradle
├── /src                # Código fonte da aplicação
│   └── /main/java/hangman/game  # Código Java do jogo
├── .gitignore          # Arquivo para ignorar arquivos no Git
├── build.gradle.kts    # Configurações do Gradle
├── gradlew             # Script para executar o Gradle
├── gradlew.bat        # Script para Windows
└── settings.gradle.kts  # Configurações do projeto
```

---

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Build Tool**: Gradle

---

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/EmyAndrade/JogoDaForca.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd JogoDaForca
   ```

3. Execute o projeto usando o Gradle:
   ```bash
   ./gradlew run
   ```

*Para Windows, use `gradlew.bat run`.*

---

## Contribuições

Emily Andrade.

---

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
