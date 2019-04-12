package work4;

abstract public class Hero {
   public enum Guns{
       ShotGun,
       SemiOto,
       Oto,
   }
    public enum Type{
       Atak,
       Defans,
   }
   
    public int age;
    protected String name;
    public Type type;
    public Guns guns;
    
    public Hero(int age,String name){
        this.age = age;
        this.name = name; 
        }
     
    public String getName(){
       return this.name = name;
    } 
    
    public void setName(String name){
        this.name = name;
    }
     
        
    }
    
    

