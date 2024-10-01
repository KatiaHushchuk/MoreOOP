package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy{
    @Override
    public void kick(Character Kicker, Character assKicked) {
        if (Kicker.getPower() > assKicked.getPower()){
            assKicked.setHp(0);
        } else {
            assKicked.setPower(assKicked.getPower() - 1);;
        }
    }
    
}
