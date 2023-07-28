package global.govstack.digitalregistries.bb.emulator.dto;

public class ReceiveResponseDto<T> {

    private T receive;

    public ReceiveResponseDto(T receive) {
        this.receive = receive;
    }

    public T getReceive() {
        return receive;
    }

    public ReceiveResponseDto<T> setReceive(T receive) {
        this.receive = receive;
        return this;
    }
}
