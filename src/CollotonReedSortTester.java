import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

public class CollotonReedSortTester {
  @Test
  void tester() {
    CollotonReedSort sorter = new CollotonReedSort();
    Integer[] arr = new Integer[]{3, 2, 10, 5, 2, 12, 3, 4};
    sorter.sort(arr, Integer::compareTo);
    assertArrayEquals(arr, new Integer[]{2, 2, 3, 3, 4, 5, 10, 12});
    System.out.println(Arrays.toString(arr));
  }
}