import java.util.*;

/**
 * Programme de calcul de moyenne de notes
 * Permet de saisir plusieurs notes et calcule leur moyenne
 */
public class CalculateurMoyenne {

    public static void main(String[] args) {
        // Initialisation du scanner pour la saisie utilisateur
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Utilise le format US pour les nombres décimaux avec point (.) ou lieu de (,)

        // Demande du nombre de notes à saisir
        System.out.print("Combien de notes voulez-vous entrer ? : ");
        int nombreDeNotes = sc.nextInt();

        // Variable pour stocker la somme des notes
        double somme = 0;

        // Boucle de saisie des notes
        for (int i = 1; i <= nombreDeNotes; i++) {
            System.out.print("Donner la note numéro " + i + " : ");
            double note = sc.nextDouble();

            // Validation : la note doit être entre 0 et 20
            while (note < 0 || note > 20) {
                System.out.print("Erreur ! La note doit être entre 0 et 20. Réessayez : ");
                note = sc.nextDouble();
            }

            // Ajout de la note à la somme totale
            somme += note;
        }

        // Calcul de la moyenne
        double moyenne = somme / nombreDeNotes;

        // Affichage de la moyenne avec 2 décimales
        System.out.printf("La moyenne de vos notes est : %.2f", moyenne);
        System.out.println();

        // Détermination du résultat (réussi ou échoué)
        if (moyenne >= 10) {
            System.out.print("Résultat : Réussi !");
        } else {
            System.out.print("Résultat : Échoué.");
        }

        // Fermeture du scanner
        sc.close();
    }
}