namespace TicTacToeAPIv1.Models {
    public class TicTacToePositionStateJSON {
        public TicTacToePositionStateJSON (string State) {
            this.State = State;
        }
        public string State { get; }
    }
}