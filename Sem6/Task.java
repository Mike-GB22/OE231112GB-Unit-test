//2023/11/16

import java.util.List;

public class Task<T extends Number> {
    public List<T> list1;
    public List<T> list2;

    public Task(List list1, List list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public Double average(List<? extends T> list) {
        Double sum = 0.0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            //sum += (Double) list.get(i);
            sum += Double.parseDouble(list.get(i).toString());
        }
        return sum / size;
    }

    public String compare() {
        if (this.list1.size() == 0) throw (new RuntimeException("Первый список пуст"));
        if (this.list2.size() == 0) throw (new RuntimeException("Второй список пуст"));
        Double averageList1 = average(this.list1);
        Double averageList2 = average(this.list2);

        if (averageList1 > averageList2) return "Первый список имеет большее среднее значение";
        else if (averageList1 < averageList2) return "Второй список имеет большее среднее значение";
        return "Средние значения равны";
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("List1: ");
            returnString.append(list1.toString());
            returnString.append(" Среднее значение: ");
            returnString.append(average(this.list1));
        returnString.append("\nList2: ");
            returnString.append(list2.toString());
            returnString.append(" Среднее значение: ");
            returnString.append(average(this.list2));
        returnString.append("\n");
        returnString.append(this.compare());
        return returnString.toString();
    }

}
