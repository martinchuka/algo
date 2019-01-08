package electrosoft.tech.lib;
public class QuickSortDiffImpl {
    public static void main (String args[]){
        int[] n={20,35,-15,7,1,-22,2,99,4,1,88,44,11,12,15};
        quickSort(n,0,n.length);
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
        }
    }


    public static void quickSort(int[] n,int pivot,int end){
        if((end-(pivot+1))<1){//base case
            return;
        }
        int j=pivot+1;
        for(int i=(pivot+1); i<end; i++){
            if(n[i]<n[pivot]){
                swap(n,j,i);
                j++;
            }
        }
        swap(n,pivot,(j-1));
        quickSort(n,pivot,j);
        quickSort(n,j,end);


    }


    public static void swap(int[] input,int i,int j){
        int pi=input[i];
        input[i]=input[j];
        input[j]=pi;
    }

}
