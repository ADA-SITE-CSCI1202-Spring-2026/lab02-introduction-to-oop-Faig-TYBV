public class Point{
  private float x;
  private float y;
  public Point(){
    x=0f;
    y=0f;
  }
  public Point(float x, float y){
    this.x=x;
    this.y=y;
  }
  public Point(Point p){
    x=p.x;
    y=p.y;
  }
  public float getX(){
    return x;
  }
  public void setX(int X){
    x=X;
  }
  public float getY(){
    return y;
  }
  public void setY(int Y){
    y=Y;
  }
  public void translate(float dx, float dy){
    x+=dx;
    y+=dy;
  }
  public float distance(Point p){
    return (float) Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y, 2));
  }
  public boolean equals(Point p){
    return x==p.x && y==p.y;
  }
}