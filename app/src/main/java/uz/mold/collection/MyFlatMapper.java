package uz.mold.collection;

public abstract class MyFlatMapper<E, R> {

    public abstract MyArray<R> apply(E element);

}
