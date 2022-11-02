import tkinter
import os
import tkinter.ttk as ttk
import time

main = Tk()

lolb =  Label(main, text="loading...")

porg = ttk.Progressbar(main, maximum=100, mode="determinate")
porg.start(10)

lolb.pack()
pork.pack()
