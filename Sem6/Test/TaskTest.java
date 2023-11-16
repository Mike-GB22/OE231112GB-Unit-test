import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.*;
import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    @DisplayName("������ ��������")
    void average() {
        Double value = 5.0;
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(value);
        }
        Task<Integer> task = new Task<>(list, list);
        assertThat(task.average(task.list1)).isEqualTo(value);

        Double sum = 0.0;
        list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(i*1.0);
            sum += i;
        }
        task = new Task<>(list, list);
        assertThat(task.average(task.list1)).isEqualTo(sum/list.size());
    }

    @Test
    @DisplayName("������� ����� ������� �����.")
    void compareEqual() {
        String waitFor = "������� �������� �����";
        Task<Integer> task = new Task<>(List.of(1, 2 ,3), List.of(1, 2 ,3));
        assertThat(task.compare()).isEqualTo(waitFor);
    }

    @Test
    @DisplayName("������� ������� ������ ������.")
    void compareGross() {
        String waitFor = "������ ������ ����� ������� ������� ��������";
        Task<Integer> task = new Task<>(List.of(3, 3 ,3), List.of(1, 2 ,3));
        assertThat(task.compare()).isEqualTo(waitFor);
    }

    @Test
    @DisplayName("������� ������� ������ ������.")
    void compareLess() {
        String waitFor = "������ ������ ����� ������� ������� ��������";
        Task<Integer> task = new Task<>(List.of(1, 2 ,3), List.of(3, 3 ,3));
        assertThat(task.compare()).isEqualTo(waitFor);
    }

    @Test
    @DisplayName("������ ������ ����.")
    void list1IsEmpty() {
        Task<Integer> task = new Task<>(List.of(), List.of(3, 3 ,3));
        assertThrows(RuntimeException.class, ()->task.compare());
    }

    @Test
    @DisplayName("������ ������ ����.")
    void list2IsEmpty() {
        Task<Integer> task = new Task<>(List.of(), List.of(3, 3 ,3));
        assertThrows(RuntimeException.class, ()->task.compare());
    }
}