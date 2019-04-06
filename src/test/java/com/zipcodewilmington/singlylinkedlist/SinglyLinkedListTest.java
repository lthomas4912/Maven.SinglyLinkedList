package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest<E> {


    SinglyLinkedList<String> list = new SinglyLinkedList<String>();


        @Test
        public void addTest(){
          //Given
          list.addNode("Hello");

            Assert.assertEquals(1, list.size());
         }

        @Test
        public void addMultipleNodesTest(){
            list.addNode("Hi");
            list.addNode("Hello");
            list.addNode("Hola");

            Assert.assertEquals( 3, list.size());
        }


        @Test
        public void removeMultipleNodesTest(){
            list.addNode("Something");
            list.addNode("Where");
            list.addNode("Rainbow");

            list.remove(2);
            list.remove(1);

            Assert.assertEquals(1, list.size() );

        }

        @Test
        public void removeOneNodeTest(){
            list.addNode("Who dat");
            list.addNode("We Dem");

            list.remove(0);

            Assert.assertEquals(1, list.size());
        }


        @Test
        public void getNodeTest(){
            list.addNode("We Dem Boys");
          String expected = "We Dem Boys";

          list.addNode(expected);



            Assert.assertEquals(expected, list.get(0));
        }

        @Test
        public void containsTest(){
            String expected = "Sometimes I wonder";
            String expected2 = "How, what?";
            list.addNode(expected);
            list.addNode(expected2);

            boolean actual = list.contains(expected);
            boolean other = list.contains(expected2);

            Assert.assertFalse(actual);
            Assert.assertTrue(other);
        }

        @Test
        public void sizeTest(){
            list.addNode("Something, something, Darkside");
            list.addNode("Winter is coming");
            list.addNode("You know nothing, Jon Snow");
            list.addNode("Type + distance = No door hold");

            Assert.assertEquals(4, list.size());
         }

//        @Test
//        public void sortTest(){
//            list.addNode( "A");
//            list.addNode( "D");
//            list.addNode("V");
//
//            list.sort();
//
//           String [] expected = new String [] {"A","D","V"};
//           String [] actual = (String[]) list.getAll(( new String [3]));
//
//        }

}
