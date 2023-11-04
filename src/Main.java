import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        jeuDuMotMotus();
    }

    private static void jeuDuMotMotus() {
        Scanner scan = new Scanner(System.in);
        int niveau ;
        boolean stopJeu = false;

        do{
            System.out.println("""
                    Quel niveau voulez vous
                    1- Facile
                    2- Intermediaire
                    3- Difficile
                    4- Sortir""");
            niveau = Integer.parseInt(scan.nextLine());

            switch (niveau) {
                case 1-> {
                    System.out.println("Vous avez choisi le niveau faible: \n");
                    jeuNiveauUn();
                }
                case 2-> {
                    System.out.println("Vous avez choisi le niveau moyen: \n");
                    jeuNiveauDeux();
                }
                case 3-> {
                    System.out.println("Vous avez choisi le niveau difficile: \n");
                    jeuxNiveauTrois();
                }
                case 4-> {
                    System.out.println("Vous avez arrêtez le jeux \n");
                    stopJeu= true;
                    stopLeJeu();
                }
                default -> System.out.println("Veuillez entre le numéro 1,2 ou 3");
            }
        }while (!stopJeu);
    }

    private static void jeuNiveauUn() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String [] tabMotQuatre = {"PAIX","FAUX","DEUX","DOUX","CINQ","KIWI"};
        char[] reponse = {'-','-','-','-'};
        int indice =0;

        int tailleTableau = tabMotQuatre.length, compteur =10;
        int nombreAleatoire = random.nextInt(tailleTableau);

        String motMotusString = tabMotQuatre[nombreAleatoire];
        char[] motMotusChar = motMotusString.toCharArray();
        char[] chercheLeMotChar;

        System.out.println("********************\nTouver le mot Motus ?\nLe mot contient 4 lettres\n********************");

        do{
            System.out.println("Entrez votre mot ?");
            chercheLeMotChar = scan.next().toUpperCase().toCharArray();

            for(int i=0; i< motMotusChar.length; i++){
                for (char c : chercheLeMotChar) {

                    if (motMotusChar[i] == chercheLeMotChar[i]) {
                        reponse[i] = motMotusChar[i];
                    } else if (motMotusChar[i] == c) {
                        indice++;
                    }
                }
            }

            System.out.print(reponse);
            if( indice != 0){
                System.out.println("\n vous avez trouver "+indice+" bonne lettre mais il ne sont de le bonne ordre");
                indice=0;
            }

            if(Objects.equals(Arrays.toString(motMotusChar), Arrays.toString(reponse))){
                String reponseFinal = String.valueOf(reponse);
                System.out.println("vous avez tout trouvez :"+ reponseFinal );
                jeuDuMotMotus();
            }

            compteur--;
        }while(compteur!=0);

        String reponseFinal = String.valueOf(motMotusChar);
        System.out.println("\nMalheureusement au bout vous n'avez pas trouvé le mot :"+ reponseFinal+"\n" );
    }

    private static void jeuNiveauDeux(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String [] tabMotSix = {"JAVAEE", "KAYAKS","YAKUZA","JOYEUX"};
        char[] reponse = {'-','-','-','-','-','-'};
        int indice =0;

        int tailleTableau = tabMotSix.length, compteur =10;
        int nombreAleatoire = random.nextInt(tailleTableau);

        String motMotusString = tabMotSix[nombreAleatoire];
        char[] motMotusChar = motMotusString.toCharArray();
        char[] chercheLeMotChar;

        System.out.println("********************\nTouver le mot Motus ?\nLe mot contient 6 lettres\n********************");

        do{
            System.out.println("Entrez votre mot ?");
            chercheLeMotChar = scan.next().toUpperCase().toCharArray();

            for(int i=0; i< motMotusChar.length; i++){
                for (char c : chercheLeMotChar) {

                    if (motMotusChar[i] == chercheLeMotChar[i]) {
                        reponse[i] = motMotusChar[i];
                    } else if (motMotusChar[i] == c) {
                        indice++;
                    }
                }
            }

            System.out.print(reponse);
            if( indice != 0){
                System.out.println("\n vous avez trouver "+indice+" bonne lettre mais il ne sont de le bonne ordre");
                indice=0;
            }


            if(Objects.equals(Arrays.toString(motMotusChar), Arrays.toString(reponse))){
                String reponseFinal = String.valueOf(reponse);
                System.out.println("vous avez tout trouvez :"+ reponseFinal );
                jeuDuMotMotus();
            }

            compteur--;
        }while(compteur!=0);

        String reponseFinal = String.valueOf(motMotusChar);
        System.out.println("\nMalheureusement au bout vous n'avez pas trouvé le mot :"+ reponseFinal+"\n" );
    }

    private static void jeuxNiveauTrois(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String [] tabMotDouze = {"ABRUTISSANTE", "ACCELERATEUR","VERIFICATEUR","UTILISATIONS"};
        char[] reponse = {'-','-','-','-','-','-','-','-','-','-','-','-'};
        int indice =0;

        int tailleTableau = tabMotDouze.length, compteur =10;
        int nombreAleatoire = random.nextInt(tailleTableau);

        String motMotusString = tabMotDouze[nombreAleatoire];
        char[] motMotusChar = motMotusString.toCharArray();
        char[] chercheLeMotChar;

        System.out.println("********************\nTouver le mot Motus ?\nLe mot contient 12 lettres\n********************");

        do{
            System.out.println("Entrez votre mot ?");
            chercheLeMotChar = scan.next().toUpperCase().toCharArray();

            for(int i=0; i< motMotusChar.length; i++){
                for (char c : chercheLeMotChar) {

                    if (motMotusChar[i] == chercheLeMotChar[i]) {
                        reponse[i] = motMotusChar[i];
                    } else if (motMotusChar[i] == c) {
                        indice++;
                    }
                }
            }

            System.out.print(reponse);
            if( indice != 0){
                System.out.println("\n vous avez trouver "+indice+" bonne lettre mais il ne sont de le bonne ordre");
                indice=0;
            }


            if(Objects.equals(Arrays.toString(motMotusChar), Arrays.toString(reponse))){
                String reponseFinal = String.valueOf(reponse);
                System.out.println("vous avez tout trouvez :"+ reponseFinal );
                jeuDuMotMotus();
            }

            compteur--;
        }while(compteur!=0);

        String reponseFinal = String.valueOf(motMotusChar);
        System.out.println("\nMalheureusement au bout vous n'avez pas trouvé le mot :"+ reponseFinal+"\n" );
    }

    private static void stopLeJeu(){
        System.out.println("Merci d'avoir jouer");

    }
}