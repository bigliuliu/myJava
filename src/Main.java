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
//        -----------------stack 课后作业---------------------
//        请利用Stack把一个给定的整数转换为十六进制：
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }
    static String toHex(int n) {
        Deque<String> deque = new LinkedList<>();
        int chuNum = n/16;
        int yuNum = n%16;
        do{
            if(yuNum<10){
                deque.addFirst(Integer.toString(yuNum));
            }
            else {
                switch (yuNum){
                    case 10:
                        deque.addFirst("A");
                        break;
                    case 11:
                        deque.addFirst("B");
                        break;
                    case 12:
                        deque.addFirst("C");
                        break;
                    case 13:
                        deque.addFirst("D");
                        break;
                    case 14:
                        deque.addFirst("E");
                        break;
                    case 15:
                        deque.addFirst("F");
                        break;
                }
            }
            int t = chuNum;
            chuNum = chuNum/16;
            yuNum = t%16;
            if (chuNum == 0){
                deque.addFirst(Integer.toString(yuNum));
            }
        }while(chuNum >0);
//        将队列转换为string
        StringBuilder str = new StringBuilder();
        for(String key: deque){
            str.append(key);
        }
        System.out.println(deque+"-------------"+str);
        return str.toString();
    }

}