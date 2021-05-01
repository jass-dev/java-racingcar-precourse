import model.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CarTest {

    @Test
    @DisplayName("자동차 생성")
    void carCreateTest() {
        Car car = new Car("myCar");
        assertThat(car).isNotNull();
        assertThat(car.getName()).isEqualTo("myCar");
    }





}
