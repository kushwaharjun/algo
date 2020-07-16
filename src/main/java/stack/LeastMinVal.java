package arjun.kushwah.stack;

import arjun.kushwah.Q.IntQ;

public class LeastMinVal {
	boolean isLeast=false;
	int finalLeastval;
	boolean isLeastMin(int val1,IntQ intq) throws Exception{
		int val2=intq.deque();
		if(val1>=val2) {
			isLeast=true;
			if(!intq.isEmpty())
			isLeastMin(val2,intq);
		}
		else {
			isLeast=false;	 
		}
		return isLeast;
	}
	public int findNxtLtNum(int val_1,My_Stack mstk_2,int count ,int placeValue) throws StackIsFullException, StackIsEmptyException {
		if(!mstk_2.isEmpty()) {
		int val_2=mstk_2.pop();
		if(val_1<val_2) {
			finalLeastval=finalLeastval+val_1*placeValue;
			placeValue=placeValue/10;
			finalLeastval=finalLeastval+val_2*placeValue;
			count=count-2;
			placeValue=placeValue/10;
			findNxtLtNum( val_2,mstk_2, count , placeValue);
		}
		else{
			if(val_1==0) {
				count--;
				return finalLeastval=finalLeastval+placeValue-1;
			}
			else{
				
			}
		}
		}
		return 1;
	}
	public static void main(String args[]) throws Exception {
		int num=120;
		LeastMinVal lmsv=new LeastMinVal();
		IntQ intq_1=new IntQ(10);
		My_Stack mstk=new My_Stack(10);
		int count=-1,placeValue=1;
		while(num!=0) {
			intq_1.enque(num%10);
			mstk.push(num%10);
			num/=10;
			count++;
			placeValue=placeValue*10;
		}
		placeValue=placeValue/10;
		System.out.println(placeValue+":"+count);
		if(lmsv.isLeastMin(intq_1.deque(),intq_1)) {
			System.out.println("true");
		}
		else {
			System.out.println(false);
			lmsv.findNxtLtNum(mstk.pop(),mstk,count,placeValue);
		}
			
			
	}

}
