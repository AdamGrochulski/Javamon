package javamonCore;

public class Javamon {
    //Private
    private static final int MIN_LEVEL = 1;
    private static final int MAX_LEVEL = 100;
    private String nickname;
    private String species;
    private int level;

    //Creates a new Javamon with a nickname or without it
    public Javamon(String nickname, String species, int level){
        this.nickname = nickname;
        this.species = species;
        if(level >= MIN_LEVEL && level <= MAX_LEVEL){
            this.level = level;
        }
        else{
            this.level = 5; //Feature For Now - Javamon's level is set to 5, if it isn't in range of [0;100]
        }

    }
    public Javamon(String species, int level){
        this.species = species;
        if(level >= MIN_LEVEL && level <= MAX_LEVEL){
            this.level = level;
        }
        else{
            this.level = 5; //Feature For Now - Javamon's level is set to 5, if it isn't in range of [0;100]
        }
    }

}
