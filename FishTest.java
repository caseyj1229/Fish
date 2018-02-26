import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {
    @Test
    void solution() {
        //Example Provided
        int[] A1 = {4,3,2,1,5};
        int[] B1 = {0,1,0,0,0};
        assertEquals(2,Fish.solution(A1,B1));

        //All fish in same direction
        int[] A2 = {1,2,3,4,5};
        int[] B2 = {1,1,1,1,1};
        assertEquals(5,Fish.solution(A2,B2));

        //Simple input
        int[] A3 = {10,9,8,7,6,5,4,3,2,1};
        int[] B3 = {0,1,0,1,0,1,0,1,0,1};
        assertEquals(6,Fish.solution(A3,B3));

        //Edge Case: One Fish
        int[] A4 = {1};
        int[] B4 = {0};
        assertEquals(1,Fish.solution(A4,B4));


    }
}