public class MaxElement {
    public static void main(String args[]){
        int [] A={7,3,5,2,1};
        int tallest=A[0];
        for(int i=1; i<A.length; i++){
            if(A[i]>tallest)
                tallest=A[i];
        }
    System.out.println(tallest);
}
}
