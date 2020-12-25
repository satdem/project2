import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates {
    private int anInt;

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array

       duplicated(tekrarlanan) öğeleri array den kaldır

        non-duplicated(tekrarlanmayan) öğeleri print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       result  [1,2,3,4,5] olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

      // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
      //   useThisLine arrayini kullan
      /*  Arrays.sort(useThisArray);
        int sayac=1;
        for(int i=0;i<useThisArray.length-1;i++){
            if(useThisArray[i]!=useThisArray[i+1])
                sayac++;
        }
        int[] array=new int[sayac];
        for(int i=0,j=0;i<useThisArray.length-1;i++) {
            if(useThisArray[i]==useThisArray[i+1]) {
            }

           else if(useThisArray[i]!=useThisArray[i+1]){
            array[j]=useThisArray[i];
            j++;
           }
           array[sayac-1]=useThisArray[useThisArray.length-1];
        }
        System.out.println(Arrays.toString(array));*/


        Arrays.sort(useThisArray);

        // kıyaslama maksadı ile geçici bir değişken oluştururuz
        int tempVal = Integer.MIN_VALUE;

        // değerleri atacağımız verilen array ile aynı boyutta bir array oluşturuyoruz.
        // yeni oluşacak array hiç bir zaman öncekinden büyük olmayacaktır zaten
        int[] newArray = new int[useThisArray.length];

        // index değeri vermek için i adlı bir değişken oluşturuyoruz.
        int i=0;

        for(int n : useThisArray) {         // array elemanlarını for ile geziyoruz
            if (tempVal != n) {             // eğer n ismi verilen array elemanı tempVal'den farklı ise
                newArray[i++] = n;          // array de yok demektir ve yeni array'e eklenir
                tempVal = n;                // n newArray içinde ise array'e eklenmesin diye
            }                               // n tempval'e atanır, soraki elemanla karşılaştırmada kullanmak için
        }

        // array Arrays.toString(newArray) ile liste halinde ekrana yazdırılır
        System.out.println(Arrays.toString(newArray));


    }


}