package LoggerTaskPack;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class interest
{
	public interest()
	{
		final Logger LOGGER=Logger.getLogger(interest.class.getName());
		Scanner scan=new Scanner(System.in);
		int chioce;
		float total_amount = 0,amount,rate_of_interest,time_period;
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("Enter the option in which you want to calculate interest:\n1)simple interest\n2)compound interest\n");
		try {
			chioce=scan.nextInt();
			if(chioce==1 || chioce==2) {
				output.println("enter principle amount");
				amount=scan.nextFloat();
				output.println("enter rate of interest");
				rate_of_interest=scan.nextInt();
				output.println("time (in years)");
				time_period=scan.nextFloat();
				if(chioce==1) {
					total_amount=(amount*rate_of_interest*time_period)/100;
					output.println("amount="+(amount+total_amount));
				}
				else if(chioce==2){
					total_amount=(float) (amount*(Math.pow((1-rate_of_interest), time_period)));
					output.println("amount="+(amount+total_amount));
				
				}
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			LOGGER.warning("PLease enter the valid chioce.......");
		}
	}
}