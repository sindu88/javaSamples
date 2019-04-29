public class stringLength 
{
public static void main (String args[])
{
String names[] ={"abc", "de","ghij","odhkshf"};
int max_len=0;

for(int i=0;i<names.length;i++)
{
if(i==0)
max_len=names[i].length() ;
 if (names[i].length()>max_len)
max_len=names[i].length();
}
System.out.println("the max length is: "+ max_len);
}
}
