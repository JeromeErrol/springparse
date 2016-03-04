package com.saltmarsh.springparse.primitives.integerparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class IntegerToFloatParser implements IParse<Integer, Float> {
    @Override
    public Float parse(Integer integer) {
        return new Float(integer);
    }

    @Override
    public Class<Integer> getObjectClass() {
        return Integer.class;
    }

    @Override
    public Class<Float> getTargetClass() {
        return Float.class;
    }
}
