import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
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
//-----------使用list的作业 1: list 有序-----------------
//        // 构造从start到end的序列：
//        final int start = 10;
//        final int end = 20;
//        List<Integer> list = new ArrayList<>();
//        for (int i = start; i <= end; i++) {
//            list.add(i);
//        }
//        // 随机删除List中的一个元素:
//        int removed = list.remove((int) (Math.random() * list.size()));
//        int found = findMissingNumber(start, end, list);
//        System.out.println(list.toString());
//        System.out.println("missing number: " + found);
//        System.out.println(removed == found ? "测试成功" : "测试失败");
        //-----------使用list的作业 1: list 整数无序-----------------
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
//    static int findMissingNumber(int start, int end, List<Integer> list) {
//        int missInt = 0;
//        if (list.getFirst() != start){
//            missInt = start;
//        } else if (list.getLast() != end) {
//            missInt = end;
//        }
//        else {
////            for (Integer i: list){
////                list.
////            }
//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i+1)-list.get(i) != 1){
//                    missInt = list.get(i)+1;
//                }
//            }
//        }
//        return missInt;
//    }
static int findMissingNumber(int start, int end, List<Integer> list) {
        int missInt = 0;
        List<Integer> list2 = new ArrayList<>(list);
        list2.sort(Comparator.naturalOrder());
        if (list2.getFirst() != start){
            missInt = start;
        } else if (list2.getLast() != end) {
            missInt = end;
        }
        else {
            for (int i = 0; i< list2.size(); i++) {
                if(i!= list2.size()-1){
                    if(list2.get(i+1)-list2.get(i) != 1){
                        missInt = list2.get(i)+1;
                    }
                }
            }
        }
    System.out.println(missInt+"result");
    return missInt;
}
}