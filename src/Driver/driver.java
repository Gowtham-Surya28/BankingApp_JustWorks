package Driver;

import java.io.File;
import Transactions.BalanceCalculation;
import Transactions.BalanceCalculationI;

/**
 * @author Gowtham Surya Gunasekaran
 *
 */
public class driver {
    public static void main(String[] args) {
		
		String absolutePath = new File("").getAbsolutePath();
		String bankInputPath = absolutePath+"/bankJustWorks.csv";
		try{
			BalanceCalculationI bObj = new BalanceCalculation();
            bObj.transactionAnalysis(bankInputPath);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{

		}
    }
}