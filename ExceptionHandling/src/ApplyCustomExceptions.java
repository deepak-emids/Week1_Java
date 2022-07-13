public class ApplyCustomExceptions {
    public static void voterCheck(int age) throws CustomException {
        if (age > 18) {
            System.out.println("U are eligible to vote");
        } else {
            throw new CustomException("U are underage", CustomException.exceptionType.UNDERAGE);
        }
    }

    public static void main(String[] args) throws CustomException {
        try{
            voterCheck(15);
        }catch (CustomException ex){
            System.out.println("exception message:"+ex.message+"exception type:"+ex.eType);
        }

    }
}
