public class ProgramFactory {
    public static Program createProgram (int number) {
        switch (number) {
            case 1: return new Program1();
            case 2: return new Program2();
            case 3: return new Program3();
            case 4: return new Program4();
            default: return null;

        }
    }
}
