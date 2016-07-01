#include <stdio.h>
#include <stdlib.h>

int count;
typedef int * bigint_t; 
int* new_bigint(char* num);
void show_bigint(bigint_t ary);
void free_bigint(bigint_t freeNum);
int countIntArry(bigint_t ary);



int main(){
	char* bigNum="132459487164488789889";
	char* bigNum2="2082740257924224";
	//
	bigint_t x = new_bigint(bigNum);
	bigint_t y= new_bigint(bigNum2);
	//free_bigint(x);
	show_bigint(x);
	
return 0;
}

bigint_t new_bigint(char* num){
	
	// taking the size of big integer
	while(num[count]!='\0'){
		count++;	// count shows the number of diigit in the given integer;
	}
	//int intArry[count];
	int i;
	char intNum;
	int *intArry;
	intArry=(int*)malloc((sizeof(int)*(count+1)));		// to store the given number
	
	for(i=0;i<count;i++){	// break the string into one digit by one and store in the array
		intNum=num[count-1-i];
		intArry[i]=atoi(&intNum);
	}
	intArry[count]=-1;
	return intArry;
}

void show_bigint(bigint_t ary){		// printing the big integer
	int i;
	int count1 = countIntArry(ary);
	
	// print big integer
	for(i=1;i<=count1;i++){
		printf("%d",ary[count1-i]);
	}
}

void free_bigint(bigint_t freeNum){	//free allocated memory
	free(freeNum);
}

int add(bigint_t sum, bigint_t a, bigint_t b){
	int countSum;
	int countA=countIntArry(a);
	int countB=countIntArry(b);
	if(countA>countB){
		countSum=countA+1;
	}else{
		countSum=countB+1;
		}
	//sum=(*int)malloc(sizeof(int)*countIntArry(sum));
	
	return 1;
}

int countIntArry(bigint_t ary){ 	//to get number of elements in the array
	int count1;
	while(ary[count1]!=-1){		
		count1++;
	}
	return count1;
}
