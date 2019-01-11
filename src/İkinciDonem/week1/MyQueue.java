package İkinciDonem.week1;

import java.util.Arrays;


public class MyQueue {

    /**
     *
     * @author ovatman
     */
         private int size;
        private int[] array;
        private int back;
        private int front;
        private int numOfElem;

        public MyQueue(int size) {
            this.size = size;
            array = new int[size];
            back = -1;
            front = 0;
            numOfElem=0;
        }

        public boolean isEmpty(){
            return numOfElem==0;
        }

        public boolean isFull(){
            return numOfElem==size;
        }

        public int deque() throws Exception{
            if(!isEmpty()){
                numOfElem--;
                int ret = array[front];
                //if(front+1==size)
                //    front=0;
                //else front++;
                front=(front+1)%size;
                return ret;
            }
            else throw new Exception("Queue empty");
        }

        public boolean enque(int num){
            if(!isFull()){
                numOfElem++;
                //if(back+1==size)
                //    back=0;
                //else back++;
                back = (back+1)%size;
                array[back]=num;
                return true;
            }
            else return false;
        }

        public void clear(){
            back = -1;
            front = 0;
        }

        @Override
        public String toString() {
            return Arrays.toString(array) + " F:" + front + ", B:" + back;
        }


    }

