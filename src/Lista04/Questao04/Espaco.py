from ObjetoSobrepostoException import ObjetoSobrepostoException
from Ponto import Ponto
from Reta import Reta

class Espaco:
    def __init__(self):
        self.__pontos = []
        self.__retas = []

    def adicionar_ponto(self, ponto: Ponto):
        for elemento in self.__retas:
            if elemento.contem(ponto):
                raise ObjetoSobrepostoException('Ponto sobreposto!')
        self.__pontos.append(ponto)

    def adicionar_reta(self, reta: Reta):
        for elemento in self.__retas:
            if elemento.intercepta(reta): raise ObjetoSobrepostoException('Reta sobreposta!')
        self.__retas.append(reta)