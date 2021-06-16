package Wlmt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test3 {
public static void main(String[] args) {

    //print(3);
    List<Integer> l1 = new ArrayList<>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    Set<Integer> s1 = new HashSet<>();
    s1.add(1);
    s1.add(2);
    s1.add(3);
    
    int batchId = 433;
    
    System.out.println(Arrays.asList(batchId));
    System.out.println(s1);
    System.out.println(s1.stream().collect(Collectors.toList()));
}


public static void print(int i) {
    
    if(i == 1) {
        System.out.println("We are in 1");
    }
    
    if(i == 2 || i == 3) {
        System.out.println("We are in 2 or 3");
        return;
    }
    
    if(i == 3) {
        System.out.println("We are in 3");
    }
}
}