package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        validateDupli(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDupli(List<Integer> numbers) {
        for(int i=0; i<numbers.size()-1; i++) {
            if(numbers.get(i)==numbers.get(i+1)) {
                throw new IllegalArgumentException("[ERROR] Lotto 숫자 중복");
            }
        }
    }
    // TODO: 추가 기능 구현
}
