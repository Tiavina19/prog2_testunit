import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestDI {
    public static boolean HelpX (String input){
        int xIndex = input.indexOf('X'); // soit X la personne
        int aIndex = input.indexOf('A'); // soit A l'animal



        // Si l'animal (A) est à la même position que la personne (X), retourne false
        if (xIndex == aIndex) {
            return false;
        }

        // Si il n'y a pas de cachette, retourne false, soit C la cachette
        if (input.indexOf('C') == -1) {
            return false;
        }



        // Si l'animal (A) est devant la personne (X), retourne false
        if (xIndex > aIndex) {
            return false;
        }

        // Si l'animal (A) est derrière la personne (X), on retourne true
        return true;
    }

// Test
    @Test
    public void testCannotHide() {
        assertFalse(HelpX("X...C..A"));
        assertFalse(HelpX("X....A.C.....C.C"));
        System.out.println("Attraper");
    }
    @Test
    public void testCanHide() {
        assertTrue(HelpX("X..C....A.."));
        System.out.println("Cacher");
    }

    private void assertFalse(boolean b) {
    }
}

