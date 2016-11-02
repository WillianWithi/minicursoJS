
#include <stdio.h> 
#define MAX 5 
 
int main(){ 
     
    int matrix[MAX][MAX]; 
    int i,j; 
    int count = 1; 
    int   aux = MAX-1; 
      
// for para criar a matriz caracol
    for(i = 1; i < MAX; i++) {  
        for(j = i-1; j < aux; j++) { 
            matrix[MAX-(aux+1)][j] = c; 
            c++; 
        } 
        for( j = i-1; j < aux; j++) { 
            matrix[j][aux] = count; 
            count++; 
        } 
        for(j = aux; j >= (i-1); j--) { 
            matrix[aux][j] = count; 
            count++; 
        } 
        aux--; 
        for(j = aux; j >= i; j--) { 
            matrix[j][MAX-(aux+2)] = count; 
            count++; 
        } 
    } 

//for para mostrar a matriz
     for(i = 0; i < MAX; i++) { 
        for(j = 0; j < MAX; j++) { 
            printf(" %3d : ",matrix[i][j]); 
             
        } 
        printf("\n"); 
    } 
} 