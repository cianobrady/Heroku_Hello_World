package com.example;

public class ArrayOps 
{ 
    public ArrayOps() {  // Set the initial value for the class attribute x
    }
    
    public static Integer mostCommon(int[] sequence){
    	
    	if(sequence.length==0) {
    		return null;
    	}
        int[] max = {1,sequence[0]};
        for(int i=0; i<sequence.length-1; i++){
            int count = 1;
            for(int j=i+1; j<sequence.length; j++)
            {
                if(sequence[i]==sequence[j])
                {
                    count++;
                }
            }
            if(count>max[0])
            {
                max[0] = count;
                max[1] = sequence[i];
            }
        }
        return max[1];
    }

    public static int[] iterReverse(int[] sequence){
        int[] reverse = sequence;
        for(int i=0; i<reverse.length/2; i++){
           int temp = reverse[i];
           reverse[i] = reverse[reverse.length-1-i];
           reverse[reverse.length-1-i] = temp;
        }
        return reverse;
    }

    public static int[] recurReverse(int[] sequence, int x, int y){
        if (x >= y)
            return sequence;

        int temp = sequence[x];
        sequence[x] = sequence[y];
        sequence[y] = temp; 
        return recurReverse(sequence, x+1, y-1);
    }

    public static int[] reverse(int[] sequence){
        int[] reverse = recurReverse(sequence, 0, sequence.length-1);
        return reverse;
    }


    public static void main(String args[]) 
    { 
        int[] array = new int[] {48, 56, 83, 56, 22, 13};
        int value = mostCommon(array);
        System.out.println(value);
        int[] r = reverse(array);
        for(int i=0; (i)<r.length; i++){
           System.out.print(r[i]+ ", ");
        }
    } 
    
}