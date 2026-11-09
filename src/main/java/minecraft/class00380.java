package minecraft;

import com.mojang.serialization.MapCodec;

public record class00380(class06584 item) implements class00395 {
   public static final MapCodec<class00380> y = class06584.N.xmap(class00380::new, class00380::y);

   public class00380(class06584 item) {
      item = item.t();
      this.item = item;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class00380 class00380 && class06584.N(this.item, class00380.item);
   }

   @Override
   public int hashCode() {
      return class06584.y(this.item);
   }

   public class06584 y() {
      return this.item;
   }

   @Override
   public class00425 N() {
      return class00425.field_24343;
   }
}
