from Espaco import Espaco
from ObjetoSobrepostoException import ObjetoSobrepostoException
from Ponto import Ponto
from Reta import Reta

r = Reta(1, 2)  # Vermelha
s = Reta(1, 1)  # Verde
t = Reta(2, -2) # Azul

A = Ponto(3, 4)
B = Ponto(2, 3)
C = Ponto(4, 6)
D = Ponto(3, 2)

espaco = Espaco()

try: espaco.adicionar_reta(r)
except ObjetoSobrepostoException as e: print(e)

try: espaco.adicionar_reta(s)
except ObjetoSobrepostoException as e: print(e)

try: espaco.adicionar_reta(t)
except ObjetoSobrepostoException as e: print(e)

try: espaco.adicionar_ponto(A)
except ObjetoSobrepostoException as e: print(e)

try: espaco.adicionar_ponto(B)
except ObjetoSobrepostoException as e: print(e)

try: espaco.adicionar_ponto(C)
except ObjetoSobrepostoException as e: print(e)

try: espaco.adicionar_ponto(D)
except ObjetoSobrepostoException as e: print(e)