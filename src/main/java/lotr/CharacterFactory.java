package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.Random;

import org.reflections.Reflections;

public class CharacterFactory {
    private Reflections reflections = new Reflections("lotr");
    private final static Random random = new Random();

    public Character creatCharacter() throws InstantiationException, IllegalAccessException,
    IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        int ind = random.nextInt(subTypes.size());
        int i = 0;
        for (Class<? extends Character> el : subTypes) {
            if (i == ind) {
                return el.getDeclaredConstructor().newInstance();
            }
            i++;
        }
        return null;
    }
}