package tests.misc;

public class InheritedCopyable extends BaseCopyable {
    protected boolean hasInheritedCopyable(){
        return false;
    }
    @Override
    public <E extends BaseCopyable> void copy(E other) {
        super.copy(other);

    }
}
