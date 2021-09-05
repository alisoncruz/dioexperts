Projeto com arquitetura baseada em microserviços usando Spring Cloud.

O Gateway recebe as requisições através da porta 8080 e as distribui para os microserviços.

O Service Discovery responde através da porta 9000, verificando a disponibilidade de cada serviço que está em funcionamento bem como fornecendo informações sobre cada um.

As configurações estão centralizadas no Config Server, que neste projeto encontra-se em um repositório específico, e usa a porta 8888. 

O Product Catalog atende através da porta 8081.

O Shopping Cart responde na porta 8082.

