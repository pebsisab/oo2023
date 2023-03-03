import java.util.List;

public class World {
    int width;
    int height;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }
    public static void printMap(int worldWidth, int worldHeight, int playerXCoordinate, int playerYCoordinate, char playerSymbol, int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol, int orcXCoordinate, int orcYCoordinate, char orcSymbol, List<Item> items) {
        char symbol = ' '; // luuakse uus muutuja (deklareerimine), esmakordne v]a]artuse andmine on initsialiseermine
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                //symbol = ' ';
                if (y == 0 || y == worldHeight - 1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth - 1) {
                    symbol = '|';
                } else {
                    for (Item i: items) {
                        if (i.YCoordinate == y && i.XCoordinate == x) {
                            symbol = 'I';
                            break;
                        }
                    }
                    //char result;
                    if (playerXCoordinate == x && playerYCoordinate == y) {
                        symbol = playerSymbol;
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y) {
                        symbol = dragonSymbol;
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
                        symbol = orcSymbol;
                    }
                    //symbol = result; // siit tehti ctrl alt n  (inline method)

                }
                System.out.print(symbol);
                symbol = ' ';
            }
        }
    }

}
