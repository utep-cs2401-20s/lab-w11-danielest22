import org.junit.Test;
import static org.junit.Assert.*;
public class newSortingTester {

    @Test
    //Test Case 1: Testing to see if newSort(); can sort an array with an even length and even size
    //Expected: {1,2,5,7};
    //Actual Result: {1,2,5,7}
    //Test Passed
    public void newSortingTest1(){
        int[] test = {2,1,7,5};// test array to newSort method
        newSorting ns = new newSorting();
        ns.newSort(test, 2);
        int[] expected = {1,2,5,7};//expected output
        assertArrayEquals(expected, test);
    }
    @Test
    //Test Case 2: Testing to see if newSort(); can sort an array with an odd length and odd size
    //Expected: {1,2,3,4,5,6,7};
    //Actual Result: {1,2,3,4,5,6,7};
    //Test Passed
    public void newSortingTest2(){
        int[] test = {3,1,7,5,2,4,6};// test array to newSort method
        newSorting ns = new newSorting();
        ns.newSort(test, 3);
        int[] expected = {1,2,3,4,5,6,7};//expected output
        assertArrayEquals(expected, test);
    }

    @Test
    //Test Case 3: Testing to see if newSort(); can sort an array with a duplicate.
    //Expected: {1,2,3,4,5,5};
    //Actual Result: {1,2,3,4,5,5};
    //Test Passed
    public void newSortingTest3(){
        int[] test = {4,5,3,1,2,5};// test array to newSort method
        newSorting ns = new newSorting();
        ns.newSort(test, 2);
        int[] expected = {1,2,3,4,5,5};//expected output
        assertArrayEquals(expected, test);
    }
    @Test
    //Test Case 4: Testing to see if newSort(); can sort an array with a negative integer.
    //Expected: {-6,1,2,3,4,5};
    //Actual Result: {-6,1,2,3,4,5};
    //Test Passed
    public void newSortingTest4(){
        int[] test = {4,-6,3,1,2,5};// test array to newSort method
        newSorting ns = new newSorting();
        ns.newSort(test, 2);
        int[] expected = {-6,1,2,3,4,5};//expected output
        assertArrayEquals(expected, test);
    }
    @Test
    //Test Case 5: Testing to see if newSort(); can sort an array with a duplicate, a negative integer, an odd length and size 1.
    //Expected: {-3,-1,-1,0,3,3,5,6,8,10,21};
    //Actual Result: {-3,-1,-1,0,3,3,5,6,8,10,21};
    //Test Passed
    public void newSortingTest5(){
        int[] test = {0,-1,6,-1,5,10,3,21,-3,3,8};// test array to newSort method
        newSorting ns = new newSorting();
        ns.newSort(test, 1);
        int[] expected = {-3,-1,-1,0,3,3,5,6,8,10,21};//expected output
        assertArrayEquals(expected, test);
    }
    /* All test passed and every method in the class newSorting.java
    was tested individually while being constructed. Outside sources
    used were stackoverflow.com for splitting an array using Arrays.copyOfRange
    rather than a populate helper method. Overall, the newSort() worked and sorted the
    array as asked.
     */
}