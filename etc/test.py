def pactorial(n) :
    if (n <= 1) :
        return (1)
    return (n * pactorial(n - 1))


print(pactorial(124))
print(pactorial(125))
