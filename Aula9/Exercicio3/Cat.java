public class Cat extends Animal {

    private int meowingVolume;
    private int purringVolume;
    private int hissVolume;
    
    
    //Constructor
    public Cat(String animalName,int age,int meowingVolume,int purringVolume,int hissVolume) {
        this.animalName = animalName;
        this.age = age;
        this.meowingVolume = meowingVolume;
        this.purringVolume = purringVolume;
        this.hissVolume = hissVolume;
    }
    
    
    //Getter
    
    public int getMeowingVolume() {
        return this.meowingVolume;
    }
    
    public int getPurringVolume() {
        return this.purringVolume;
    }
    
    public int getHissVolume() {
        return this.hissVolume;
    }
    
    
    //Setter 
    
    public void setMeowingVolume(int meowingVolume) {
        this.meowingVolume = meowingVolume;
    }
    
    public void setPurringVolume(int purringVolume) {
        this.purringVolume = purringVolume;
    }
    
    public void setHissVolume(int hissVolume) {
        this.hissVolume = hissVolume;
    }
    
    
    //Methods
    
    public String meow() {
        if (meowingVolume <= 5) {
            return "Meow";
        } else return "MEOWWW!!";
    }
    
    public String purr() {
        if (purringVolume <= 5) {
            return "Purrrrr";
        } else return "PURRRRRR";
    }
    
    @Override 
    public String toString() {
        return "That's toString Cat"
             + "\nAnimal name: " + this.animalName
             + "\nAge: " + this.age
             + "\nMeowing Volume: " + this.meowingVolume
             + "\nPurring Volume: " + this.purringVolume
             + "\nHiss Volume: " + this.hissVolume
             + "\nIs it meowing? " + this.meow() 
             + "\nIs it Purring? " + this.purr()
             + "\n";
    }
}