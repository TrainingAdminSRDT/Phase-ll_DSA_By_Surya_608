text = "abcd"
undo_s = list(text) 
redo_s= []

def undo():
    global undo_s, redo_s
    if undo_s:
        redo_s.append(undo_s.pop())
    print("".join(undo_s))

def redo():
    global undo_s, redo_s
    if redo_s:
        undo_s.append(redo_s.pop())
    print("".join(undo_s))


print("Original:", "".join(undo_s))

undo()   # abc

redo()   # abcd
