package poovaragavanday2;

public class lastdig {
	
		 public int addLastDigits(int input1,int input2){
		    if(input1<0)
		   input1*=-1;
		  if(input2<0)
		   input2*=-1;
		  int x=input1%10;
		  int y=input2%10;
		  int sum = x+y;
		  return sum;
		 }
		}


