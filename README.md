# Estudos Kotlin

### Lições aprendidas Kotlin

- Sintaxe Kotlin
- If e When
- For e While
- Unit (void)

### Lições aprendidas sobre POO no Kotlin (Parte 1)

- **Criação de Classes e Objetos**
- **Métodos de uma classe**
    - Qualquer comportamento que altere os atributos de uma classe deve ser implementado na própria classe
- **Encapsulamento com getters e setters**
    - Protegendos atributos de uma classe
- **Properties**
    - Não precisamos implementar getters e setters a não ser que tenhamos um comportamento específico pois as properties
      ja implementam isso por padrão
- **Labels** Ex: (conta = contaMarcos, valor = 50)
    - Ao invés de passarmos somente os atributos também o atribuímos para melhorar a visualização do código

### Lições aprendidas sobre POO no Kotlin (Parte 2)

- **Heranças** (De "extends" para " : ")
    - Classe a ser herdada precisa do prefixo "open"
    - O mesmo acontece para override de funções
- **Sobrescrita e Sobrecarga de Métodos**
    - Sobrescrita - adicionando o prefixo override podemos sobrescrever as properties e métodos implementados pela
      classe mãe
    - Sobrecarga - funções com o mesmo nome, porém recebem valores diferentes como parâmetros e tem execuções diferentes
- **Polimorfismo**
    - Compartilhar comportamentos comuns entre a classe mãe e filha
    - Novas implementações que herdarem da classe mãe não precisaram ser ajustadas em metodos que utilizam
      comportamentos comuns entre mãe e filha
- **Classes Abstratas**
    - Classes que não podem ser instânciadas e apenas herdadas
    - Metodos abstratos (Não possuem implementação na propria classe porém exige a implementação nas classes filhas)
    - **Public** (Definem que determinada propertie seja alterada a qualquer momento)
    - **Private** (Definem que determinada propertie seja alterada apenas pela propria classe)
    - **Protected** (Definem que determinada propertie seja alterada apenas pela propria classe e suas filhas)
- **Interfaces**
    - Contratos definidos que a serem implementados obrigam que determinada classe implemente os metodos da interface
    - Podem ser implementados com o uso de herança
    - Usado quando precisamos da mesma implementação em contextos diferentes
    - Interfaces permitem implementação de métodos porém sem armazenar estados
    - Usar implemetações na interface apenas quando não tivermos dados sensíveis envolvidos pois atributos não podem ser
      private nem protected

### Lições aprendidas sobre POO no Kotlin (Parte 3)

- **Organização de projeto e pacotes**
    - Default imports
    - Imports com "*" para importar todos os recursos do pacote
    - Renomear imports com o "as"
- **Composição entre classes**
    - Permite a utilização de Classes como tipo de uma propertie
- **Variáveis Globais**
    - Variáveis que podem ser utilizadas e alteradas em qualquer parte do código(devem ser evitas ou não utilizadas)
- **Object Expressions, Declarations and Companions**
    - Declaração de objetos anonimos(Não são ligados a classe ou interface, porém podem fazer herança e implementar
      interfaces)
    - É utilizado o "object{}" para declaração
    - Objeto declarado dentro da classe
    - Companion objects(Declarados com o prefixo "companion")
- **Herança base Kotlin**
    - Any(Permite a execução sem "tipar")
    - Cast adicionando "as" ao final da variavel ex: "valor as Funcionario"
    - Cuidado ao utilizar e evitar o uso do "Any e As"
    - Operador "is"(Permite a verificação se determinado objeto é de determinado tipo, além de possibilitar o smart
      cast)
- **Métodos comuns a todas as classes**
    - Equals - Utilizado pra verificar igualdade de objetos
    - HashCode - Retorna o hashCode do objeto
    - ToString - Retorna a representação so objeto sob String
    - (Os métodos acima podem também sofrer um "override ou sobrescrita na classe desejada")
    - Usando os atalhos alt+insert no intellij conseguimos trazer automaticamente a implementação da sobrescrita para
      esses métodos padrões
- **Data Class**
    - Class focada em nas properties e em persistência de dados
    - Possuem as implementações do comando alt+insert por padrão trazendo as properties no método toString por exemplo
    - Possuem também o Component N Functions e Copy
        - Component N Functions - Permite a desestruturação para capturar properties dentro do objeto ex: val(rg, cpf) =
          funcionario
        - Copy - Permite realizar uma copia da instância do objeto da classe

### Lições aprendidas sobre POO no Kotlin (Parte 4)

- **Pilha de Execução**
    - Conforme as funções vão sendo chamadas elas vão sendo executadas como a ordem de execução
- **Modo Debbuger**
    - Permite a depuração do código com o uso de breakpoints
