import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTests {

    @Test
    public void validateSorting() throws Exception {
        int[] arr = new int[]{4,8,1,9};
        Assert.assertArrayEquals(SelectionSort.sort(arr), new int[]{1,4,8,9});
    }

    @Test(expected = SelectionSort.NotAValidArray.class)
    public void validateSingleIntArray() throws Exception{
        int[] arr = new int[]{4};
        Assert.assertArrayEquals(SelectionSort.sort(arr), new int[]{4});
    }

    @Test(expected = NullPointerException.class)
    public void validateNull() throws Exception{
        int[] arr = null;
        SelectionSort.sort(arr);
    }

    @Test
    public void dummyArray() throws Exception{
        int[] arr = new int[5];
        Assert.assertArrayEquals(SelectionSort.sort(arr),arr);
    }

}
