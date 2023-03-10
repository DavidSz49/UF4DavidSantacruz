public class UsaInstitut {
    public static void main(String[] args) throws Exception {
        Institut Jaume = new Institut("INS Jaume Huguet");
        Institut Narcis = new Institut("Narcis Oller");

        Alumne David = new Alumne("David",22, "72179852X", "David@gmail.com");
        Alumne Juan = new Alumne("Juan", 19, "72179852X", "Juan@gmail.com");
        Alumne Pepe = new Alumne("Pepe", 21, "72179852X", "Pepe@gmail.com");
        Alumne Manuel = new Alumne("Manuel", 19, "72179852X", "Manuel@gmail.com");
        Alumne Jose = new Alumne("Jose", 19, "72179852X", "Pepe@gmail.com");
        Alumne Pedro = new Alumne("Pedro", 20, "72179852X", "Pepe@gmail.com");
        
        Jaume.afegirAlumne(David);
        Jaume.afegirAlumne(Pepe);
        Jaume.afegirAlumne(Juan);

        Narcis.afegirAlumne(Pedro);
        Narcis.afegirAlumne(Manuel);
        Narcis.afegirAlumne(Jose);

        System.out.println("Alumnes de l'Institut " + Jaume.getNom() + ":");
        for (int i = 0; i < Jaume.getNum(); i++) {
            System.out.println(Jaume.getLlistaAlumnes()[i].getNom());
        }

        System.out.println("Alumnes de l'Institut " + Narcis.getNom() + ":");
        for (int i = 0; i < Narcis.getNum(); i++) {
            System.out.println(Narcis.getLlistaAlumnes()[i].getNom());
        }

    }
}
