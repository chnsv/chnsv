package kr_djenerics;

class Matrix<T extends Comparable<T>>{
    T[][]a;
    Matrix(T[][]a){
        this.a = a.clone();
    }
    void print(){
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    T elemByInd(int i, int j) throws ArrayIndexOutOfBoundsException{
        if(i<0 || i>=a.length)
            if(j<0 || j>=a.length)
            throw new ArrayIndexOutOfBoundsException("Vihod za granitsi indexa");
        return a[i][j];
    }
    
    /*T[] maxEl(){
       
        T[] maxElem = (T[]) new Comparable[a[0].length];
        for(int j=0;j<a[0].length;j++){
            T max = a[0][j];
            for(int i =0;i<a.length;i++){
                if(a[i][j].compareTo(max)>0){
                    max = a[i][j];
                }
            }
            maxElem[j]=max;
        }
        return maxElem;
    }*/
    
    void maxEl(){
        int maxInd = 0;
        T maxEl = a[0][0];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                if(a[i][j].compareTo(maxEl)>0){
                    maxEl = a[i][j];
                    maxInd = i;
                }
            }
        }
        for(int j = 0;j<a[0].length;j++){
            System.out.print(a[maxInd][j]+ " ");
        }
    }
    
    void obr(){
        for(int i=0;i<a.length/2;i++){
            T[] t=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=t;
            
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}