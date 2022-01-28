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