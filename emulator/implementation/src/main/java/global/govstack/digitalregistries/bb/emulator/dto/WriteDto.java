package global.govstack.digitalregistries.bb.emulator.dto;

public class WriteDto<T> {
    private T write;

    public T getWrite() {
        return write;
    }

    public WriteDto<T> setWrite(T write) {
        this.write = write;
        return this;
    }
}
