package agh.po.lab3;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    private final Map exercises = new Map();

    // --- Testy dla mapAB ---

    @Test
    void shouldCombineAAndBWhenBothPresent() {
        java.util.Map<String, String> input = new HashMap<>();
        input.put("a", "Hi");
        input.put("b", "There");

        java.util.Map<String, String> result = exercises.mapAB(input);

        assertEquals("HiThere", result.get("ab"));
        assertEquals("Hi", result.get("a"));
        assertEquals("There", result.get("b"));
        assertEquals(3, result.size());
    }

    @Test
    void shouldNotModifyMapWhenOnlyKeyAIsPresent() {
        java.util.Map<String, String> input = new HashMap<>();
        input.put("a", "Hi");

        java.util.Map<String, String> result = exercises.mapAB(input);

        assertNull(result.get("ab"));
        assertEquals("Hi", result.get("a"));
        assertEquals(1, result.size());
    }

    @Test
    void shouldNotModifyMapWhenOnlyKeyBIsPresent() {
        java.util.Map<String, String> input = new HashMap<>();
        input.put("b", "There");

        java.util.Map<String, String> result = exercises.mapAB(input);

        assertNull(result.get("ab"));
        assertEquals("There", result.get("b"));
        assertEquals(1, result.size());
    }

    // --- Testy dla wordLen ---

    @Test
    void shouldReturnWordLengthsAndIgnoreDuplicates() {
        String[] words = {"this", "and", "that", "and"};

        java.util.Map<String, Integer> result = exercises.wordLen(words);

        assertEquals(3, result.size());
        assertEquals(4, result.get("this"));
        assertEquals(3, result.get("and"));
        assertEquals(4, result.get("that"));
    }

    @Test
    void shouldHandleRepetitionsAndLengthsCorrectly() {
        String[] words = {"code", "code", "code", "bug"};

        java.util.Map<String, Integer> result = exercises.wordLen(words);

        assertEquals(2, result.size());
        assertEquals(4, result.get("code"));
        assertEquals(3, result.get("bug"));
    }

    @Test
    void shouldReturnEmptyMapForEmptyArray() {
        String[] words = {};

        java.util.Map<String, Integer> result = exercises.wordLen(words);

        assertTrue(result.isEmpty());
    }
}