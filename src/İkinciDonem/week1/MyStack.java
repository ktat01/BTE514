package İkinciDonem.week1;

import java.util.Arrays;

public class MyStack {

        private int size;
        private int[] array;
        private int top;

        public MyStack(int size) {
            this.size = size;
            array = new int[size];
            top=-1;
        }

        public boolean isFull(){
            return top==size-1;
        }

        public void clear(){
            top=-1;
        }

        public boolean isEmpty(){
            return top==-1;
        }

        public int pop() throws Exception{
            if(!isEmpty())
                return array[top--];
            else throw new Exception("Stack Empty!!");
        }

        public boolean push(int num){
            if(!isFull()){
                array[++top]=num;
                return true;
            }
            else return false;

        }

        public int peek() throws Exception{
            if(!isEmpty())
                return array[top];
            else throw new Exception("Stack Empty!!");
        }

        @Override
        public String toString() {
            return Arrays.toString(array)+"TOP: "+top;
        }


    }


