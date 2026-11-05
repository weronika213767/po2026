package agh.po.lab3;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    private final MapExercises exercises = new MapExercises();

    @Test
    void shouldAddKeyABWhenBothKeysPresent() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        exercises.mapAB(map);

        assertEquals("HiThere", map.get("ab"));
        assertEquals("Hi", map.get("a"));
        assertEquals("There", map.get("b"));
    }

    @Test
    void shouldNotModifyWhenOnlyA() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");

        exercises.mapAB(map);

        assertNull(map.get("ab"));
        assertEquals("Hi", map.get("a"));
    }

    @Test
    void shouldNotModifyWhenOnlyB() {
        Map<String, String> map = new HashMap<>();
        map.put("b", "There");

        exercises.mapAB(map);

        assertNull(map.get("ab"));
        assertEquals("There", map.get("b"));
    }
}