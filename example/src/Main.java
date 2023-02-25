import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(18,"abbbccc"));
        list.add(new Person(17,"sdasfa"));
        // clone是浅拷贝，改变clone中的元素的值，list中的元素也会被改变
        ArrayList<Person> clone = (ArrayList<Person>) list.clone();
        Person person = clone.get(1);
        person.setAge(1);
        System.out.println(clone);

    }
}
