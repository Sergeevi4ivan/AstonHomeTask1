package ru.panas.sort;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import ru.panas.customList.MyArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomQuickSortTest extends TestCase {

    private CustomQuickSort<String> quickSort = new CustomQuickSort<>();
    private MyArrayList<String> arrayList = new MyArrayList<>();

    @Before
    public void setUp() {

        arrayList.add("7");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
    }
    @Test
    public void testSort_ShouldSortArrayList() {

        quickSort.sort(arrayList, arrayList.size());

        assertThat(arrayList.get(0)).contains("1");

    }
}