package collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EratosthenesTest {

    @Test
    void eratosthenes() {
        assertEquals(Set.of(), Eratosthenes.eratosthenes(1));
        assertEquals(Set.of(2, 3), Eratosthenes.eratosthenes(3));
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23), Eratosthenes.eratosthenes(26));

        long startTime1 = System.nanoTime();
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23,
                29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113,
                127, 131, 137, 139, 149, 151, 157, 163, 167,
                173, 179, 181, 191, 193, 197, 199, 211, 223,
                227, 229, 233, 239, 241, 251, 257, 263, 269,
                271, 277, 281, 283, 293, 307, 311, 313, 317,
                331, 337, 347, 349, 353, 359, 367, 373, 379,
                383, 389, 397, 401, 409, 419, 421, 431, 433,
                439, 443, 449, 457, 461, 463, 467, 479, 487,
                491, 499, 503, 509, 521, 523, 541), Eratosthenes.eratosthenes(542));
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        assertEquals(Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23,
                29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113,
                127, 131, 137, 139, 149, 151, 157, 163, 167,
                173, 179, 181, 191, 193, 197, 199, 211, 223,
                227, 229, 233, 239, 241, 251, 257, 263, 269,
                271, 277, 281, 283, 293, 307, 311, 313, 317,
                331, 337, 347, 349, 353, 359, 367, 373, 379,
                383, 389, 397, 401, 409, 419, 421, 431, 433,
                439, 443, 449, 457, 461, 463, 467, 479, 487,
                491, 499, 503, 509, 521, 523, 541), EratosthenesOPT.eratosthenes(542));
        long endTime2 = System.nanoTime();

        long duration1 = endTime1 - startTime1;
        long duration2 = endTime2 - startTime2;

        double difference = ((double)duration1 - duration2) / duration1 * 100;

        System.out.println("EratosthenesOPT is: " + difference + "% more efficient than Eratosthenes.");

    }
}