peso = input("Ingrese su peso (Kg): ")

estatura = input("Ingrese su estatura (Metros): ")

imc = float(peso) / (float(estatura)**2)

print("Tu índice de masa corporal es: "+str(imc))
