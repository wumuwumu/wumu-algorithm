package cn.sciento.algorithm.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Train {

    public static void main(String[] args){
        priorityQueue();
    }

    public static void priorityQueue(){
        PriorityQueue<Person> queue = new PriorityQueue((o1, o2) -> {
            Person p1 = (Person) o1;
            Person p2 = (Person) o2;
            if(p1.getAge() < p2.getAge()){
                return 1;
            }
            return -1;
        });
        Person p1 = new Person();
        p1.setAge(2);
        p1.setName("2");
        Person p2 = new Person();
        p2.setName("3");
        p2.setAge(3);
        queue.offer(p1);
        queue.add(p2);
        System.out.println(queue);
        Person p = queue.peek();
        System.out.println(p);
    }


     static  class Person{
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             return "Person{" +
                     "age=" + age +
                     ", name='" + name + '\'' +
                     '}';
         }
     }
}
