import java.text.DecimalFormat;

public class work1_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; ++i){
            double n = 1./i;
            System.out.print(new DecimalFormat( "#.###" ).format(n) + "\n");
        }
    }
}
