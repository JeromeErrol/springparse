package com.saltmarsh.springparse.primitives.stringparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class StringToFloatParser implements IParse<String, Float> {

    @Override
    public Float parse(String string) {
        return Float.parseFloat(string);
    }

    @Override
    public Class<String> getObjectClass() {
        return String.class;
    }

    @Override
    public Class<Float> getTargetClass() {
        return Float.class;
    }
}
