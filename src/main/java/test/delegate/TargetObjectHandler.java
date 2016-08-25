package test.delegate;

import test.data.SomeHolderType;

public interface TargetObjectHandler extends TargetHandler<SomeHolderType, Long> {
    String sayHello(SomeHolderType o);
}
