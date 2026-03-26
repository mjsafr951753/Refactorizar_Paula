// After refactoring

public class javaspring {
}

abstract class ShapeRefactored {

    public abstract double calculateArea();
}

class Circle extends ShapeRefactored {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends ShapeRefactored {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    class Cuadrado extends ShapeRefactored {

        double lado;

        public Cuadrado(double lado) {
            this.lado = lado;

        }

        public double calculateArea() {
            return lado * lado;

        }

        class Triangulo extends ShapeRefactored {

            double base;
            double altura;

            public Triangulo(double base, double altura) {
                this.base = base;
                this.altura = altura;

            }

            public double calculateArea() {
                return (base * altura) / 2;

            }

        }

    }
}
