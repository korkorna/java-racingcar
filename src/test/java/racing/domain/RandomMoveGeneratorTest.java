package racing.domain;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import racing.utils.RandomMoveGenerator;

public class RandomMoveGeneratorTest {

    @Test
    public void 랜덤값_생성_성공() {
        int MAX_MOVE_SIZE = 10;

        Assertions.assertThat(RandomMoveGenerator.nextInt(MAX_MOVE_SIZE)).isBetween(0, MAX_MOVE_SIZE);
    }

    @Test
    public void 랜덤값_최소_최대값_검증() {
        int MAX_MOVE_SIZE = 10;
        int[] values = new int[20];

        for (int i = 0; i < values.length; i++) {
            Assertions.assertThat(RandomMoveGenerator.nextInt(MAX_MOVE_SIZE)).isBetween(0, MAX_MOVE_SIZE);
        }

    }
}