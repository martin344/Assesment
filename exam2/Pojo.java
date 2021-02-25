package com.kctech.exam2;

import java.util.ArrayList;

class Pojo{
    int num;

    public Pojo(int num) {
        super();
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

public static void main(String args[])
{

ArrayList<Pojo>list = new ArrayList<Pojo>();
            list.add(new Pojo(5));
            list.add(new Pojo(3));
            list.add(new Pojo(4));
            list.add(new Pojo(55));
            list.add(new Pojo(2));

            int totalSum = list.stream().mapToInt(pojo -> pojo.getNum()).sum();
            System.out.println(totalSum);
            }
            }
            