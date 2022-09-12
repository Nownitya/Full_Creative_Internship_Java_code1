package Java.G1_Java_Generics_Class;

//  Create a Generics Class
class Main1 {
    public static void main(String[] args) {

        //  initialization generic class with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic class returns: " + intObj.getData());

        //  initialize generic class with string data
        GenericsClass<String> stringObj = new GenericsClass<>("Java is a Programming Language");
        System.out.println("Generic Class returns: "+ stringObj.getData());
    }
}

class GenericsClass<T> {

    //  variable of T type
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    //  method that return T type variable
    public T getData() {
        return this.data;
    }
}

