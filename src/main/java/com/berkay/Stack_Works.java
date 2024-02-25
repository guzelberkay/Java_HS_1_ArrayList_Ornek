package com.berkay;

import java.util.Stack;

public class Stack_Works {
    /**
     * Yıgın
     * FILO
     * LIFO
     *
     * Bir stacl ouşturacağız
     * içerisinde 6,7 tane değer ekleyeceğiz
     * 100 TL den buyukleri başka bir stack yapısında toplayacağız
     * 100 TL den kucuk değerlerin ise toplamını bulup yazdıralım
     *
     */

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> yuzdenBuyukler = new Stack<>();
        int toplam = 0;
        stack.add(200);
        stack.push(50);
        stack.push(25);
        stack.push(125);
        stack.push(400);
        stack.push(20);

//        for (Integer para : stack){
//            System.out.println(para);
//            if (para>100){
//                yuzdenBuyukler.push(para);
//            }else {
//                toplam+=para;
//            }
//        }
        while (!stack.isEmpty()){
            if(stack.peek()>100){
                yuzdenBuyukler.push(stack.pop());
            }else {
                toplam+=stack.pop();
            }
        }
        System.out.println(toplam);
        System.out.println(yuzdenBuyukler);



    }
}

