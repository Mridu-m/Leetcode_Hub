class Solution {
    public void duplicateZeros(int[] arr) {
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] == 0) {
        //         for(int j = arr.length - 1; j > i; j--) {
        //             arr[j] = arr[j - 1];
        //         }
        //         i++;
        //         // System.out.println(Arrays.toString(arr));
        //     }
        // }

        int[] temp = arr.clone();
        int i = 0, j = 0;
        while(i < arr.length && j < temp.length) {
            arr[i] = temp[j];
            if(temp[j] == 0 && i + 1 < arr.length) {
                arr[++i] = 0;
            }
            i++; j++;
        }

        System.gc();
    }
}