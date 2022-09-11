import string
from Endereco import Endereco
from Veiculo import Veiculo

class Cliente:

	def __init__(self, nome, cpf, endereco, veiculo):
		self.__nome = nome
		self.__cpf = cpf
		self.__endereco = endereco
		self.__veiculo = veiculo

	def getNome(self):
		return self.__nome
	
	def setNome(self, nome):
		self.__nome = nome
	
	def getCpf(self):
		return self.__cpf
	
	def setCpf(self, cpf):
		self.__cpf = cpf
	
	def getEndereco(self):
		return self.__endereco
	
	def setEndereco(self, endereco):
		self.__endereco = endereco
	
	def getVeiculo(self):
		return self.__veiculo
	
	def setVeiculo(self, veiculo):
		self.__veiculo = veiculo
	
	def __str__(self):
		return "Nome: {}, Cpf: {}, Endereço: {}, Veículo Alugado: {}".format(self.__nome, self.__cpf, self.__endereco, self.__veiculo)