import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamTest {

    public static void main(String[] args) {
        //Collection集合 产生  stream
        List<Integer> list = Arrays.asList(1,6,3,6,8,9);
        System.out.println( list.stream() );

        //数组 产生 stream
        int [] nums = {1,6,4,6,89,9};
        System.out.println(  Arrays.stream(nums) );

        //Stream静态方法 of
        System.out.println( Stream.of(1,2,4,6,75432,344,234,23) );

        //Stream.generate() 创建无限流
        Stream.generate( ()-> Math.floor(Math.random() * 100000 )  ).forEach(  System.out::println );




    }


}
