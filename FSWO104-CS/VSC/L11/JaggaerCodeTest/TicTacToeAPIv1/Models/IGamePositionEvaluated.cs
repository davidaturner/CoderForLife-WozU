namespace TicTacToeAPIv1.Models {
    public interface IGamePositionEvaluated {
        static string READY = "ready";
        static string INPROGRESS = "in progress";
        static string DRAWN = "drawn";
        static string INVALID = "invalid";

        public string evaluate ();
        public string solver ();
    }
}