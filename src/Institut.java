public class Institut {
    private String nom;
    private Alumne[] llistaAlumnes;
    private int num;

    public Institut(String nom) {
        this.nom = nom;
        this.llistaAlumnes = new Alumne[100];
        this.num = 0;
    }

    public Institut(String nom, int maxAlumnes) {
        this.nom = nom;
        this.llistaAlumnes = new Alumne[maxAlumnes];
        this.num = 0;
    }

    public void afegirAlumne(Alumne al) {
        if (num < llistaAlumnes.length) {
            llistaAlumnes[num] = al;
            num++;
        } else {
            System.out.println("La llista d'alumnes esta plena.");
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Alumne[] getLlistaAlumnes() {
        return llistaAlumnes;
    }

    public void setLlistaAlumnes(Alumne[] llistaAlumnes) {
        this.llistaAlumnes = llistaAlumnes;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
