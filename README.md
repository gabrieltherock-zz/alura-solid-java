# alura-solid-java

coesão: harmonia entre elementos (os métodos e atributos da classe estão no mesmo contexto. a classe não faz mais do que ela deveria fazer)

encapsulamento: blindar e proteger uma classe contra influências internas. não é adequado setar diretamente os atributos de uma classe. classes que não estão encapsuladas permitem que ocorram violações nas regras de negócio, uma vez que os atributos dela podem ser mudados sem nenhuma restrição

acoplamento: quando duas classes estão dependentes uma da outra de forma muito intensa

Coesão:
	Uma classe coesa faz bem uma única coisa
	Classes coesas não devem ter várias responsabilidades
Encapsulamento:
	Getters e setters não são formas eficientes de aplicar encapsulamento
	É interessante fornecer acesso apenas ao que é necessário em nossas classes
	O encapsulamento torna o uso das nossas classes mais fácil e intuitivo
Acoplamento:
	Acoplamento é a dependência entre classes
	Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
	Devemos controlar o nível de acoplamento na nossa aplicação (falaremos mais sobre isso)


SOLID

	Single Responsability Principle --> "uma classe deve ter apenas um único motivo para mudar". só deve mudar quando houver um motivo relacionado a ela mesma. PRINCÍPIO DA COESÃO
	
	Que classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
	Que, segundo o Princípio de Responsabilidade Única (SRP), uma classe deve ter um e apenas um motivo para ser alterada;
	Como realizar uma refatoração no nosso sistema, para aplicar o SRP;
	Como extrair uma classe.


	Open Closed Principle --> a classe precisa estar aberta para extensões, mas fechada para modificações.

	Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
	Que o princípio Aberto/Fechado (OCP) diz que um sistema deve ser aberto para a extensão, mas fechado para a modificação
	Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
	Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.
	
	
	Liskov Substitution Principle --> Favorecer a Composição ao invés da Herança para evitar que classes herdem métodos e atributos que não deveriam e gerem comportamentos indesejados
	
	Que, embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
	Que o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.
	
	
	Interface Segregation Principle --> Uma classe não deveria ser forçada a depender de métodos que ela não utilizará. Criar interfaces novas para cada contexto em que haja o risco disso acontecer.
	

	Dependency Inversion Principle --> Abstrações não devem depender de implementações: são as implementações que devem depender das abstrações
	
	
Que é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
Que o Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
Que o Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;
