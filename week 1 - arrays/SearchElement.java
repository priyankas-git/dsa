public class SearchElement{
    public static String solve(int N, int X, int[] A){
        for(int i=0; i<A.length; i++){
            if(A[i]==X){
                return "Yes";
            }
        } return "No";
    }
    public static void main(String [] args){
        int N=5; int X=3;
        int[] A={7,3,5,2,1};
        String ans=solve(N, X, A);
        System.out.println(ans);
    }
}
