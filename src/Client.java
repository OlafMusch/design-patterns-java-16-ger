/**
 *
 * @author Olaf Musch
 *
 * Design Patterns mit Java
 *
 * Eine Einführung in Entwurfsmuster, Springer Verlag
 *
 * Kapitel "Singleton"
 */
public class Client {

    public static void main(String[] args) {

        // Instanz des Singleton holen. Wird erzeugt, wenn nötig
        var singleton1 = MySingleton.getInstance();

        // was machen
        singleton1.doSomething();

        // Mal vergleichen: Neue Instanz holen 
        var singleton2 = MySingleton.getInstance();
        singleton2.doSomething();

    }
}
