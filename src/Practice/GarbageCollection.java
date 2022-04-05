package Practice;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Wooden Spoon";// as you see, the previous object "Wooden Spoon is in the garbage collection,now.
               str = null; //and the new object "null" is being written on the console.

        System.out.println(str);

        System.out.println("...........................");

       String word = "Python";// and also the previous object  "Python" is in the garbage collection,now.

              word = "Java";// and the new object "Java" is being written on the console.

        System.out.println(word);

    }

}
/* the 1st way is making an object be unreferenced is;
// "wooden spoon object" has a reference name "str" now.It has not unreferenced,yet.
//So,one way to make this object unreferenced is assigning to a null keyword
//once you assigned the null keyword,this object is now eligible for garbage collection.
//and the java collector is going to collect it, runs the java heap and then destroys it.
//so, this is the one way is making the object unreferenced.

//the 2nd way is, in order to make an object to be unreferenced is,
if you can replace it by a new object. it means, with another word if you reaassign it by an another object.
any reference name if you reassign it,the previous object will be eligible for garbage collection.
for ex: suppose that..has shown that above example..
*/
//calculate the area and perimeter of a circle

