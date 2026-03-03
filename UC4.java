public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] lines = new String[9];
        String border = "=".repeat(60);
        String gap = "      "; 

        lines[0] = border;
        lines[1] = String.join(gap, "  *** ", "  *** ", " ***** ", " ***** ");
        lines[2] = String.join(gap, " ** **", " ** **", " ** **", " ** ");
        lines[3] = String.join(gap, " ** **", " ** **", " ** **", " ** ");
        lines[4] = String.join(gap, " ** **", " ** **", " ***** ", " ***** ");
        lines[5] = String.join(gap, " ** **", " ** **", " ** ", "     **");
        lines[6] = String.join(gap, " ** **", " ** **", " ** ", "     **");
        lines[7] = String.join(gap, "  *** ", "  *** ", " ** ", " ***** ");
        lines[8] = border;

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
