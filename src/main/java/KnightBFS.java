import java.util.*;

public class KnightBFS {

    Queue<Point> queue = new LinkedList<Point>();
    Set<Point> visited = new HashSet<Point>();
    ArrayList<Direction> directions = new ArrayList<Direction>();


    public int calculateShortestPath(Point start, Point end) {

        queue.add(start);
        visited.add(start);
        storeKnightMoves();

        while (true) {
            Point point = queue.peek();
            if (point.equals(end))
                return point.move;
            int moves = point.move;
            int r = point.r;
            int c = point.c;
            for (Direction direction : directions) {
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

    private void storeKnightMoves() {

        directions.add(Direction.LEFTFDOWN);
        directions.add(Direction.LEFTLEFTD);
        directions.add(Direction.RIGHTDOWN);
        directions.add(Direction.RIGHTRIGHTU);
        directions.add(Direction.RIGHTUP);
        directions.add(Direction.RIGHTRIGHTD);
        directions.add(Direction.LEFTUP);
        directions.add(Direction.LEFTLEFTU);

    }


}
