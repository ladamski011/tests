package tests.misc;

public class BaseCopyable implements Copyable<BaseCopyable> {

    protected boolean hasFeatureBase(){
        return true;
    }

    @Override
    public <E extends BaseCopyable> void copy(E other) {
        other.hasFeatureBase();
    }
}
