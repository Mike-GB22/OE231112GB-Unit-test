import java.util.List;
public interface RepositoryInterface<T>{
    T getById(int id);
    List<T> getByName(String name);
    List<T> getAll();
    void add(T t);
    void update(T newT);
    void delete(T t);
    int getSize();

}
