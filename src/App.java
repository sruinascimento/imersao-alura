import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        final String API_SECRET = System.getenv("API_SECRET_KEY");
    
        // String url = "https://alura-imdb-api.herokuapp.com/movies";
        // ExtratorDeConteudoDoImdb extrator = new ExtratorDeConteudoDoImdb();
        
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        //  String url = "https://api.mocki.io/v2/549a5d8b/NASA-APOD";
        ExtratorDeConteudoDaNasa extrator = new ExtratorDeConteudoDaNasa();
        
        
        var json = new ClienteHttp().buscaDados(url);
        List<Conteudo> conteudos = extrator.extraiConteudo(json);
        
        var sticker = new Sticker();
        for(int i = 0; i < conteudos.size(); i++) {
            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();

            String nomeArquivo = conteudo.titulo();

            sticker.cria(inputStream, nomeArquivo);

            System.out.println(nomeArquivo);
            System.out.println(conteudo.urlImagem());
        }

        //exibir e manipular os dados
        
        // for (Map<String,String> conteudo : listaDeConteudos) {
        //     String nomeImagem = conteudo.get("url");
        //     String titulo = conteudo.get("title");
        //     String nomeArquivo = titulo + ".png";
        //     String urlFormatada = formataUrl(nomeImagem);
        //     InputStream inpuInputStream = new URL(urlFormatada).openStream();
        //     Float avaliacaoFilme = Float.parseFloat(conteudo.get("imDbRating"));

        //     sticker.cria(inpuInputStream, nomeArquivo);
        //     System.out.println("Titulo " + titulo);
        //     System.out.println("Avaliacao " + avaliacaoFilme);
        //     System.out.println("Poster: " + urlFormatada);
            // System.out.println("\u001b[1m \u001b[32m  Title \u001b[0m: \u001b[40m \u001b[34m" + filme.get("title") + "\u001b[0m");
            // System.out.println("\u001b[1m \u001b[32m  Poster \u001b[0m: " + filme.get("image"));
            // Float avaliacao = Float.parseFloat(filme.get("imDbRating"));
            // System.out.println("\u001b[1m \u001b[32m  Rating \u001b[0m:  \u001b[43m" + geraEstrelaAvaliacao(avaliacao) + " \u001b[0m");
            // System.out.println();
        // }

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

    public static String formataUrl(String url) {
        String padrao = "._V1";
        if (url.indexOf(padrao) == -1) {
            return url;
        }

        return url.substring(0, url.indexOf(padrao)) + url.substring(url.length()-4);
    }
}
