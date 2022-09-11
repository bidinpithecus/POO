import string
from Data import Data

class Veiculo:

	def __init__(self, modelo, marca, cor, placa, ano, devolucao):
		self.__modelo = modelo
		self.__marca = marca
		self.__cor = cor
		self.__placa = placa
		self.__devolucao = devolucao
		self.__ano = ano
	
	def getModelo(self):
		return self.__modelo
	
	def setModelo(self, modelo: string):
		self.__modelo = modelo

	def getMarca(self):
		return self.__marca

	def setMarca(self, marca: string):
		self.__marca = marca

	def getCor(self):
		return self.__cor

	def setCor(self, cor: string):
		self.__cor = cor

	def getPlaca(self):
		return self.__placa

	def setPlaca(self, placa: string):
		self.__placa = placa

	def getAno(self):
		return self.__ano

	def setAno(self, ano: int):
		self.__ano = ano

	def getDevolucao(self):
		return self.__devolucao

	def setDevolucao(self, data: Data):
		self.__devolucao = data

	def __str__(self):
		return 'Modelo: {}, Marca: {}, Ano: {}, Cor: {}, Placa: {}, Data para Devolução: {}'.format(self.__modelo, self.__marca, self.__ano, self.__cor, self.__placa, self.__devolucao)