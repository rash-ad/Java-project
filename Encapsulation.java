
public class Encapsulation{
   static  class human{
        private String name;
        private int age;
        private String  Grade;
        public int getAge(){
            return age;
        }
        public void setName(String name){
             this.name=name;
        }
        public void setAge(int age){
           this.age=age;
        }
        public void setGrade(String Grade){
            this.Grade=Grade;

       }
        public int getName(){
            return age;
        }
        public String getGrade() {
            return Grade;
        }
       
        
    }
  public static void main(String[] args) {
      human obj1=new human();
      obj1.setName("ravi");
      obj1.setAge(20);
      obj1.setGrade("A+");
      System.out.println(obj1.getName()+" "+obj1.getAge()+""+" "+obj1.getGrade());

      human obj2=new human();
      obj2.setName("rolex");
      obj2.setAge(21);
      obj2.setGrade("B");
      System.out.println(obj2.getName()+" "+obj2.getAge()+" "+obj2.getGrade());
      


  }  
}