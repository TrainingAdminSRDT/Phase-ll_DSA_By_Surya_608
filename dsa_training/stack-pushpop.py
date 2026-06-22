s = "abc#d##f"

stack = []

for ch in s:
    if ch == "#":
        stack.pop()
    else:
        stack.append(ch)

result = "".join(stack)
print(result)