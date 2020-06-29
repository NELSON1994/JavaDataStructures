package com.javacollections.nelson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//=========================================LISTS====================================================================================================================================
        List list = new ArrayList();
        list.add("nelson");
        list.add("moses");
        list.add("33333");
        list.add("bbbbbb");
        list.add("33333");
        list.add("bbbbbb");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Iterator iterator=list.iterator();
        ListIterator iterator1=list.listIterator();
        int i=0;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(list);
            int a=list.size();
            System.out.println(a);
            if (a==0){
                System.out.println("This is the end of the list");
                System.out.println("After this rounds   >>>:::" +i);
            }

            i++;
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            iterator1.remove();
            System.out.println(list);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


//=================================================================================SETS==============================================================================================
        Set listt = new HashSet();
        listt.add("nelson");
        listt.add("moses");
        listt.add("moses");
        listt.add("33333");
        listt.add("33333");
        listt.add("bbbbbb");

        System.out.println(listt);
        System.out.println(listt.size());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Iterator iteratorr=listt.iterator();
        while (iteratorr.hasNext()){
            System.out.println(iteratorr.next());


        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //========================further implementation of sets==========================================================================================

        SortedSet sortedSet=new TreeSet();
        sortedSet.add("1");
        sortedSet.add("2");
        sortedSet.add("3");
        sortedSet.add("6");
        sortedSet.add("7");
        sortedSet.add("10");
        sortedSet.add("11");
        sortedSet.add("15");

        System.out.println("The sortedSet is ");
        System.out.println(sortedSet);

        NavigableSet navigableSet=new TreeSet();


        Iterator iterator2=sortedSet.iterator();
        int m=0;
        if(m<=sortedSet.size()) {
            while (iterator2.hasNext()) {
                SortedSet h = sortedSet.headSet(iterator2.hasNext());
                SortedSet k = sortedSet.tailSet(iterator2.hasNext());
                System.out.println(iterator2.next());
                m++;
            }
        }
//=========================================================MAPS===============================================================================================================================
        Map<String,String> map= new HashMap<>();
        map.put("A" , "1");
        map.put("B" , "2");
        map.put("C" , "3");
        map.put("D" , "4");
        map.put("E" , "5");
        map.put("F" , "6");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(map);

        boolean containsKey=map.containsKey("A");
        boolean containsKey1=map.containsKey("a");
        System.out.println(containsKey);
        System.out.println(containsKey1);// false
       // if (containsKey==true){
        // check if map is empty
        if (map.isEmpty()){
            System.out.println("NO items found in the map");
        }
        else{
            // iterating the map with  Iterator
            Iterator<String> iterator3=map.keySet().iterator();
            while (iterator3.hasNext()){
                String key=iterator3.next();
                String value=map.get(key);
                System.out.println(key);
                System.out.println(value);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
            // iterating the map with for each
            for (String one:map.keySet()){
                String value=map.get(one);
                System.out.println(one);
                System.out.println(value);
            }
          // size of map
            int a=map.size();
            System.out.println("The size of map is   :" +a);

            // removing elements
//            for (String one:map.keySet()){
//                String value=map.remove(one);
//                System.out.println("Removing this element  :" +value);
//            }

            // clear the map
            map.clear();
        }

 //=======================================================================================================QUEUE=====================================================================

        Queue<String> queue=new LinkedList<>();// create a generic String queue
        // adding elements  to queue using add() and offer()
        queue.add("AAAAA");
        queue.add("BBBBB");
        queue.add("CCCCC");
        queue.add("DDDDD");
        queue.add("EEEEE");
        queue.add("FFFFF");
        queue.add("GGGGG");
        queue.add("HHHHH"); // when the queue is full, throws exception
        queue.add("IIIII");

        queue.offer("ZZZZZ");  // when the queue is full, throws false
        queue.offer("VVVVV");

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(queue);

        // size of the queue
        int s=queue.size();
        System.out.println("The size of the queue is  :" +s);

        // clear elements
         //queue.clear();
        int ss=queue.size();
        if (ss==0){
            System.out.println("The size of the queue is  :" +ss);
            System.out.println("The QUEUE IS EMPTY" );
        }

        // remove element using remove()--> returns exception if queue is empty and poll()--> returns null if queue is empty
        boolean con = queue.contains("VVVVV");// checking if a queue has a given element // /// returns true or false
        if (queue.isEmpty()){
//            String rem="";
//            rem=queue.remove();// removes the first element
//            System.out.println(queue);
            System.out.println("The QUEUE IS EMPTY" );
        }
        else{
            Queue<String> queue1=new LinkedList<>();
            queue1.addAll(queue);// copy queue to queue1
            System.out.println("COPYING QUEUE TO QUEUE 1  :" +queue1);
            System.out.println("The QUEUE IS  :" +queue);

            // get first element
            String firstelement=queue.element();
            System.out.println("The first value is  :" +firstelement);

            // get first element
            String firstelement1=queue.peek();
            System.out.println("The first value is  :" +firstelement1);
            // iterate the queue
            Iterator<String> iterator3=queue.iterator();
            while(iterator3.hasNext()){
                String next=iterator3.next();
                System.out.println("The value is  :" +next);
            }
            // or iterate using for Each
            for (String vv:queue){
                System.out.println(vv);
            }
        }
//======================================================DEQUEUE==================================================================
        Deque<String> deque=new LinkedList<>();
        //add to head====add(),offer(),offerFirst(),addFirst(),push()
        deque.add("aaaaa");
        deque.add("bbbbb");
        deque.add("ccccc");
        deque.add("ddddd");
        deque.offer("ffff");
        deque.offer("ggggg");
        deque.addFirst("hhhhh");
        deque.offerFirst("jjjjj");
        //add to tail====addLast(),offerLast(),
        deque.addLast("vvvvvv");
        deque.offerLast("zzzzzz");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(deque);
        // OUTPUT ====[jjjjj, hhhhh, aaaaa, bbbbb, ccccc, ddddd, ffff, ggggg, vvvvvv, zzzzzz]
        List<String > j= new ArrayList<>();
        j.add("dvvvvv");
        j.add("mnnnnn");
        j.add("sfgggg");
        j.add("rtyhhhh");
        for(String b:j){
            deque.push(b);// add
        }
       // deque.push(j.toString());// push()----> used to add elements to dequeue
        System.out.println(deque);
        //OUTPUT=====>[rtyhhhh, sfgggg, mnnnnn, dvvvvv, jjjjj, hhhhh, aaaaa, bbbbb, ccccc, ddddd, ffff, ggggg, vvvvvv, zzzzzz]

        // get first element
        String aa=deque.peek();//at head
        String ab=deque.peekFirst(); //at head
        String ac=deque.peekLast();   // at tail
        System.out.println(aa);
        System.out.println(ab);
        System.out.println(ac);

        // size of the deque
        int v=deque.size();
        System.out.println(v);
        // check if it contains
        boolean contains=deque.contains("vvvvvv");
        System.out.println(contains);

        // iterate over deque using ITERATOR()
        Iterator<String> iterator3=deque.iterator();
        Set<String> sets=new HashSet<>();
        Set<String> set3=new HashSet<>();
        while(iterator3.hasNext()){
            String valuee=iterator3.next();
            sets.add(valuee);
        }
        System.out.println("Values copied to the set are from Iterator() :" +sets);//values

        // iterate using for Each
        for (String z:deque){
            set3.add(z);
        }
        System.out.println("Values copied to the set are from for Each loop :" +set3);//values

        String h=deque.peek();// return first element
        String hh=deque.peekFirst();// return first element
        String hhh=deque.peekLast();// return last element

        System.out.println(h);
        System.out.println(hh);
        System.out.println(hhh);

        String ha=deque.poll();// return first element
        String hha=deque.pollFirst();// return first element
        String hhha=deque.pollLast();// return last element

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(ha);
        System.out.println(hha);
        System.out.println(hhha);

        //remove first elements from dequeue
        String dd=deque.pop();
        System.out.println(dd);
        System.out.println(deque);

        // clear deque
        deque.clear();


        // ============================================================STACK={{{LIFO}}}=============================================================
        Stack<String> stack=new Stack<>();
        stack.push("111111");
        stack.push("222222");
        stack.push("333333");
        stack.push("444444");
        stack.push("555555");

        System.out.println(stack);

        // size of stack
        int f=stack.size();
        System.out.println(f);

        //getting element at the top
        String nn=stack.peek();
        System.out.println(nn);

        // getting first element inserted
        String nnn=stack.firstElement();
        System.out.println(nnn);

        // search an element===> return >0 or -1(not found)
        int gg=stack.search("222222");
        System.out.println(gg);

        // removing elements in LIFO order
        String jj=stack.pop();
        System.out.println(jj);//555555

        //Iterating
        Iterator<String> stringIterator=stack.iterator();
        Iterator<String> stringIterator1=stack.listIterator();
        Set<String> stringSet=new HashSet<>();
        Set<String> stringSet1=new HashSet<>();
        while(stringIterator.hasNext()){
            String kk=stringIterator.next();
            stringSet.add(kk);
        }
        System.out.println(stringSet);


        while(stringIterator1.hasNext()){
        String ssss=stringIterator1.next();
            stringSet1.add(ssss);
        }
        System.out.println(stringSet1);


        // remove elements
       // remove all
        stack.removeAllElements();
        stack.clear();
    }
}
