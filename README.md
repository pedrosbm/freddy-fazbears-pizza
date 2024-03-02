# freddy-fazbears-pizza

Esse repositório é dedicado ao versionamento do meu projeto spring mvc da Freddy Fazbear's Pizza, site fictício de delivery de pizza temático de fnaf.

Essa é basicamente uma api de delivery de pizza básica para o projeto web que estou trabalhando.

## Endpoints

Verbo|Tipo da requisição|Descrição|Exemplo de uso|
|--|:--:|--|:--:|
|user/{id}|GET|Obtém os dados de um usuário| [Obter usuário](#1-obter-usuário) | 
|user|POST|Cria um novo usuário| [Criar usuário](#2-criar-usuário) |
|user|PUT|Atualiza os dados de um usuário| ▼ |
|user|DELETE|Apaga um usuário| ▼ |
|login|POST|Realiza a autenticação de um usuário| ▼ |

## Demonstração/ exemplos dos endpoints

### 1-obter usuário
GET `user/2753545612`

Retorno:
```json
{
  "id_clie": 2753545612,
  "nm_clie": "Pedro",
  "email_clie": "psbm@hotmail.com",
}
```
##
|Status code|Mensagem|
|--|--|
|200|Dados retornados com sucesso|
|404|Usuário não encontrado|

---

### 2-criar usuário
POST `user`

Request Body:
```json
{
  "nm_clie": "Pedro",
  "email_clie": "psbm@hotmail.com",
  "senha_clie": "psbm2024"
}
```

Retorno:
```json
{
  "id": 2753545612,
  "nm_clie": "Pedro",
  "email_clie": "psbm@hotmail.com",
  "senha_clie": "psbm2024"
}
```
