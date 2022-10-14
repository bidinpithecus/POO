from Filme import Filme
import json

file = open('input.json')
input = json.loads(file.read())

movies = []

for line in input:
	movie = Filme(line['titulo'], line['ano'], line['classificacao'], line['nota'])
	movies.append(movie)

movies.sort(key = lambda movie: movie.getNota(), reverse = True)

for movie in movies:
	print(movie)