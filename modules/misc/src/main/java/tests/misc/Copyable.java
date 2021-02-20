package tests.misc;

public interface Copyable<T> {
    public <E extends T> void copy(E other);
}
