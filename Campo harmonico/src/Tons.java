import java.util.Scanner;

public class Tons {

    public void puxaCampo() {
        Scanner input = new Scanner(System.in);
        System.out.println("alimente o vetor, com o(s) ton(s) que você deseja");
        System.out.println("máximo de 7 tons");
        int i = 0;
        String[] tons = new String[7];
        // armazenando os tons
        do {
            System.out.println("insira uma nota");
            System.out.print("exemplo: A, B, C, C# etc...");

            tons[i] = input.next().toUpperCase();
            i++;

        } while (i < tons.length);

        // retornando o campo harmonico
        
        //while (j < tons.length) {
          for(int j = 0; j<tons.length; j++){
            switch (tons[j]){

            
            
            case "C": System.out.println("Campo harmonico de C: C, Dm, Em, F, G, Am, Bdim");
            break;


            case "D":System.out.println("Campo harmonico de D: D, Em, F#m, G, A, B, C#dim ");
            break;
            
            case "E":
                System.out.println("Campo harmonico de E: E, F#m, G#m, A, B, C#m, D#dim ");
            break;

            case "F":
                System.out.println("Campo harmonico de F: F, Gm, Am, A#, C, Dm, Fdim ");
            break;
            
            case "G":
                System.out.println("Campo harmonico de G: G, Am, Bm, C, D, Em, F#dim ");
            break;
             
            case "A":
                System.out.println("Campo harmonico de A: A, Bm, C#m, D, E, F#m, G#dim ");
             break;
            case "B":    
                System.out.println("Campo harmonico de B: B, C#m, D#m, E, F#, G#m, A#dim ");
            break;
            
            case "C#":
            System.out.println("Campo harmonico de C#: D#m, E#m, F#, A#, C, Dm, Bdim ");
            break;
            case "D#":
            System.out.println("Campo harmonico de D#: D#, Fm, Gm, G#, A#, Cm, Ddim ");
            break;

            case "F#":
                System.out.println("Campo harmonico de F#: F#, G#m, A#m, B, C#, D#m, Fdim ");
            break;
            case"G#":
                System.out.println("Campo harmonico de G#: G#, A#m, Cm, C#, D#, Fm, Gdim ");
            
            case "A#":
                System.out.println("Campo harmonico de A#: A#, Cm, Dm, D#, F, Gm, Adim ");
            break;

            default: System.out.println("inválido");
            break;

              

        }
    }
}
}
