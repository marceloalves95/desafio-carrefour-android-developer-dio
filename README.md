# Desafio Carrefour Android Developer

> Projeto baseado nos desafios propostos pelo Bootcamping Carrefour Android Developer
> <a name="ancora"></a>

| Desafio               | Tema do Desafio                     | Nível do Desafio | Respostas                             |
| --------------------- | ----------------------------------- | ---------------- | ------------------------------------- |
| [Desafio 1](#ancora1) | Primeiros passos em Kotlin          | Básico           | [Resolução](src/desafios/Desafio1.kt) |
| [Desafio 2](#ancora2) | Primeiros passos em Kotlin          | Básico           | [Resolução](src/desafios/Desafio2.kt) |
| [Desafio 3](#ancora3) | Primeiros passos em Kotlin          | Básico           | [Resolução](src/desafios/Desafio3.kt) |
| [Desafio 4](#ancora4) | Introdução a Programação com Kotlin | Intermediário    | [Resolução](src/desafios/Desafio4.kt) |
| [Desafio 5](#ancora5) | Introdução a Programação com Kotlin | Intermediário    | [Resolução](src/desafios/Desafio5.kt) |
| [Desafio 6](#ancora6) | Introdução a Programação com Kotlin | Intermediário    | [Resolução](src/desafios/Desafio6.kt) |
| [Desafio 7](#ancora7) | Desafios numéricos em Kotlin        | Avançado         | [Resolução](src/desafios/Desafio7.kt) |
| [Desafio 8](#ancora8) | Desafios numéricos em Kotlin        | Avançado         | [Resolução](src/desafios/Desafio8.kt) |
| [Desafio 9](#ancora9) | Desafios numéricos em Kotlin        | Avançado         | [Resolução](src/desafios/Desafio9.kt) |


# <a id="ancora1"></a>[Desafio 1](#ancora)
> Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

## Entrada

O arquivo de entrada contém um número inteiro positivo **N** (1 < **N** < 1000).


## Saída

Imprima a saída conforme o exemplo fornecido.

| Exemplos de Entrada | Exemplos de Saída                                            |
| ------------------- | ------------------------------------------------------------ |
| 5                   | 1 1 1<br/>1 2 2<br/>2 4 8<br/>2 5 9<br/>3 9 27<br/>3 10 28<br/>4 16 64<br/>4 17 65<br/>5 25 125<br/>5 26 126 |

# <a id="ancora2"></a>[Desafio 2](#ancora)

>  Ricardo e Vicente são aficionados por figurinhas. Nas horas vagas, eles arrumam um jeito de jogar um “bafo” ou algum outro jogo que envolva tais figurinhas. Ambos também têm o hábito de trocarem as figuras repetidas com seus amigos e certo dia pensaram em uma brincadeira diferente. Chamaram todos os amigos e propuseram o seguinte: com as figurinhas em mãos, cada um tentava fazer uma troca com o amigo que estava mais perto seguindo a seguinte regra: cada um contava quantas figurinhas tinha. Em seguida, eles tinham que dividir as figurinhas de cada um em pilhas do mesmo tamanho, no maior tamanho que fosse possível para ambos. Então, cada um escolhia uma das pilhas de figurinhas do amigo para receber. Por exemplo, se Ricardo e Vicente fossem trocar as figurinhas e tivessem respectivamente 8 e 12 figuras, ambos dividiam todas as suas figuras em pilhas de 4 figuras (Ricardo teria 2 pilhas e Vicente teria 3 pilhas) e ambos escolhiam uma pilha do amigo para receber.
>
>  ![](src/imagens/figurinha.jpg)

## Entrada

A primeira linha da entrada contém um único inteiro **N** (1 ≤ **N** ≤ 3000), indicando o número de casos de teste. Cada caso de teste contém 2 inteiros **F1** (1 ≤ **F1** ≤ 1000) e **F2** (1 ≤ **F2** ≤ 1000) indicando, respectivamente, a quantidade de figurinhas que Ricardo e Vicente têm para trocar.

## Saída

Para cada caso de teste de entrada haverá um valor na saída, representando o tamanho máximo da pilha de figurinhas que poderia ser trocada entre dois jogadores.


| Exemplo de Entrada              | Exemplo de Saída |
| ------------------------------- | ---------------- |
| 3<br/>8 12<br/>9 27<br/>259 111 | 4<br/>9<br/>37   |

# <a id="ancora3"></a>[Desafio 3](#ancora3)
> Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
>
> Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
>
> ![](src/imagens/renda.png)
>
> Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

## Entrada

A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

## Saída

Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".


| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 3002.00             | R$ 80.36          |
| 1701.12             | Isento            |
| 4520.00             | R$ 355.60         |

# <a id="ancora4"></a>[Desafio 4](#ancora)
> Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
>
> Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 

## Entrada

O arquivo de entrada contém um valor inteiro.

## Saída

Imprima a saída conforme exemplo fornecido.


| Exemplo de Entrada | Exemplo de Saída                     |
| ------------------ | ------------------------------------ |
| 400                | 1 ano(s)<br/>1 mes(es)<br/>5 dia(s)  |
| 800                | 2 ano(s)<br/>2 mes(es)<br/>10 dia(s) |
| 30                 | 0 ano(s)<br/>1 mes(es)<br/>0 dia(s)  |

# <a id="ancora5"></a>[Desafio 5](#ancora)
> Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem *"Media: "*. Se esta média for maior ou igual a 7.0, imprima a mensagem *"Aluno aprovado."*. Se a média calculada for inferior a 5.0, imprima a mensagem *"Aluno reprovado."*. Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem *"Aluno em exame."*.
>
> No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem *"Nota do exame: "* acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem *"Aluno aprovado."* (caso a média final seja 5.0 ou mais ) ou *"Aluno reprovado."*, (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem *"Media final: "* seguido da média final para esse aluno.

## Entrada

A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

## Saída

Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o *enter* após o final de cada linha, caso contrário obterá "Presentation Error".


| Exemplo de Entrada      | Exemplo de Saída                                             |
| ----------------------- | ------------------------------------------------------------ |
| 2.0 4.0 7.5 8.0<br/>6.4 | Media: 5.4<br/>Aluno em exame.<br/>Nota do exame: 6.4<br/>Aluno aprovado.<br/>Media final: 5.9 |
| 2.0 6.5 4.0 9.0         | Media: 4.8<br/>Aluno reprovado.                              |
| 9.0 4.0 8.5 9.0         | Media: 7.3<br/>Aluno aprovado.                               |

# <a id="ancora6"></a>[Desafio 6](#ancora)
> Daniela é enfermeira em um grande hospital, e tem os horários de trabalho muito variáveis. Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com relógios despertadores.
>
> Recentemente ela ganhou de presente um relógio digital, com alarme com vários tons, e tem esperança que isso resolva o seu problema. No entanto, ela anda muito cansada e quer aproveitar cada momento de descanso. Por isso, carrega seu relógio digital despertador para todos os lugares, e sempre que tem um tempo de descanso procura dormir, programando o alarme despertador para a hora em que tem que acordar. No entanto, com tanta ansiedade para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.
>
> Um problema que a tem atormentado na hora de dormir é saber quantos minutos ela teria de sono se adormecesse imediatamente e acordasse somente quando o despertador tocasse. Mas ela realmente não é muito boa com números, e pediu sua ajuda para escrever um programa que, dada a hora corrente e a hora do alarme, determine o número de minutos que ela poderia dormir.

## Entrada

A entrada contém vários casos de teste. Cada caso de teste é descrito em uma linha, contendo quatro números inteiros H  1 , M 1 , H2 e M 2, com H1:M1 representando a hora e minuto atuais, e H2:M2 representando a hora e minuto para os quais o alarme despertador foi programado (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).

O final da entrada é indicado por uma linha que contém apenas quatro zeros, separados por espaços em branco.

## Saída

Para cada caso de teste da entrada seu programa deve imprimir uma linha, cada uma contendo um número inteiro, indicando o número de minutos que Daniela tem para dormir.


| Exemplo de Entrada                                 | Exemplo de Saída    |
| -------------------------------------------------- | ------------------- |
| 1 5 3 5<br/>23 59 0 34<br/>21 33 21 10<br/>0 0 0 0 | 120<br/>35<br/>1417 |

# <a id="ancora7"></a>[Desafio 7](#ancora)
> Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.
>
> Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para cada uma das sequências que Paula lhe apresentar.

## Entrada

A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência de três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira posição outro caractere de '0' a '9'.

## Saída

Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução da sequência proposta por Paula.


| Exemplos de Entrada                       | Exemplos de Saída          |
| ----------------------------------------- | -------------------------- |
| 5<br/>4A5<br/>3A3<br/>4f2<br/>2G4<br/>7Z1 | 1<br/>9<br/>6<br/>2<br/>-6 |

# <a id="ancora8"></a>[Desafio 8](#ancora)
> A tarefa aqui neste problema é ler uma expressão matemática na forma de dois números Racionais (numerador / denominador) e apresentar o resultado da operação. Cada operando ou operador é separado por um espaço em branco. A sequência de cada linha que contém a expressão a ser lida é: número, caractere, número, caractere, número, caractere, número. A resposta deverá ser apresentada e posteriormente simplificada. Deverá então ser apresentado o sinal de igualdade e em seguida a resposta simplificada. No caso de não ser possível uma simplificação, deve ser apresentada a mesma resposta após o sinal de igualdade.
>
> Considerando N1 e D1 como numerador e denominador da primeira fração, segue a orientação de como deverá ser realizada cada uma das operações:
> Soma: (N1*D2 + N2*D1) / (D1*D2)
> Subtração: (N1*D2 - N2*D1) / (D1*D2)
> Multiplicação: (N1*N2) / (D1*D2)
> Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)

## Entrada
A entrada contem vários casos de teste. A primeira linha de cada caso de teste contem um inteiro **N** (1 ≤ **N** ≤ 1*104), indicando a quantidade de casos de teste que devem ser lidos logo a seguir. Cada caso de teste contém um valor racional **X** (1 ≤ **X** ≤ 1000), uma operação (-, +, * ou /) e outro valor racional **Y** (1 ≤ **Y** ≤ 1000).

## Saída

A saída consiste em um valor racional, seguido de um sinal de igualdade e outro valor racional, que é a simplificação do primeiro valor. No caso do primeiro valor não poder ser simplificado, o mesmo deve ser repetido após o sinal de igualdade.


| Exemplo de Entrada                                           | Exemplo de Saída                                         |
| ------------------------------------------------------------ | -------------------------------------------------------- |
| 4<br/>1 / 2 + 3 / 4<br/>1 / 2 - 3 / 4<br/>2 / 3 * 6 / 6<br/>1 / 2 / 3 / 4 | 10/8 = 5/4<br/>-2/8 = -1/4<br/>12/18 = 2/3<br/>4/6 = 2/3 |
# <a id="ancora9"></a>[Desafio 9](#ancora)
> Mariazinha sabe que um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7 sem que haja resto. Então ela pediu para você fazer um programa que aceite diversos valores e diga se cada um destes valores é primo ou não. Acontece que a paciência não é uma das virtudes de Mariazinha, portanto ela quer que a execução de todos os casos de teste que ela selecionar (instâncias) aconteçam no tempo máximo de um segundo, pois ela odeia esperar.

## Entrada

A primeira linha da entrada contém um inteiro **N** (1 ≤ **N** ≤ 200), correspondente ao número de casos de teste. Seguem **N** linhas, cada uma contendo um valor inteiro **X** (1 < **X** < 231) que pode ser ou não, um número primo.

## Saída

Para cada caso de teste imprima a mensagem “Prime” (Primo) ou “Not Prime” (Não Primo), de acordo com o exemplo abaixo.


| Exemplos de Entrada          | Exemplos de Saída                 |
| ---------------------------- | --------------------------------- |
| 3<br/>123321<br/>123<br/>103 | Not Prime<br/>Not Prime<br/>Prime |
