public class Exceptions {
    public static void main(String[] args) {
        try {
            //Stmt 1;
            //Stmt - 2;
            //Stmt - 3;
        } catch (Exception e) {
            //Stmt - 4;
        } finally {
            ///stmt - 5;
        }
        //Stmt-6;
    }

    //Case 1: If there is no exception.
    // 1, 2, 3, 5, 6 normal termination.

    // Case 2: if an exception raised at statement 2 and corresponding catch block matched .
    // 1,4,5,6normal terminations.

    //Case 3:
    // if an exception raised at statement 2 and corresponding catch block is not matched. 1,5
    //abnormal termination.

    //Case 4: if an exception raised at statement 4
    //always abnormal termination but before the finally block will be executed.

    //Case 5: if an exception raised at statement 5 or statement 6
    //always abnormaltermination .

}
