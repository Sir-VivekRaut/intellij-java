public class JDemo extends Demo{
    int data = 0;
     public void getInfo(){
         data = setInfo();
     }
    public static void main(String[]args){
    }
}
abstract class Demo{
    int data = 6900;

    void getInfo(){
    }

    int setInfo(){
        return data;
    }
}
