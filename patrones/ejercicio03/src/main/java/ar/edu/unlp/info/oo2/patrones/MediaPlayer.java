package ar.edu.unlp.info.oo2.patrones;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    
    private List<Media> media;

    public MediaPlayer() {
        this.media = new ArrayList<>();
    }

    public void Play(){
        this.media.stream().forEach(media -> media.play());
    }

    public void addMedia(Media media){
        this.media.add(media);
    }
}
