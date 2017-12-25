var x = 1
var y = 2
var z = 0

repeat {
    z = x + y
    x = y
    y = z
}
while(String(z).characters.count < 1000)
print(String(z))