- **Execeptions**
    - Exceções em que o código compila mas apresenta um comportamento inesperado
    - Podem ser tratadas com try-expression(try, catch, finally)
    - A exception precisa ser tipada Ex: ArithmeticException
    - Propriedades de uma exception(message, stacktrace, cause)
    - Printa as tres propriedades acima (printStackTrace)
    - Variaveis podem receber o try/catch ou if
    - Pode ser feito mais de um catch para um try
    - Ao lidar com erro desconhecido usar Exception genérica, coloca-la por ultimo
- **Referências Nulas**
    - Caso ocorra um erro de referência nula, irá retornar um NullPointerException
    - Not Null Operator(Cast que garante a presença de valor numa variavel opcional "!!")
    - Safe Call(Adicionando um "?" antes do seugndo nível da variavel podemos garantir que não havera erro de compilação
      caso a variavel seja nula)
    - Let(Safe call que garante a execução somente se a variavel não for nula)
    - Elvis Operator(Permite adicionar retorno específico caso a variavel seja nula ? varaivel :? retorno)
    - Safe Cast(Garante que caso a variavel n seja daquele tipo, retornar nulo "as?")

### Lições aprendidas sobre Coleções no Kotlin (Parte 5)

- **Arrays**
    - Para declarar um Array usamos "TipoArray(tamanho_array)"
    - Para declarar um Array de tipos não primitivos "Array<TipoArray>(tamanho_array)"
    - Para declarar um Array sem a necessidade de colocar o tamanho dele "tipoArrayOf(elemento1, elemento2)"
    - Para percorrer array com for "for(atribuição in array){}"
    - Para declarar um range podemos usar "rangeTo, .., downTo"
- **Funções Agregadoras**
    - Para pegar um valor maximo "array.max()"
    - Para pegar um valor mínimo "array.min()"
    - Para pegar a média "array.average()"
    - Para pegar a soma "array.sum()"
    - Para testar se todas os atributos do array satifazem aquela condição "array.all {condição}" retornando um boolean
    - Para testar se algum dos atributos do array satifazem aquela condição "array.any {condição}" retornando um boolean
    - Para retornar os atributos do array satifazem aquela condição "array.filter {valor -> condição}"
    - Para retornar o primeiro atributo do array que satifaz aquela condição "array.find {valor -> condição}"
    - Para retornar os atributos depois de serem processados "array.map {iteração}"
    - Para declarar funções extensivas ao tipo "Array<TipoArray>.nome_função(): retorno{}"
    - Para retornar valores acumulados "array.reduce {acc, valor -> iteração}"
    - Para retornar valores acumulados mais valor inicial "array.fold(valor_inicial) {acc, valor -> iteração}"
    - Para retornar valores ordenados do maior pro menor "array.sorted()"
    - Para primeiros valores ordenados "array.take(quantidade)"
    - Para ultimos valores ordenados "array.takeLast(quantidade)"
    - Para converter de Lista para Array, "val variavel: Array<TipoDesejado> = lista.toTypedArray()"
- **Listas**
    - Só podem ter lista de objetos não existe lista de tipos primitivos
    - Para declarar uma lista MUTÁVEL usamos "mutableListOf(objeto1, objeto2, objeto3)"
        - lista.add(adiciona um objeto a lista)
        - lista.remove(remove um objeto da lista)
    - Para declarar uma lista IMUTÁVEL "listOf(objeto1, objeto2, objeto3)"
    - Para ondernar uma Lista a classe do Objeto criado de extender de Comparable e implementar o metodo sorted
    - Para ondernar uma Lista manipulando a mesma também podemos usar "lista.sortBy {it.atributo}"
    - Para ondernar uma Lista criando uma nova lista podemos usar "lista.sortedBy {it.atributo}"
    - Para retornar os objetos do array satifazem aquela condição "lista.filter {valor -> condição}"
    - Declarar um lista com possíveis nulos "lista?"
    - Para filtrar elementos não nulos de uma lista "lista.filterNotNull()"
    - Para agrupar uma lista por um atributo em específico "lista.groupBy {atributo}"

### Lições aprendidas sobre Coleções no Kotlin (Parte 6)

- **Coleções**
    - Iterable -> Collection -> List e Set
    - MutableIterable -> MutableCollection -> MutableList e MutableSet
    - Tomar cuidado ao trabalhar com coleções para n ferir os princípios da POO
    - Usando o "lista.toList()" devolvemos uma cópia do objeto ao invés da referência do mesmo
    - Para concatenar listas podemos usar "novaLista.addAll(element1+element2+...)"
    - Para eleminar-mos os elementos repetidos de uma lista podemos usar "lista.distinct()"
- **Sets**
    - Conjunto de elementos (Similar ao conjunto matemático)
    - Não possuem índice
    - Não possuem elementos repetidos
    - Para declarar o set "setOf(element1, element2,...)"
    - Para unir dois sets "set1 union set2 || set1.union(set2)"
    - Para subtrair dois sets "set subtract set || set1.subtract(set2)"
    - Para pegar o incomum nos dois sets "set intersect set || set1.subtract(set2)"
