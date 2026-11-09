package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import jerozgen.languagereload.mixin.SignTextAccessor;
import org.jspecify.annotations.Nullable;

public class class03610 implements SignTextAccessor {
   private static final Codec<class00392[]> L = class03748.N
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 4)
            .map(var0x -> new class00392[]{(class00392)var0x.get(0), (class00392)var0x.get(1), (class00392)var0x.get(2), (class00392)var0x.get(3)}),
         var0 -> List.of(var0[0], var0[1], var0[2], var0[3])
      );
   public static final Codec<class03610> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            L.fieldOf("messages").forGetter(var0x -> var0x.u),
            L.lenientOptionalFieldOf("filtered_messages").forGetter(class03610::u),
            class06563.field_41600.fieldOf("color").orElse(class06563.field_7963).forGetter(var0x -> var0x.R),
            Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter(var0x -> var0x.M)
         )
         .apply(var0, class03610::N)
   );
   public static final int y = 4;
   private final class00392[] u;
   private final class00392[] i;
   private final class06563 R;
   private final boolean M;
   @Nullable
   private class01028[] B;
   private boolean Z;

   private static class00392[] L() {
      return new class00392[]{class05220.N, class05220.N, class05220.N, class05220.N};
   }

   public class03610() {
      this(L(), L(), class06563.field_7963, false);
   }

   public class03610(class00392[] var1, class00392[] var2, class06563 var3, boolean var4) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.M = var4;
   }

   private Optional<class00392[]> u() {
      for (int ix = 0; ix < 4; ix++) {
         if (!this.i[ix].equals(this.u[ix])) {
            return Optional.of(this.i);
         }
      }

      return Optional.empty();
   }

   public class00392[] y(boolean var1) {
      return var1 ? this.i : this.u;
   }

   public boolean y(class08036 var1) {
      class00392[] aclass00392 = this.y(var1.method_33793());
      int ix = aclass00392.length;

      for (int j = 0; j < ix; j++) {
         class00647 class00647 = aclass00392[j].method_10866().Z();
         if (class00647 != null && class00647.N() == class00654.field_11750) {
            return true;
         }
      }

      return false;
   }

   public class06563 y() {
      return this.R;
   }

   public class00392 N(int var1, boolean var2) {
      return this.y(var2)[var1];
   }

   public class03610 N(class06563 var1) {
      return var1 == this.y() ? this : new class03610(this.u, this.i, var1, this.M);
   }

   public class03610 N(boolean var1) {
      return var1 == this.M ? this : new class03610(this.u, this.i, this.R, var1);
   }

   public boolean N() {
      return this.M;
   }

   private static class03610 N(class00392[] var0, Optional<class00392[]> var1, class06563 var2, boolean var3) {
      return new class03610(var0, var1.orElse(Arrays.copyOf(var0, var0.length)), var2, var3);
   }

   public class01028[] N(boolean var1, Function<class00392, class01028> var2) {
      if (this.B == null || this.Z != var1) {
         this.Z = var1;
         this.B = new class01028[4];

         for (int ix = 0; ix < 4; ix++) {
            this.B[ix] = (class01028)var2.apply(this.N(ix, var1));
         }
      }

      return this.B;
   }

   public boolean N(class08036 var1) {
      return Arrays.stream(this.y(var1.method_33793())).anyMatch(var0 -> !var0.getString().isEmpty());
   }

   public class03610 N(int var1, class00392 var2, class00392 var3) {
      class00392[] aclass00392 = Arrays.copyOf(this.u, this.u.length);
      class00392[] aclass003921 = Arrays.copyOf(this.i, this.i.length);
      aclass00392[var1] = var2;
      aclass003921[var1] = var3;
      return new class03610(aclass00392, aclass003921, this.R, this.M);
   }

   public class03610 N(int var1, class00392 var2) {
      return this.N(var1, var2, var2);
   }
}
