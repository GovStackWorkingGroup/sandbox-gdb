package global.govstack.digitalregistries.bb.emulator.dto;

public class ContentResponseDto<T> {

    private T content;

    public ContentResponseDto() {}

    public ContentResponseDto(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public ContentResponseDto<T> setContent(T  content) {
        this.content = content;
        return this;
    }
}
