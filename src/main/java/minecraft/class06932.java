package minecraft;

import Nursultan.class10014;
import Nursultan.class11647;
import java.util.Map;

public record class06932(
   int durability,
   Map<class03274, Integer> defense,
   int enchantmentValue,
   class03556<class04891> equipSound,
   float toughness,
   float knockbackResistance,
   class03530<class06581> repairIngredient,
   class05946<class11647> assetId
) {
   public int L() {
      return this.enchantmentValue;
   }

   public class03530<class06581> M() {
      return this.repairIngredient;
   }

   public class06932(
      int durability,
      Map<class03274, Integer> defense,
      int enchantmentValue,
      class03556<class04891> equipSound,
      float toughness,
      float knockbackResistance,
      class03530<class06581> repairIngredient,
      class05946<class11647> assetId
   ) {
      super();
      this.durability = durability;
      this.defense = defense;
      this.enchantmentValue = enchantmentValue;
      this.equipSound = equipSound;
      this.toughness = toughness;
      this.knockbackResistance = knockbackResistance;
      this.repairIngredient = repairIngredient;
      this.assetId = assetId;
   }

   public class05946<class11647> B() {
      return this.assetId;
   }

   public float i() {
      return this.toughness;
   }

   public class03556<class04891> u() {
      return this.equipSound;
   }

   public Map<class03274, Integer> y() {
      return this.defense;
   }

   public class02833 N(class03274 var1) {
      int i = this.defense.getOrDefault(var1, 0);
      class10014 class10014 = class02833.N();
      class02834 class02834 = class02834.N(var1.N());
      class01894 class01894 = class01894.y("armor." + var1.y());
      class10014.N(class05298.y, new class07471(class01894, i, class07463.field_6328), class02834);
      class10014.N(class05298.L, new class07471(class01894, this.toughness, class07463.field_6328), class02834);
      if (this.knockbackResistance > 0.0F) {
         class10014.N(class05298.b, new class07471(class01894, this.knockbackResistance, class07463.field_6328), class02834);
      }

      return class10014.N();
   }

   public int N() {
      return this.durability;
   }

   public float R() {
      return this.knockbackResistance;
   }
}
