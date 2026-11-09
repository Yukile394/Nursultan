package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;

public record class02827(class02835 shape, IntList colors, IntList fadeColors, boolean hasTrail, boolean hasTwinkle) implements class02694 {
   public static final class02827 N = new class02827(class02835.field_7976, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> y = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<class02827> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02835.field_49322.fieldOf("shape").forGetter(class02827::N),
            y.optionalFieldOf("colors", IntList.of()).forGetter(class02827::y),
            y.optionalFieldOf("fade_colors", IntList.of()).forGetter(class02827::L),
            Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(class02827::u),
            Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(class02827::i)
         )
         .apply(var0, class02827::new)
   );
   private static final class02362<ByteBuf, IntList> z = class02389.M.N_33(class02389.N()).N_10(IntArrayList::new, ArrayList::new);
   public static final class02362<ByteBuf, class02827> u = class02362.N(
      class02835.field_49321, class02827::N, z, class02827::y, z, class02827::L, class02389.y, class02827::u, class02389.y, class02827::i, class02827::new
   );
   private static final class00392 U = class00392.L("item.minecraft.firework_star.custom_color");

   public IntList L() {
      return this.fadeColors;
   }

   public class02827(class02835 shape, IntList colors, IntList fadeColors, boolean hasTrail, boolean hasTwinkle) {
      super();
      this.shape = shape;
      this.colors = colors;
      this.fadeColors = fadeColors;
      this.hasTrail = hasTrail;
      this.hasTwinkle = hasTwinkle;
   }

   public boolean i() {
      return this.hasTwinkle;
   }

   public boolean u() {
      return this.hasTrail;
   }

   public IntList y() {
      return this.colors;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      var2.accept(this.shape.N().N(class06541.field_1080));
      this.N(var2);
   }

   private static class00392 N(class05216 var0, IntList var1) {
      for (int i = 0; i < var1.size(); i++) {
         if (i > 0) {
            var0.i(", ");
         }

         var0.y(N(var1.getInt(i)));
      }

      return var0;
   }

   private static class00392 N(int var0) {
      class06563 class06563 = class06563.y(var0);
      return (class00392)(class06563 == null ? U : class00392.L("item.minecraft.firework_star." + class06563.y()));
   }

   public class02827 N(IntList var1) {
      return new class02827(this.shape, this.colors, new IntArrayList(var1), this.hasTrail, this.hasTwinkle);
   }

   public void N(Consumer<class00392> var1) {
      if (!this.colors.isEmpty()) {
         var1.accept(N(class00392.i().N(class06541.field_1080), this.colors));
      }

      if (!this.fadeColors.isEmpty()) {
         var1.accept(N(class00392.L("item.minecraft.firework_star.fade_to").y(class05220.l).N(class06541.field_1080), this.fadeColors));
      }

      if (this.hasTrail) {
         var1.accept(class00392.L("item.minecraft.firework_star.trail").N(class06541.field_1080));
      }

      if (this.hasTwinkle) {
         var1.accept(class00392.L("item.minecraft.firework_star.flicker").N(class06541.field_1080));
      }
   }

   public class02835 N() {
      return this.shape;
   }
}
