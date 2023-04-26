import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    // Constructor
    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<>();
    }

    // Accessor methods
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    // toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Word{word='").append(word).append("', follows=[");
        for (int i = 0; i < follows.size(); i++) {
            sb.append(follows.get(i).toString());
            if (i < follows.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
