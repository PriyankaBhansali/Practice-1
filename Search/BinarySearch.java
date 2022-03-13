//time complexity = O(logn)
//space complexity= O(n)

class BinarySearch {
  // Returns index of x if it is present in arr[l.. r], else return -1
  int binarySearch(int arr[], int low, int high, int x) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == x) {
        return mid;
      } else if (arr[mid] > x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}

public class Solution {
  public static void main(String args[]) {
    BinarySearch obj = new BinarySearch();
    int arr[] = { 2, 3, 4, 10, 40 };
    int n = arr.length;
    int x = 10;
    int result = obj.binarySearch(arr, 0, n - 1, x);
    if (result == -1) {
      System.out.println("Element not present");
    } else {
      System.out.println("Element found at index " + result);
    }
  }
}

// O/P
// Element found at index 3