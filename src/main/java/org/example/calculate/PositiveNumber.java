package org.example.calculate;

public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {  // 여기서 이미 0또는 음수를 전달할 수 없다고 선언함
        if (isNegativeNumber(value)) {
            throw new IllegalArgumentException("0또는 음수를 전달할 수 없습니다.");
        }
    }

    private boolean isNegativeNumber(int value) {
        return value <=0;
    }

    public int toInt() {
        return value;
    }

}
