package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class class04748 {
   public static final Codec<class04748> L = class04206.F.T().dispatch(class04748::N, class04367::codec);
   public static final Codec<class03556<class04748>> u = class01281.N(class04227.yj, L);
   protected final class04758 i;

   public Map<class07428, class04426> L() {
      return this.i.y();
   }

   private static int[] L(class04764 var0, int var1, int var2, int var3, int var4) {
      class08088 class08088 = var0.y();
      class05474 class05474 = var0.Z();
      class04084 class04084 = var0.u();
      return new int[]{
         class08088.L(var1, var3, class07830.field_13194, class05474, class04084),
         class08088.L(var1, var3 + var4, class07830.field_13194, class05474, class04084),
         class08088.L(var1 + var2, var3, class07830.field_13194, class05474, class04084),
         class08088.L(var1 + var2, var3 + var4, class07830.field_13194, class05474, class04084)
      };
   }

   public class04748(class04758 var1) {
      super();
      this.i = var1;
   }

   public class06040 i() {
      return this.i.u();
   }

   public class07852 u() {
      return this.i.L();
   }

   public static int y(class04764 var0, int var1, int var2, int var3, int var4) {
      int[] aint = L(var0, var1, var3, var2, var4);
      return Math.min(Math.min(aint[0], aint[1]), Math.min(aint[2], aint[3]));
   }

   public Optional<class04780> y(class04764 var1) {
      return this.N(var1).filter(var1x -> N(var1x, var1));
   }

   public class03543<class00780> y() {
      return this.i.N();
   }

   protected abstract Optional<class04780> N(class04764 var1);

   @Deprecated
   protected class07209 N(class04764 var1, class06993 var2) {
      byte b0 = 5;
      byte b1 = 5;
      if (var2 == class06993.field_11463) {
         b0 = -5;
      } else if (var2 == class06993.field_11464) {
         b0 = -5;
         b1 = -5;
      } else if (var2 == class06993.field_11465) {
         b1 = -5;
      }

      class07321 class07321 = var1.B();
      int ix = class07321.N(7);
      int j = class07321.y(7);
      return new class07209(ix, y(var1, ix, j, b0, b1), j);
   }

   public abstract class04367<?> N();

   public static <S extends class04748> RecordCodecBuilder<S, class04758> N(Instance<S> var0) {
      return class04758.R.forGetter(var0x -> var0x.i);
   }

   private static boolean N(class04780 var0, class04764 var1) {
      class07209 class07209 = var0.y();
      return var1.z()
         .test(
            var1.y()
               .u()
               .method_38109(
                  class01146.N(class07209.method_10263()), class01146.N(class07209.method_10264()), class01146.N(class07209.method_10260()), var1.u().y()
               )
         );
   }

   protected static Optional<class04780> N(class04764 var0, class07830 var1, Consumer<class03291> var2) {
      class07321 class07321 = var0.B();
      int ix = class07321.L();
      int j = class07321.u();
      int k = var0.y().L(ix, j, var1, var0.Z(), var0.u());
      return Optional.of(new class04780(new class07209(ix, k, j), var2));
   }

   public class04932 N(
      class03556<class04748> var1,
      class05946<class07299> var2,
      class01042 var3,
      class08088 var4,
      class00765 var5,
      class04084 var6,
      class01224 var7,
      long var8,
      class07321 var10,
      int var11,
      class05474 var12,
      Predicate<class03556<class00780>> var13
   ) {
      class03299 class03299 = class01834.M.N(var10, var2, var1);
      class04764 class04764 = new class04764(var3, var4, var5, var6, var7, var8, var10, var12, var13);
      Optional optional = this.y(class04764);
      if (optional.isPresent()) {
         class03291 class03291 = ((class04780)optional.get()).N();
         class04932 class04932 = new class04932(this, var10, var11, class03291.N());
         if (class04932.y()) {
            if (class03299 != null) {
               class03299.finish(true);
            }

            return class04932;
         }
      }

      if (class03299 != null) {
         class03299.finish(false);
      }

      return class04932.y;
   }

   public class05163 N(class05163 var1) {
      return this.i() != class06040.field_28922 ? var1.N(12) : var1;
   }

   protected static int N(class04764 var0, int var1, int var2) {
      class07321 class07321 = var0.B();
      int ix = class07321.i();
      int j = class07321.R();
      return y(var0, ix, j, var1, var2);
   }

   public static int N(class04764 var0, int var1, int var2, int var3, int var4) {
      int[] aint = L(var0, var1, var2, var3, var4);
      return (aint[0] + aint[1] + aint[2] + aint[3]) / 4;
   }

   public static <S extends class04748> MapCodec<S> N(Function<class04758, S> var0) {
      return RecordCodecBuilder.mapCodec(var1 -> var1.group(N(var1)).apply(var1, var0));
   }

   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class03300 var7) {
   }
}
