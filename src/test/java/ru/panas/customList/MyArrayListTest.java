package ru.panas.customList;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyArrayListTest {

    private MyArrayList<String> actualArrayList = new MyArrayList<>();

    @Before
    public void setUp() {
        actualArrayList.add("6");
        actualArrayList.add("5");
        actualArrayList.add("4");
        actualArrayList.add("3");
        actualArrayList.add("2");
        actualArrayList.add("1");
        actualArrayList.add("0");
    }

    @Test
    public void testAdd_ShouldAddElement() {

        actualArrayList.add("Hi");
        int indexOfActualElement = actualArrayList.indexOf("Hi");

        assertThat(actualArrayList.get(indexOfActualElement)).contains("Hi");
    }

    @Test
    public void testAdd_ShouldAddElementByIndex() {

        actualArrayList.add(2, "Hi-Hi");

        assertThat(actualArrayList.get(2)).contains("Hi-Hi");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ShouldNotAddElementByIndex() {

        actualArrayList.add(9, "Hi-Hi");

        assertThat(actualArrayList.get(9)).contains("Hi-Hi");
    }

    @Test
    public void testGet_ShouldGetElementByIndex() {

        assertThat(actualArrayList.get(0)).contains("6");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_ShouldNotGetElementByIndex() {

        assertThat(actualArrayList.get(9)).contains("0");
    }

    @Test
    public void testSet_ShouldSetElementByIndex() {

        actualArrayList.set(0, "Hello");

        assertThat(actualArrayList.get(0)).contains("Hello");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_ShouldNotSetElementByIndex() {

        actualArrayList.set(9, "Hello");

        assertThat(actualArrayList.get(9)).contains("Hello");
    }

    @Test
    public void testSize_ShouldTakeSize() {

        int actualSize = actualArrayList.size();

        assertThat(actualSize).isEqualTo(7);
    }

    @Test
    public void testIndexOf_ShouldGetIndexOfElement() {

        int actualIndex = actualArrayList.indexOf("5");

        assertThat(actualIndex).isEqualTo(1);
    }

    @Test
    public void testRemove_ShouldRemoveElementByIndex() {

        actualArrayList.remove(0);

        assertThat(actualArrayList.get(0)).doesNotContain("6");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ShouldDontRemoveElementByIndex() {

        actualArrayList.remove("9");

        assertThat(actualArrayList.get(9)).doesNotContain("0");
    }

    @Test
    public void testRemove_ShouldRemoveElementByValue() {

        actualArrayList.remove("6");

        assertThat(actualArrayList.get(0)).doesNotContain("6");
    }



    @Test
    public void testClear() {

        actualArrayList.clear();

        assertThat(actualArrayList.size()).isZero();
    }
}