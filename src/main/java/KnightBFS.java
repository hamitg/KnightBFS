import java.util.*;

public class KnightBFS {

    Queue<Point> queue = new LinkedList<Point>();
    Set<Point> visited = new HashSet<Point>();


    public int calculateShortestPath(Point start, Point end) {

        queue.add(start);
        visited.add(start);

        while (true) {
            Point point = queue.peek();
            if (point.equals(end))
                return point.move;
            int moves = point.move;
            int r = point.r;
            int c = point.c;
            for (Direction direction : Direction.values()) {
                Point currentPoint = new Point(r,c);
                currentPoint.makeKnightMove(direction);
                if (visited.contains(currentPoint))
                    continue;
                currentPoint.move = moves + 1;
                queue.add(currentPoint);
                visited.add(currentPoint);
            }
            queue.remove();

        }



    }

}
