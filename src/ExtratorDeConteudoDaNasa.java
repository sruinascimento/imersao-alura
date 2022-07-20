import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudo(String json) {
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);
        List<Conteudo> listaDeConteudos = new ArrayList<>();


        for (Map<String, String> atributos: listaDeAtributos) {
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("url");

            var conteudo = new Conteudo(titulo, urlImagem);
            listaDeConteudos.add(conteudo);
        }

        return listaDeConteudos;

        
    }   
}
