## RH Software

### Description
Projeto de estudos trilha: "Arquitetura e Design de Projetos Java" na **Alura**

Modele o seu projeto usando boas práticas e padrões de projeto como o SOLID. 
Use BDD e DDD e saiba as vantagens da Clean Architecture.

### Technologies: Java

### Anotações ###

SOLID

    Príncípios da ORIENTAÇÃO A OBJETOS
        COESÃO -> 'União armonica entre os elementos', todos os atribútos e classes de um projeto devem estar em armonia, exemplo da classe funcionário que possui metodos de formatação de CPF ou informações de endereço por exemplo.

        "Classes não coesas tendem a crescer indefinidamente, o que as tornam difíceis de manter"

        Quando temos classes não coesas a manutenção quase sempre é prejudicada.

        ENCAPSULAMENTO -> 'Incluir ou proteger alguma coisa em uma cápsula, progetger ou blindar', o encapsulamento nada mais é do que blindar uma classe de influência ou manipulações externas que podem prejudicar a consistência das informações.

        O fato de apenas colocar private ou criar getters e setters não implica na proteção da classe

        ACOPLAMENTO -> 'Ação de acoplar. Agrupamento aos pares'. O fato de uma classe usar outra gera um acoplamento entre elas, o problema é quando uma classe conhece muitos detalhes de outra, quando essa dependência é muito forte, quaisquer alterações na classe a, ocasionam alterações na classe b também.
        "Classes acopladas causam fragilidade no código da aplicação, o que dificulta sua manutenção."


        SINGLE RESPONSIBILITY PRINCIPLE (Foca em manter a coesão das classes no projeto)
            Uma classe deveria ter apenas um único motivo para mudar - Robert Martin

        OPEN CLOSED PRINCIPLE 
            'Não é necessário fazer uma cirurgia de peito aberto para por um casaco', a ideia é que entidades de software (classes, modulos ou funções) deveriam estar abertas para extensão e fechadas para modificação. Quanto menos modificarmos uma classe melhor.

        LISKOV SUBSTITUTION PRINCIPLE
            'Se parece com um pato, faz quack como um pato, mas precisa de baterias, você provavelmente fez a abstração errada.'
            Precisamos ter cuidado ao utilizar herança para não criar efeitos colaterais nas relações entre classes e objetos, uma alternativa muito relevante é a composição

        INTERFACE SEGREGATION PRINCIPLE
            'Uma classe não deveria ser forçada a depender de métodos que não utilizará'

            Vimos no último vídeo que, ao separar as interfaces, implementamos o Interface Segregation Principle.
            Qual a definição formal deste princípio?  Alternativa correta!
            R: Classes não devem ser obrigadas a implementar métodos que não irão precisar.
            JUSTIFICATIVA: Uma classe não deve ser obrigada a implementar um método de determinada interface, se ele não será útil. Para isso, uma interface deverá ser extraída apenas com os métodos necessários.

        DEPENDENCY INVERSION PRINCIPLE 
            'Abstrações não devem depender de implementações. Implementações devem depender de abstrações'

             Que vantagem temos ao depender de interfaces e não de implementações?
                R: Caso uma determinada implementação mude, não seremos afetados, pois dependemos apenas de sua interface. Alternativa correta!
                Justificativa: Se um método muda a forma como realiza sua tarefa, desde que a interface se mantenha, não vamos precisar nos preocupar nem em editar o nosso código.

        O QUE APRENDEMOS

            Que é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
            
            Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
            
            Que o Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
        
            Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
            
            Que o Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;
       
        OS CONCEITOS APRENDIDOS NESTE TREINAMENTO FORMAM O ACRÔNIMO SOLID
       
            Single Responsibility Principle
            Open Closed Principle
            Liskov Substitution Principle
            Interface Segregation Principle
            Dependency Inversion Principle

### Por: **Caike Bispo**


