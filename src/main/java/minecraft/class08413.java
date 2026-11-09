package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public record class08413<T extends class06555>(String N, Supplier<T> y, Codec<T> L, class05715 u) {
   public class08413(String N, Supplier<T> y, Codec<T> L, class05715 u) {
      this.N = N;
      this.y = y;
      this.L = L;
      this.u = u;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class08413 class08413 && this.N.equals(class08413.N);
   }

   @Override
   public String toString() {
      return "SavedDataType[" + this.N + "]";
   }

   @Override
   public int hashCode() {
      return this.N.hashCode();
   }
}
