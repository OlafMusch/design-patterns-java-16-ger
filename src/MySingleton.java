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
public class MySingleton {

    /**
     * Einzige Instanz der Klasse
     */
    private static MySingleton instance;

    /**
     * Privater Konstruktor, um zu verhindern, dass Anwender Instanzen der
     * Klasse erzeugen
     */
    private MySingleton() {
    }

    /**
     * Gibt die eine Instanz dieser Klasse zurück. Einfache Version eines
     * Singletons
     *
     * @return Instanz der Klasse
     */
    public static MySingleton getInstance() {
        if (instance == null)
            instance = new MySingleton();
        return instance;
    }

    /**
     * Verhalten des Objekts
     */
    public void doSomething() {
        // Verhalten des Objektes
        System.out.println("Singleton 1 " + this.getClass() + ": " + this);
    }
}
