package test.delegate;

import test.data.TypeObject;

public interface TargetHandler<T extends TypeObject, ID extends Long> {
    int getID(ID id);
    T get(int id);
}
