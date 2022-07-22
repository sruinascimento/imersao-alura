package br.com.nextprofile.linguagensapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;


    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getImage() {
        return this.image;
    }

    public int getRanking() {
        return this.ranking;
    }


    
}
