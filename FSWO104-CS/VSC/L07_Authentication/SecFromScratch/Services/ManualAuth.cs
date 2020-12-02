using System.Security.Cryptography;
using System.Text;

namespace SecFromScratch.Services {
    public class ManualAuth {
        public static string Sha256 (string randomstring) {
            System.Security.Cryptography.SHA256Managed crypt = new SHA256Managed ();
            StringBuilder sb = new StringBuilder ();
            byte[] crypto = crypt.ComputeHash (Encoding.UTF8.GetBytes (randomstring), 0,
                Encoding.UTF8.GetByteCount (randomstring));
            foreach (byte theByte in crypto) {
                sb.Append (theByte.ToString ("x2"));
            };
            return sb.ToString ();
        }

        public static bool Sha256Check (string userInput, string valueToCompare) {
            string sb = ManualAuth.Sha256 (userInput);
            return (valueToCompare == sb);
        }
    }
}