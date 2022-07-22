public class ConteudoClasse {
    
    private final String titulo;
    private final String urlImagem;

    
    public ConteudoClasse(String titulo, String urlImagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getUrlImagem() {
        return this.urlImagem;
    }
    

    @Override
    public String toString() {
        return "Titulo " + this.titulo + "\n" +
                "UrlImagem " + this.urlImagem + "\n";
    }


}
