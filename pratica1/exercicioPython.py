import os
import random

def cls():
    os.system('cls' if os.name == 'nt' else 'clear')

def lista(lenght):
    lista = []
    for i in range(lenght):
        lista.append(random.randint(0,100))
    print("-------------------RESULTADO-------------------")

    for j in lista:
        if (j % 3 == 0):
            print(f"{j} - número múltiplo de três")
        elif (j % 2 == 0):
            print(f"{j} - número par")
        else:
            print(f"{j} - número ímpar")
cls()
entrada = (int(input("Digite um tamanho para a lista: ")))

lista(entrada)






