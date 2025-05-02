public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        String name = "Anna";
        int age = 40;
        String country = "Ukraine";
        String programLanguage = "Java";
        int hours = 8;
        String hobby= "Hiking";
        String location = "Valencia";

        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println(String.format("Mi nombre es %s, tengo %d años y soy de %s.", name, age, country));

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println(String.format("Estoy estudiando %s y practico %d horas al día.", programLanguage, hours));

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println(String.format("Mi pasatiempo favorito es %s y lo practico en %s", hobby, location));
    }
}
