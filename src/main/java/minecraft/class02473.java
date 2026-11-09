package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

record class02473(class02477<?> type, boolean removed) {
   public static final Codec<class02473> N = Codec.STRING
      .flatXmap(
         var0 -> {
            boolean flag = var0.startsWith("!");
            if (flag) {
               var0 = var0.substring("!".length());
            }

            class01894 class01894 = class01894.L(var0);
            class02477<?> class02477 = class04206.NW.N(class01894);
            if (class02477 == null) {
               return DataResult.error(() -> "No component with type: '" + class01894 + "'");
            } else {
               return class02477.u()
                  ? DataResult.error(() -> "'" + class01894 + "' is not a persistent component")
                  : DataResult.success(new class02473(class02477, flag));
            }
         },
         var0 -> {
            class02477<?> class02477 = var0.y();
            class01894 class01894 = class04206.NW.y(class02477);
            return class01894 == null
               ? DataResult.error(() -> "Unregistered component: " + class02477)
               : DataResult.success(var0.L() ? "!" + class01894 : class01894.toString());
         }
      );

   public boolean L() {
      return this.removed;
   }

   class02473(class02477<?> type, boolean removed) {
      super();
      this.type = type;
      this.removed = removed;
   }

   public class02477<?> y() {
      return this.type;
   }

   public Codec<?> N() {
      return this.removed ? Codec.EMPTY.codec() : this.type.L();
   }
}
