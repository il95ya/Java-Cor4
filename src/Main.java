import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        for(int k=0; k<10;k++){
            System.out.print(k+" ");
        }
        System.out.println();

        for(int k=0; k<10;k+=2){
            System.out.print(k+" ");
        }
        System.out.println();

        for(int k=9; k>=0;k--){
            System.out.print(k+" ");
        }
        System.out.println();

        for(int k=9; k>=0;k-=2){
            System.out.print(k+" ");
        }
        System.out.println();

        int[]arr={0, 10, 20, 30,40, 50, 60, 70, 80, 90};

        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        for(int k=0; k<arr.length;k+=2){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                System.out.print("i="+i+" "+"j="+j+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[]arr2={0, 10, 20, 30,40};
        for(int i=0; i<arr2.length;i++){
            for(int j=0; j<=i;j++){
                System.out.print(arr2[j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=arr2.length-1; i>=0;i--){
            for(int j=0; j<=i;j++){
                System.out.print(arr2[j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[]arr3={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(arr3)+"-> ");
        for(int k=0; k<arr3.length-1;k++){
            int tmp=arr3[k];
            arr3[k]=arr3[k+1];
            arr3[k+1]=tmp;
        }
        System.out.print(Arrays.toString(arr3));
        System.out.println();

        int[]arr4={0, 10, 20, 3, 4, 5, 600, 700, 8, 9};
        System.out.print(Arrays.toString(arr4)+"-> ");
        for(int k=0; k<arr4.length-1;k++){
            if(arr4[k]>arr4[k+1]) {
                int tmp = arr4[k];
                arr4[k] = arr4[k + 1];
                arr4[k + 1] = tmp;
            }
        }
        System.out.print(Arrays.toString(arr4)+);
        System.out.println();

        //bubble sort
        System.out.print(Arrays.toString(arr4)+"-> ");
        for(int barrier=arr4.length-1; barrier>=0;barrier--){
            for(int index=0; index<barrier; index++){
                if (arr4[index] > arr4[index+1]) {
                    int tmp = arr4[index];
                    arr4[index] = arr4[index + 1];
                    arr4[index  + 1] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(arr4));
        System.out.println();

        //сделать
        System.out.print(Arrays.toString(arr4)+"-> ");
        for(int barrier=arr4.length-1; barrier>=0;barrier--){
            for(int index=0; index<barrier; index++){
                if (arr4[index] < arr4[index+1]) {
                    int tmp = arr4[index];
                    arr4[index] = arr4[index + 1];
                    arr4[index  + 1] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(arr4));
        System.out.println();
    }
}
