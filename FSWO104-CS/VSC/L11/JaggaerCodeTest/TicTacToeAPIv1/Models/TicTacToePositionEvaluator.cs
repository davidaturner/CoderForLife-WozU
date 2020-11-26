namespace TicTacToeAPIv1.Models {
    public class TicTacToePositionEvaluator {
        static string X_WIN = "x wins";

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

        public int M { get; set; }
        public int N { get; set; }
        public int K { get; set; }

        public string State { get; set; }

        public void Embark (TicTacToePositionJSON jsonIN) {

            this.Id = jsonIN.Id;

            this.Cell01 = jsonIN.Cell01;
            this.Cell02 = jsonIN.Cell02;
            this.Cell03 = jsonIN.Cell03;
            this.Cell04 = jsonIN.Cell04;
            this.Cell05 = jsonIN.Cell05;
            this.Cell06 = jsonIN.Cell06;
            this.Cell07 = jsonIN.Cell07;
            this.Cell08 = jsonIN.Cell08;
            this.Cell09 = jsonIN.Cell09;

            this.M = jsonIN.M;
            this.N = jsonIN.N;
            this.K = jsonIN.K;

            this.State = IGamePositionEvaluated.READY;
        }

        public TicTacToePositionJSON Disembark () {
            TicTacToePositionJSON jsonOUT = new TicTacToePositionJSON ();

            jsonOUT.Id = this.Id;

            jsonOUT.Cell01 = this.Cell01;
            jsonOUT.Cell02 = this.Cell02;
            jsonOUT.Cell03 = this.Cell03;
            jsonOUT.Cell04 = this.Cell04;
            jsonOUT.Cell05 = this.Cell05;
            jsonOUT.Cell06 = this.Cell06;
            jsonOUT.Cell07 = this.Cell07;
            jsonOUT.Cell08 = this.Cell08;
            jsonOUT.Cell09 = this.Cell09;

            jsonOUT.M = this.M;
            jsonOUT.N = this.N;
            jsonOUT.K = this.K;

            jsonOUT.State = this.State;

            return jsonOUT;
        }

        public string Evaluate () {

            if (Validate ()) {

                if (State == null || State == "") {
                    return IGamePositionEvaluated.READY;
                }

                return X_WIN;
            }

            return IGamePositionEvaluated.INVALID;
        }

        public TicTacToePositionJSON Solve () {
            return null;
        }

        private bool Validate () {
            return (Id > 0);
        }
    }
}