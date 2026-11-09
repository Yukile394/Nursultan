package minecraft;

public record class00546(int containerId, int buttonId) implements class00381<class08051> {
   public static final class02362<class00667, class00546> N = class02362.N(class02389.l, class00546::N, class02389.B, class00546::y, class00546::new);

   public class00546(int containerId, int buttonId) {
      this.containerId = containerId;
      this.buttonId = buttonId;
   }

   public int y() {
      return this.buttonId;
   }

   public void method_65081(class08051 var1) {
      var1.method_12055(this);
   }

   public int N() {
      return this.containerId;
   }

   @Override
   public class02897<class00546> method_65080() {
      return class04248.yI;
   }
}
