package demoArrayList;

public class Animal {
	private String name;
	private int age;
	private float weight;
	
	
	public Animal(String name, int age, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}


	public void say() {
		System.out.println("Demo phai thanh cong. ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
