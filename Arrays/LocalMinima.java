class LocalMinima{
    public static int findLocalMinima(String[] args) {
        int[] array = {9, 6, 3, 5, 7, 2, 8, 1, 4};
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(array[mid]<array[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    } 

    public static void main(String[] args) {
        int localMinIndex = findLocalMinima(args);
        System.out.println("Index of a local minima: " + localMinIndex);
    }
}
