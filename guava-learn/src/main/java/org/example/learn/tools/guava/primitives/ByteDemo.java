package org.example.learn.tools.guava.primitives;

import com.google.common.primitives.Bytes;

import java.util.List;

public class ByteDemo {
    public static void main(String args[]){
        ByteDemo tester = new ByteDemo();
        tester.testBytes();
    }

    private void testBytes(){
        byte[] byteArray = {1,2,3,4,5,5,7,9,9};

        //convert array of primitives to array of objects
        List<Byte> objectArray = Bytes.asList(byteArray);
        System.out.println(objectArray.toString());

        //convert array of objects to array of primitives
        byteArray = Bytes.toArray(objectArray);
        System.out.print("[ ");
        for(int i = 0; i< byteArray.length ; i++){
            System.out.print(byteArray[i] + " ");
        }
        System.out.println("]");
        byte data = 5;
        //check if element is present in the list of primitives or not
        System.out.println("5 is in list? "+ Bytes.contains(byteArray, data));

        //Returns the index		
        System.out.println("Index of 5: " + Bytes.indexOf(byteArray,data));

        //Returns the last index maximum		
        System.out.println("Last index of 5: " + Bytes.lastIndexOf(byteArray,data));
    }//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/guava/guava_bytes.html


}
