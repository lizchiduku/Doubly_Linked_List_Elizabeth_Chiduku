package com.codingdojo.dll;
public class DLLTest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dll dL = new Dll();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        
        dL.push(n1);
        dL.push(n2);
        dL.push(n3);
        dL.push(n4);
        dL.push(n5);
        dL.push(n6);
        
        dL.printValuesForward();
        System.out.println(dL.contains(100));
        System.out.println("Number of nodes in the list: " + dL.size());
        dL.pop();
        dL.printValuesForward();
        dL.pop();
        dL.printValuesForward();
        System.out.println(dL.contains(100));
        System.out.println("Number of nodes in the list: " + dL.size());
	}

}