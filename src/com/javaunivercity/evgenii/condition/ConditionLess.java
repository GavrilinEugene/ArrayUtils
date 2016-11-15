package com.javaunivercity.evgenii.condition;

/*
 * условие (правый элемент < левый элемент)
 */
public class ConditionLess implements Condition {
    @Override
    public boolean satisfies(int right, int left) {
        return right < left;
    }
}
