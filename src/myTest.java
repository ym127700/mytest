import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class myTest {


    public static void main(String[] args) {

        // lambda表达式理解  就是  接口函数  的实现
        // 当接口中  只有一个抽象方法 需要去实现  那么这个接口就是 接口函数  可以使用lambda实现
        // lambda实际就是一个函数  这个函数就是用来实现 接口函数中的抽象方法
        // () 是参数    ->后面   是方法体
        Runnable run = ()-> System.out.println("1111111111");

        Com c = (x1,x2)-> x1+x2 ;
        int num = c.add(1,2);

        //自定义接口函数  分别使用lambda实现接口函数;
          //1  接收一个参数   无返回结果        消费型
          //2  不接受参数    返回一个结果       供给型
          //3  接收一个参数   有一个返回结果     函数型
          //4  接收两个参数    返回一个boolean类型的记过     断言型
        MyUtils myUtils = new MyUtils();

        Consumer<String> con = System.out::println;

        Comparator<Integer> com = Integer::compare;

        Student student = new Student();


        Function<Student,String> fun = (a)->a.getName();

        


    }
}
