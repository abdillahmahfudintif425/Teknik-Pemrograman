interface Sortable {

    public abstract int compare(Sortable b);

    public static void shellSort(Sortable[] array) {
         int n = array.length;
        
        // Gap dimulai dari setengah panjang array, terus dikurangi
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = array[i];
                int j = i;
                
                // Geser elemen yang lebih besar dari temp
                while (j >= gap && array[j - gap].compare(temp) > 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
        }
    }
}