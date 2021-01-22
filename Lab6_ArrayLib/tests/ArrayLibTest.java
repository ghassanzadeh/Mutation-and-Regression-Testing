import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


public class ArrayLibTest {

    @Test
    public void testReverseMethod(){
        String[] l = new String[]{"Burger", "Fries", "Pizza"};
        String[] e = new String[] {"Pizza", "Fries", "Burger"};
        String[] a = ArrayLib.reverse(l, String.class);
        assertArrayEquals(e, a);
    }

    @Test
    public void testUniqueMethod(){
        String[] l = new String[]{"Burger","Fries","Pizza","Fries","Burrito","Burger"};
        String[] e = new String[] {"Burger", "Fries", "Pizza", "Burrito"};
        String[] a = ArrayLib.unique(l, String.class);
        assertArrayEquals(e, a);
    }

    @Test
    public void testIntersectionMethod(){
        String[] l1 = new String[]{"Burger", "Fries", "Pizza"};
        String[] l2 = new String[]{"Burger","Pizza","Pasta","Lasagna"};
        String[] e = new String[] {"Burger", "Pizza"};
        String[] a = ArrayLib.intersection(l1,l2, String.class);
        assertArrayEquals(e, a);
    }

    @Test
    public void testUnionMethod(){
        String[] l1 = new String[]{"Burger", "Fries", "Pizza"};
        String[] l2 = new String[]{"Burger","Pizza","Fish","Lasagna"};
        String[] e = new String[] {"Burger", "Fries", "Pizza", "Fish","Lasagna"};
        String[] a = ArrayLib.union(l1,l2, String.class);
        assertArrayEquals(e, a);
    }

    @Test
    public void testCompactMethod(){
        String[] l3 = new String[]{"Burger","Fries",null,"Pizza","Lasagna",null};
        String[] e = new String[]{"Burger","Fries","Pizza","Lasagna"};
        String[] a = ArrayLib.compact(l3, String.class);
        assertArrayEquals(e, a);
    }

    @Test
    public void testIndexOfMethod(){
        String[] l3 = new String[]{"Burger","Fries",null,"Pizza","Lasagna",null};
        int a = ArrayLib.indexOf(l3, "Lasagna");
        assertEquals(a, 4);
    }

    @Test
    public void testIndexOfNotFound(){
        String[] l3 = new String[]{"Burger","Fries",null,"Pizza","Lasagna",null};
        int a = ArrayLib.indexOf(l3, "Bunny");
        assertEquals(a, -1);
    }

    @Test
    public void testContainsMethod(){
        String[] l = new String[] {"Burger","Fries","Pizza","Lasagna"};
        boolean contains = ArrayLib.contains(l, "Pizza");
        assertTrue(contains);
    }

    @Test
    public void testContainsNotFound(){
        String[] l = new String[] {"Burger","Fries","Pizza","Lasagna"};
        boolean contains = ArrayLib.contains(l, "Bunny");
        assertTrue(!contains);
    }

    @Test
    public void testWithoutMethod(){
        String[] l = new String[]{"Burger","Fries","Pizza","Fries","Lasagna","Burger"};
        String[] e = new String[] {"Burger", "Pizza", "Fries", "Burger"};
        String[] a = ArrayLib.without(l, String.class, "Fries", "Lasagna");
        assertArrayEquals(e, a);
    }

//    @Test
//    public void testWithoutNotFound(){
//        String[] l = new String[]{"Burger","Fries","Pizza","Fries","Lasagna","Burger"};
//        String[] e = new String[] {"Pizza", "Fries", "Burger"};
//        String[] a = ArrayLib.without(l, String.class, "Burger","Fries", "Lasagna");
//        assertArrayEquals(e, a);
//    }

}
