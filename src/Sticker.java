import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;


public class Sticker {

    public void cria (InputStream inpuInputStream, String nomeArquivo, float avaliacao) throws IOException {

        BufferedImage imagemOriginal =  ImageIO.read(inpuInputStream);
        BufferedImage imagemYoda =  ImageIO.read(new File("../image/yoda.jpg"));
        BufferedImage imagemBabyYoda =  ImageIO.read(new File("../image/baby-yoda.jpg"));
        
        int alturaImagem = imagemOriginal.getHeight();
        int larguraImagem = imagemOriginal.getWidth();
        int novaAlturaImagem = alturaImagem + 200;

        BufferedImage novaImagem =  new BufferedImage(larguraImagem, novaAlturaImagem, BufferedImage.TRANSLUCENT);

        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);
        Font fonte = this.condiguraFonte();
        graphics.setFont(fonte);
        graphics.setColor(Color.YELLOW);
        
        //Mensagens personalizadas
        if (avaliacao > 6) {
            graphics.drawImage(imagemYoda, 20, alturaImagem / 2, null);
            graphics.drawString("ASSISTIR eu irei!", 200 , alturaImagem + 130);
        } else {
            graphics.drawImage(imagemBabyYoda, 20, alturaImagem / 2, null);
            graphics.drawString("DORMIR eu irei!", 200 , alturaImagem + 130);
        }

        //Criando Diretório caso o diretório 'image-out' não exista
        String path = "../image-out/";
        File diretorioSaida = new File(path);
        if (!diretorioSaida.exists()) {
            diretorioSaida.mkdir();
        }
        ImageIO.write(novaImagem, "png", new File(path+nomeArquivo));
    }

    private Font condiguraFonte() {
        Font fonte = null;
        try {
            fonte = Font.createFont(Font.TRUETYPE_FONT, new File("../fonts/impact.ttf")).deriveFont(100f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("../fonts/impact.ttf")));
            return fonte;
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Font(Font.SANS_SERIF, Font.BOLD, 64);
    }

}
