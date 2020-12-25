public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın
  int d = 0,g=0;
  int toplam1=0;
  int toplam2=0;
        String[][] array=new String[][] {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        int[][] a=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){


                if(array[i][j].contains("$")){
                    array[i][j]=array[i][j].replaceAll("[^0-9]","");
                    a[i][j]=Integer.parseInt(array[i][j]);
                    d=(int)(a[i][j]*3.2);
                    toplam1+=d;

                }


               else if(array[i][j].contains("€")){
                    array[i][j]=array[i][j].replaceAll("[^0-9]","");
                    a[i][j]=Integer.parseInt(array[i][j]);
                    g=(int)(a[i][j]*4.2);
                    toplam2+=g;

                }


            }


        }System.out.println(toplam1+toplam2);



    }
}



