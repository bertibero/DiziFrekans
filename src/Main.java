import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] list = {2, 7, 58, 9, 2, 2, 6, 7, 7, 7, 7, 58, 9, 7, 2, 2, 5};
        int[] slist = new int[list.length];

        for (int i = 0; i < list.length; i++){
            if(isFind(slist,list[i])){
                int tekrar = 0;
                for (int j = 0; j < list.length; j++){
                    if(list[i] == list[j]){
                        tekrar++;
                    }
                }
                slist[i] = list[i];
                System.out.println(list[i] + " sayısı " + tekrar + " kere tekrar edildi.");
            }
        }
    }
}