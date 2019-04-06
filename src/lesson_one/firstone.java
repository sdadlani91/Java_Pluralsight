
/*

Name: ShaanyD.
Created: long ago
Modified: 4/6/19 - starting adding real life examples for property management application


** for loop and if statement example for reference

int a = 36, b = 6, c = 3,
for(c=3;c<10;++c)
System.out.println("Oh shittttt, this be a computer program"+((a-b)/c)+" some other number shit"+c);
if(a>b)
System.out.println(letter +" is greater than B");
else if (a==b)
System.out.println("They be the same");
else
System.out.println("B is a bigger bitch");
*/


public class firstone {

    public static void main(String[] args)

    {

        int  month;
        String monthstring = "";

        char tenantA = 'A', tenantB = 'B', tenantC = 'C';

        float rent = 1400.50f, electricbill = 0f, gasbill = 0f, internetbill = 75.0f, utilitybill = 0f;


        for (month = 1; month <= 12; month++) {


            if (month >= 1 && month < 5) {
                electricbill = 50.25f;
                gasbill = 25.25f;
            } else if (month > 4 && month < 9) {
                electricbill = 75.0f;
                gasbill = 15.50f;
            } else {
                electricbill = 35.99f;
                gasbill = 44.01f;
            }

            utilitybill = electricbill + gasbill + internetbill;
            
             switch(month) {
                case 1:
                    monthstring = "January";
                    break;
                case 2:
                    monthstring = "February";
                    break;
                case 3:
                    monthstring = "March";
                    break;
                case 4:
                    monthstring = "April";
                    break;
                case 5:
                    monthstring = "May";
                    break;
                case 6:
                    monthstring = "June";
                    break;
                case 7:
                    monthstring = "July";
                    break;
                case 8:
                    monthstring = "August";
                    break;
                case 9:
                    monthstring = "September";
                    break;
                case 10:
                    monthstring = "October";
                    break;
                case 11:
                    monthstring = "November";
                    break;
                case 12:
                    monthstring = "December";
                    break;
                }
                    System.out.println("The utility bill for  " + monthstring + " is $" + utilitybill);


        }
    }
}



