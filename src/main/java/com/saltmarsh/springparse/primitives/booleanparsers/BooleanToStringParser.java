package com.saltmarsh.springparse.primitives.booleanparsers;

import com.saltmarsh.springparse.IParse;
import org.springframework.stereotype.Component;

@Component
public class BooleanToStringParser implements IParse<Boolean, String> {

    @Override
    public String parse(Boolean aBoolean) {
        return Boolean.toString(aBoolean);
    }

    @Override
    public Class<Boolean> getObjectClass() {
        return Boolean.class;
    }

    @Override
    public Class<String> getTargetClass() {
        return String.class;
    }
}
