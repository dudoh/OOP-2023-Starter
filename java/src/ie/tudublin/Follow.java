package ie.tudublin;


public class Follow {
    private String word;
    private int count;

    // Constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    // Accessor methods
    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    // Mutator methods
    public void setWord(String word) {
        this.word = word;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // toString() method
    public String toString() {
        return "Follow{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
