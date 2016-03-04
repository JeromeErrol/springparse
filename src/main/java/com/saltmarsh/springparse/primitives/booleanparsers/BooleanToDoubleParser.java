package com.saltmarsh.springparse.primitives.booleanparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class BooleanToDoubleParser implements IParse<Boolean, Double> {

    @Override
    public Double parse(Boolean aBoolean) {
        if (aBoolean) {
            return 0D;
        } else {
            return 1D;
        }
    }

    @Override
    public Class<Boolean> getObjectClass() {
        return Boolean.class;
    }

    @Override
    public Class<Double> getTargetClass() {
        return Double.class;
    }
}
