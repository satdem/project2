public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */


    public static void main(String[] args) {
        int[][] array=new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int max=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                max=Math.max(array[i][j],max);

            }
        }
        System.out.println(max);






    }

}
