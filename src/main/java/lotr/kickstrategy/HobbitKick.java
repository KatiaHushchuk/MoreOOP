package lotr.kickstrategy;

import lotr.Character;

public class HobbitKick implements KickStrategy{
    @Override
    public void kick(Character Kicker, Character assKicked) {
        System.out.println("crying");
    }
}
