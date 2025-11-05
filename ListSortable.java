import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lớp ListSortable
class ListSortable<E extends KLTN<?, ?>> {
    private List<E> list = new ArrayList<>();

    public void add(E element) {
        list.add(element);
    }

    public void print() {
        Collections.sort(list);
        System.out.println("=== DANH SÁCH KHÓA LUẬN TỐT NGHIỆP ===\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i) + "\n");
        }
    }

    public int size() { return list.size(); }
}
