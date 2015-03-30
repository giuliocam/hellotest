import org.junit.Test;

public class Hello {

    public String getMessage(int n) {
        String out = "";
        if(n > 1){
            for(int i=0;i<n;i++) {
                out += "msg";
            }
        }
        return out;
    }

}


