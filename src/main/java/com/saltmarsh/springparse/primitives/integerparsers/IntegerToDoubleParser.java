package com.saltmarsh.springparse.primitives.integerparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class IntegerToDoubleParser implements IParse<Integer, Double> {

    @Override
    public Double parse(Integer integer) {
        return integer.doubleValue();
    }

    @Override
    public Class<Integer> getObjectClass() {
        return Integer.class;
    }

    @Override
    public Class<Double> getTargetClass() {
        return Double.class;
    }
}
