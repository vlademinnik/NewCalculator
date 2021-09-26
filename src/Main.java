import impl.ArabCalcImpl;
import impl.Input;
import impl.RomanCalcImpl;
import impl.Separator;

public class Main {
    public static void main(String[] args) {
        String[] data = Input.input();
        if(Separator.separator(data)){
            System.out.println(RomanCalcImpl.calculate(data));
        }
        else {
            System.out.println(ArabCalcImpl.calculate(data));
        }
    }
}
