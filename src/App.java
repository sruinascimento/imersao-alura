import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //Top 250 Filmes
        // String url = "https://imdb-api.com/en/API/Top250Movies/"+API_SECRET;
        //Filmes mais populares
        // String url = "https://imdb-api.com/en/API/MostPopularMovies/"+API_SECRET;
        //Top 250 seriados
        // String url = "https://imdb-api.com/en/API/Top250TVs/"+API_SECRET;
        //Seriados mais populares
        // String url = "https://imdb-api.com/en/API/MostPopularTVs/"+API_SECRET;

        //Utilizando uma variavel de ambiente para guardar a chave da
        final String API_SECRET = System.getenv("API_SECRET_KEY");
        
        
        String url = "https://api.mocki.io/v2/549a5d8b";
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
            System.out.println("\u001b[1m \u001b[32m  Title \u001b[0m: \u001b[40m \u001b[34m" + filme.get("title") + "\u001b[0m");
            System.out.println("\u001b[1m \u001b[32m  Poster \u001b[0m: " + filme.get("image"));
            Float avaliacao = Float.parseFloat(filme.get("imDbRating"));
            System.out.println("\u001b[1m \u001b[32m  Rating \u001b[0m:  \u001b[43m" + geraEstrelaAvaliacao(avaliacao) + " \u001b[0m");
            
            System.out.println();
        }

    }

    public static String geraEstrelaAvaliacao(float rating) {
        int avaliacaoTruncada = Math.round(rating);
        String estrelas = " ";
        for (int i = 0; i < 10; i++) {
            // estrelas += "★";
            if (i < avaliacaoTruncada) {
                estrelas += " \u2605 ";
            } else {
                estrelas += " \u2606 ";
                
            }
        }
        return estrelas;
    }
}
