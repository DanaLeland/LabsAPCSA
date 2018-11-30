import java.util.Random;
public class RandomSentenceGenerator
{
    final static int noWords = 5;
    final static int noSents = 20;
    final static String space = " ";

    static Random r = new Random();

    public static void main( String args[] ){
        String[] article = {"the", "a", "one", "some"};
        String[] nouns = { "meme", "moth", "skeleton", "psat", "harley davidson's perfume", 
            "one miserbale star", "liberals", "4chan" }; 
        String[] verbs = {"t-poses", "dabs", "yeets", "doots"};
        String[] adj = {"dank", "lit", "basic", "normie", "Russian" };
        String[] det = {"his", "her", "their", "our"};
        String[] adverb = {"literally", "dankily", "smoothly", "furiously"};
        String[] prep = {"doth", "yonder", "inside", "against", "on top"};

        String sentence;
        for (int i = 0; i < noSents; i++){
            sentence = article[rand()];
            char c = sentence.charAt(0);
            sentence = sentence.replace( c, Character.toUpperCase(c) );
            sentence += space + adj[rand()] + space;
            sentence += (nouns[rand()] + space + adverb[rand()]);
            sentence += (space + verbs[rand()] + space + prep[rand()]);
            sentence += (space + det[rand()] + space + adj[rand()]);
            sentence += (space + nouns[rand()]);
            System.out.println(sentence);
            sentence = "";
        }
    }

    static int rand(){
        int ri = r.nextInt() % noWords;
        if ( ri < 0 )
            ri += noWords;
        return ri;
    }
}
//I'm gonna type here so this updates and see if it works mk bai


    

