package individual_interface;

public class SortArray implements Array{
    int []x;

    SortArray(int[] x) {
        this.x = x;
    }
    
    public int[] getArray(){return x;}
    
    public void O(){
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for(int i = 0;i < x.length - 1;i++){
                if(x[i] > x[i+1]){
                    temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for(int i = 0;i<x.length;i++)
            System.out.print(x[i] + " ");
    }
    
    public void S(Array[] arr){
        int k = 0;
        for(Array x : arr){
            k += x.getArray().length;
        }
        int []x1 = new int[k];
        int i = 0;
        for(Array x : arr){
            for(int c : x.getArray()){
                x1[i++] = c;
            }
        }
        for(int x : x1){
            System.out.println(x);
        }
    }

    public void print(){
        System.out.print("Massiv: ");
        System.out.println();
        for(int i = 0;i<x.length;i++){
            System.out.print(x[i] + " ");
        }
    }
}
