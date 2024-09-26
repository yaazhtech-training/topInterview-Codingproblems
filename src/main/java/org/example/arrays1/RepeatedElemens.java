package org.example.arrays1;

public class RepeatedElemens {
    void printrepeating(int arr[], int size){
        int count[]=new int [size];
        int i;
        {
            System.out.println("Repeating elements are ");
        }
        for(i=0;i<size;i++){
            if(count[arr[i]]==1) {
                System.out.print(arr[i] + " ");
            }
                else
                    count[arr[i]]++;
                }
            }




    public static void main(String[] args){
        RepeatedElemens repeat = new RepeatedElemens();
        int arr []={0,0,1,1,2,2,3,3,4,4,5};
        int arr_size=arr.length;
        repeat.printrepeating(arr,arr_size);

    }
}
