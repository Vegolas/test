package githubtest;

public class GitHubTest {


    public static void main(String[] args) {
        CD plyta = new CD();
        
        plyta.setTitle("DnD");
        System.out.println(plyta.toString());
        
        AudioCD lordi = new AudioCD();
        
        lordi.setTitle("Get Heavy");
        lordi.setArtist("Lordi");
        lordi.setPrice(65.50);
        System.out.println(lordi.toString());
    }
}
