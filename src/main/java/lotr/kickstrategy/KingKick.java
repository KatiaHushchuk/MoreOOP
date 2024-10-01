package lotr.kickstrategy;

import java.util.Random;
import lotr.Character;

public class KingKick implements KickStrategy{
    private static final Random random = new Random();
    @Override
    public void kick(Character Kicker, Character assKicked) {
        assKicked.setHp(assKicked.getHp() - random.nextInt(Kicker.getPower()));
    }
    
}
