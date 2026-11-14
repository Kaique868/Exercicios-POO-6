# Questão 1
O Java Collections Framework (JCF) é um conjunto de interfaces e classes da linguagem Java que permite armazenar, organizar e manipular grupos de objetos de maneira eficiente.

Seus principais benefícios em relação aos arrays tradicionais são:
- **Tamanho dinâmico:** as coleções podem aumentar ou diminuir conforme a quantidade de elementos, enquanto os arrays possuem tamanho fixo.
- **Facilidade de manipulação:** oferecem métodos prontos para adicionar, remover, buscar e ordenar elementos.
- **Diferentes estruturas de dados:** permitem utilizar listas, conjuntos e mapas, cada um adequado a diferentes necessidades.
- **Reutilização de código:** disponibilizam implementações prontas, evitando a necessidade de desenvolver essas estruturas manualmente.
- **Maior flexibilidade:** facilitam o gerenciamento e a organização de grandes quantidades de dados.

Portanto, o Java Collections Framework torna o armazenamento e a manipulação de dados mais simples, flexíveis e eficientes em comparação aos arrays tradicionais.

# Questão 2
As interfaces List, Set e Map fazem parte do Java Collections Framework e possuem diferentes formas de armazenar e organizar dados.

- **List:** permite armazenar elementos repetidos e mantém a ordem de inserção. Os elementos podem ser acessados por meio de índices.

  **Exemplo:** uma lista de nomes de alunos, na qual podem existir nomes repetidos.

- **Set:** não permite elementos duplicados. É utilizado quando se deseja armazenar apenas valores únicos, sem repetições.

   **Exemplo:** uma coleção de e-mails de usuários, garantindo que nenhum endereço seja cadastrado mais de uma vez.


- **Map:** armazena dados no formato de chave e valor (key-value). Cada chave deve ser única e serve para localizar seu respectivo valor.

  **Exemplo:** um sistema de cadastro de usuários, utilizando o e-mail como chave e os dados do usuário como valor.

  # Questão 3
  As três classes implementam a interface ``Set``, ou seja, não permitem elementos duplicados. Entretanto, possuem diferenças na organização e no desempenho.

- **HashSet:** não mantém uma ordem específica dos elementos. Possui operações de busca, inserção e remoção rápidas, com complexidade média O(1). Apresenta menor consumo de memória em comparação às outras implementações.

- **LinkedHashSet:** mantém os elementos na ordem em que foram inseridos. Possui complexidade média O(1) para busca, inserção e remoção. Consome um pouco mais de memória que o HashSet, pois mantém referências para preservar a ordem.

- **TreeSet:** mantém os elementos automaticamente ordenados. Suas operações de busca, inserção e remoção possuem complexidade O(log n). Geralmente consome mais memória devido à utilização de uma estrutura de árvore.
