using System;
namespace TicTacToeAPIv1.Models {
    public class TicTacToePositionEvaluator {
        protected const string PLAYER_X = "X";
        protected const string PLAYER_O = "O";

        protected const string X_WIN = "x wins";
        protected const string O_WIN = "o wins";
        protected const int INVALID_WIN = 100;

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

            this.State = jsonIN.State;
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

            ResetGamePositionEvaluation ();
            this.State = (Validate ()) ? EvaluateWinLines () :
                IGamePositionEvaluated.INVALID;
            return this.State;
        }

        public bool Validate () {
            // TODO - Check if pos has the right number of X's and 'O's 
            // TODO - Check if right number of cells are being eval-ed.
            // TODO - Check that if there's a win, there's only one.
            return true;
        }
        public TicTacToePositionJSON Solve () {
            return null;
        }

        protected int wins = 0;
        private string EvaluateWinLines () {

            wins += EvaluateOneLine (Cell01, Cell02, Cell03);
            wins += EvaluateOneLine (Cell04, Cell05, Cell06);
            wins += EvaluateOneLine (Cell07, Cell08, Cell09);

            wins += EvaluateOneLine (Cell01, Cell04, Cell07);
            wins += EvaluateOneLine (Cell02, Cell05, Cell08);
            wins += EvaluateOneLine (Cell03, Cell06, Cell09);

            wins += EvaluateOneLine (Cell01, Cell05, Cell09);
            wins += EvaluateOneLine (Cell07, Cell05, Cell03);

            if (wins == 1) {
                return X_WIN;
            } else if (wins == -1) {
                return O_WIN;
            } else if (wins == 0) {
                if (empty_numberoffound == 0) {
                    return IGamePositionEvaluated.DRAWN;
                } else {
                    return IGamePositionEvaluated.INPROGRESS;
                }
            }

            return IGamePositionEvaluated.INVALID;
        }

        private int EvaluateOneLine (string a, string b, string c) {
            if (!CheckEmptyFor (a, b, c)) {
                if (CheckWinLineFor (a, b, c, PLAYER_X)) {
                    return (wins == 0) ? 1 : INVALID_WIN;
                }
                if (CheckWinLineFor (a, b, c, PLAYER_O)) {
                    return (wins == 0) ? -1 : INVALID_WIN;
                }
            }
            return 0;
        }
        private bool CheckEmptyFor (string a, string b, string c) {
            return (String.IsNullOrEmpty (a) || String.IsNullOrEmpty (b) ||
                String.IsNullOrEmpty (c));
        }
        private bool CheckWinLineFor (string a, string b, string c, string player) {
            return (CheckEmptyFor (a, b, c) ? false :
                a.Equals (b) && a.Equals (c) && a.Equals (player));
        }

        protected int x_numberoffound = 0;
        protected int o_numberoffound = 0;
        protected int empty_numberoffound = 0;
        private void ResetGamePositionEvaluation () {

            x_numberoffound = 0;
            o_numberoffound = 0;
            empty_numberoffound = 0;

            CheckBoardCell (Cell01);
            CheckBoardCell (Cell02);
            CheckBoardCell (Cell03);
            CheckBoardCell (Cell04);
            CheckBoardCell (Cell05);
            CheckBoardCell (Cell06);
            CheckBoardCell (Cell07);
            CheckBoardCell (Cell08);
            CheckBoardCell (Cell09);
        }
        private void CheckBoardCell (string cell) {
            if (String.IsNullOrEmpty (cell)) {
                empty_numberoffound += 1;
            } else if (cell.Equals (PLAYER_O)) {
                o_numberoffound += 1;
            } else if (cell.Equals (PLAYER_X)) {
                x_numberoffound += 1;
            }
        }
    }
}