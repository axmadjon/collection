package uz.mold.collection;

public class CollectionException extends RuntimeException {

    public CollectionException() {
    }

    public CollectionException(String detailMessage) {
        super(detailMessage);
    }

    public CollectionException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public CollectionException(Throwable throwable) {
        super(throwable);
    }

    public static CollectionException Unsupported() {
        return new CollectionException("Unsupported");
    }

    public static CollectionException NullPointer() {
        return new CollectionException("NULL pointer");
    }

    public static void checkNull(Object... args) {
        for (Object a : args) {
            if (a == null) {
                throw NullPointer();
            }
        }
    }

    public static void require(boolean state, String message) {
        if (!state) {
            throw new CollectionException(message == null ? "required" : message);
        }
    }

    public static CollectionException Required() {
        return new CollectionException("Required");
    }

}
