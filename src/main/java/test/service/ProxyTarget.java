package test.service;

import test.delegate.TargetObjectHandler;
import test.contract.SomeService;
import test.data.SomeHolderType;

public class ProxyTarget extends AbstractParent<TargetObjectHandler, SomeHolderType, Long> implements SomeService {

    public ProxyTarget(TargetObjectHandler handler) {
        super(handler);
    }

    public SomeHolderType converse(SomeHolderType o) {
        return o;
    }
}
