import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        method1();

//        System.out.println(method4());
//        metho5();
        method6();

    }

    public static void method1() {

        HashMap<Integer, List<Integer>> mapList = new HashMap<>();

        mapList.put(1, Arrays.asList(1, 2));
        mapList.put(2, Arrays.asList(2, 3));
        mapList.put(3, Arrays.asList(3, 4));

        for (Map.Entry<Integer, List<Integer>> entry : mapList.entrySet()) {

            System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue());

        }

    }

    public static void method2() {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);

        Integer i = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(entry.getValue() + i);
            i++;

        }

    }

    public static boolean method3() {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(5, 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getKey() == 5) {
                return true;
            }
        }
        return false;
    }

    public static Integer method4() {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);
        map.put(5, 1);
        map.put(6, 3);
        map.put(7, 1);
        map.put(8, 1);
        map.put(9, 1);
        map.put(10, 2);

        Integer count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue().equals(entry.getValue())) {
                    count++;
                }

            }
            return count;
        }
        return count;
    }

    public static void metho5() {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);
        map.put(5, 1);
        map.put(6, 1);
        map.put(7, 1);
        map.put(8, 1);
        map.put(9, 1);
        map.put(10, 1);

        map.remove(9);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue() + "; ");
        }

    }

    public static void method6() {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 11);
        map.put(2, 12);
        map.put(3, 13);
        map.put(4, 14);
        map.put(5, 15);
        map.put(6, 16);
        map.put(7, 17);
        map.put(8, 18);
        map.put(9, 19);
        map.put(10, 21);

        HashMap<Integer,Integer> map1=new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            map1.put(entry.getValue(),entry.getKey());
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue() + "; ");
        }

    }

}