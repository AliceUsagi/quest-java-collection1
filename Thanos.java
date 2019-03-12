import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
	ArrayList<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

	Hero name1 = new Hero("Black Widow", 34);
	Hero name2 = new Hero ("Captain America", 100);
	Hero name3 = new Hero ("Vision", 3);
	Hero name4 = new Hero ("Iron Man", 48);
	Hero name5 = new Hero ("Scarlet Witch", 29);
	Hero name6 = new Hero ("Thor", 1500);
	Hero name7 = new Hero ("Spider-Man", 18);
	Hero name8 = new Hero ("Hulk", 49);
	Hero name9 = new Hero ("Doctor Strange", 42);

	heroes.add(name1);
	heroes.add(name2);
	heroes.add(name3);
	heroes.add(name4);
	heroes.add(name5);
	heroes.add(name6);
	heroes.add(name7);
	heroes.add(name8);
	heroes.add(name9);

        // TODO 3 : It's Thor birthday, now he's 1501
	
	Hero thorage = new Hero ("Thor", 1501);	
	heroes.set(5, thorage);	

        // TODO 4 : Shuffle the heroes list
	
	Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
	
	 List<Hero> list1 = heroes.subList(0, 4); 

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

	for (int i = 0; i < list1.size(); i++) 
	{
    		Hero Heroes = list1.get(i);
		System.out.println(Heroes.getName());
	}
    }
}
