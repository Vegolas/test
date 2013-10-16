package githubtest;


public class AudioCD extends CD {
    private String artist;


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    @Override
    public String toString(){
        
        String n = System.getProperty("line.separator");
        return getClass().getSimpleName() + n +
                "\ttitle: " + getTitle() + n +
                "\tprice: " + getPrice() + n +
                "\tartist: " + this.artist;
    }
    
}
