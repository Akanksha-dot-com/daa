import java.util.Scanner;
interface Characters {
    void changeCase();
}


class Upper implements Characters {
     String text;

    public Upper(String text) {
        this.text = text;
    }

   
    public void changeCase() {
        System.out.println("Uppercase: " + text.toUpperCase());
    }
}

class Lower implements Characters {
     String text;

     Lower(String text) {
        this.text = text;
    }

    
    public void changeCase() {
        System.out.println("Lowercase: " + text.toLowerCase());
    }
}


public class CharactersDemo {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String a = scan.nextLine();
        Characters upperCase = new Upper(a);
        Characters lowerCase = new Lower(a);

        upperCase.changeCase();
        lowerCase.changeCase();
    }
}
