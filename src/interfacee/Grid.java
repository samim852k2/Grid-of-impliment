package interfacee;

import java.util.ArrayList;

public class Grid {


        private String [][] grid;


        Grid(int numRows, int numColumns){

            grid = new String[numRows][numRows];

        }

        public  void add(int Rows, int Columns,String description){

            grid[Rows][Columns] =description;
        }

        public  String getDescription(int Row, int Columns){
            return grid[Row][Columns];
        }

        public ArrayList<Location> getDescriptions(){
            ArrayList<Location> DescriptionLocation = new ArrayList<>();

            for (int Row=0;Row<grid.length ; Row++){
                for (int Column=0;Column<grid[Row].length ;Column++){
                    if(grid[Row][Column] !=null){
                        DescriptionLocation.add(new Location(Row,Column));

                    }

                }
            }
            return DescriptionLocation;
        }

        public class Location{
            private int Row ;
            private  int Column;

            public Location(int Row,int Column){
                this.Row = Row;
                this.Column =Column;


            }

            public int getRow() {
                return Row;
            }

            public int getColumn() {
                return Column;
            }

            @Override
            public String toString() {
                return "Location{" +
                        "Row=" + Row +
                        ", Column=" + Column +
                        '}';
            }
        }


}
