public class Main {
    public static void main(String[] args) {
        int nuemeroPos=8;
        int nuemroCero=0;
        int nuemroNeg=-4;



        ComparaNumero(nuemeroPos);
        ComparaNumero(nuemroCero);
        ComparaNumero(nuemroNeg);

        BucleW();

        BucleDo();

        BucleFor();

        Estaciones(1);

        Estaciones(2);

        Estaciones(3);

        Estaciones(4);

        Estaciones(12);






    }

    public static void ComparaNumero(int a){
        if (a>0){
             System.out.println("El número "+a+" es positivo");
        }
        else if (a==0) {
             System.out.println("El número "+a+" es cero");


        }
        else {
            System.out.println("El número "+a+" es negativo");
        }

    }

    public static void BucleW(){
        int i=1;
        while(i<3){
            System.out.println("Pasada numero: "+i);
            i++;


        }


    }

    public static void BucleDo(){
        int i=1;

        do{
            System.out.println("Es la vuelta numero: "+i+" del DoWhile");
            i++;

        }
        while(i<2);
    }

    public static void BucleFor(){
        for(int i=0;
        i <= 3;
        i++){
            System.out.println("Es la vuelta numero: "+i+" del For");

        }
    }

    public static void Estaciones(int esta){
        String estacion="";
        switch(esta){
            case 1: estacion="primavera";
            break;
            case 2: estacion="verano";
            break;
            case 3: estacion="otoño";
            break;
            case 4: estacion="invierno";
            break;
            default: estacion="no reconozco esa estación";
            break;
        }
        System.out.println(estacion);
    }
}