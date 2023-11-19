//2023/11/19

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {
    public MainHW mainClass;
    public int[] les26;

    @BeforeEach
    void setUp() {
        mainClass = new MainHW();
        les26 = new int[125];
        for(int i = 0; i < les26.length; i++){
            les26[i] = 25 - i;
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, -2, -4, -6, -8, -10})
    @DisplayName("1. Четное")
    void testEvenOddNumberTrue(int n) {
        assertThat(mainClass.evenOddNumber(n)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, -1, -3, -5, -7, -9})
    @DisplayName("1. Нечетное")
    void testEvenOddNumberFalse(int n) {
        assertThat(mainClass.evenOddNumber(n)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 20, 15, 10, 5, 0, -5})
    @DisplayName("2. Меньше или равно 25")
    void numberInIntervalLess(int n) {
        assertThat(mainClass.numberInInterval(n)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 105, 115, 120, 135, 150, 200})
    @DisplayName("2. Больше или равно 100")
    void numberInIntervalMehr(int n) {
        assertThat(mainClass.numberInInterval(n)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 37, 48, 59, 70, 81, 92, 99})
    @DisplayName("2. Попадает в интервал между 25 и 100")
    void numberInIntervalInInterval(int n) {
        assertThat(mainClass.numberInInterval(n)).isTrue();
    }
}