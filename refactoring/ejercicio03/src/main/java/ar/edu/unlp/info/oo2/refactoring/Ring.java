package ar.edu.unlp.info.oo2.refactoring;

import java.util.List;

public abstract class Ring<T> {
    private List<T> source;
    private int idx;

    public Ring(List<T> src) {
        this.source = src;
        this.idx = 0;
    }

    public T next() {
        if (idx >= source.size())
            idx = 0;
        return source.get(idx++);
    }
}
