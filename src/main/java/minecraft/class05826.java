package minecraft;

import java.util.Objects;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class05826 {
   private class00500 first;
   private class00500 second;
   private class07211 direction;
   private int u;

   public class07211 L() {
      return this.direction;
   }

   public class05826(class00500 var1, class00500 var2, class07211 var3) {
      super();
      this.first = var1;
      this.second = var2;
      this.direction = var3;
      this.N(var1, var2, var3, null);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class05826 class05826
         && this.first == class05826.first
         && this.second == class05826.second
         && this.direction == class05826.direction;
   }

   @Override
   public final String toString() {
      return "class05826[first="
         + Objects.toString(this.first)
         + ", second="
         + Objects.toString(this.second)
         + ", direction="
         + Objects.toString(this.direction)
         + "]";
   }

   @Override
   public int hashCode() {
      return this.u;
   }

   public class00500 y() {
      return this.second;
   }

   private void N(class00500 var1, class00500 var2, class07211 var3, CallbackInfo var4) {
      int i = System.identityHashCode(this.first);
      i = 31 * i + System.identityHashCode(this.second);
      this.u = 31 * i + this.direction.hashCode();
   }

   public class00500 N() {
      return this.first;
   }
}
