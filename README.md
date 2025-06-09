# 🔍 Projeto BuscaCEP

Aplicação Java para consulta de endereços a partir de um CEP ou busca de CEPs a partir de um endereço, utilizando a API pública do [ViaCEP](https://viacep.com.br/).

---

## ✨ Funcionalidades

- 🔎 Busca por CEP: retorna dados de endereço formatados.
- 📍 Busca por Endereço (estado, cidade, rua): retorna uma lista de CEPs encontrados.
- 📦 Integração com a API ViaCEP via HTTP.
- 🔧 Código modular com separação clara entre menu, lógica de negócio e modelo de dados.
- 🔄 Loop de interação com o usuário para múltiplas consultas.

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- API HTTP Client (`java.net.http`)
- Biblioteca [Gson](https://github.com/google/gson) para desserialização de JSON
- API pública do ViaCEP


## 📦 Como executar

### Pré-requisitos

- JDK 17 ou superior instalado
- [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) incluído no classpath

### Executando  
1 - Clone o repositório:

```
git clone https://github.com/VitorZanela/buscaCEP.git  
``` 
2 - Acesse o diretório do projeto:
```
cd buscaCEP
```
3 - Abra o projeto em sua IDE Java preferida (Ex: IntelliJ ou VS Code).

4 - Certifique-se de que você tem o Java 17 (ou versão compatível) instalado.

5 - Execute a classe Main localizada em:
```
src/project/buscacep/classes/main/Main.java
```
_Observação: O projeto utiliza a biblioteca GSON para conversão de JSON em objetos Java. Certifique-se de que o .jar 
está incluído no seu classpath ou que seu ambiente reconhece a dependência._
### 📌 Observações
O projeto não possui interface gráfica. Toda interação é feita via terminal.

Em caso de erro no CEP ou endereço digitado, o sistema informará e pedirá nova tentativa.

Os dados retornados são de domínio público conforme os termos de uso do ViaCEP.

### ✅ Exemplos de uso
```
---- BUSCA DE ENDEREÇO ----  
1 - Busca por CEP / 2 - Busca por Endereço:  
1  
Digite o CEP (Somente números):  
01001000

Resultado:  
Logradouro: Praça da Sé  
Bairro: Sé  
Cidade: São Paulo  
UF: SP  
  ``` 
  

### 📄 Licença  
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.