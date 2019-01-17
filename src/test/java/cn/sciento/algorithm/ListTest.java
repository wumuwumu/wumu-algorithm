package cn.sciento.algorithm;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

    @Test
    public void add(){
        List<Integer> integerList = new List<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        int i = integerList.get(1);
        System.out.println(i);
        System.out.println(integerList.size());
        integerList.remove(1);
        System.out.println(integerList.get(1));
        System.out.println(integerList.size());
    }

    public void arrayList(){
        java.util.List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.remove(1);
        int size = list.size();
    }

    public void linkedList(){
        java.util.List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
    }

}