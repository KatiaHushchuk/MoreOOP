package lotr;

import lotr.kickstrategy.KingKick;

public class King extends Character {
    public King() {
        super(generateRandom(5, 15), generateRandom(5, 15), new KingKick());
    }
    
}
