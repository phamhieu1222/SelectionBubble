public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] a) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            double currentMin = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    minIndex = j;

                }
            }if(minIndex!=1){
             list[minIndex] = list[i];
             list[i] = currentMin;


            }
        }
    }
public static void main(String[] args){
        selectionSort(list);
        for (int i = 0; i < list.length - 1; i++) {
            System.out.println(list[i]);

        }
}

}
