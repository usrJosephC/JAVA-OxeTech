## ☕ Conteúdo:

Este arquivo README contêm as resoluções das questões teóricas dos exercícios do Módulo 2, do curso de Programação em Java.

## 📝 Resolução de questões teóricas:

- 1.1. A estrutura 'if' é utilizada para executar um bloco de código apenas se uma condição específica for verdadeira. Se a condição não for satisfeita, o programa ignora o bloco de código associado ao 'if' e continua sua execução normalmente.
  .Ex.: int nivelDoAluno = 2; // 1 = iniciante, 2 = intermediário, 3 = avançado

  if (nivelDoAluno == 3) {
  System.out.println("Acesso ao conteúdo avançado liberado!");
  }

- 1.2. A estrutura if-else permite que o programa execute um bloco de código quando a condição é verdadeira e outro bloco quando a condição é falsa. Isso fornece uma alternativa clara para lidar com casos em que a condição inicial não é atendida.
  .Ex.: if (nivelDoAluno == 3) {
  System.out.println("Acesso ao conteúdo avançado liberado!");
  } else {
  System.out.println("Continue seus estudos para alcançar o nível avançado!");
  }

- 2. Uma estrutura de repetição é um conceito fundamental em programação que permite executar um bloco de código várias vezes, enquanto uma condição específica for verdadeira.
     .For: O laço 'for' é utilizado quando o número de iterações é conhecido antes da execução do loop. Ele é ideal para percorrer sequências ou arrays, onde a quantidade de elementos é definida.
     .While: O laço while é usado quando não se sabe quantas vezes o loop deve ser executado, mas se tem uma condição que deve ser avaliada antes de cada iteração. O loop continuará enquanto a condição for verdadeira.
     .Do-While: O laço do-while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada após a execução do bloco.

- 3. As palavras-chave break e continue são instruções de controle de fluxo em linguagens de programação, incluindo Java. Elas são utilizadas dentro de laços (loops) para modificar o comportamento padrão da iteração.
     .Break: A instrução break é usada para interromper a execução de um loop imediatamente. Quando o 'break' é encontrado, o controle do programa é transferido para a próxima linha de código após o loop. Isso é útil quando uma condição específica é atendida e você deseja sair do loop antes que ele complete todas as iterações.
     .Continue: A instrução continue faz com que a iteração atual do loop seja interrompida e que o controle retorne ao início do loop para avaliar a condição novamente. Isso significa que o restante do código dentro do loop após o continue não será executado para essa iteração específica.

- 4.1 Uma expressão condicional é uma construção que avalia uma condição e retorna um valor booleano, ou seja, verdadeiro (true) ou falso (false). Em muitas linguagens de programação, incluindo Java, as expressões condicionais são fundamentais para o controle de fluxo, permitindo que o programa tome decisões com base em condições específicas.

- 4.2 As expressões condicionais podem ser combinadas usando operadores lógicos, que permitem criar condições mais complexas. Os principais operadores lógicos são:
    .AND (&&): Verdadeiro se ambas as condições forem verdadeiras.
    .OR (||): Verdadeiro se pelo menos uma das condições for verdadeira.
    .NOT (!): Inverte o valor da condição; verdadeiro se a condição for falsa.
