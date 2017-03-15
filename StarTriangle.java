class StarTriangle
{
public static void main(String[] args) 
{
int i,j;
char k;
for(i=1; i<=5; i++)
{
for(j=4; j>=i; j--)
{
System.out.print(" ");
}
for(k='a'; k<='j'; k++)
{
System.out.print(k);
j++;
}
System.out.println("");
}
}
}