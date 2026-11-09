package minecraft;

public record class02575(int slotId, int selectedItemIndex) implements class00381<class08051> {
   public static final class02362<class00667, class02575> N = class00381.N(class02575::N, class02575::new);

   private class02575(class00667 var1) {
      this(var1.E(), var1.E());
      if (this.selectedItemIndex < 0 && this.selectedItemIndex != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.selectedItemIndex);
      }
   }

   public class02575(int slotId, int selectedItemIndex) {
      super();
      this.slotId = slotId;
      this.selectedItemIndex = selectedItemIndex;
   }

   public int y() {
      return this.selectedItemIndex;
   }

   private void N(class00667 var1) {
      var1.L(this.slotId);
      var1.L(this.selectedItemIndex);
   }

   public int N() {
      return this.slotId;
   }

   public void method_65081(class08051 var1) {
      var1.method_61220(this);
   }

   @Override
   public class02897<class02575> method_65080() {
      return class04248.yj;
   }
}
