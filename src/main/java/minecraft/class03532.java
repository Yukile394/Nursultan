package minecraft;

import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class class03532 {
   public static final Codec<class03532> y = class04206.a.T().dispatch(class03532::i, class03549::codec);
   private static final int N = 10387320;
   private final class00753 L;
   private final class03555 u;
   private final float i;
   private final int R;
   private final Optional<class03538> M;

   public static boolean L(long var0, int var2, int var3, int var4, float var5) {
      class07836 class07836 = new class07836(new class06075(0L));
      class07836.N(var0, var3, var4, 10387320);
      return class07836.z() < var5;
   }

   public boolean L(class02045 var1, int var2, int var3) {
      return !this.M.isPresent() || !this.M.get().N(var1, var2, var3);
   }

   protected class03555 M() {
      return this.u;
   }

   public class03532(class00753 var1, class03555 var2, float var3, int var4, Optional<class03538> var5) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
   }

   protected float B() {
      return this.i;
   }

   protected int Z() {
      return this.R;
   }

   public abstract class03549<?> i();

   protected Optional<class03538> z() {
      return this.M;
   }

   public static boolean u(long var0, int var2, int var3, int var4, float var5) {
      int ix = var3 >> 4;
      int j = var4 >> 4;
      class07836 class07836 = new class07836(new class06075(0L));
      class07836.N(ix ^ j << 4 ^ var0);
      class07836.M();
      return class07836.y((int)(1.0F / var5)) == 0;
   }

   public static boolean y(long var0, int var2, int var3, int var4, float var5) {
      class07836 class07836 = new class07836(new class06075(0L));
      class07836.L(var0, var3, var4);
      return class07836.U() < var5;
   }

   public boolean y(class02045 var1, int var2, int var3) {
      return this.N(var1, var2, var3) && this.N(var2, var3, var1.u()) && this.L(var1, var2, var3);
   }

   protected static <S extends class03532> P5<Mu<S>, class00753, class03555, Float, Integer, Optional<class03538>> N(Instance<S> var0) {
      return var0.group(
         class00753.method_39677(16).optionalFieldOf("locate_offset", class00753.field_11176).forGetter(class03532::R),
         class03555.field_37786.optionalFieldOf("frequency_reduction_method", class03555.field_37782).forGetter(class03532::M),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(class03532::B),
         class06338.T.fieldOf("salt").forGetter(class03532::Z),
         class03538.N.optionalFieldOf("exclusion_zone").forGetter(class03532::z)
      );
   }

   public static boolean N(long var0, int var2, int var3, int var4, float var5) {
      class07836 class07836 = new class07836(new class06075(0L));
      class07836.N(var0, var2, var3, var4);
      return class07836.z() < var5;
   }

   public boolean N(int var1, int var2, long var3) {
      return !(this.i < 1.0F) || this.u.N(var3, this.R, var1, var2, this.i);
   }

   protected abstract boolean N(class02045 var1, int var2, int var3);

   public class07209 N(class07321 var1) {
      return new class07209(var1.i(), 0, var1.R()).method_10081(this.R());
   }

   protected class00753 R() {
      return this.L;
   }
}
