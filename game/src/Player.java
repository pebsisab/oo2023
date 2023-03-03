public class Player {
    int XCoordinate; //Math.random()*8+1; //taisarvuline nr
    int YCoordinate;
    char Symbol;
    Direction direction; // 3nda tunni teema (enum?)
    //Ese: xCoordinate, yCoordinate, tugevustest, kasutuskordadest, nimest - mingi komplekt
    Item item; // klassikomplekt Player klassis sees on item klass

    // constrctor - funkt mis kaivitatake koheselt
    public Player(int worldWidth, int worldHeight) {
        this.XCoordinate = getRandomCoordinate(worldWidth);
        this.YCoordinate = getRandomCoordinate(worldHeight);
        this.Symbol = 'X';
        this.direction = Direction.UP;
    }

    private static int getRandomCoordinate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) +1);
    }

    // publik tahendab, et moni teine klass saab ka seda funkt valja kutsuda
    // private puhul saab ainult selles klassis funkt kasutada
    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        } else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        } else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.YCoordinate > 1) {
            this.YCoordinate = this.YCoordinate - 1;
        } else if (direction.equals(Direction.DOWN) && this.YCoordinate < world.height - 1) {
            this.YCoordinate = this.YCoordinate + 1;
        } else if (direction.equals(Direction.LEFT) && this.XCoordinate > 1) {
            this.XCoordinate = this.XCoordinate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.XCoordinate < world.height - 1) {
            this.XCoordinate = this.XCoordinate + 1;
        }
    }
}
