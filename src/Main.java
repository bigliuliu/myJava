import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.time.DayOfWeek;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        --------------学习list-----------
//        List<String> list = new ArrayList<>();
//        list.add("first one");
//        list.add("second one");
////    允许重复
//        list.add("first one");
//        list.add(null);
//        System.out.println(list.size());
//        String first = list.get(0);
//        System.out.println(first);
////        list of 不接受null,并且返回只读的list，
//        List<Integer> list2 = List.of(1,33,34,434);
////        list2.add(2323); 会报错
//        System.out.println(list2);
////        遍历方式不推荐，太低效
////        for (int i= 0;i<list2.size();i++){
////            Integer ii = list2.get(i);
////            System.out.println(ii);
////        }
////        推荐使用迭代器iterator.写法复杂
////        for(Iterator<Integer> it = list2.iterator();it.hasNext();){
////            Integer ii = it.next();
////            System.out.println(ii);
////        }
//        //    for each 本身可以帮助使用iterator---最常用
//        for(Integer it: list2){
//            System.out.println(it);
//        }
////        list to array
//        Integer[] array = list2.toArray(Integer[]::new);
//        System.out.println(array);
////        array to list
//        Integer[] array2 = {1,2,3};
//        List<Integer> list3 = List.of(array2);
//        System.out.println(list3);
//        ------------使用Map ----------
//        Student s = new Student("ll",56);
//        Map<String,Student> map = new HashMap<>();
////        将ll 和Student 实例映射并关联
//        map.put("ll",s);
//        Student target = map.get("ll");
//        System.out.println(target.name);
//        System.out.println(target.score);
//        System.out.println(map.get("oo"));
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("apple1", 123);
//        map1.put("pear", 456);
//        map1.put("orang",12);
//        map1.put("apple2", 789);
//        通过遍历key来遍历map
//        for (String key : map1.keySet()){
//            Integer value = map1.get(key);
//            System.out.println(key+"="+value);
//        }
//        同时遍历key和value遍历map
//        for (Map.Entry<String,Integer> entry:map1.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key+"="+value);
//        }
//        学习enumMap
        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
//        学习Treemap
        Map<String,Integer> mapTree = new TreeMap<>();
        mapTree.put("a",1);
        mapTree.put("c",3);
        mapTree.put("b",2);
        for (String key: mapTree.keySet()){
            System.out.println(key);
            System.out.println(mapTree.get(key));
        }
    }
}

//class Student{
//    public String name;
//    public int score;
//    public Student(String name,int score){
//        this.name = name;
//        this.score = score;
//    }
//}

