#include <stdio.h>

int main() {
    printf("Hola desde programación en C!!!");

    char nombre[20];

    printf("Dame tu nombre buen programador: ");
    scanf("%s", &nombre);

    printf("Bienvenido maestro %s", nombre);

    return 0;
}
