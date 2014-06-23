package praktikum14c.bin;

public class Circle extends GraphicObject
{
    void resize()
	{
	    System.out.println("Circle Rezise");
	}
    void drawShape()
	{
        System.out.println("Circle Shape");
    }
    void posisition()
    {
        System.out.println(this.x + this.y);
	}
}	