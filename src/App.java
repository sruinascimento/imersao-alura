import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // fazer um conexão e pegar os 250 melhores filmes
        // String url = "https://imdb-api.com/en/API/Top250Movies/k_w5bdv4dn";
        // String url = "https://imdb-api.com/en/API/MostPopularMovies/k_w5bdv4dn";
        String url = "https://imdb-api.com/en/API/Top250TVs/k_w5bdv4dn";
        // String url = "https://imdb-api.com/en/API/MostPopularTVs/k_w5bdv4dn";
        
        
        
        // String url = "https://api.mocki.io/v2/549a5d8b";
        // String url = "https://developers.themoviedb.org/3/trending/movie/week?api_key=ded9ce3e7ef2e209ebb01d855f779ff7";
        URI endereco =  URI.create(url);
        HttpClient client = HttpClient.newHttpClient(); 
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response =  client.send(request, BodyHandlers.ofString());
        String body = response.body();

        //extrair os dados que interessam (titulo, poster, classificacao)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        
        //exibir e manipular os dados
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[1m Title \u001b[0m: " + filme.get("title"));
            System.out.println("\u001b[1m Image \u001b[0m: " + filme.get("image"));
            Float avaliacao = Float.parseFloat(filme.get("imDbRating"));
            System.out.println("\u001b[1m Rating \u001b[0m: " + geraEstrelaAvaliacao(avaliacao) );
            
            System.out.println();
        }


        //Desafios!!!

        // Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do 
        //IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.



    }

    public static String geraEstrelaAvaliacao(float rating) {
        int avaliacaoTruncada = Math.round(rating);
        String estrelas = " ";
        for (int i = 0; i < avaliacaoTruncada; i++) {
            estrelas += "★";
            // estrelas += "\\U+2B50 ";	
        }
        return estrelas;
    }
}
