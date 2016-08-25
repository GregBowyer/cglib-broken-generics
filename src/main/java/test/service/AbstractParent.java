package test.service;

import test.delegate.TargetHandler;
import test.data.TypeObject;

abstract class AbstractParent<H extends TargetHandler<T, ID>, T extends TypeObject<ID>, ID extends Long> {

    private final H handler;

    public AbstractParent(H handler) {
        this.handler = handler;
    }

    public T talkToMe(T o) {
        return o;
    }

}
