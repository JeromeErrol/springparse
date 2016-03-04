package com.saltmarsh.springparse;

public interface IParse<T, J> {
    J parse(T t);

    Class<T> getObjectClass();

    Class<J> getTargetClass();
}
