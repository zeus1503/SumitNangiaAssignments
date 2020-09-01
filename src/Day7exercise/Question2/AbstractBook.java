package Day7exercise.Question2;
import java.util.*;

abstract class Book{

    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

class MyBook extends Book{
    void setTitle(String s) {
        title = s;
    }
}



