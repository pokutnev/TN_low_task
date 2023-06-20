class EditingArray {

    public int[] deleteSameElements(int[] arr){

        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[arrLength - 1];
                    arrLength--;
                    j--;
                }
            }
        }

        int[] resArr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            resArr[i] = arr[i];
        }

        return resArr;
    }

}