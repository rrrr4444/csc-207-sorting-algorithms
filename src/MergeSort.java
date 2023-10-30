import java.util.Arrays;
import java.util.Comparator;
/**
 * A simple way to sort arrays using merge sort.
 *
 * @author Reed
 * @author Noah
 * @author Samuel A. Rebelsky
 */
public class MergeSort implements Sorter {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The one sorter you can access.
   */
  public static Sorter SORTER = new MergeSort();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a sorter.
   */
  MergeSort() {
  } // MergeSort()

  /**
   * Sort an array using the merge sort algorithm.
   */
  @Override
  public <T> void sort(T[] vals, Comparator<? super T> order) {
    sort(0, vals.length, vals, order);
  } // sort

  /**
   * Recursive helper for the sort method.
   */
  public <T> void sort(int i, int size, T[] vals, Comparator<? super T> order) {
    // recursively call merge sort
  } // sort

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Merge the values from positions [lo..mid) and [mid..hi) back into
   * the same part of the array.
   *
   * Preconditions: Each subarray is sorted according to comparator.
   */
 public <T> void merge(T[] vals, int lo, int mid, int hi, Comparator<? super T> comparator) {
    T[] left = Arrays.copyOfRange(vals, lo, mid);
    T[] right = Arrays.copyOfRange(vals, mid, hi);
    int l = 0;
    int r = 0;
    int commonRange = Math.min(left.length, right.length);
    for (int i = 0; i < commonRange; i++) {
      int difference = comparator.compare(vals[lo], vals[mid]);
      if (difference == -1) {
        vals[lo + i] = left[l++];
      } else if (difference == 1) {
        vals[lo + i] = right[r++];
      } else {
        vals[lo + i] = left[l++];
      } // if
    } // for
    T[] longer = (left.length > right.length) ? left : right;
    for (int i = 0; i < longer.length; i++) {
      vals[lo + commonRange + i] = longer[commonRange + i];
    } // for
  } // merge
} // class MergeSorter