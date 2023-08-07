import javax.swing.plaf.synth.SynthOptionPaneUI;

class pell_series {
    public static void main(String arg[]) {
        int i, a = 0, b = 1, sum = 0;
        for (i = 0; i <= 20; i++) 
        {
            sum = (b * 2) + a;
                a = b;
                b = sum;
                System.out.print(sum + " ");
        }
    }
}