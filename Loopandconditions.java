package Week1.Day1;

public class Loopandconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iValue = 345;
		//int condition = iValue;
		int iResult = 0;
		int iQuotient = 0;
		int iRemainder=0;
		while ( iValue != 0 ) {
			iQuotient = iValue/10;
			iRemainder= iValue%10;
			iResult=iResult + iRemainder;
			iValue= iQuotient;
		}
		System.out.println(iResult);
	}

}
