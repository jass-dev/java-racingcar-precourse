import inout.InputOutputUtil;
import model.Racing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    Racing racing;

    @BeforeEach
    void testSetting() throws NoSuchFieldException, IllegalAccessException {
        racing = new Racing();
        System.setIn(new ByteArrayInputStream("car1,car2,car3,car4\n10".getBytes()));
        Field scannerField = InputOutputUtil.class.getDeclaredField("scanner");
        scannerField.setAccessible(true);
        scannerField.set(new InputOutputUtil(), new Scanner(System.in));
    }

    @Test
    @DisplayName("Race 기본셋팅")
    void racingSetup() {
        racing.setRace();
        assertThat(racing.getRacingLap()).isEqualTo(10);
        assertThat(racing.isRacingEnded(9)).isFalse();
        assertThat(racing.isRacingEnded(10)).isTrue();
    }

    @Test
    @DisplayName("Race가 정상 진행된다.")
    void doRacingTest() {
        racing.playRace(); // exception 없이 전체 진행 끝.
    }
}
