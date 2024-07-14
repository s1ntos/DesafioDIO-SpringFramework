# Padrão de Projeto Singleton em Java

Este repositório demonstra a implementação do Padrão de Projeto Singleton em Java. O padrão Singleton garante que uma classe tenha apenas uma única instância e forneça um ponto global de acesso a essa instância. Isso pode ser particularmente útil para gerenciar recursos compartilhados, como configurações de sistema ou conexões de banco de dados.

## Tabela de Conteúdos
- [Introdução](#introdução)
- [Características](#características)
- [Quando Usar](#quando-usar)
- [Comparação com Outros Padrões](#comparação-com-outros-padrões)
- [Vantagens e Desvantagens](#vantagens-e-desvantagens)
- [Casos de Uso na Vida Real](#casos-de-uso-na-vida-real)
- [Recursos Adicionais](#recursos-adicionais)
- [Licença](#licença)

## Introdução
O padrão Singleton é um padrão de projeto que restringe a instanciação de uma classe a uma única instância e fornece um ponto global de acesso a ela. Isso é útil para gerenciar recursos que precisam ser compartilhados de maneira controlada.

## Características
- Garante uma única instância de uma classe.
- Fornece um ponto global de acesso à instância.
- Útil para gerenciar recursos compartilhados, como configurações ou conexões de banco de dados.

## Quando Usar
- Quando é necessário garantir que apenas uma instância de uma classe seja criada.
- Quando a instância única deve ser acessível globalmente.
- Para gerenciar recursos compartilhados, como conexões de banco de dados ou configurações de aplicação.

## Comparação com Outros Padrões
### Singleton vs. Factory
- **Singleton**: Garante uma única instância de uma classe.
- **Factory**: Cria instâncias de várias classes relacionadas sem especificar suas classes exatas.

### Singleton vs. Prototype
- **Singleton**: Sempre retorna a mesma instância.
- **Prototype**: Cria novas instâncias copiando uma instância existente.

## Vantagens e Desvantagens
### Vantagens
- Controla o acesso a uma única instância.
- Reduz o uso de memória ao evitar a criação de múltiplas instâncias.

### Desvantagens
- Pode ser difícil de testar devido à dependência de uma única instância.
- Pode introduzir um estado global na aplicação, dificultando o rastreamento de mudanças de estado.

## Casos de Uso na Vida Real
- **Gerenciamento de Configurações**: Manter configurações de aplicação em uma única instância para fácil acesso e modificação.
- **Conexões de Banco de Dados**: Controlar o acesso a uma única instância de conexão para otimizar o uso de recursos.
- **Loggers**: Implementar um logger global que possa ser acessado por diferentes partes da aplicação.

## Recursos Adicionais
- [Padrões de Projeto em Java](https://refactoring.guru/design-patterns/java)
- [Exemplos de Padrões de Projeto no GitHub](https://github.com/iluwatar/java-design-patterns)
- [Singleton Pattern - Wikipedia](https://en.wikipedia.org/wiki/Singleton_pattern)
