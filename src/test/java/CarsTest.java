import model.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    Cars cars;

    @BeforeEach
    void testSetting(){
        cars = new Cars("car1,car2,car3,car4");
    }
    @Test
    @DisplayName("자동차가 정상 생성되는지 확인")
    void carsCreateTest() {
        assertThat(cars.getCarList().size()).isEqualTo(4);
        assertThat(cars.getCarList().get(0).getName().equals("car1")).isTrue();
        assertThat(cars.getCarList().get(3).getName().equals("car4")).isTrue();
    }

    @Test
    @DisplayName(",만 여러개 발생할경우")
    void carsNullStringTest() {
        Cars commaCars = new Cars("car1,car2,car3,,,,");
        assertThat(commaCars.getCarList().size()).isEqualTo(3);
        assertThat(commaCars.getCarList().get(0).getName().equals("car1")).isTrue();
        assertThat(commaCars.getCarList().get(2).getName().equals("car3")).isTrue();
    }

    @Test
    @DisplayName("빈 스페이스로 이름생성 테스트")
    void carsSpaceStringTest() {
        Cars spaceCars = new Cars("car1,car2,car3, , ,,,");
        assertThat(spaceCars.getCarList().size()).isEqualTo(5);
        assertThat(spaceCars.getCarList().get(0).getName().equals("car1")).isTrue();
        assertThat(spaceCars.getCarList().get(2).getName().equals("car3")).isTrue();
        assertThat(spaceCars.getCarList().get(4).getName().equals(" ")).isTrue();
    }


}
