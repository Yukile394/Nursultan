package minecraft;

public record class01735(int slotId, int containerId, boolean newState) implements class00381<class08051> {
   public static final class02362<class00667, class01735> N = class00381.N(class01735::N, class01735::new);

   public boolean L() {
      return this.newState;
   }

   private class01735(class00667 var1) {
      this(var1.E(), var1.G(), var1.readBoolean());
   }

   public class01735(int slotId, int containerId, boolean newState) {
      super();
      this.slotId = slotId;
      this.containerId = containerId;
      this.newState = newState;
   }

   public int y() {
      return this.containerId;
   }

   private void N(class00667 var1) {
      var1.L(this.slotId);
      var1.R(this.containerId);
      var1.writeBoolean(this.newState);
   }

   public void method_65081(class08051 var1) {
      var1.method_54436(this);
   }

   public int N() {
      return this.slotId;
   }

   @Override
   public class02897<class01735> method_65080() {
      return class04248.yq;
   }
}
