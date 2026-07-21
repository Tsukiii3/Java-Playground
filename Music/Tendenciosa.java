package Music;
public class Tendenciosa {

    public static void escrever(String texto, int velocidade) throws InterruptedException {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            Thread.sleep(velocidade);
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {

        String[] gang = {"Ghard", "Koda", "Nagalli", "Honaiser", "Toledo"};

        for (String s : gang) {
            escrever("Já pensou se é o " + s + " com a peça na cinta?", 40);
            Thread.sleep(300);
        }

        escrever("Já pensou se é uma cinta com a peça intocada?", 40);
        escrever("Já pensou se eu aperto essa porra pelo olho mágico, e você tá sentado na sala?", 40);

        System.out.println();
        System.out.println("VEIGH BABY UUUUUUUUUUUUUUUUUUUUUUUUU");
    }
}
