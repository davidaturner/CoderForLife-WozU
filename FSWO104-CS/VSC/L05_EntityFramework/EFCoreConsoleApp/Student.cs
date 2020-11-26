namespace EFCoreConsoleApp
{
    public class Student
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Describe => Id + ": " + Name;
               
    }
}