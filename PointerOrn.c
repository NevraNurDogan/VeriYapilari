#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	//işaretçilere değer atama
	
	int *ip,id;
	id=25;
	ip=&id;
	printf("id degisken degeri:%d \n",id);//25
	printf("id degisken degeri:%d \n",*ip);//25
	printf("id degisken bellek adresi:%d\n",&id);//adres
	printf("id degisken bellek adresi:%d\n",ip);//adres
	
	
	//İşaretçiler yoluyla değişkenlere değer atama
	
	int *p1,*p2,d1,d2;
	p1 = &d1; // d1 değişkeninin adresini p1 işaretçisine atama
    p2 = &d2; // d2 değişkeninin adresini p2 işaretçisine atama
    d1 = 42;   // d1 değişkenine değer atama
   *p2 = 67;  // d2 değişkenine p2 işaretçisi yoluyla değer atama

  printf("d1 degiskeninin degeri: %d\n", *p1);
  printf("d2 degiskeninin degeri: %d\n", *p2);
  printf("d1 degiskeninin bellek adresi: %p\n", p1);
  printf("d2 degiskeninin bellek adresi: %p", p2);

  printf("\n\n");

  printf("p1 isaretcisinin bellek adresi: %p\n", p1);
  printf("p2 isaretcisinin bellek adresi: %p", p2);

	
	
	return 0;
}
