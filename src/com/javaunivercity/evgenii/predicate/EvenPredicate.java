package com.javaunivercity.evgenii.predicate;
/*
 * предикат чётности
 */
public class EvenPredicate implements Predicate {
    @Override
    public boolean satisfies(int value) {
        return value%2 == 0;
    }
}
