import sys

n = 13
lower = "abcdefghijklmnopqrstuvwxyz"
upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

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
    
sys.stdout.write("".join(output))