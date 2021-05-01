import model.Racing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    Racing racing;
    @BeforeEach
    void testSetting(){
        racing = new Racing();
    }

    @Test
    @DisplayName("Racing lap 설정, 가져오기")
    void carsRacingLapSetGet(){
        racing.setRacingLap(100);
        assertThat(racing.getRacingLap()).isEqualTo(100);
        assertThat(racing.isRacingEnded(99)).isFalse();
        assertThat(racing.isRacingEnded(100)).isTrue();
    }
}
