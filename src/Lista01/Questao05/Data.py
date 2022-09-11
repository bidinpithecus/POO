class Data:

	def __init__(self, dia, mes, ano):
		self.__dia = dia
		self.__mes = mes
		self.__ano = ano

	def getDia(self):
		return self.__dia

	def setDia(self, dia: int):
		self.__dia = dia

	def getMes(self):
		return self.__mes

	def setMes(self, mes: int):
		self.__mes = mes

	def getAno(self):
		return self.__ano

	def setAno(self, ano: int):
		self.__ano = ano

	def __str__(self):
		return '{}/{}/{}'.format(self.__dia, self.__mes,self.__ano)