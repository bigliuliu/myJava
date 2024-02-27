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
//  学习hashset
//        Set<String> set =  new HashSet<>();
//        set.add("ad");
//        set.add("bb");
//        set.add("ab");
//        System.out.println( set.contains("bb"));
//        System.out.println(set.remove("ab"));
//        System.out.println(set.size());
//        System.out.println(set);
////        //学习tressset和treemap类似，是有序的
//        Set<String> setTree = new TreeSet<>();
//        setTree.add("ad");
//        setTree.add("bb");
//        setTree.add("ab");
//        System.out.println(setTree);
//学习队列
//        Queue<String> q = new LinkedList<>();
////        对列添加数据
//        q.offer("add");
//        q.offer("dfd");
//        q.add("ooo");
////        队列取数据
////        poll ,remove 取队列首元素并删除
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        q.offer("add");
//        q.offer("dfd");
//        q.add("ooo");
////        peek ,element 取队列首元素不删除
//        System.out.println(q.peek());
//        System.out.println(q.peek());
//        System.out.println(q.peek());
//        System.out.println(q.peek());
////add,remove,element 是抛出异常，其他是返回false或者null
//        -----------------尝试修复priorityQueue---------------------
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Tom", "A10"));
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}
class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小
            //            return u1.number.compareTo(u2.number);
//            fixed
            int u1Int = Integer.parseInt(u1.number.substring(1));
            int u2Int = Integer.parseInt(u1.number.substring(1));
            return u1Int-u2Int;
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}
class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}