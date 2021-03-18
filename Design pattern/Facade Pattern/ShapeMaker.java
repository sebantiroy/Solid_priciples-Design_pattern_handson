package FacadePattern;

public class ShapeMaker {
	private Circle c;
	private Rectangle r;
	private Square s;
  public ShapeMaker()
  {
	   c=new Circle();
	   r=new Rectangle();
	   s=new Square();
  }
  void drawCircle()
  {
	  c.draw();
  }
  void drawRectangle()
  {
	  r.draw();
  }
  void drawSquare()
  {
	  s.draw();
  }
}
