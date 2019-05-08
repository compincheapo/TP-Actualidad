package sistema;

import modelo.Estudiante;
import modelo.Docente;
import modelo.NoDocente;
import java.util.Date;

/**
 *
 * @author Gabriel Britez, Fernando Nahirñak
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Gabriel", "gabrielito@gmail.com", 123456, 3);
        Docente d = new Docente("Diego", "dieguito@gmail.com", 798795, 500.20, new Date(), "JTP");
        NoDocente nd = new NoDocente("Fernan", "fernandito@gmail.com", 234483, 3000, new Date(), "Secretario");
        System.out.println(e.toString());
        System.out.println(d.toString());
        System.out.println(nd.toString());
    }

}
