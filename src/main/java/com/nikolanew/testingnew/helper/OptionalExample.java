package com.nikolanew.testingnew.helper;

public class OptionalExample {


    public static void main(String[] args) {
        /*var s = new String[10];

        Optional<String> optional = Optional.ofNullable(s[5]);

        if (optional.isPresent()) {
            System.out.println(optional.get().toLowerCase());

        }
        var s2 = new String[]{"e", "d", "f", "g"};
        Optional<String[]> optionalArr = Optional.of(s2);

        System.out.println("---------------------");
        System.out.println(optionalArr.isPresent());

        System.out.println(Arrays.toString(optionalArr.get()));
        System.out.println(Stream.of(optionalArr.get()).filter(a -> a.equals("e")));
        var test = Stream.of(optionalArr.get()).filter(a -> a.equals("e")).findFirst();

        Predicate<Integer> pre = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 5;
            }
        };

        var list = new ArrayList<Integer>();
        var listOfOptional = new ArrayList<Optional<Integer>>();
        var listOfList = new ArrayList<List<Integer>>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
            listOfOptional.add(Optional.of(i));
            var inner = new ArrayList<Integer>();

            for (int j = 0; j < 20; j++) {
                inner.add(j);
            }
            listOfList.add(inner);

        }

        // for(int i=0, s=0; i<5; i+=s, s=-s+1)

        //list.stream().filter(l -> pre.test(l)).forEach(System.out::println);
        //listOfOptional.parallelStream().filter(l -> pre.test(l.get())).map(l -> l.get()).forEach(System.out::print);

        // listOfOptional.stream().


        var predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        };
        var a = listOfList.stream().flatMap(l -> l.stream())
            .filter(l -> predicate.test(l)).sorted().collect(Collectors.toSet()).stream().sorted()
            .collect(
                Collectors.toList());
        System.out.println(a); */

        fibSeries();

    }

    static void fibSeries() {
        var count = 10;
        int n1 = 0, n2 = 1, n3 = 0;

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }
}


