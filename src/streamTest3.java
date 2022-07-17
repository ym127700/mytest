import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class streamTest3 {

    List<Book> list = new ArrayList<>();
    //1  言情     2  武侠    3  科幻    4  悬疑
    Map<Integer,String> typeMap = new HashMap<>();

    @Before
    public void init(){
        list.add(new Book(1001,"天龙八部1",1,20.45));
        list.add(new Book(1002,"天龙八部2",2,21.45));
        list.add(new Book(1003,"天龙八部2",2,21.45));
        list.add(new Book(1004,"天龙八部4",2,53.45));
        list.add(new Book(1005,"天龙八部5",3,20.45));
        list.add(new Book(1006,"天龙八部6",1,60.45));
        list.add(new Book(1007,"天龙八部7",2,20.45));

        typeMap.put( 1,"宴请");
        typeMap.put( 2,"武侠");
        typeMap.put( 3,"科幻");
        typeMap.put( 4,"悬疑");
    }

    @Test
    public void test1(){
        list.forEach(System.out::println);
    }

    @Test
    public void test2(){
        list.stream().filter(a->a.getType()==1).forEach(System.out::println);
    }

    @Test
    public void test3(){
        list.stream().filter(a->a.getType()==2 && a.getPrice()>50 ).forEach(System.out::println);
    }

    @Test
    public void test4(){
        list.stream().filter(a->a.getPrice()>50 ).map(Book::getType).forEach(System.out::println);
    }

    @Test
    public void test5(){
        Double total = list.stream().collect(Collectors.summingDouble(Book::getPrice));
        System.out.println(total);
    }

    @Test
    public void test6(){
       list.stream().skip((2-1)*2).limit(2).forEach(System.out::println);
    }

    @Test
    public void test7(){
        list.stream().sorted((x1,x2)->-Double.compare(x1.getPrice(),x2.getPrice())).forEach(System.out::println);
    }

    @Test
    public void test8(){
        Optional<Book> optional = list.stream().max((x1, x2) -> Double.compare(x1.getPrice(), x2.getPrice()));
        Book book = optional.get();
        System.out.println(book);
    }


    @Test
    public void test9(){
        //List<Integer> list = this.list.stream().map(Book::getBid).collect(Collectors.toList());
        //Set<Integer> set = this.list.stream().map(Book::getBid).collect(Collectors.toSet());


        System.out.println(list);
    }

    @Test
    public void test10(){
        Map<Integer, Book> map = this.list.stream().collect(Collectors.toMap(Book::getBid, a -> a));
        System.out.println(map);
    }


    @Test
    public void test11(){
        //Double aDouble = this.list.stream().collect(Collectors.summingDouble(Book::getPrice));
        //long count = this.list.stream().map(Book::getType).distinct().collect(Collectors.summarizingInt(a -> a)).getCount();
        DoubleSummaryStatistics summaryStatistics = this.list.stream().collect(Collectors.summarizingDouble(Book::getPrice));
        double average = summaryStatistics.getAverage();
        double max = summaryStatistics.getMax();
        long count = this.list.stream().count();
        System.out.println(count);
    }

    @Test
    public void test12(){
        Map<Integer, List<Book>> map = this.list.stream().collect(Collectors.groupingBy(Book::getType));
        System.out.println(map);
    }


    @Test
    public void test13(){
        //List<Book> list ---> List<BookVo>
        List<BookVo> voList = this.list.stream().map(a -> {
            BookVo bookVo = new BookVo();
            bookVo.setType(a.getType());
            bookVo.setBid(a.getBid());
            bookVo.setBname(a.getBname());
            bookVo.setPrice(a.getPrice());
            //通过id 去数据库查询typeName
            bookVo.setTypeName(this.typeMap.get(bookVo.getType()));
            return bookVo;
        }).collect(Collectors.toList());
        System.out.println(voList);
    }

    



}
