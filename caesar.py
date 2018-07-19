import sys

n = 13
lower = "abcdefghijklmnopqrstuvwxyz"
upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

print("Enter text to be encrypted: ")
print("Prest ctrl + d when complete")

src = lower + upper
dst = lower[n:] + lower[:n] + upper[n:] + upper[:n]

cipher = {}
i = 0
while i < len(dst):
    cipher[src[i]] = dst[i]
    i = i + 1
    
message = sys.stdin.read()

output = []
i = 0
while i < len(message):
    if message[i] in cipher:
        output.append(cipher[message[i]])
    else:
        output.append(message[i])
    i = i + 1
  

text = ["Encrypted text: ", "".join(output)]  
sys.stdout.write("".join(text))