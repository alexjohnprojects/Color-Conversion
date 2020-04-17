public class ColorConversion {
    public static void main(String[] args) {
        int r, g, b;
        r = Integer.parseInt(args[0]);
        g = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[2]);
        double w = Math.max(Math.max(r/255.0, g/255.0), b/255.0);
        double c = (w - (r / 255.0)) / w;
        double m = (w - (g / 255.0)) / w;
        double y = (w - (b / 255.0)) / w;
        double k = 1.0 - w;
        System.out.println("C = " + c + " M = " + m + " Y = " + y + " K = " + k);
    }
}
