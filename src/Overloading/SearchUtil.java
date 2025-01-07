package Overloading;

public class SearchUtil {



    public int search(int a[], int ele) {
        return search(a, ele,0);

    }


    public int search(int a[], int ele, int pos) {

        for(int i = pos; i < a.length; i++) {

            if (a[i] == ele) {

                return i;

            }
        }

// Not found hence return -1.

        return -1;

    }

}

class Main {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 10, 30, 40};

        int ele = 30;

        SearchUtil obj = new SearchUtil();

        int x = obj.search(arr, ele);

// finds at 2

        int y = obj.search(arr, ele, 3);

// search from pos 3.

// finds at 4

        System.out.println(" x is " + x);

        System.out.println(" y is " + y);

    }
}

