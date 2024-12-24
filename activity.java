public class Activity{
    public static void main(String[] args){

        Dog puppy = new Dog();

        puppy.setName("Aiah");

        System.out.println(puppy.showName());

        puppy.bark();

        puppy.listofpuppies = new String[] {"Maloi", "Colet", "Gwen", "Mikha", "Staku", "Jho", "Sheena"};

        int shownumber = puppy.show_numofpuppies();

        System.out.println("Number of puppies: " + shownumber);

        puppy.show_numofpuppies();

        puppy.showpuppies();
    }
}