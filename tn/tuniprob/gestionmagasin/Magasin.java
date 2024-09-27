package tn.tuniprob.gestionmagasin;
public class Magasin {
    public int id;
    public String adresse;
    public int capaciteMax;
    public Produit[] produits;
    public int nombreProduits;
    public static int totalProduits = 0; //
    public Magasin(int id, String adresse, int capaciteMax) {
        this.id = id;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new Produit[50];  // Taille fixe du tableau (50 produits max)
        this.nombreProduits = 0;          // Initialise le nombre de produits à 0
    }

    public void ajouterProduit(Produit produit) {
        if (nombreProduits < 50) {  // Vérifie si la capacité n'est pas atteinte
            produits[nombreProduits] = produit;  // Ajoute le produit dans le tableau
            nombreProduits++;  // Incrémente le compteur de produits
            totalProduits++;   // Incrémente le total de produits dans tous les magasins
        } else {
            System.out.println("Le magasin a atteint la capacité maximale de 50 produits.");
        }
    }

    public void afficherMagasin() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité maximale: " + capaciteMax);
        System.out.println("Produits dans le magasin:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println(produits[i]);  // Affiche chaque produit
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
