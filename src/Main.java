//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’*/
        Author a1 = new Author("Joshua", "Bloch", "joshua@email.com", 'M');

        /*Imprima por pantalla al autor previamente instanciado.*/
        System.out.println(a1);

        /* Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        pesos con una cantidad de 150 copias.*/
        Author [] authors = new Author[1];
        authors[0]=a1;
        Book b1 = new Book("Effective Java", 450f, 150,authors);

        /*Imprima por pantalla el libro instanciado.*/
        System.out.println("____________________________________________________");
        b1.printMessage();

        /*Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        cantidad en 50 copias*/
        b1.setPrice(500f);
        b1.setStock(b1.getStock() + 50);
        System.out.println(b1.printMessage());

        /*Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        Libro “Effective Java”*/



        /*Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        siguiente mensaje: “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”*/
        System.out.println("____________________________________________________");
        System.out.println(b1);

        /*Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        cambios necesarios en el método del punto g, para imprimir un nuevo
        mensaje que liste los autores que contribuyeron a ese libro.*/


    }
}