import java.util.Comparator;

/**
 * ChatGPT-created sorting algorithm based on bubble sort.
 *
 * @author Reed Colloton
 */

public class CollotonReedSort implements Sorter {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The one sorter you can access.
   */
  public static Sorter SORTER = new CollotonReedSort();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a sorter.
   */
  CollotonReedSort() {
  } // CollotonReedSort()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * ChatGPT created this sorting algorithm based on bubble sort.
   */
  @Override
  public <T> void sort(T[] values, Comparator<? super T> order) {
    boolean swapped;
    for (int i = 0; i < values.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < values.length - 1 - i; j++) {
        if (order.compare(values[j], values[j + 1]) > 0) {
          // swap the elements
          T temp = values[j];
          values[j] = values[j + 1];
          values[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  } // sort(T[], Comparator<? super T>
} // class CollotonReedSort
