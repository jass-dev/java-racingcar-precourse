import Model.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("자동차가 정상 생성되는지 확인")
    void carsCreateTest() {
        Cars cars = new Cars("car1,car2,car3,car4");
        assertThat(cars.getCarList().size()).isEqualTo(4);
        assertThat(cars.getCarList().get(0).getName().equals("car1")).isTrue();
        assertThat(cars.getCarList().get(3).getName().equals("car4")).isTrue();
    }

    @Test
    @DisplayName(",만 여러개 발생할경우")
    void carsNullStringTest() {
        Cars cars = new Cars("car1,car2,car3,,,,");
        assertThat(cars.getCarList().size()).isEqualTo(3);
        assertThat(cars.getCarList().get(0).getName().equals("car1")).isTrue();
        assertThat(cars.getCarList().get(2).getName().equals("car3")).isTrue();
    }

    @Test
    void carsSpaceStringTest() {
        Cars cars = new Cars("car1,car2,car3, , ,,,");
        assertThat(cars.getCarList().size()).isEqualTo(5);
        assertThat(cars.getCarList().get(0).getName().equals("car1")).isTrue();
        assertThat(cars.getCarList().get(2).getName().equals("car3")).isTrue();
        assertThat(cars.getCarList().get(4).getName().equals(" ")).isTrue();
    }
}
