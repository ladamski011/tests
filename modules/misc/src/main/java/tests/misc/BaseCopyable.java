package tests.misc;

public class BaseCopyable<T extends BaseCopyable> implements Copyable<T> {

    protected boolean hasFeatureBase(){
        return true;
    }

    @Override
    public <E extends T> void copy(E other) {

    }
}
