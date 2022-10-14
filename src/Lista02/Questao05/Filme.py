class Filme:
	def __init__(self, titulo, ano, classificacao, nota):
		self.__titulo = titulo
		self.__ano = ano
		self.__classificacao = classificacao
		self.__nota = nota

	def __str__(self):
		return "Título: {}; Ano: {}; Classificação: {}; Nota: {}".format(self.__titulo, self.__ano, self.__classificacao, self.__nota)

	def getNota(self):
		return self.__nota