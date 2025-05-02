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
        System.out.println(String.format("Una calificación %c es muy buena.", ratingA));

        //Reemplaza <good> concatenando el String con la variable creada. 
        System.out.println(String.format("Una calificación %c es buena.", ratingB));
        
        //Reemplaza <fairly_good> concatenando el String con la variable creada. 
        System.out.println(String.format("Una calificación %s es medianamente buena.", ratingC));
        
        //Reemplaza <neutral> concatenando el String con la variable creada. 
        System.out.println(String.format("Una calificación %s es neutral.", ratingD));
        
        //Reemplaza <fairly_bad> concatenando el String con la variable creada. 
        System.out.println(String.format("Una calificación %s es medianamente mala.", ratingE));
        
        //Reemplaza <bad> concatenando el String con la variable creada. 
        System.out.println(String.format("Una calificación %s es mala.", ratingF));

        //Reemplaza <very_bad> concatenando el String con la variable creada.
        System.out.println(String.format("Una calificación %s es muy mala.", ratingG));

    }
}
