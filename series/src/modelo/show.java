package modelo;

import java.io.Serializable;

/**
 * 
 * @author sepla
 */
public class show implements Serializable{
    
    private String title;
    private String scriptwriter;
    private int seasons;
    private String genre;
    private int views;
    
    //CONSTRUCTOR

    public show(String title, String scriptwriter, int seasons, String genre, int views) {
        this.title = title;
        this.scriptwriter = scriptwriter;
        this.seasons = seasons;
        this.genre = genre;
        this.views = views;
    }

}
