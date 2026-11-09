package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public record class05638(class01894 file, int height, int ascent, int[][] codepointGrid) implements class06270 {
   private static final Codec<int[][]> M = Codec.STRING.listOf().xmap(var0 -> {
      int i = var0.size();
      int[][] aint = new int[i][];

      for (int j = 0; j < i; j++) {
         aint[j] = ((String)var0.get(j)).codePoints().toArray();
      }

      return aint;
   }, var0 -> {
      ArrayList arraylist = new ArrayList(var0.length);

      for (int[] aint : var0) {
         arraylist.add(new String(aint, 0, aint.length));
      }

      return arraylist;
   }).validate(class05638::N);
   public static final MapCodec<class05638> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class01894.N.fieldOf("file").forGetter(class05638::L),
               Codec.INT.optionalFieldOf("height", 8).forGetter(class05638::u),
               Codec.INT.fieldOf("ascent").forGetter(class05638::i),
               M.fieldOf("chars").forGetter(class05638::R)
            )
            .apply(var0, class05638::new)
      )
      .validate(class05638::N);

   public class01894 L() {
      return this.file;
   }

   public class05638(class01894 file, int height, int ascent, int[][] codepointGrid) {
      this.file = file;
      this.height = height;
      this.ascent = ascent;
      this.codepointGrid = codepointGrid;
   }

   public int i() {
      return this.ascent;
   }

   public int u() {
      return this.height;
   }

   @Override
   public Either<class06246, class06254> y() {
      return Either.left(this::N);
   }

   private int N(class08280 var1, int var2, int var3, int var4, int var5) {
      int i;
      for (i = var2 - 1; i >= 0; i--) {
         int j = var4 * var2 + i;

         for (int k = 0; k < var3; k++) {
            int l = var5 * var3 + k;
            if (var1.y(j, l) != 0) {
               return i + 1;
            }
         }
      }

      return i + 1;
   }

   private class06262 N(class01089 var1) throws IOException {
      class01894 class01894 = this.file.R("textures/");

      class05658 class05658;
      try (InputStream inputstream = var1.u(class01894)) {
         class08280 class08280 = class08280.N(class08247.field_4997, inputstream);
         int i = class08280.N();
         int j = class08280.y();
         int k = i / this.codepointGrid[0].length;
         int l = j / this.codepointGrid.length;
         float f = (float)this.height / l;
         class03475 class03475 = new class03475<>(class05656[]::new, class05656[][]::new);

         for (int i1 = 0; i1 < this.codepointGrid.length; i1++) {
            int j1 = 0;

            for (int k1 : this.codepointGrid[i1]) {
               int l1 = j1++;
               if (k1 != 0) {
                  int i2 = this.N(class08280, k, l, l1, i1);
                  if (class03475.N(k1, new class05656(f, class08280, l1 * k, i1 * l, k, l, (int)(0.5 + i2 * f) + 1, this.ascent)) != null) {
                     class05658.N.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(k1), class01894);
                  }
               }
            }
         }

         class05658 = new class05658(class08280, class03475);
      }

      return class05658;
   }

   private static DataResult<int[][]> N(int[][] var0) {
      int i = var0.length;
      if (i == 0) {
         return DataResult.error(() -> "Expected to find data in codepoint grid");
      } else {
         int j = var0[0].length;
         if (j == 0) {
            return DataResult.error(() -> "Expected to find data in codepoint grid");
         } else {
            for (int k = 1; k < i; k++) {
               int[] aint = var0[k];
               if (aint.length != j) {
                  return DataResult.error(
                     () -> "Lines in codepoint grid have to be the same length (found: " + aint.length + " codepoints, expected: " + j + "), pad with \\u0000"
                  );
               }
            }

            return DataResult.success(var0);
         }
      }
   }

   private static DataResult<class05638> N(class05638 var0) {
      return var0.ascent > var0.height ? DataResult.error(() -> "Ascent " + var0.ascent + " higher than height " + var0.height) : DataResult.success(var0);
   }

   @Override
   public class05855 N() {
      return class05855.field_2312;
   }

   public int[][] R() {
      return this.codepointGrid;
   }
}
