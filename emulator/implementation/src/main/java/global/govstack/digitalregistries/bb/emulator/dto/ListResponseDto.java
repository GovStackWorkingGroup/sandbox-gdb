package global.govstack.digitalregistries.bb.emulator.dto;

import java.util.List;

public class ListResponseDto<T> {

    private int count;
    private int next;
    private int previous;
    private List<T> results;

    public ListResponseDto(int count, int next, int previous, List<T> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public ListResponseDto<T> setCount(int count) {
        this.count = count;
        return this;
    }

    public int getNext() {
        return next;
    }

    public ListResponseDto<T> setNext(int next) {
        this.next = next;
        return this;
    }

    public int getPrevious() {
        return previous;
    }

    public ListResponseDto<T> setPrevious(int previous) {
        this.previous = previous;
        return this;
    }

    public List<T> getResults() {
        return results;
    }

    public ListResponseDto<T> setResults(List<T> results) {
        this.results = results;
        return this;
    }
}
