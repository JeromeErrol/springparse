package com.saltmarsh.springparse.primitives.floatparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class FloatToIntegerParser implements IParse<Float, Integer> {

    @Override
    public Integer parse(Float aFloat) {
        return aFloat.intValue();
    }

    @Override
    public Class<Float> getObjectClass() {
        return Float.class;
    }

    @Override
    public Class<Integer> getTargetClass() {
        return Integer.class;
    }
}
