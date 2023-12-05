package md.orange.accessmodifiers.peopleevidence;

public class Person {
    public String name;
    public String surname;
    public long ID;
    public int age;
    public String sex;
    public String residence;
    public Boolean isRetired;


        public void setAge (int inputAge){
            if (inputAge > 0) {
                if(inputAge<128) {
                    this.age = inputAge;
                    System.out.println("The age was set");
                }else {
                    System.out.println("Age is exceeded");
                }
                this.age = inputAge;

                }

         }

    }





