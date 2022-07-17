import java.util.Arrays;
import java.util.List;

public class streamTest2 {
    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(1,6,3,6,8,9,7,5);
        //forEach  终止操作   循环将stream中的数据 遍历
        //list.stream().filter(a->a>5).forEach( System.out::println );



        List<Student> list1 = Arrays.asList(
                new Student("晏攀丰",70), new Student("陶勇春",80),
                new Student("赵敢",78), new Student("刘锐",93),
                new Student("陈长青",65), new Student("郑杞",58),
                new Student("杨星宇",40), new Student("甘增荣",47)
                );

        //list1.stream().filter(a->a.getScore()<60).forEach(System.out::println);
        //list1.stream().limit(3).forEach(System.out::println);
        //list1.stream().skip(3).forEach(System.out::println);
        //list1.stream().map(Student::getScore).forEach(System.out::println);

        


    }
}
