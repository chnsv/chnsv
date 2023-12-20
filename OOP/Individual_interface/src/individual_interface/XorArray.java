package individual_interface;

public class XorArray implements Array{
    int []x;

    XorArray(int[] x) {
        this.x = x;
    }
    
    public int[] getArray(){return x;}
    
    public void O()
    {
        for(int i = 0;i<x.length;i++){
            int elem = x[i];
            double elem_sqrt = Math.sqrt(elem);
            System.out.println(x[i] + " = " + elem_sqrt);
        }
    }

    public void S(Array[] n){
        boolean[] all = {false, true};
        for(boolean x : all){
            for(boolean mas : all){
                boolean c = x ^ mas;
                System.out.println(x + " ^ " + mas + " = " + c);
            }
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
