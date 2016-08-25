package test.contract;

import test.data.SomeHolderType;

public interface SomeService extends Service<SomeHolderType, Long> {

    SomeHolderType converse(SomeHolderType o);

}
