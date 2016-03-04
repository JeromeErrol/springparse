package com.saltmarsh.springparse.primitives.booleanparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class BooleanToFloatParser implements IParse<Boolean, Float> {

    @Override
    public Float parse(Boolean aBoolean) {
        if (aBoolean) {
            return 0F;
        } else {
            return 1F;
        }
    }

    @Override
    public Class<Boolean> getObjectClass() {
        return null;
    }

    @Override
    public Class<Float> getTargetClass() {
        return null;
    }
}
