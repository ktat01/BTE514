package FinalStudy;

public class FinalSturdy_2 {

 //kelime içindeki harfi bulup saydırma metodu
/*
    static int countChar(String word, char a){

        int count=0;

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==a){
                count++;
            }
        }
        return count;
    }*/


 //array metodu yaratma

    static void printArray(int[] arr){
        if(arr.length<0){
            return;
        }
        System.out.println("[]");

        for(int i=0; i<arr.length-1;i++){
            System.out.println(arr[i] + "," );
        }
        System.out.println(" " + arr[arr.length-1] + "]" );

    }







}
