package com.saltmarsh.springparse.primitives.floatparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class FloatToDoubleParser implements IParse<Float, Double> {

    @Override
    public Double parse(Float aFloat) {
        return aFloat.doubleValue();
    }

    @Override
    public Class<Float> getObjectClass() {
        return Float.class;
    }

    @Override
    public Class<Double> getTargetClass() {
        return Double.class;
    }
}
