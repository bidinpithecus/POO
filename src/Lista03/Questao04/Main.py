from Aluno import Aluno
from Professor import Professor

Professores = []
Professores.append(Professor("Nicolas", 3371))
Professores.append(Professor("Carlos", 2586))

Alunos = []
Alunos.append(Aluno("Helena", [8.2, 8.98, 6.55, 6.34, 9.17]))
Alunos.append(Aluno("Vicente", [8.8, 4.52, 1.07, 9.71, 1.24]))
Alunos.append(Aluno("Stella", [4.15, 8.05, 9.45, 6.71, 7.38]))
Alunos.append(Aluno("Henrique", [3.03, 2.37, 2.57, 5.07, 2.3]))
Alunos.append(Aluno("Maitê", [9.37, 6.57, 1.75, 6.88, 2.04]))

print("Professores: ")
for professor in Professores:
    print(professor)

print()
print("Alunos: ")
for aluno in Alunos:
    print(aluno)
    print()