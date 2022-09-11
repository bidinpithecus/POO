from Veiculo import Veiculo
from Cliente import Cliente

class Negocio:

	def __init__(self):
		self.__veiculos =  []
		self.__numVeiculos = 0
		self.__clientes = []
		self.__numClientes = 0

	def getVeiculos(self):
		return self.__veiculos

	def setVeiculo(self, veiculo : Veiculo):
		self.__veiculos.append(veiculo)

	def getNumVeiculos(self):
		return self.__numVeiculos

	def setNumVeiculos(self):
		self.__numVeiculos = self.__numVeiculos + 1

	def getNumClientes(self):
		return self.__numClientes

	def setNumClientes(self):
		self.__numClientes = self.__numClientes + 1

	def getClientes(self):
		return self.__clientes

	def setCliente(self, cliente : Cliente):
		self.__clientes.append(cliente)

	def __str__(self):
		return 'Veiculos: {}, Clientes: {}'.format(self.__veiculos, self.__clientes)