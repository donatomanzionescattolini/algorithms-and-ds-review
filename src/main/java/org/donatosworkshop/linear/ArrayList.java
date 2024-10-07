package org.donatosworkshop.linear;

public class ArrayList {

    Node[] internalArray;

    void add(Node newNode){
        for(int i = 0;i<internalArray.length;i++){
            if(internalArray[i]==null){
                internalArray[i] = newNode;
                return;
            }
        }

        Integer oldLength = internalArray.length;
        Integer newLength=  oldLength + oldLength + (oldLength/2);

        Node[] newInternalArray = new Node[newLength];
        for(int i = 0; i < internalArray.length;i++){
            newInternalArray[i] = internalArray[i];
        }
        internalArray = newInternalArray;
        internalArray[oldLength]=newNode;
    }

    class Node {
        int data;
    }
}
