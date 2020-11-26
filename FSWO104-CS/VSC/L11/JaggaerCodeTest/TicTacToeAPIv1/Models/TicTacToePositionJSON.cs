namespace TicTacToeAPIv1.Models {
    public class TicTacToePositionJSON {
        public int Id { get; set; }

        public string Cell01 { get; set; }
        public string Cell02 { get; set; }
        public string Cell03 { get; set; }
        public string Cell04 { get; set; }
        public string Cell05 { get; set; }
        public string Cell06 { get; set; }
        public string Cell07 { get; set; }
        public string Cell08 { get; set; }
        public string Cell09 { get; set; }

        // Additional Position Information
        public int M { get; set; }
        public int N { get; set; }
        public int K { get; set; }

        // Position state
        public string State { get; set; }
    }
}