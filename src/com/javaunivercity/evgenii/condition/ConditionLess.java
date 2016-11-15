package com.javaunivercity.evgenii.condition;

public class ConditionLess implements Condition {
    @Override
    public boolean satisfies(int right, int left) {
        return right < left;
    }
}
