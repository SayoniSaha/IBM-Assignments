package project21_3jul;

import java.util.*;

public class SortArray {
	  private static final int l = 400;
	  private static final int t = 4;

	  public static void main(String[] args) {
	    int[] array = createArray();
	    System.out.println("Before sorting: " + Arrays.toString(array));

	    Thread[] threads = new Thread[t];
	    int l2 = l / t;

	    for (int i=0; i<t; i++) {
	      int start = i*l2;
	      int end = (i == t-1) ? l-1 : (start + l2-1);
	      threads[i] = new Thread(new SortTask(array, start, end));
	      threads[i].start();
	    }

	    for (Thread thread: threads) {
	      try {
	        thread.join();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }

	    mergeSort(array, 0, l-1);
	    System.out.println("After sorting: " + Arrays.toString(array));
	  }

	  private static int[] createArray() {
	    int[] array = new int[l];
	    for (int i=0; i<l; i++) {
	      array[i] = (int)(Math.random() * 400); // Generate random numbers between 0 and 400
	    }
	    return array;
	  }

	  private static void mergeSort(int[] array, int left, int right) {
	    if (left < right) {
	      int mid = (left + right) / 2;
	      mergeSort(array, left, mid);
	      mergeSort(array, mid+1, right);
	      merge(array, left, mid, right);
	    }
	  }

	  private static void merge(int[] array, int left, int mid, int right) {
	    int[] temp = new int[right - left + 1];
	    int i = left, j = mid+1, k = 0;

	    while (i <= mid && j <= right) {
	      if (array[i] <= array[j]) {
	        temp[k++] = array[i++];
	      } else {
	        temp[k++] = array[j++];
	      }
	    }

	    while (i <= mid) {
	      temp[k++] = array[i++];
	    }

	    while (j <= right) {
	      temp[k++] = array[j++];
	    }

	    System.arraycopy(temp, 0, array, left, temp.length);
	  }

	  static class SortTask implements Runnable {
	    private int[] array;
	    private int start;
	    private int end;

	    public SortTask(int[] array, int start, int end) {
	      this.array = array;
	      this.start = start;
	      this.end = end;
	    }

	    @Override
	    public void run() {
	      Arrays.sort(array, start, end+1);
	    }
	  }
}
