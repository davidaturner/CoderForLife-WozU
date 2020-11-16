namespace ContactsEntityFramework.Models
{
    public class Contact
    {
        public string Id { get; set; }
        public string FirstName { get; set; }        
        public string LastName { get; set; }  
        public string FullName => FirstName + " " + LastName;      

    }
}