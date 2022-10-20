class Reta:
    def __init__(self, a, b):
        self.__a = a
        self.__b = b

    def get_a(self):
        return self.__a

    def get_b(self):
        return self.__b

    def intercepta(self, reta):
        if self.__a == reta.get_a(): return True
        return False

    def contem(self, ponto): # função esta_na_reta
        if ponto.get_y() == ponto.get_x() * self.__a + self.__b: return True
        return False    