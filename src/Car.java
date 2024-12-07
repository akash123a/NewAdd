
public class Car {

                Car() {
                System.out.println("Inside Default Contructor");
                }

                            Car(String name) {

                            this();
                            this.name = name;
                            System.out.println("Inside Parameterized Construtor");
                }

    }

}
