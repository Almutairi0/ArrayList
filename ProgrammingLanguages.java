import java.util.ArrayList;
import java.util.Comparator;

public class ProgrammingLanguages {
    ArrayList<String> programmingLanguages = new ArrayList<>();
    public ProgrammingLanguages() {


        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C");
        programmingLanguages.add("Rust");
        programmingLanguages.add("Dart");
        programmingLanguages.add(1,"C#");
        System.out.println(programmingLanguages);
        programmingLanguages.set(4, "C++");
        System.out.println(programmingLanguages);
        programmingLanguages.remove(2);
        System.out.println(programmingLanguages.size());
        programmingLanguages.sort(Comparator.naturalOrder());
        System.out.println(programmingLanguages);
        programmingLanguages.sort(Comparator.reverseOrder());
        System.out.println(programmingLanguages);
        boolean flag = programmingLanguages.contains("Java");
        boolean result = programmingLanguages.isEmpty();
        System.out.println(flag);
        System.out.println(result);
    }

}
