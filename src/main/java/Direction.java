public enum Direction {
    LEFTLEFTU(-2, 1),
    LEFTUP(-1, 2),
    RIGHTUP(1, 2),
    RIGHTRIGHTU(2, 1),
    RIGHTRIGHTD(2,-1),
    RIGHTDOWN(1, -2),
    LEFTFDOWN(-1, -2),
    LEFTLEFTD(-2, -1);

    public int dr;
    public int dc;


    private Direction(int dr, int dc) {
        this.dr = dr;
        this.dc = dc;
    }
}

