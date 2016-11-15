package com.javaunivercity.evgenii.predicate;

import com.javaunivercity.evgenii.condition.Condition;

public class ComparablePredicate implements Predicate {

    private int limiterValue;
    private Condition condition;

    public ComparablePredicate(Condition condition, int value) {
        this.limiterValue = value;
        this.condition = condition;
    }

    @Override
    public boolean satisfies(int value) {
        return condition.satisfies(value, limiterValue);
    }
}
