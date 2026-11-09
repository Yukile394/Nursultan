package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.nio.file.Path;
import net.irisshaders.iris.mixin.DimensionTypeAccessor;

public record class07376(
   boolean hasFixedTime,
   boolean hasSkyLight,
   boolean hasCeiling,
   double coordinateScale,
   int minY,
   int height,
   int logicalHeight,
   class03530<class00891> infiniburn,
   float ambientLight,
   class07370 monsterSettings,
   class07360 skybox,
   class07334 cardinalLightType,
   class00587 attributes,
   class03543<class07587> timelines
) implements DimensionTypeAccessor {
   public static final int N = class07209.field_10975;
   public static final int y = 16;
   public static final int L = (1 << N) - 32;
   public static final int u = (L >> 1) - 1;
   public static final int i = u - L + 1;
   public static final int R = u << 4;
   public static final int M = i << 4;
   public static final Codec<class07376> B = N(class00587.y);
   public static final Codec<class07376> Z = N(class00587.L);
   public static final class02362<class04247, class03556<class07376>> z = class02389.y(class04227.yu);
   public static final float[] U = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<class03556<class07376>> E = class01281.N(class04227.yu, B);

   public boolean L() {
      return this.skybox == class07360.field_64387;
   }

   public double M() {
      return this.coordinateScale;
   }

   public class07334 P() {
      return this.cardinalLightType;
   }

   public class03543<class07587> T() {
      return this.timelines;
   }

   public class07376(
      boolean hasFixedTime,
      boolean hasSkyLight,
      boolean hasCeiling,
      double coordinateScale,
      int minY,
      int height,
      int logicalHeight,
      class03530<class00891> infiniburn,
      float ambientLight,
      class07370 monsterSettings,
      class07360 skybox,
      class07334 cardinalLightType,
      class00587 attributes,
      class03543<class07587> timelines
   ) {
      super();
      if (height < 16) {
         throw new IllegalStateException("height has to be at least 16");
      } else if (minY + height > u + 1) {
         throw new IllegalStateException("min_y + height cannot be higher than: " + (u + 1));
      } else if (logicalHeight > height) {
         throw new IllegalStateException("logical_height cannot be higher than height");
      } else if (height % 16 != 0) {
         throw new IllegalStateException("height has to be multiple of 16");
      } else if (minY % 16 != 0) {
         throw new IllegalStateException("min_y has to be a multiple of 16");
      } else {
         this.hasFixedTime = hasFixedTime;
         this.hasSkyLight = hasSkyLight;
         this.hasCeiling = hasCeiling;
         this.coordinateScale = coordinateScale;
         this.minY = minY;
         this.height = height;
         this.logicalHeight = logicalHeight;
         this.infiniburn = infiniburn;
         this.ambientLight = ambientLight;
         this.monsterSettings = monsterSettings;
         this.skybox = skybox;
         this.cardinalLightType = cardinalLightType;
         this.attributes = attributes;
         this.timelines = timelines;
      }
   }

   public int B() {
      return this.minY;
   }

   public int Z() {
      return this.height;
   }

   public boolean i() {
      return this.hasSkyLight;
   }

   public class00587 s() {
      return this.attributes;
   }

   public class07360 m() {
      return this.skybox;
   }

   public class03530<class00891> U() {
      return this.infiniburn;
   }

   public int z() {
      return this.logicalHeight;
   }

   public boolean u() {
      return this.hasFixedTime;
   }

   public int y() {
      return this.monsterSettings.y();
   }

   public float E() {
      return this.ambientLight;
   }

   public static double N(class07376 var0, class07376 var1) {
      double d0 = var0.M();
      double d1 = var1.M();
      return d0 / d1;
   }

   private static Codec<class07376> N(Codec<class00587> var0) {
      return class06338.i(
         RecordCodecBuilder.create(
            var1 -> var1.group(
                  Codec.BOOL.optionalFieldOf("has_fixed_time", false).forGetter(class07376::u),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(class07376::i),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(class07376::R),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(class07376::M),
                  Codec.intRange(i, u).fieldOf("min_y").forGetter(class07376::B),
                  Codec.intRange(16, L).fieldOf("height").forGetter(class07376::Z),
                  Codec.intRange(0, L).fieldOf("logical_height").forGetter(class07376::z),
                  class03530.y(class04227.Z).fieldOf("infiniburn").forGetter(class07376::U),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(class07376::E),
                  class07370.N.forGetter(class07376::W),
                  class07360.field_64388.optionalFieldOf("skybox", class07360.field_64386).forGetter(class07376::m),
                  class07334.field_64382.optionalFieldOf("cardinal_light", class07334.field_64380).forGetter(class07376::P),
                  var0.optionalFieldOf("attributes", class00587.N).forGetter(class07376::s),
                  class03541.N(class04227.yG).optionalFieldOf("timelines", class03543.R()).forGetter(class07376::T)
               )
               .apply(var1, class07376::new)
         )
      );
   }

   public static Path N(class05946<class07299> var0, Path var1) {
      if (var0 == class07299.field_25179) {
         return var1;
      } else if (var0 == class07299.field_25181) {
         return var1.resolve("DIM1");
      } else {
         return var0 == class07299.field_25180 ? var1.resolve("DIM-1") : var1.resolve("dimensions").resolve(var0.N().y()).resolve(var0.N().N());
      }
   }

   public class02142 N() {
      return this.monsterSettings.N();
   }

   public class07370 W() {
      return this.monsterSettings;
   }

   public boolean R() {
      return this.hasCeiling;
   }
}
