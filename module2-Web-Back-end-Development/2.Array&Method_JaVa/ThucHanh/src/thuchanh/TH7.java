package thuchanh;

import java.util.Scanner;

public class TH7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] map = {
                {"*", ".", "*", ".", "."},
                {".", "*", ".", ".", "."}
        };
        final int Map_Width = map[0].length;
        final  int Map_Height = map.length;


        String[][] mapReport = new String[Map_Height][Map_Width];
        for (int yOrdinate = 0; yOrdinate < Map_Height; yOrdinate++){
            for (int xOrdinate = 0; xOrdinate < Map_Width; xOrdinate++){
                String curentCell = map[yOrdinate][xOrdinate];

                if (curentCell.equals("*"))
                    mapReport[yOrdinate][xOrdinate] = "*";
                else{
                    final int[][] NeighBours_Ordinate = {
                            {yOrdinate -1, xOrdinate -1},{yOrdinate-1, xOrdinate+1},
                            {yOrdinate -1, xOrdinate + 1},{yOrdinate, xOrdinate -1},
                            {yOrdinate,xOrdinate + 1},{yOrdinate + 1, xOrdinate - 1},
                            {yOrdinate + 1, xOrdinate}, {yOrdinate + 1, xOrdinate + 1}
                    };
                    int minesAround = 0;
                    for (int i = 0; i < NeighBours_Ordinate.length; i++) {
                        int[] neighbourOrdinate = NeighBours_Ordinate[i];
                        int xOrdinateOfNeighbour = neighbourOrdinate[1];
                        int yOrdinateOfNeighbour = neighbourOrdinate[0];

                        boolean isOutMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == Map_Width
                                || yOrdinateOfNeighbour < 0 || yOrdinateOfNeighbour == Map_Height;
                        if (isOutMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                        if (isMineOwnerNeighbour) minesAround++;

                    }
                    mapReport[yOrdinate][xOrdinate] = String.valueOf(minesAround);
                }
            }
        }
        for (int yOrdinate = 0; yOrdinate < Map_Height; yOrdinate++) {
            for (int xOrdinate = 0; xOrdinate < Map_Width; xOrdinate++) {
                String curentCellReport = mapReport[yOrdinate][xOrdinate];
                System.out.println(curentCellReport);
            }
        }
    }
}
