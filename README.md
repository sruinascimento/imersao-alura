

 <h1 align="center"> Alura Sticker </h1>

<p align="center">
<img src="https://camo.githubusercontent.com/18185202231435bc1c2003830758e4b9f1567a33602d9d5ed1c73a04f8a44348/687474703a2f2f696d672e736869656c64732e696f2f7374617469632f76313f6c6162656c3d535441545553266d6573736167653d454d253230444553454e564f4c56494d454e544f26636f6c6f723d475245454e267374796c653d666f722d7468652d6261646765">
</>

## Descrição do Projeto

<h4 align="justify"> Projeto de imersão backend com a linguagem Java, visa criar um app que irá consumir dados de uma API que retorna a classificação de filmes e séries, ao fim do projeto pretende criar stickers personalizado com indicação de filmes/séries para enviar por whatsapp. </h4>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![Heroku](https://img.shields.io/badge/heroku-%23430098.svg?style=for-the-badge&logo=heroku&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)

## 🔨 Tecnologias

- [Java](https://github.com/sruinascimento/imersao-alura) - java 17.0.2 2022-01-18 LTS 
- Spring 3.0
- MongoDB Atlas
- Heroku

## 📝 5 dias de imersão

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
