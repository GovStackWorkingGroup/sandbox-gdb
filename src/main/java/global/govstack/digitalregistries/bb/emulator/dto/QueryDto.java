package global.govstack.digitalregistries.bb.emulator.dto;

public class QueryDto<T> {

    private T content;

    public T getContent() {
        return content;
    }

    public QueryDto<T> setContent(T  content) {
        this.content = content;
        return this;
    }
}
