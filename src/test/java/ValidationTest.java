import model.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class ValidationTest {

    @Test
    @DisplayName("자동차 이름이 비어있을경우")
    void carNameNullTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car("")
        );
    }

    @Test
    @DisplayName("자동차 이름이 5글자 초과인 경우")
    void carNameTooLongTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car("123456")
        );
    }

}
