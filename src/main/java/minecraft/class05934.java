package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class class05934 {
   public static final MapCodec<class05934> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.LONG.fieldOf("seed").stable().forGetter(class05934::L),
            Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(class05934::u),
            Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(class05934::i),
            Codec.STRING.lenientOptionalFieldOf("legacy_custom_options").stable().forGetter(var0x -> var0x.R)
         )
         .apply(var0, var0.stable(class05934::new))
   );
   public static final class05934 y = new class05934("North Carolina".hashCode(), true, true);
   private final long L;
   private final boolean u;
   private final boolean i;
   private final Optional<String> R;

   public long L() {
      return this.L;
   }

   public static long M() {
      return class06069.u().B();
   }

   private class05934(long var1, boolean var3, boolean var4, Optional<String> var5) {
      super();
      this.L = var1;
      this.u = var3;
      this.i = var4;
      this.R = var5;
   }

   public class05934(long var1, boolean var3, boolean var4) {
      this(var1, var3, var4, Optional.empty());
   }

   public boolean i() {
      return this.i;
   }

   public boolean u() {
      return this.u;
   }

   public static class05934 y() {
      return new class05934(M(), false, false);
   }

   public class05934 y(boolean var1) {
      return new class05934(this.L, var1, this.i, this.R);
   }

   public static class05934 N() {
      return new class05934(M(), true, false);
   }

   public class05934 N(boolean var1) {
      return new class05934(this.L, this.u, var1, this.R);
   }

   public static OptionalLong N(String var0) {
      var0 = var0.trim();
      if (StringUtils.isEmpty(var0)) {
         return OptionalLong.empty();
      } else {
         try {
            return OptionalLong.of(Long.parseLong(var0));
         } catch (NumberFormatException numberformatexception) {
            return OptionalLong.of(var0.hashCode());
         }
      }
   }

   public class05934 N(OptionalLong var1) {
      return new class05934(var1.orElse(M()), this.u, this.i, this.R);
   }

   public boolean R() {
      return this.R.isPresent();
   }
}
