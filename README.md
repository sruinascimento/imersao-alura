

# Alura Sticker 

Projeto de imersão backend com a linguagem Java, visa criar um app que irá consumir dados de uma API que retorna a classificação de filmes e séries, ao fim do projeto pretende criar stickers personalizado com indicação de filmes/séries para enviar por whatsapp.

| 🪧 Vitrine.Dev |     |
| -------------  | --- |
| ✨ Nome        | Alura Sticker
| 🏷️ Tecnologias | Java, Spring, MongoDB, Heroku, Git (tecnologias utilizadas)
| 🚀 URL         | https://linguagens-imersao-api.herokuapp.com/linguagens
| ![](https://user-images.githubusercontent.com/57668890/180817617-19891220-9a10-4894-b958-ffac9356e130.png) Desafio | https://www.alura.com.br/imersao-java

![](https://user-images.githubusercontent.com/57668890/180806003-6765c6ae-b347-4e0c-82a5-bc224e08d9a8.png#vitrinedev)


## 🔨 Tecnologias

- ``Java - 17.0.2 2022-01-18 LTS``
- ``Spring - 3.0``
- ``MongoDB``
- ``Heroku``
- ``Git``


 ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
 ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
 ![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
 ![Heroku](https://img.shields.io/badge/heroku-%23430098.svg?style=for-the-badge&logo=heroku&logoColor=white)
 ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

## 📝 5 dias de imersão 
<img src="https://camo.githubusercontent.com/459f141bd5e24c179a0e2dd49691e290ed5c5d4b4cb97767daee7cfaf6e31121/687474703a2f2f696d672e736869656c64732e696f2f7374617469632f76313f6c6162656c3d535441545553266d6573736167653d434f4e434c5549444f26636f6c6f723d475245454e267374796c653d666f722d7468652d6261646765">


- [x] 1ª Dia
  - [x] Buscar filmes mais populares
  - [x] Apresentar notas com emoji de estrela
  - [x] Colocar chave da API em um local fora do código fonte

### Resultado do 1º dia

![resultado_1dia_imersao](https://user-images.githubusercontent.com/57668890/179632900-2276f83e-50a3-4cf0-8ae1-96a5b6ebc818.png)


- [x] 2º Dia
  - [x] Criar diretório de saída das imagens, se ainda não existir.
  - [x] Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
  - [x] Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
  - [x] Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.

### Resultado do 2º dia
![resultado2dia_filmebom](https://user-images.githubusercontent.com/57668890/179868393-a8090a3f-4294-4b8a-ab07-6b6ac2eddf2c.png)
![resultado_2](https://user-images.githubusercontent.com/57668890/179868402-93d6ebab-b6db-4800-9b16-cdf5422f8aed.png)
![resultado_whats](https://user-images.githubusercontent.com/57668890/179868541-7bef4103-5d21-4627-a164-6db7b431bde5.png)

- [x] 3º Dia
  - [x] Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
  - [x] consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas
  
  ### Resultado do 3º dia
  ![resultados_3](https://user-images.githubusercontent.com/57668890/180566098-cea6264c-ea60-4e29-b405-76aea25c2c59.png)

   Código refatorado. Foram criadas novas classes, para que a classe App(principal) não fosse uma classe GOD(classe que faz tudo). Foram delegados as tarefas e funções.
   
  
- [x] 4º Dia
  - [x] Criando API com spring
  - [x] Métodos GET, POST implementados nas rotas
  - [x] Conexão com o MongoDB Atlas e aramzenamento dos documentos.
 
 ### Resultado do 4º dia
   ![resultados_4](https://user-images.githubusercontent.com/57668890/180573308-ae5086f6-0f1f-43fe-9361-2791e5fa0fac.png)
 
 Api implemtnada com o spring

  
 - [x] 5º Dia
   - [x] Realizar deploy na Heroku
   - [x] link - https://linguagens-imersao-api.herokuapp.com/linguagens

### Resultado do 5º dia
![resultado_final](https://user-images.githubusercontent.com/57668890/180580712-0b48693e-8294-4256-b3b4-b1e19163f537.png)

Stickers para o whatsapp gerado e consumidos a partir da API disponibilizada no HEROKU.

