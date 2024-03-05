import tkinter as tk
from tkinter import ttk
import time
from playsound import playsound

def alarme():
    tempo_do_alarme = hora_spinbox.get() + ":" + minuto_spinbox.get() + ":" + segundo_spinbox.get()  # Obtém o tempo definido pelo usuário
    while True:
        obter_tempo = time.strftime("%H:%M:%S")  # Obtém a hora atual
        if obter_tempo == tempo_do_alarme:  # Verifica se a hora atual coincide com o alarme
            playsound("alarm.mp3")  # Reproduzir o som do alarme
            break

# Configuração da interface gráfica
raiz = tk.Tk()
raiz.title("Despertador")

label = tk.Label(raiz, text="Selecione a hora do alarme:")  # Cria um rótulo para exibir instruções
label.pack()

# Cria os spinboxes para selecionar a hora, minuto e segundo
hora_spinbox = ttk.Spinbox(raiz, from_=0, to=23, width=2, format="%02.0f")
hora_spinbox.pack(side=tk.LEFT)

label_hora = tk.Label(raiz, text=":")
label_hora.pack(side=tk.LEFT)

minuto_spinbox = ttk.Spinbox(raiz, from_=0, to=59, width=2, format="%02.0f")
minuto_spinbox.pack(side=tk.LEFT)

label_minuto = tk.Label(raiz, text=":")
label_minuto.pack(side=tk.LEFT)

segundo_spinbox = ttk.Spinbox(raiz, from_=0, to=59, width=2, format="%02.0f")
segundo_spinbox.pack(side=tk.LEFT)

botao = tk.Button(raiz, text="Definir Alarme", command=alarme)  # Cria um botão para definir o alarme
botao.pack()

raiz.mainloop()
