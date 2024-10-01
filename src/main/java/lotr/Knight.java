package lotr;

import lotr.kickstrategy.KingKick;

public class Knight extends Character{
    public Knight() {
        super(generateRandom(2, 12), generateRandom(2, 12), new KingKick());
    }
}
