/**
 *
 * @author DIVYESH
 */
public class BubbleSort {
    
    static int [] bubbleSort(int [] list){
        int temp;
        for(int i = 0; i<list.length; i++){
            for(int j = i+1; j<list.length; j++){
                if(list[i] > list[j]){
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        
        int list[] = {13,85,21,677,342,8,5679,0,-234,7566};
        int sortedList[];
        sortedList = bubbleSort(list);
        for(int x : sortedList) System.out.print(" " + x);
        System.out.println();
        System.out.println("Maximum number is : " + sortedList[(sortedList.length)-1]);
        
    }
    
}
