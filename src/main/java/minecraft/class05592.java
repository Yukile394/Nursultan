package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class05592 extends class04748 {
   public static final MapCodec<class05592> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(N(var0), Codec.BOOL.fieldOf("is_beached").forGetter(var0x -> var0x.y)).apply(var0, class05592::new)
   );
   public final boolean y;

   public class05592(class04758 var1, boolean var2) {
      super(var1);
      this.y = var2;
   }

   private void N(class03291 var1, class04764 var2) {
      class06993 class06993 = class06993.N(var2.R());
      class07209 class07209 = new class07209(var2.B().i(), 90, var2.B().R());
      class04940 class04940 = class04914.N(var2.i(), class07209, class06993, var1, var2.R(), this.y);
      if (class04940.y()) {
         class05163 class05163 = class04940.L();
         int i;
         if (this.y) {
            int j = class04748.y(var2, class05163.B(), class05163.u(), class05163.z(), class05163.R());
            i = class04940.N(j, var2.R());
         } else {
            i = class04748.N(var2, class05163.B(), class05163.u(), class05163.z(), class05163.R());
         }

         class04940.N(i);
      }
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class07830 class07830 = this.y ? class07830.field_13194 : class07830.field_13195;
      return N(var1, class07830, var2x -> this.N(var2x, var1));
   }

   @Override
   public class04367<?> N() {
      return class04367.W;
   }
}
