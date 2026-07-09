public class FindKey
{
public static void findK()
{
//Read only region end
//Write code here
int a=3521;
int b=2452;
int c=1352;
int maxSum=0;
int minSum=0;
foreach (int n in new[] {a,b,c}){
int num =n;
int min=9;
int max=0;
while(num>0) {
int d=num%10;
if(d>max) max=d;
if(d<min) min=d;
num /=10;}
minSum+=min;
maxSum+=max;

}
Console.WriteLine(maxSum+minSum);

}
}