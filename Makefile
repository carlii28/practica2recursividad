JAVAC = javac
JAVA = java
SRC = src
BIN = bin

CLASSES = $(SRC)/mates/Matematicas.java $(SRC)/aplicacion/Principal.java

all: build run

build:
	mkdir -p $(BIN)
	$(JAVAC) -d $(BIN) $(CLASSES)

run:
	$(JAVA) -cp $(BIN) aplicacion.Principal

clean:
	rm -rf $(BIN)/*
