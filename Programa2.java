public class Programa2 {
    public static void main(String[] args) {
        
        Atleta atleta = new Atleta();

        atleta.setNome("Rebeca");
        atleta.setPais("Brasil");
        atleta.setMedalhas(6);
        
        System.out.println("Nome do atleta: " + atleta.getNome());
        System.out.println("Pais: " + atleta.getPais());
        System.out.println("Medalhas: " + atleta.getMedalhas());
