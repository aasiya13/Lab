#include <stdio.h>
#include <stdlib.h>

int count;
int countSum=0;
typedef int * bigint_t; 
int* new_bigint(char* num);
void show_bigint(bigint_t ary);
void free_bigint(bigint_t freeNum);
int countIntArry(bigint_t ary);
int add(bigint_t sum, bigint_t a, bigint_t b);
bigint_t makeZero(bigint_t arry);



int main(){
	char* bigNum="123";
	char* bigNum2="9876";
	char* p="0";
	bigint_t x = new_bigint(bigNum);
	bigint_t y= new_bigint(bigNum2);
	bigint_t sum= new_bigint(p);
	bigint_t makeZero(bigint_t arry);
	
	 add(sum, x, y);
	
	
return 0;
}

bigint_t new_bigint(char* num){
	
	// taking the size of big integer
	while(num[count]!='\0'){
		count++;								// count shows the number of diigit in the given integer;
	}
	
	//int intArry[count];
	int i;
	char intNum;
	int *intArry;
	intArry=(int*)malloc((sizeof(int)*(count+1)));		// to store the given number
	
	for(i=0;i<count;i++){								// break the string into one digit by one and store in the array
		intNum=num[count-1-i];
		intArry[i]=atoi(&intNum);
	}
	intArry[count]=-1;
	count=0;
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
 
	int countA=countIntArry(a);
	int countB=countIntArry(b);
	if(countA>countB){
		countSum=countA+1;
	}else{
		countSum=countB+1;
		}
	
	bigint_t newA=makeZero(a);
	bigint_t newB=makeZero(b);
	int m;
	int isDecimal=0;
	int carry=0;
	for(m=0;m<countSum;m++){
		isDecimal=newA[m]+newB[m];
		if(isDecimal>=10){
			sum[m]=isDecimal%10;
			carry= isDecimal/10;
		}else{
			sum[m]=isDecimal+carry;
			carry=0;
			}
	}
		sum[countSum]=-1;
		show_bigint(sum);
		
	int t;
	//for(t=0;t<countSum;t++){
		//printf("%d",sum[countSum]);
	//}
	return 1;
}

int countIntArry(bigint_t ary){ 	//to get number of elements in the array
	int count1=0;
	while(ary[count1]!=-1){		
		count1++;
	}
	return count1;
}

bigint_t makeZero(bigint_t arry){		// makiing front digits zero
		int j;
	int temp=0;
	for(j=0;j<countSum;j++){
		if(arry[j]==-1){
			temp=4;
			}
			if(temp==4){
				arry[j]=0;
				}
	}
	
	return arry;
}
