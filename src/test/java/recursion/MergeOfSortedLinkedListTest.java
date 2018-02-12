package recursion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

public class MergeOfSortedLinkedListTest {
    @DataProvider
    private static Object[][] linkedLists() {
        return new Object[][]{
                {new LinkedList<Integer>(Arrays.asList(1, 2)), new LinkedList<Integer>(Arrays.asList(1, 2)), new LinkedList<Integer>(Arrays.asList(1, 1, 2, 2))}
        };
    }

    @Test(dataProvider = "linkedLists")
    public void name(LinkedList<Integer> first, LinkedList<Integer> second, LinkedList<Integer> merged) {
        assertReflectionEquals(merged, MergeOfSortedLinkedList.merge(first.iterator(), second.iterator()));
    }
}