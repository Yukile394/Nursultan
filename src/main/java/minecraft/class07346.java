package minecraft;

public record class07346(short slotNum, class06584 itemStack) implements class00381<class08051> {
   public static final class02362<class04247, class07346> N = class02362.N(
      class02389.i, class07346::N, class06584.N(class06584.Z), class07346::y, class07346::new
   );

   public class07346(int var1, class06584 var2) {
      this((short)var1, var2);
   }

   public class07346(short slotNum, class06584 itemStack) {
      this.slotNum = slotNum;
      this.itemStack = itemStack;
   }

   public class06584 y() {
      return this.itemStack;
   }

   public void method_65081(class08051 var1) {
      var1.method_12070(this);
   }

   public short N() {
      return this.slotNum;
   }

   @Override
   public class02897<class07346> method_65080() {
      return class04248.LW;
   }
}
