public class Orc {

    int XCoordinate; //taisarvuline nr
    int YCoordinate;
    char Symbol;

    // constrctor - funkt mis kaivitatake koheselt
    public Orc(int worldWidth, int worldHeight) {
        this.XCoordinate = getRandomCoordinate(worldWidth);
        this.YCoordinate = getRandomCoordinate(worldHeight);
        this.Symbol = 'O';
    }

    // getrandomcoordinate funkt
    private static int getRandomCoordinate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) +1);
    }
}
