package com.nikolanew.testingnew.helper.generics_java;


public class TestGenericsClass<N> {

    N obj;

    TestGenericsClass(N obj) {
        this.obj = obj;
    }

    public N getName() {
        return obj;
    }

    public static void main(String[] args) {
        var test1 = new TestGenericsClass<Integer>(1);
        var test2 = new TestGenericsClass<String>("str");
        System.out.println(test1.getName());
        System.out.println(test2.getName());


    }
}
