package at.campus02.iwi.battleships;

public class BattleShipMap {

    public int[][] map = {
            {0, 0, 0, 2, 0, 1, 1, 0, 0, 0 },
            {0, 3, -1, 2, 0, 0, 0, 2, 0, 0 },
            {0, 3, -1, 0, 4, 4, 0, 0, 2, 2 },
            {0, 0, 2, 0, 0, 0, 0, 0, 0, 0 },
            {-1, 0, 2, 0, -1, 2, 2, 0, 0, 0 },
            {-3, 1, 0, 0, -3, 0, -1, 0, 0, 3 },
            {0, 0, 0, -3, 0, 0, 0, -1, 0, 3 },
            {0, 0, -2, 0, -2, 0, -2, 0, 0, 0 },

    };

    public void print() {
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    System.out.format(" 0\t");
                } else {
                    System.out.format("%+d\t", map[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int totalBattleShipStrength(char player){
        /* player == 'A' > postive Numbers */
        /* player == 'B' > negative Numbers */
        int summe = 0;

        for(int z = 0; z < map.length; ++z) {
            for (int s = 0; s < map[z].length; ++s)
            {
               if(map[z][s] > 0 && player == 'A'){
                 summe = summe + map[z][s];
            }
            else if (map[z][s] < 0 && player == 'B'){
                summe = summe - map[z][s];
            }
        }
    }
        return summe;
    }
    public int totalCountBattleShips(){
        int anzahl = 0;
        for (int z = 0; z < map.length; ++z) {
            for (int s = 0; s < map[z].length; ++s) {
                if(map[z][s] != 0){
                    anzahl = anzahl +1;
                }
            }

        }

        return anzahl;
    }
    // returns a one-dim-array with count in every line
    public int[] countOfShipsPerLine() {
        int[]erg = new int[map.length];

            for(int z = 0; z < map.length; ++z){
                int anzhal = 0;
                for(int s = 0; s < map[z].length; ++s){
                    if(map[z][s] != 0){
                         anzhal = anzhal + 1;
                }
            }
                erg[z] = anzhal;
        }

        return erg;
    }

    // returns the average ship strength of player A ships (positive numbers)
    public double averageShipStrengthPlayerA(){
        int summe = 0;
        int anzahl = 0;

        for (int z = 0; z < map.length; ++z) {
            for (int s = 0; s < map[z].length; ++s) {
                if (map[z][s] > 0) {
                    summe = summe + map[z][s];
                    anzahl += 1;
                }
            }
        }
        return summe / (double)anzahl;
    }
}
