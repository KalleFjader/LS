public class MoveInfo {
    public int move;
    public int value;

    public MoveInfo(int m, int v) {
        move = m;
        value = v;
    }
    public MoveInfo findCompMove() {
        int i;
        int responsevalue;
        int value;
        int bestMove = 1;
        MoveInfo quickWinInfo;

        if (fullboard()) {
            value = DRAW;
        }
        else if (quickWinInfo = immediateCompWin())



            return null;
    }
}
