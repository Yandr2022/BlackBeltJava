package Part4_NestedClasses.lesson4_LocalInnerClasses;

public class LocalInnerDemo {
    public static void main(String[] args) {

        new Math().getResult();


    }
}

class Math {

    private int a =10;

    public void getResult() {
         int dividend = 21;
        class Division {

            private int divider;

//            public int getDividend() {
//                return dividend;
//            }

//            public void setDividend(int dividend) {
//                this.dividend = dividend;
//            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getDivisionResult() {
                return dividend / divider;
            }

            public int getRemainderOfDivision() {
                return dividend % divider;
            }
        }
        Division division = new Division();
//        division.setDividend(21);
        division.setDivider(4);
        System.out.println(division.getDivisionResult());
        System.out.println(division.getRemainderOfDivision());
        System.out.println(a);


    }
}