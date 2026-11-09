package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class05666(class03556<class05660> type, class03556<class05672> profession, int level) {
   public static final int N = 1;
   public static final int y = 5;
   private static final int[] B = new int[]{0, 10, 70, 150, 250};
   public static final Codec<class05666> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04206.l.b().fieldOf("type").orElseGet(() -> class04206.l.y(class05660.L)).forGetter(var0x -> var0x.type),
            class04206.d.b().fieldOf("profession").orElseGet(() -> class04206.d.y(class05672.y)).forGetter(var0x -> var0x.profession),
            Codec.INT.fieldOf("level").orElse(1).forGetter(var0x -> var0x.level)
         )
         .apply(var0, class05666::new)
   );
   public static final class02362<class04247, class05666> u = class02362.N(
      class02389.y(class04227.NH), class05666::N, class02389.y(class04227.Ne), class05666::y, class02389.B, class05666::L, class05666::new
   );

   public static int L(int var0) {
      return u(var0) ? B[var0] : 0;
   }

   public int L() {
      return this.level;
   }

   public class05666(class03556<class05660> type, class03556<class05672> profession, int level) {
      super();
      level = Math.max(1, level);
      this.type = type;
      this.profession = profession;
      this.level = level;
   }

   public static boolean u(int var0) {
      return var0 >= 1 && var0 < 5;
   }

   public class03556<class05672> y() {
      return this.profession;
   }

   public class05666 y(class02063 var1, class05946<class05672> var2) {
      return this.y(var1.i(var2));
   }

   public static int y(int var0) {
      return u(var0) ? B[var0 - 1] : 0;
   }

   public class05666 y(class03556<class05672> var1) {
      return new class05666(this.type, var1, this.level);
   }

   public class05666 N(class03556<class05660> var1) {
      return new class05666(var1, this.profession, this.level);
   }

   public class05666 N(int var1) {
      return new class05666(this.type, this.profession, var1);
   }

   public class05666 N(class02063 var1, class05946<class05660> var2) {
      return this.N(var1.i(var2));
   }

   public class03556<class05660> N() {
      return this.type;
   }
}
