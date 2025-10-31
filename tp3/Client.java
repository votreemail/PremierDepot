public class Client {
    public static void main(String[] args) {
        int choix = Integer.parseInt(args[0]);
        /*  question 1: Client avant l'utilisation de factory 
        if(choix == 1 ) new Program1().go();
        else if(choix == 2 ) new Program2().go();
        else if(choix == 3 ) new Program3().go();
        else System.out.println("choix invalide !");*/
        Program program = ProgramFactory.createProgram(choix);
        program.go();

    }
}
