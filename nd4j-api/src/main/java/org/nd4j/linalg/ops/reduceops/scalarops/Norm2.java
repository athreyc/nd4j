package org.nd4j.linalg.ops.reduceops.scalarops;

import org.apache.commons.math3.util.FastMath;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * Overall norm2 of an ndarray
 *
 * @author Adam Gibson
 */
public class Norm2 extends BaseScalarOp {
    public Norm2() {
        super(0);
    }

    @Override
    public double accumulate(INDArray arr, int i, double soFar) {
        double ret =  soFar +  FastMath.pow(arr.getDouble(i),2);
        if(i == arr.length() - 1)
            return  FastMath.sqrt(ret);
        return ret;
    }
}
