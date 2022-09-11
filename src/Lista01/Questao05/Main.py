from Cliente import Cliente
from Data import Data
from Endereco import Endereco
from Negocio import Negocio
from Veiculo import Veiculo

sistema = Negocio()

endereco1 = Endereco("Gov. Magalhães Barata", "44", "Nazaré", "Belém", "Pará", "66040170")
data1 = Data("08", "12", "2022")
veiculo1 = Veiculo("KE100", "KAWASAKI", "Verde", "HLA5349", 2001, data1)
cliente1 = Cliente("Tomás", "38132910818", endereco1, veiculo1)
sistema.setVeiculo(veiculo1)
sistema.setCliente(cliente1)

endereco2 = Endereco("Luciano Pavarotti", "154", "Cachoeira", "Curitiba", "Paraná", "82220408")
data2 = Data("07", "03", "2022")
veiculo2 = Veiculo("R1100S Boxer Cup Replica", "BMW", "Branco", "HYN3562", 2003, data2)
cliente2 = Cliente("Roberto", "41533968772", endereco2, veiculo2)
sistema.setVeiculo(veiculo2)
sistema.setCliente(cliente2)

print("~~~ Veículos ~~~")
for veiculo in sistema.getVeiculos():
	print(veiculo, '\n')

print("\n~~~ Clientes ~~~")
for cliente in sistema.getClientes():
	print(cliente, '\n')
