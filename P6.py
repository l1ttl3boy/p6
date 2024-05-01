import math

class Circulo:
    def __init__(self, color, radio):
        self.__color = color
        self.__radio = radio

    def getColor(self):
       return self.__color

    def getRadio(self):
       return self.__radio

    def getArea(self):
       return self.__area()

    def getPerimetro(self):
       return self.__perimetro()

    def __area(self):
       return math.pi * self.__radio**2

    def __perimetro(self):
       return 2 * math.pi * self.__radio

class Trapecio:
    def __init__(self, color, base_mayor, base_menor, altura, lado):
        self.__color = color
        self.__base_mayor = base_mayor
        self.__base_menor = base_menor
        self.__altura = altura
        self.__lado = lado

    def getColor(self):
        return self.__color

    def getBaseMayor(self):
        return self.__base_mayor

    def getBaseMenor(self):
        return self.__base_menor

    def getAltura(self):
        return self.__altura

    def getLado(self):
        return self.__lado

    def getArea(self):
        return self.__area()

    def getPerimetro(self):
        return self.__perimetro()

    def __area(self):
        return ((self.__base_mayor + self.__base_menor) / 2) * self.__altura

    def __perimetro(self):
        return self.__base_mayor + self.__base_menor + self.__lado * 2

class Hexagono:
    def __init__(self, color, apotema, lado):
        self.__color = color
        self.__apotema = apotema
        self.__lado = lado

    def getColor(self):
        return self.__color

    def getApotema(self):
        return self.__apotema

    def getLado(self):
        return self.__lado

    def getPerimetro(self):
        return self.__perimetro()

    def getArea(self):
        return self.__area()

    def __perimetro(self):
        return 6 * self.__lado

    def __area(self):
        return (self.__perimetro() * self.__apotema) /  2


#CIRCULO
circulo = Circulo("rojo", 5)
print("===CIRCULO=====")
print("Color", circulo.getColor())
print("Radio", circulo.getRadio())
print("Area", circulo.getArea())
print("Perimetro", circulo.getPerimetro())

#TRAPECIO
trapecio = Trapecio("verde", 10, 7, 6, 5)
print("====TRAPECIO====")
print("Color", trapecio.getColor())
print("Base mayor", trapecio.getBaseMayor())
print("Base menor", trapecio.getBaseMenor())
print("Altura", trapecio.getAltura())
print("Lateral", trapecio.getLado())
print("Area", trapecio.getArea())
print("Perimetro", trapecio.getPerimetro())

#HEXAGONO
hexagono = Hexagono("morado", 10, 5)
print("====HEXAGONO===")
print("Color", hexagono.getColor())
print("Apotema", hexagono.getApotema())
print("Lado", hexagono.getLado())
print("Area", hexagono.getArea())
print("Perimetro", hexagono.getPerimetro())
