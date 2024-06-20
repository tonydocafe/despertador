# despertador.py
Este código cria uma aplicação de despertador utilizando a biblioteca Tkinter do Python para a interface gráfica e a biblioteca playsound para tocar um som de alarme.
Permitindo que o usuário defina um tempo específico para o alarme e reproduz um som quando o tempo atual corresponde ao tempo definido.

### Bibliotecas 
- tkinter.

Biblioteca padrão do Python para criar interfaces gráficas.
Permite criar janelas, botões, rótulos, caixas de texto, e outros componentes de interface.
Facilita a criação e gestão de janelas e eventos de usuário.

- ttk.

Subconjunto de tkinter que fornece uma série de widgets tematicamente melhorados.
Inclui spinboxes, que são caixas de seleção que permitem ao usuário escolher valores numéricos.

- time é usado para obter a hora atual.
- playsound é usado para tocar um arquivo de som.

## Função
- Esta função é chamada quando o botão "Definir Alarme" é pressionado.
- Ela obtém o tempo do alarme definido pelo usuário a partir dos spinboxes.
- Em um loop contínuo, ela verifica a hora atual e compara com o tempo do alarme.
- Quando a hora atual coincide com o tempo do alarme, ela toca o som do alarme e sai do loop.

## Interface
- Uma janela principal é criada com o título "Despertador".
- Um rótulo instruindo o usuário a selecionar a hora do alarme é adicionado.
- Três spinboxes são criados para permitir que o usuário selecione a hora, minuto e segundo do alarme.
- Um botão é adicionado para permitir que o usuário defina o alarme. Quando clicado, ele chama a função alarme.

## Loop Principal da GUI
raiz.mainloop() inicia o loop principal da GUI, que mantém a janela aberta e interativa.

### execução

python3 despertador.py


## O que é GUI?
GUI (Graphical User Interface, ou Interface Gráfica do Usuário) é um tipo de interface que permite aos usuários interagir com dispositivos eletrônicos através de elementos gráficos como janelas, ícones, botões e outros controles visuais. 
Em vez de usar comandos de linha de comando, os usuários podem executar ações clicando e arrastando com o mouse ou tocando na tela. 
No contexto deste código, a GUI permite ao usuário definir um alarme de forma intuitiva e visual.




