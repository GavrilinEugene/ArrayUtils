package com.javaunivercity.evgenii.condition;

public class ConditionMore implements Condition {

    @Override
    public boolean satisfies(int right, int left) {
        return right > left;
    }
}
