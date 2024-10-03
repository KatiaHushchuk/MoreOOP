package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstrategy.KickStrategy;
import java.util.Random;

@Getter @Setter @AllArgsConstructor
public class Character {
    
    private static final Random random = new Random();
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character c){
        kickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public static int generateRandom(int min, int max){
        return min + random.nextInt(max - min);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

}
