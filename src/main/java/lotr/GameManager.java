package lotr;

public class GameManager {
    private boolean turn = true;

    public void fight(Character c1, Character c2){
        System.out.println(c1.getClass().getSimpleName() + " is fighting with " +
        c2.getClass().getSimpleName() + " until the last drop of blood.");
        while (c1.isAlive() && c2.isAlive()) {
            if (turn) {
                int before = c2.getHp();
                c1.kick(c2);
                int after = c2.getHp();
                System.out.println(c2.getClass().getSimpleName() + 
                " lost " + (after-before) + "points of health");
            } else {
                int before = c1.getHp();
                c2.kick(c1);
                int after = c1.getHp();
                System.out.println(c1.getClass().getSimpleName() + 
                " lost " + (after-before) + "points of health");
            }
            turn = !turn;
        }
        if (c1.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + 
            " wins the battle (but Oles won in life)");
        } else {
        System.out.println(c1.getClass().getSimpleName() + " wins the battle (...)");
        }
    }
}
