CC = clang
CFLAGS = -c -Wall -Wextra -O0
LFLAGS = -Wall -Wextra

clean : P30 P30.o
	rm -f P30 *.o

P30 : P30.o
	${CC} ${LFLAGS} P30.o -o P30 -lm

P30.o : P30.c
	${CC} ${CFLAGS} P30.c -o P30.o

