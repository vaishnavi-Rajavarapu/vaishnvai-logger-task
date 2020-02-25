package LoggerTaskPack;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class houseconstruction
{
	public houseconstruction()
	{
		final Logger LOGGER=Logger.getLogger(interest.class.getName());
		Scanner scan=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("Enter choice of Material Type:");
		output.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
		try {
			String choice2=scan.next();
			int choice=Integer.parseInt(choice2);
			if(choice==3 || choice==1 || choice==2) {
				String choice1="";
				int[] cost= {1200,1500,1800,2500};
				double total_cost;
				if (choice==3) {
					output.println("Do you want fully automated home?(yes/no):\n");
					choice1=scan.next();
				}
				output.println("Area of House (in square feet):");
				float area=scan.nextFloat();
				if(choice==3) {
					if(choice1.equals("yes")) {
						total_cost=cost[3]*area;
					}
					else 
					{
						total_cost=cost[2]*area;
					}
				}
				else 
				{
					total_cost=cost[choice-1]*area;
				}
				output.println("Cost is needed to construct by using your wished materials:"+total_cost);
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