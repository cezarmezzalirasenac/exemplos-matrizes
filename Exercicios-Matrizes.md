##Exercício 01 - Cadastro de usuários
Desenvolver um programa que simule uma agenda de cadastro pessoal com nome, endereço, código postal, bairro e telefone de dez pessoas. 
Ao final, o programa deve apresentar seus elementos dispostos em ordem alfabética ascendente a partir do elemento (campo) nome.


##Exercício 02 
Gerar e escrever uma matriz bidimensional de tamanho 9x7, com números aleatórios entre zero e cem. Ao final, imprimir a média geral dos números da tabela.

##Exercício 03 - Gado de corte
Um grande pecuarista está fazendo um experimento com um lote de 10 cabeças de gado de corte em sua fazenda. O gado de corte come diariamente em média 3% de sua massa, porém o produtor está buscando uma eficiência no consumo de alimentos, onde o esperado é que o animal esteja se alimentando de até 12 Kg de comida no coxo por dia. 
Neste exercício, gere uma matriz de 10 linhas e 7 colunas, sendo as linhas para os animais e as colunas para os dias da semana (domingo à sábado), onde os valores das colunas devem ser reais e devem ser gerados randomicamente entre 10 e 13 Kg. Após gerar os valores, deverá ser avaliado o consumo em uma semana desses 10 animais, buscando manter um padrão de mais de 60% dos dias de cada animal consumindo menos que 12 Kg. Caso a média de todos os animais seja maior ou igual a 60%, mostrar a mensagem "Meta alcançada! Resultado x%" e caso contrário mostrar a mensagem "Meta não alcançada. Resultado x%"

##Exercício 04 - Parcelas IPTU
Todos os anos, as prefeituras de todo o país fazem a cobrança do IPTU, imposto predial e territorial urbano, o qual é a principal fonte de receita das prefeituras para manter os serviços municipais funcionando. Dessa forma, a prefeitura precisa de um software que seja capaz de calcular as parcelas de IPTU fazendo o rateio e a correta divisão dos valores em 5 parcelas, para os contribuintes que desejam pagar parcelados seu imposto. Neste exercício, crie um vetor com 50 posições, com valores reais gerados randomicamente entre 900 e 10000, que servirá como base para gerar os valores das parcelas em uma matriz de 50 linhas e 5 colunas, sendo as colunas o valor de cada parcela. Utilizar o cálculo de rateio de parcelas com percentual igual, ou seja cada parcela vai corresponder a 20%. Validar se a soma de todas as parcelas fecha com valor total e somar a diferença na última parcela.


Exercício 05 - Financiamento de casa
O financiamento de imóveis é uma prática comum dos brasileiros, o qual permite o acesso ao sonho da casa própria através de financiamentos a perder de vista. Pensando nisso, um banco está disponibilizando uma tabela exclusiva para pessoas que querem comprar seu primeiro imóvel, seja ele novo ou usado, financiando até 90% do valor do imóvel.
João e sua esposa são clientes desse banco e estão buscando o financiamento de um imóvel no valor R$ 221.000,00, parcelado em 10 anos, porém eles moram de aluguel, pagando um valor mensal de R$ 1000,00 e estão estudando a possibilidade de guardar dinheiro durante 10 anos para comprar um imóvel a vista e continuar no lugar que estão, porém eles precisam se um software que faça esse cálculo. 
Nesse exercício, gere uma matriz contendo 120 linhas e 3 colunas, sendo as linhas os meses que compreendem 10 anos e as colunas, sendo calculadas da seguinte forma:
coluna 1 - deve ser 90% do valor do imóvel dividido pelo número de parcelas e acrescido de um juro de 2,5% a.m. nos primeiros 3 anos, 1,75% a.m. do terceiro ao quinto e de 1,2 % a.m. até o final das parcelas
coluna 2 - deve ser o valor total dividido pelo número de parcelas
coluna 3 - deve ser a diferença entre a coluna 1 e a coluna 2

No final, mostrar a soma total da coluna 3 e caso o valor da diferença positivo, mostrar a mensagem "Este financiamento não é viável." e caso contrário, mostrar a mensagem "Este financiamento é viável"

