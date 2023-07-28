package global.govstack.digitalregistries.bb.emulator.dto;

public class ContentRequestDto<T> {

    private T content;

    public ContentRequestDto() {}

    public ContentRequestDto(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public ContentRequestDto<T> setContent(T  content) {
        this.content = content;
        return this;
    }

}
