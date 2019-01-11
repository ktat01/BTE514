package İkinciDonem.week1;

import java.util.Arrays;

public class PositiveArray {

        private int size;
        private int[] array;

        public PositiveArray(int size) {
            this.size = size;
            array = new int[size];
            for(int i=0;i<size;i++)
                array[i]=-1;
        }

        public void add(int num){
            for(int i=0;i<array.length;i++){
                if(array[i]==-1){
                    array[i]=num;
                    break;
                }
            }


        }

        public void add(int num, int indice){
            array[indice] = num;
        }

        public int search(int num){
            for(int i=0;i<array.length;i++)
                if(array[i]==num)
                    return i;
            return -1;

        }

        public void removeFirst(int num){
            for(int i=0;i<array.length;i++){
                if(array[i]==num){
                    array[i]=-1;
                    break;
                }
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(array);
        }






    }
