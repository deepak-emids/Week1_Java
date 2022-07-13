
/*case 1*/
abstract class DrawableAbs {
    abstract void draw();
}

/*case 2*/
interface DrawableInterf {
    public void draw();
}

class AnonymousClass {
    public static void main(String[] args) {

        //case 1
        DrawableAbs a = new DrawableAbs() {
            public void draw() {
                System.out.println("DrawableAbs implemented using anonymous class");
            }
        };
        a.draw();

        //case 2
        DrawableInterf d = new DrawableInterf() {
            public void draw() {
                System.out.println("DrawableInterf implemented using anonymous class");
            }
        };
        d.draw();
    }

}





