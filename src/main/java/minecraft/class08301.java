package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class08301(int nearDistance, int farDistance, List<class01894> sprites, List<class01894> spriteLocations) {
   public static final String N = "hud/locator_bar_dot/";
   public static final int y = 128;
   public static final int L = 332;
   private static final Codec<Integer> Z = Codec.intRange(0, 60000000);
   public static final Codec<class08301> u = RecordCodecBuilder.create(
         var0 -> var0.group(
               Z.optionalFieldOf("near_distance", 128).forGetter(class08301::y),
               Z.optionalFieldOf("far_distance", 332).forGetter(class08301::L),
               class06338.y(class01894.N.listOf()).fieldOf("sprites").forGetter(class08301::u)
            )
            .apply(var0, class08301::new)
      )
      .validate(class08301::N);

   public int L() {
      return this.farDistance;
   }

   public class08301(int var1, int var2, List<class01894> var3) {
      this(var1, var2, var3, var3.stream().map(var0 -> var0.R("hud/locator_bar_dot/")).toList());
   }

   public class08301(int nearDistance, int farDistance, List<class01894> sprites, List<class01894> spriteLocations) {
      super();
      this.nearDistance = nearDistance;
      this.farDistance = farDistance;
      this.sprites = sprites;
      this.spriteLocations = spriteLocations;
   }

   public List<class01894> i() {
      return this.spriteLocations;
   }

   public List<class01894> u() {
      return this.sprites;
   }

   public int y() {
      return this.nearDistance;
   }

   public class01894 N(float var1) {
      if (var1 < this.nearDistance) {
         return this.spriteLocations.getFirst();
      } else if (var1 >= this.farDistance) {
         return this.spriteLocations.getLast();
      } else if (this.spriteLocations.size() == 1) {
         return this.spriteLocations.getFirst();
      } else if (this.spriteLocations.size() == 3) {
         return this.spriteLocations.get(1);
      } else {
         int i = class04995.N((var1 - this.nearDistance) / (this.farDistance - this.nearDistance), 1, this.spriteLocations.size() - 1);
         return this.spriteLocations.get(i);
      }
   }

   public DataResult<class08301> N() {
      if (this.sprites.isEmpty()) {
         return DataResult.error(() -> "Must have at least one sprite icon");
      } else if (this.nearDistance <= 0) {
         return DataResult.error(() -> "Near distance (" + this.nearDistance + ") must be greater than zero");
      } else {
         return this.nearDistance >= this.farDistance
            ? DataResult.error(() -> "Far distance (" + this.farDistance + ") cannot be closer or equal to near distance (" + this.nearDistance + ")")
            : DataResult.success(this);
      }
   }
}
