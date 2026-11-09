package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02551(class02546 minDamage, class02546 maxDamage, class03556<class03689> damageType) implements class02560 {
   public static final MapCodec<class02551> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02546.y.fieldOf("min_damage").forGetter(class02551::y),
            class02546.y.fieldOf("max_damage").forGetter(class02551::L),
            class03689.y.fieldOf("damage_type").forGetter(class02551::u)
         )
         .apply(var0, class02551::new)
   );

   public class02546 L() {
      return this.maxDamage;
   }

   public class02551(class02546 minDamage, class02546 maxDamage, class03556<class03689> damageType) {
      super();
      this.minDamage = minDamage;
      this.maxDamage = maxDamage;
      this.damageType = damageType;
   }

   public class03556<class03689> u() {
      return this.damageType;
   }

   public class02546 y() {
      return this.minDamage;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      float f = class04995.y(var4.method_59922(), this.minDamage.N(var2), this.maxDamage.N(var2));
      var4.method_64397(var1, new class07072(this.damageType, var3.L()), f);
   }

   @Override
   public MapCodec<class02551> N() {
      return N;
   }
}
