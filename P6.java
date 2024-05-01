public class Rectangulo {
    private String color;
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        this.color = color;
        this.base = base;
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double perimetro() {
        return (base * 2) + (altura * 2);
    }

    private double area() {
        return base * altura;
    }

}


public class Cuadrado {
    private String color;
    private double lado;

    public Cuadrado(String color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double perimetro() {
        return 4 * lado;
    }

    private double area() {
        return lado * lado;
    }
}

public class Triangulo {
    private String color;
    private double base;
    private double altura;
    private double lado;

    public Triangulo(String color, double base, double altura, double lado) {
        this.color = color;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado(){
        return lado;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double area() {
        return (base * altura) /2;
    }

    private double perimetro() {
        return 3 * lado;
    }
}

public class Rombo {
    private String color;
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(String color, double diagonalMayor, double diagonalMenor, double lado) {
        this.color = color;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public double getLado(){
         return lado;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double perimetro() {
        return 4 * lado;
    }

    private double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

}

public class Main{
     public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("azul", 5, 3);
        System.out.println("Color: " + rectangulo.getColor());
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimetro());

        Cuadrado cuadrado = new Cuadrado("amarillo", 8);
        System.out.println("Color: " + cuadrado.getColor());
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Área: " + cuadrado.getArea());
        System.out.println("Perímetro: " + cuadrado.getPerimetro());


        Triangulo triangulo = new Triangulo("azul", 5, 3,4);
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Lado; " + triangulo.getLado());
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimetro());

        Rombo rombo = new Rombo("blanco", 8, 4, 5);
        System.out.println("Color: " + rombo.getColor());
        System.out.println("Diagonal Mayor: " + rombo.getDiagonalMayor());
        System.out.println("Diagonal menor: " + rombo.getDiagonalMenor());
        System.out.println("Lado" + rombo.getLado());
        System.out.println("Área: " + rombo.getArea());
        System.out.println("Perímetro: " + rombo.getPerimetro());
 }
}
