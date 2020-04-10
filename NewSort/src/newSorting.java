import java.util.Arrays;

public class newSorting {
    public static void newSort(int[] A, int size){
        if(A.length <= size) {
            quickSort(A,0,A.length-1);
        }
        else{
            int mid = (A.length/2);
            int[] leftHalf = Arrays.copyOfRange(A, 0, A.length - mid);
            int[] rightHalf;
            if(A.length % 2 == 0){
                rightHalf = Arrays.copyOfRange(A, mid, A.length);//copyOfRange from stackoverflow.com
            }
            else{
                rightHalf = Arrays.copyOfRange(A, mid + 1, A.length);
            }

            newSort(leftHalf, size);
            newSort(rightHalf, size);
            mergeHalves(A, leftHalf, rightHalf);
        }
    }
    private static void mergeHalves(int[] A, int[] leftHalf, int[] rightHalf) {
        int leftHP = 0;//left half pointer
        int rightHP = 0;//right half pointer
        int mergeP = 0;//new array pointer
        while (leftHP < leftHalf.length || rightHP < rightHalf.length) {//checks that index won't be out of bounds        if(leftHalf[leftHP] == )
            if (leftHP >= leftHalf.length) {//Keep left pointer in bounds
                A[mergeP] = rightHalf[rightHP];
                rightHP++;
            }else if (rightHP >= rightHalf.length) {
                A[mergeP] = leftHalf[leftHP];
                leftHP++;
            }  else if (leftHalf[leftHP] < rightHalf[rightHP]) {
                A[mergeP] = leftHalf[leftHP];
                leftHP++;

            } else {
                A[mergeP] = rightHalf[rightHP];
                rightHP++;
            }
            mergeP++;
        }
    }
    private static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int pivotIndex = partArray(A,left,right);//find index of pivot
            quickSort(A, left, pivotIndex - 1);//sort left side
            quickSort(A, pivotIndex + 1, right);//sort right side
        }
    }

    private static void printArray(int[] arr){//Print array for visualization and tracing
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    private static int partArray(int[] A, int left, int right) {//helper method to partition array
        int pivot = A[left];//set pivot value
        int i = left;//pointer 1
        int j = left + 1;//pointer 2
        //partition
        while(j <= right){
            //if more element is less than pivot
            if(A[j] < pivot){//if more side is less than pivot
                i++;
                //swap i and j
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            j++;
        }
        //swap pivot at given index
        int temp = A[i];
        A[i] = A[left];
        A[left] = temp;
        return i;//index of pivot
    }
}

