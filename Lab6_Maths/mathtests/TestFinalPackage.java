package mathtests;

import org.junit.Test;
import src.FinalPackage;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFinalPackage {

    @Test
    public void testRandomMethod(){
        boolean valid = false;
        double[] r = FinalPackage.random(4, 1, 8);
        for (int i = 0 ; i< r.length; i++){
            if ((r[i] <= 8) && (r[i] >= 1)){
                valid = true;
                assertTrue(valid);
            }
        }
        assertTrue(valid);
    }

    @Test
    public void testMaxMethod(){
        double[] values = {2.6, 3.4, 3.2, 8.4};
        double maxVal = 8.4;
        double r = FinalPackage.max(values);
        assertEquals(maxVal, r);
    }

    @Test
    public void testMinMethod(){
        double[] values = {2.1, 3.4, 3.2, 8.4};
        double minVal = 2.1;
        double r = FinalPackage.min(values);
        assertEquals(minVal, r);
    }

    @Test
    public void testNormalizeMethod(){
        double[] values = {1.0, 2.0, 3.0, 5.0};
        double[] n = {0, 0.25, 0.5, 1};
        double[] r = FinalPackage.normalize(values);
        assertArrayEquals(n, r);
    }

    @Test
    public void testSumMethod(){
        double[] values = {1.4, 2.2, 3.2, 5.0};
        double sumVal = 11.8;
        double r = FinalPackage.sum(values);
        assertEquals(sumVal, r);
    }

    @Test
    public void testStddevMethod(){
        double[] values = {1.0, 2.0, 3.0, 5.0};
        double stddevVal = 1.479019945774904;
        double r = FinalPackage.stddev(values);
        assertEquals(stddevVal, r);

    }

    @Test
    public void testArrayAddMethod(){
        double[] values1 = {1.0, 2.0, 6.0, 6.0};
        double[] values2 = {2.0, 4.0, 6.0, 8.0};
        double[] sumArr = {3.0, 6.0, 12.0, 14.0};
        double[] r = FinalPackage.arrayAdd(values1, values2);
        assertArrayEquals(sumArr, r);
    }

    @Test
    public void testArrayNegateMethod(){
        double[] values1 = {1.0, 2.0, 8.0, 6.0};
        double[] negatedArr = {-1.0, -2.0, -8.0, -6.0};
        double[] r = FinalPackage.arrayNegate(values1);
//        System.out.print(r);
        assertArrayEquals(negatedArr, r);
    }

    @Test
    public void testArraySubtractMethod(){
        double[] values1 = {1.0, 2.0, 4.0, 6.0};
        double[] values2 = {2.0, 5.0, 6.0, 8.0};
        double[] subtractArr = {1.0, 3.0, 2.0, 2.0};
        double[] r = FinalPackage.arraySubtract(values2, values1);
        assertArrayEquals(subtractArr, r);
    }

    @Test
    public void testDistanceMethod(){
        double[] values1 = {1.0, 2.0};
        double[] values2 = {2.0, 4.0};
        double distanceVal = Math.sqrt(5.0);
        double r = FinalPackage.distance(values2, values1);
        assertEquals(distanceVal, r);
    }

    @Test
    public void testArrayDeviationMethod(){
        double[] values1 = {1.0, 2.0, 3.0, 6.0};
        double[] arraydev = {-1.5374953600536374, -1.204162026720304, -0.8708286933869707, 0.12917130661302934};
        double[] r = FinalPackage.arrayDeviation(values1);
        assertArrayEquals(arraydev, r);
    }
}
