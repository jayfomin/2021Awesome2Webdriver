public class MyClass {

    public MyClass(String param){
        // i cna do some additional stuff here
        System.out.println("Constructor with params:" + param);
    }

    public MyClass() {
        //i can do some additional stuff here
        System.out.println("Constructor with no params");
    }

    public void print(){
        System.out.println("printer");
    }

    public String print(String parameterValue){
        String result;

        result = parameterValue + "printed";

        return result;

    }
}
