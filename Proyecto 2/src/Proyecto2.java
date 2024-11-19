public class Proyecto2 {
    final static double PI = 3.14159;


    public static void main(String[] args) { //Metodo o función
        //Definimos variables con diferentes ambitos y tipos
        int numLados = 3;
        double diametro = 10.2;
        double radio = diametro / 2;

        double area = PI * radio * radio;
        double area2 = PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);

        //Vamos ha hacer el area de un triangulo

        int base = 5;
        double altura = 13.34;
        double areaT = (base * altura) / 2;

        System.out.println("El area del triángulo es: " + areaT);
    }
}
