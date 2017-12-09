//Find Cost of Tile to Cover W x H Floor By Tom Biju
import scala.math.BigDecimal;

object floorTileCost extends App{
 
  //Define variables  
  var cost=0.00  
  var price=0.00
  var width=0.00
  var height=0.00
	
  //Asks the user about the price
  println("Enter the cost per square area of tile: ")
  price=readLine().toDouble
	
  //Asks the user about the width
  println("Enter the width of the floor")
  width=readLine().toDouble
	
  //Asks the user about the height
  println("Enter the height of the floor")
  height=readLine().toDouble
	
  //Calculates the total cost of the tiles to cover the floor
  cost=height*width*price
  var trueCost=BigDecimal(cost).setScale(2)

  //Displays the result of the calculation and the values entered by the user	
  println("The cost of covering a "+width+" by "+height+" floor is $"+trueCost)
}


