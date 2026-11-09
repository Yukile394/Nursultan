package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08149(class08159 permission) implements class08164 {
   public static final MapCodec<class08149> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class08159.y.fieldOf("permission").forGetter(class08149::y)).apply(var0, class08149::new)
   );

   public class08149(class08159 permission) {
      super();
      this.permission = permission;
   }

   public class08159 y() {
      return this.permission;
   }

   @Override
   public boolean N(class08152 var1) {
      return var1.hasPermission(this.permission);
   }

   @Override
   public MapCodec<class08149> N() {
      return y;
   }
}
