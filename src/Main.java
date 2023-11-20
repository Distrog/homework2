import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        //Задача 2
        dog+=4;
        System.out.println(dog);
        cat+=4;
        System.out.println(cat);
        paper+=4;
        System.out.println(paper);
        //Задача 3
        dog-=3.5;
        System.out.println(dog);
        cat-=3.6;
        System.out.println(cat);
        paper-=7639;
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);
        //Задача 6
        var weight1 = 78.2;
        System.out.println(weight1);
        var weight2 = 82.7;
        System.out.println(weight2);
        var sumWeight = weight1+weight2;
        System.out.println(sumWeight);
        var differenceWeight = weight2-weight1;
        System.out.println(differenceWeight);
        //Задача 7
        var differenceWeight1 = weight2-weight1;
        System.out.println(differenceWeight1);
        var differenceWeight2 = weight2%weight1;
        System.out.println(differenceWeight2);
        //Задача 8.1
        var workTime = 640;
        var oneWorkerTime = 8;
        var workers = workTime/oneWorkerTime;
        System.out.println("Всего работников в компании - "+workers+" человек.");
        //Задача 8.2
        workers +=94;
        workTime = oneWorkerTime*workers;
        System.out.println("Если в компании работает "+workers+" человек, то всего "
                +workTime+" часов работы может быть поделено между сотрудниками.");
    }
}