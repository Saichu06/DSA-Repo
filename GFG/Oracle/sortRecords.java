package GFG.Oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortRecords {
     public List<String> sortRecords(List<String> employee, List<Integer> salary) {

        List<Pair> records = new ArrayList<>();

        for(int i = 0; i < employee.size(); i++) {
            records.add(new Pair(salary.get(i), employee.get(i)));
        }

        Collections.sort(records, new Comparator<Pair>() {

            @Override
            public int compare(Pair a, Pair b) {

                if(a.salary == b.salary) {
                    return a.name.compareTo(b.name);
                }

                return Integer.compare(a.salary, b.salary);
            }
        });

        List<String> ans = new ArrayList<>();

        for(Pair record : records) {
            ans.add(record.name);
        }

        return ans;
    }

    static class Pair {

        String name;
        int salary;

        Pair(int salary, String name) {
            this.salary = salary;
            this.name = name;
        }
    }
}
