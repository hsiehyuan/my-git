import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("輸入10筆資料：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sca.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        System.out.print("排序完成：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print("\n\n輸入欲搜尋的數字：");
        int searchNum = sca.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int mid = (end + start) / 2;
        boolean isFind = false;
        int searchNumIndex = 0;
        while(!isFind){
            if(searchNum > arr[mid]){
                start = mid + 1;
                mid = (end + start) / 2;
            }else{
                end = mid - 1;
                mid = (end + start) / 2;
            }

            if(searchNum == arr[mid]){
                isFind = true;
                searchNumIndex = mid;
            }
        }
        System.out.printf("數字 %d 位於 %d", searchNum, mid);
    }
}