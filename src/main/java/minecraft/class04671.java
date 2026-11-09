package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.Supplier;

public final class class04671 {
   private final String y;
   private final class04648 L;
   private final int u;
   private final Supplier<class00392> i;
   static final Map<String, class04671> N = Maps.newHashMap();

   public String L() {
      return this.y;
   }

   class04671(String var1, class04648 var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = Suppliers.memoize(() -> var2.field_24197.apply(var3, var1));
      N.put(var1, this);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04671 class04671 = (class04671)var1;
         return this.u == class04671.u && this.L == class04671.L;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.y;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.L, this.u);
   }

   public OptionalInt i() {
      if (this.u >= 48 && this.u <= 57) {
         return OptionalInt.of(this.u - 48);
      } else {
         return this.u >= 320 && this.u <= 329 ? OptionalInt.of(this.u - 320) : OptionalInt.empty();
      }
   }

   public class00392 u() {
      return this.i.get();
   }

   public int y() {
      return this.u;
   }

   public class04648 N() {
      return this.L;
   }
}
