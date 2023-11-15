import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    public Motorcycle vehicle;
    public int reife = 2;
    public int driveSpeed = 75;

    @BeforeEach
    void setUp() {
        vehicle = new Motorcycle("ABC", "Drindulet1980", 1980);
    }

    @Test
    @DisplayName ("Bike. Проверям класс")
    void testMakeACar() {
        assertThat(vehicle instanceof Motorcycle).isEqualTo(true);
    }

    @Test
    @DisplayName ("Bike. Проверяем колеса")
    void testReife() {
        assertThat(vehicle.getNumWheels()).isEqualTo(reife);
    }

    @Test
    @DisplayName ("Bike. Разгоняемся")
    void testDrive() {
        vehicle.testDrive();
        assertThat(vehicle.getSpeed()).isEqualTo(driveSpeed);
    }

    @Test
    @DisplayName ("Bike. Разгоняемся и паркуем")
    void park() {
        vehicle.testDrive();
        vehicle.park();
        assertThat(vehicle.getSpeed()).isEqualTo(0);
    }
}