- **Maps**
    - Não possuem índice
    - É uma coleção que carrega a estrutura de chave e valor
    - Para declarar o map "mapOf(Pair(chave, valor), chave to valor,...)"
    - Para capturar todas as chaves "map.keys"
    - Para capturar todas os valores "map.values"
    - Os comportamentos são feitos a partir da chave "map[chave]" essa iteração sempre retonar o valor opcional "valor?"
    - Conseguimos realizar atribuição e atualização a partir da chave "map[chave]=valor"
    - Também onseguimos realizar atribuição e atualização dessa forma "map.put(chave, valor)"
    - Para só adicionar caso não exista valor "map.putIfAbsent(chave, valor)"
    - Para remover um elemento "map.remove(chave)"
    - Para remove rum elemento caso ele tenha um valor específico "map.remove(chave, valor)"
    - Para pegar um valor de uma chave sem verificação (null se a chave não existir) podemos "map.get(key)"
    - Para pegar um valor de uma chave com verificação (exception se a chave não existir) podemos "map.getValue(key)"
    - Para executar algo e capturar um valor caso a chave não exista podemos usar
      "map.getOrElse(chave, {função lambda -> valor})"
    - Para capturar diretamente um valor caso a chave não exista podemos usar "map.getOrDefault(chave, valor)"
    - Para filtrar em um map "map.filter {(chave, valor) -> condição}"
    - Para adicionar ou remover sem modificar a fonte podemos usar "map + Pair(chave, valor) || map - chave"
    - Para adicionar ou alterar uma coleção ao map "map.putAll(coleção)"
    - Para adicionar ou alterar uma coleção ao map "map += (coleção)"
    - Para remover do map "map.remove(chave || valor(em caso de valor remove o primeiro))"
    - Para remover do map "map -= chave"
- **Transformação de Coleções**
    - Para associar uma lista ou set para um map "lista.associate {propriedade -> Pair(valor, chave)}"
    - Para associar uma lista ou set para um map por uma propriedade "lista.associateBy {propriedade -> chave}"
    - Para associar uma lista ou set para um map por uma função "lista.associateWith {propriedade -> função}"
    - Para agrupar uma coleção "map.groupBy {propriedade -> função}" podemos posteriormente usar o resultado "
      map[agrupamento]"

### Lições aprendidas sobre Programação Funcional no Kotlin (Parte 7)

- **Programação Funcional**
    - Trabalha com a ideia de imutabilidade
- **Tipo Função**
    - Para declarar uma função dentro de uma variavel primeiro declaramos a função normalmente e depois               
      "val variavel: (Element1, Element2,...) -> Retorno = ::nomeFunção"
    - Para declarar uma classe dentro de uma variavel primeiro declaramos a classe
      "class Classe: (Element1) -> retorno {implementar invoke}" e depois               
      "val variavel: (Element1) -> Retorno = Classe()"
    - Para utilizar uma função lambda por meio de uma variavel "val variavel: (Element1) -> Retorno = {execução}"
    - Para utilizar uma função anonima por meio de uma variavel "val variavel: (Element1) -> Retorno = fun(): Retorno
      {execução}"
    - Para utilizar mais de um retorno numa função lambda "val variavel: (Element1) -> Retorno = label@
      {...return1@label ...return2@label}"
- **Funções Higher-Order**
    - São funções que recebem outra função com parâmetro
- **Funções de Escopo**
    - São funções que possuem um pequeno bloco de escopo a ser executado
    - Funções que recebem o this, "run, with, apply", não precisam que seja usado o this para se referir ao objeto de
      contexto
    - Funções que recebem o it, "let, also", precisam que seja usado o it para se referir ao objeto de contexto
    - Funções retornam o objeto de contexto "also, apply"
    - Let usado quando pretendemos trabalhar no resultado de uma ou mais funções
    - With (Não é uma função de extensão) "with(Objeto) {função}" usado quando precisamos não devolver nada ou devolver
      uma computação (não temos it, e sim o this podendo usar as propriedas do objeto diretamente)
    - Run (Invocado igual ao let(função de extensão) ou não) usamos quando queremos atribuições e ao final computações
    - Apply (Invocado igual ao let(função de extensão)) usamos quando queremos devolver o próprio objeto ao final da
      execução
    - Also (Invocado igual ao let(função de extensão)) possui o it para referenciar o objeto, usamos geralmente para
      imprimir ou loggar algo
    - TakeIf (Invocado igual ao let(função de extensão)) retonar o objeto caso verdadeiro
    - TakeUnless (Invocado igual ao let(função de extensão)) retonar o objeto caso falso
