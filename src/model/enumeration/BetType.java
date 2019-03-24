package model.enumeration;

import model.interfaces.Player;
import model.interfaces.Slot;

/**
 * Provided enum type for Further Programming representing a type of Bet<br>
 * See inline comments for where you need to provide additional code
 * 
 * @author Caspar Ryan
 * 
 */
public enum BetType
{
   RED
   {
      @Override
      public void applyWinLoss(Player player, Slot winSlot)
      {
         // TODO implementation
      }
   },
   
   // TODO finish this class with other enum constants
 
   /**
    * This method is to be overridden for each bet type<br>
    * see assignment specification for betting odds and how win/loss is applied
    * 
    * @param player - the player to apply the win/loss points balance adjustment
    * @param winSlot - the winning slot the ball landed on
    */
   public abstract void applyWinLoss(Player player, Slot winSlot);
}