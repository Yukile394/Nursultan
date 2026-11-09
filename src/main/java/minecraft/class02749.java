package minecraft;

import java.util.List;

public record class02749(
   class03530<class00891> incorrectBlocksForDrops,
   int durability,
   float speed,
   float attackDamageBonus,
   int enchantmentValue,
   class03530<class06581> repairItems
) {
   public static final class02749 N = new class02749(class01210.LL, 59, 2.0F, 0.0F, 15, class01226.yt);
   public static final class02749 y = new class02749(class01210.LN, 131, 4.0F, 1.0F, 5, class01226.yG);
   public static final class02749 L = new class02749(class01210.yr, 190, 5.0F, 1.0F, 13, class01226.yl);
   public static final class02749 u = new class02749(class01210.yh, 250, 6.0F, 2.0F, 14, class01226.yd);
   public static final class02749 i = new class02749(class01210.yD, 1561, 8.0F, 3.0F, 10, class01226.yk);
   public static final class02749 R = new class02749(class01210.Ly, 32, 12.0F, 0.0F, 22, class01226.yw);
   public static final class02749 M = new class02749(class01210.yx, 2031, 9.0F, 4.0F, 15, class01226.yY);

   public float L() {
      return this.speed;
   }

   public class02749(
      class03530<class00891> incorrectBlocksForDrops,
      int durability,
      float speed,
      float attackDamageBonus,
      int enchantmentValue,
      class03530<class06581> repairItems
   ) {
      super();
      this.incorrectBlocksForDrops = incorrectBlocksForDrops;
      this.durability = durability;
      this.speed = speed;
      this.attackDamageBonus = attackDamageBonus;
      this.enchantmentValue = enchantmentValue;
      this.repairItems = repairItems;
   }

   public int i() {
      return this.enchantmentValue;
   }

   public float u() {
      return this.attackDamageBonus;
   }

   public int y() {
      return this.durability;
   }

   private class02833 y(float var1, float var2) {
      return class02833.N()
         .N(class05298.u, new class07471(class06581.M, var1 + this.attackDamageBonus, class07463.field_6328), class02834.field_49217)
         .N(class05298.R, new class07471(class06581.B, var2, class07463.field_6328), class02834.field_49217)
         .N();
   }

   private class02833 N(float var1, float var2) {
      return class02833.N()
         .N(class05298.u, new class07471(class06581.M, var1 + this.attackDamageBonus, class07463.field_6328), class02834.field_49217)
         .N(class05298.R, new class07471(class06581.B, var2, class07463.field_6328), class02834.field_49217)
         .N();
   }

   private class06573 N(class06573 var1) {
      return var1.y(this.durability).N(this.repairItems).L(this.enchantmentValue);
   }

   public class06573 N(class06573 var1, float var2, float var3) {
      class02055 class02055 = class04206.N(class04206.i);
      return this.N(var1)
         .N(
            class02484.O,
            new class02197(
               List.of(
                  class02191.N(class03543.N(class00869.yw.s()), 15.0F),
                  class02191.y(class02055.y(class01210.yA), Float.MAX_VALUE),
                  class02191.y(class02055.y(class01210.yF), 1.5F)
               ),
               1.0F,
               2,
               false
            )
         )
         .N(this.y(var2, var3))
         .N(class02484.g, new class08609(1));
   }

   public class06573 N(class06573 var1, class03530<class00891> var2, float var3, float var4, float var5) {
      class02055 class02055 = class04206.N(class04206.i);
      return this.N(var1)
         .N(
            class02484.O,
            new class02197(List.of(class02191.N(class02055.y(this.incorrectBlocksForDrops)), class02191.N(class02055.y(var2), this.speed)), 1.0F, 1, true)
         )
         .N(this.N(var3, var4))
         .N(class02484.g, new class08609(2, var5));
   }

   public class03530<class00891> N() {
      return this.incorrectBlocksForDrops;
   }

   public class03530<class06581> R() {
      return this.repairItems;
   }
}
