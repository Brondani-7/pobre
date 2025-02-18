public class Victor
{
    String Nome;
    public Victor()
    {
        Nome = "Victor Brondani";
        int idade = 16;
        System.out.println (" " + Nome + idade);
        System.out.println (Nome);
        System.out.println(2025 - idade);
    }
    public static void main(String args[])
    {
        new Victor();
    }
}