/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package segurtasuna;

public class OrdezkatzeHiztegia {

    private final String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";

    public String zifratu(String mezua){

        StringBuilder emaitza = new StringBuilder();
        for (int i=0; i < mezua.length(); i++) {
            char letra = mezua.charAt(i);
            if (Character.isLetter(letra)){
                letra = gakoa.charAt(letra - 'A');

            }
            emaitza.append(letra);
        }

        return emaitza.toString();
    }

    public String deszifratu(String kripto){
        StringBuilder emaitza = new StringBuilder();
        for (int i=0; i < kripto.length(); i++) {
            char letra = kripto.charAt(i);
            if (Character.isLetter(letra)){
                int indizea = gakoa.indexOf(letra);
                String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                letra = abc.charAt(indizea);

            }
            emaitza.append(letra);


        }

        return emaitza.toString();
    }

    public static void main(String[] args) {
        OrdezkatzeHiztegia mezua = new OrdezkatzeHiztegia();

        System.out.println(mezua.zifratu("EZ GAUDE GERRAREN ALDE"));
        System.out.println(mezua.deszifratu("BP MZTVB MBWWZWBJ ZGVB"));
    }
}