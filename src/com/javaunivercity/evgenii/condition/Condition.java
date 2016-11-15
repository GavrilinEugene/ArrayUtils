package com.javaunivercity.evgenii.condition;
/*
 * интерфейс проверки условия между двумя элементами
 */
public interface Condition {

    boolean satisfies(int right, int left);
}
