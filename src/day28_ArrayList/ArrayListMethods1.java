package day28_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

        numbers.add(2, 25); //2
        numbers.add(5, 45); //5

        System.out.println(numbers);


        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size() - 1);

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println(".............................");



                ///---> Java ArrayList Kullanımı Örneği <---\\\
                List<Integer> myRandomList = new ArrayList<>();
                Random random = new Random();
                int value, total = 0, cift = 0, tek = 0;
                System.out.print("----------------------\n< Random ArrayList Oluşturma >\n----------------------\n-> Oluşturulan Dizi Elemanları: ");
                for (int i = 0; i < 10; i++) {
                    value = random.nextInt(1000) + 1;
                    myRandomList.add(value);
                    total += myRandomList.get(i);
                    if (myRandomList.get(i) % 2 == 0)
                        cift += 1;
                    else
                        tek += 1;
                }
                    System.out.print("[" + myRandomList.get('i') + "] ");

                   // Bir ip ile lastik bir bant düşünelim. Lastik bantın yapısı gergin olmadığında küçük olmasına rağmen, bantı çektikçe uzamaktadır.
                    //ArrayList’de lastik bant gibi içine değer aktarıldığında büyümekte içerisinden değer çıkarıldığında küçülmektedir.
                    // Diziyi ip olarak düşünürsek ipin uzunluğu sabit olduğu için her hangi bir büyüme ve küçülme söz konusu değildir.

                }


            }



