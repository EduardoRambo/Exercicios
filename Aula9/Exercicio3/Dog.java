public class Dog extends Animal {

    private int barkVolume;
    private int snarlVolume;
    private int howlVolume;
    
    
    //Constructor
    public Dog(String animalName, int age, int barkVolume, int snarlVolume, int howlVolume) {
        this.animalName = animalName;
        this.age = age;
        this.barkVolume = barkVolume;
        this.snarlVolume = snarlVolume;
        this.howlVolume = howlVolume;
    }
    
    
    //Getter
    
    public int getBarkVolume() {
        return this.barkVolume;
    }
    
    public int getSnarlVolume() {
        return this.snarlVolume;
    }
    
    public int getHowlVolume() {
        return this.howlVolume;
    }
    
    
    //Setter
    
    public void setBarkVolume(int barkVolume) {
        this.barkVolume = barkVolume;
    }
    
    public void setSnarlVolume(int snarlVolume) {
        this.snarlVolume = snarlVolume;
    }
    
    public void setHowlVolume(int howlVolume) {
        this.howlVolume = howlVolume;
    }
    
    
    //Methods
    
    public String bark() {
        if (barkVolume <=5) {
            return "Bark"; 
        } else return "BARRKK!!";
    }
    
    public String howl() {
        if (howlVolume <=5) {
            return "Awooo";
        } else return "AWOOOOO!!";
    }
    
    
     @Override 
    public String toString() {
        return "That's toString Dog"
             + "\nAnimal name: " + this.animalName
             + "\nAge: " + this.age
             + "\nMeowing Volume: " + this.barkVolume
             + "\nPurring Volume: " + this.snarlVolume
             + "\nHiss Volume: " + this.snarlVolume
             + "\nIs it meowing? " + this.bark() 
             + "\nIs it Purring? " + this.howl()
             + "\n";
    }
}