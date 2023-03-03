public class Item {
    int XCoordinate;
    int YCoordinate;
    int strength;
    int durability;
    String name;

    //constructor - parem klops- generate - constructor - ctrl peal hoides koik valida

    public Item(int strength, int durability, String name, int worldWidth, int worldHeight) {
        this.XCoordinate = getRandomCoordinate(worldWidth);
        this.YCoordinate = getRandomCoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }

    private static int getRandomCoordinate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) +1);
    }
}
