import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    public Car vehicle;
    public int reife = 4;
    public int driveSpeed = 60;
    @BeforeEach
    void setUp() {
        vehicle = new Car("ABC", "Taz2000", 2000);
    }

    @Test
    @DisplayName ("Car. �������� �����")
    void testMakeACar() {
        assertThat(vehicle instanceof Car).isEqualTo(true);
    }

    @Test
    @DisplayName (value = "Car. ��������� ������")
    void testReife() {
        assertThat(vehicle.getNumWheels()).isEqualTo(reife);
    }

    @Test
    @DisplayName ("Car. �����������")
    void testDrive() {
        vehicle.testDrive();
        assertThat(vehicle.getSpeed()).isEqualTo(driveSpeed);
    }

    @Test
    @DisplayName ("Car. ����������� � �������")
    void park() {
        vehicle.testDrive();
        vehicle.park();
        assertThat(vehicle.getSpeed()).isEqualTo(0);
    }
}