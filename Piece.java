// Piece.java
 
import java.awt. Point;
 
/**
* Interface qui décrit une pièce d'un jeu de plateau
*
* @author Sébastien Combéfis
* @version 02-mai-08
*/
public interface Piece
{
    public Point getPosition();
 
    public void move ( Direction d);
}