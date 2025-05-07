public class EnergyEfficiency {
    public static void main(String[] args) {
        //inicializar variables (del tipo que veas conveniente) para las calificaciones A, B, C, D, E, F y G que correspondan a eficiencia energética e imprime en terminal concatenando cada string con cada variable creada. 
        char ratingA = 'A';
        char ratingB = 'B';
        char ratingC = 'C';
        char ratingD = 'D';
        char ratingE = 'E';
        char ratingF = 'F';
        char ratingG = 'G';

        //Reemplaza <very_good> concatenando el String con la variable creada. 
        System.out.printf("Una calificación %c es muy buena.%n", ratingA);

        //Reemplaza <good> concatenando el String con la variable creada. 
        System.out.printf("Una calificación %c es buena.%n", ratingB);
        
        //Reemplaza <fairly_good> concatenando el String con la variable creada. 
        System.out.printf("Una calificación %s es medianamente buena.%n", ratingC);
        
        //Reemplaza <neutral> concatenando el String con la variable creada. 
        System.out.printf("Una calificación %s es neutral.%n", ratingD);
        
        //Reemplaza <fairly_bad> concatenando el String con la variable creada. 
        System.out.printf("Una calificación %s es medianamente mala.%n", ratingE);
        
        //Reemplaza <bad> concatenando el String con la variable creada. 
        System.out.printf("Una calificación %s es mala.%n", ratingF);

        //Reemplaza <very_bad> concatenando el String con la variable creada.
        System.out.printf("Una calificación %s es muy mala.%n", ratingG);

    }
}
