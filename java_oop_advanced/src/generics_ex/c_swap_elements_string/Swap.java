package generics_ex.c_swap_elements_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap<T> {
    private List<T> list;

    public Swap() {
        this.list = new ArrayList<>();
    }

    public void swap(Integer ind1, Integer ind2){
        T firstElement = this.list.get(ind1);
        this.list.set(ind1, this.list.get(ind2));
        this.list.set(ind2, firstElement);

    }
    public void add(T element){
        this.list.add(element);
    }

    public List<T> getList() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : list) {
            sb.append(String.format("%s: %s",t.getClass().getTypeName(), t)).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
