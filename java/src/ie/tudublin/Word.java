//DAVID UDOH

package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;
    // Constructor method that takes a String argument called word and initializes follows to an empty ArrayList of Follow objects
public Word(String word) {
    this.word = word;
    follows = new ArrayList<>();
}

// Getter method that returns the value of word
public String getWord() {
    return word;
}

// Getter method that returns the ArrayList of Follow objects
public ArrayList<Follow> getFollows() {
    return follows;
}

// Setter method that sets the value of word to the argument passed to it
public void SetWord(String word) {
    this.word = word;
}

// Method that takes a Follow object as an argument and adds it to the ArrayList of Follow objects
public void addFollow(Follow follow) {
    follows.add(follow);
}

// Method that takes a String argument called str and searches through the ArrayList of Follow objects for a Follow object whose word variable matches str. If one is found, it is returned, otherwise null is returned
public Follow findFollow(String str) {
    for (Follow follow : follows) {
        if (follow.getWord().equals(str)) {
            return follow;
        }
    }
    return null;
}

 
}