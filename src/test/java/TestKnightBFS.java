import org.junit.Test;
import static org.junit.Assert.*;

public class TestKnightBFS {

    @Test
    public void testKnightBFSCalculateShortestPath () {
        Point start = new Point(0,0);
        Point end = new Point(200,-100);

        KnightBFS knightBFS = new KnightBFS();

        assertEquals(100, knightBFS.calculateShortestPath(start, end));

    }


}
