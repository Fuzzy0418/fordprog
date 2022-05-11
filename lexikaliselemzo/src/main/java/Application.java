public class Application {
    private String input;
    private int index;

    Application(String input){
        this.input = input;
        index = -1;
        allapotvaltas(1);
    }

    void read(){
        index++;
    }
    void backup(){
        index--;
    }

    void allapotvaltas(int allapotID){
        switch (allapotID){
            case 1:{
                read();
                allapot1();
                break;
            }
            case 2:{
                read();
                allapot2();
                break;
            }
            case 3:{
                //backup();
                allapot3();
                break;
            }
            case 4:{
                read();
                allapot4();
                break;
            }
            case 5:{
                //backup();
                allapot5();
                break;
            }
            case 6:{
                read();
                allapot6();
                break;
            }
            case 7:{
                allapot7();
                break;
            }
            case 8:{
                read();
                allapot8();
                break;
            }
            case 9:{
                read();
                allapot9();
                break;
            }
            case 10:{
                read();
                allapot10();
                break;
            }
            case 11:{
                allapot11();
                break;
            }
            case 12:{
                read();
                allapot12();
                break;
            }
            case 13:{
                allapot13();
                break;
            }
            case 14:{
                read();
                allapot14();
                break;
            }
            case 15:{
                allapot15();
                break;
            }
            case 16:{
                allapot16();
                break;
            }
            case 17:{
                read();
                allapot17();
                break;
            }
            case 18:{
                allapot18();
                break;
            }
            case 19:{
                allapot19();
                break;
            }
            case 20:{
                allapot20();
                break;
            }
            case 21:{
                allapot21();
                break;
            }
        }
    }

    void allapot1(){
        System.out.println("Kezdőállapot");
        if (Character.isLetter(input.charAt(index))){
            allapotvaltas(2);
        } else if (Character.isDigit(input.charAt(index))){
            allapotvaltas(4);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(21);
        } else if (input.charAt(index) == '{'){
            allapotvaltas(6);
        } else if (input.charAt(index) == '}'){
            allapotvaltas(19);
        } else if (input.charAt(index) == '('){
            allapotvaltas(8);
        } else if (input.charAt(index) == '*'){
            allapotvaltas(19);
        } else if (input.charAt(index) == ')'){
            allapotvaltas(19);
        } else if (input.charAt(index) == ':'){
            allapotvaltas(12);
        } else if (input.charAt(index) == '='){
            allapotvaltas(19);
        } else if (input.charAt(index) == '<'){
            allapotvaltas(14);
        } else if (input.charAt(index) == '>'){
            allapotvaltas(17);
        } else if (input.charAt(index) == ' '){
            allapotvaltas(1);
        } else {
            allapotvaltas(19);
        }
    }

    void allapot2(){
        System.out.println("Azonosítóban");
        if (!Character.isLetter(input.charAt(index)) && !Character.isDigit(input.charAt(index))){
            allapotvaltas(3);
        } else {
            allapotvaltas(2);
        }
    }

    void allapot3()
    {
        System.out.println("Azonosító vége");
        backup();
        allapotvaltas(1);
    }

    void allapot4(){
        System.out.println("Számban");
        if (Character.isDigit(input.charAt(index))){
            allapotvaltas(4);
        } else {
            allapotvaltas(5);
        }
    }

    void allapot5(){
        System.out.println("Szám vége");
        backup();
        allapotvaltas(1);
    }

    void allapot6(){
        System.out.println("Komm. ban");
        if (input.charAt(index) == '}'){
            allapotvaltas(7);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(6);
        }
    }

    void allapot7(){
        System.out.println("Komm. vég");
        allapotvaltas(1);
    }

    void allapot8(){
        System.out.println("(-t talált");
        if (input.charAt(index) == '*'){
            allapotvaltas(9);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(20);
        }
    }

    void allapot9(){
        System.out.println("(**) komm.ban");
        if (input.charAt(index) == '*'){
            allapotvaltas(10);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(9);
        }
    }

    void allapot10(){
        System.out.println("* (**)-ban");
        if (input.charAt(index) == '*'){
            allapotvaltas(10);
        } else if (input.charAt(index) == ')'){
            allapotvaltas(11);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(9);
        }
    }

    void allapot11(){
        System.out.println("(**) komm.vég");
        allapotvaltas(1);
    }

    void allapot12(){
        System.out.println(":-t talált");
        if (input.charAt(index) == '='){
            allapotvaltas(13);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(20);
        }
    }

    void allapot13(){
        System.out.println(":= token");
        allapotvaltas(1);
    }

    void allapot14(){
        System.out.println("(<-t talált");
        if (input.charAt(index) == '='){
            allapotvaltas(15);
        } else if (input.charAt(index) == '>'){
            allapotvaltas(16);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(20);
        }
    }

    void allapot15(){
        System.out.println("<= token");
        allapotvaltas(1);
    }

    void allapot16(){
        System.out.println("<> token");
        allapotvaltas(1);
    }

    void allapot17(){
        System.out.println(">-t talált");
        if (input.charAt(index) == '='){
            allapotvaltas(18);
        } else if (input.charAt(index) == '$'){
            allapotvaltas(19);
        } else {
            allapotvaltas(20);
        }
    }

    void allapot18(){
        System.out.println(">= token");
        allapotvaltas(1);
    }

    void allapot19(){
        System.out.println("hibakezelő");
        allapotvaltas(1);
    }

    void allapot20(){
        System.out.println("tovább fejl.");
        backup();
        allapotvaltas(1);
    }

    void allapot21(){
        System.out.println("vége.");
    }
}
