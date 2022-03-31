
import java.io.*;
import java.util.Arrays; 
import java.util.ArrayList;

public class HelloWorld{

     public static void main(String []args){
         //Sample data to be replace by numbers from (https://grnhse-ghr-prod-s101.s3.eu-central-1.amazonaws.com/generic_attachments/attachments/401/717/010/original/PhoneNumbers.txt?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVQGOLGY3RZPEZZOZ%2F20220328%2Feu-central-1%2Fs3%2Faws4_request&X-Amz-Date=20220328T090107Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=6b788be5dd3e8fbdb22f44c79bd5e476e3426806777cd0b609562b0852558aec)
       String numbers[] = {"07032347645", "07060982354", "08034328790","08066897890", "0810435765", "09156722367", "07056129087", "08118797854", "07012378454", "09044634697", "08077563986", "09076581785", "08184098756", "09188765900", "08046783456"
        };
        getNetwork(numbers);
        
     }
     
      static void getNetwork(String[] numbers) {
        String[] mtnArray = {"0703", "0706", "0803", "0806", "0810", "0813", "0814", "0816", "0903", "0906", "0913", "0916", "0702", "0704"};
        ArrayList<String> mtnNumbers = new ArrayList<>();

         String[] gloArray = {"0705", "0805", "0807", "0811", "0815", "0905", "0915"};
        ArrayList<String> gloNumbers = new ArrayList<>();

        String[] airtelArray = {"0701", "0708", "0802", "0808", "0812", "0901", "0902", "0904", "0907", "0912"};
        ArrayList<String> airtelNumbers = new ArrayList<>();

        String[] nineMobileArray = {"0809", "0817", "0818", "0909", "0918"};
        ArrayList<String> nineMobileNumbers = new ArrayList<>();
        
        String[] mtelArray = {"0804"};
        ArrayList<String> mtelNumbers = new ArrayList<>();

        for (String number : numbers) {
            if (Arrays.asList(mtnArray).contains(number.substring(0, 4))) {
                mtnNumbers.add(number);
            }
            else if (Arrays.asList(gloArray).contains(number.substring(0, 4))) {
                gloNumbers.add(number);
            }
            else if (Arrays.asList(airtelArray).contains(number.substring(0, 4))) {
                airtelNumbers.add(number);
            }
            else if (Arrays.asList(nineMobileArray).contains(number.substring(0, 4))) {
                nineMobileNumbers.add(number);
            }
             else if (Arrays.asList(mtelArray).contains(number.substring(0, 4))) {
                mtelNumbers.add(number);
            }
        }
        
        System.out.println("MTN: " + mtnNumbers);
        System.out.println("GLO: " + gloNumbers);
        System.out.println("Airtel: " + airtelNumbers);
        System.out.println("9Mobile: " + nineMobileNumbers);
        System.out.println("MTel: " + mtelNumbers);
        
        
    } 
}