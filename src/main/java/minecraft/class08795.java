package minecraft;

public class class08795 extends class06249<class08266, class06078<class08266>> {
   private static final class01894 N = class01894.y("textures/entity/fish/tropical_a_pattern_1.png");
   private static final class01894 y = class01894.y("textures/entity/fish/tropical_a_pattern_2.png");
   private static final class01894 L = class01894.y("textures/entity/fish/tropical_a_pattern_3.png");
   private static final class01894 u = class01894.y("textures/entity/fish/tropical_a_pattern_4.png");
   private static final class01894 i = class01894.y("textures/entity/fish/tropical_a_pattern_5.png");
   private static final class01894 R = class01894.y("textures/entity/fish/tropical_a_pattern_6.png");
   private static final class01894 M = class01894.y("textures/entity/fish/tropical_b_pattern_1.png");
   private static final class01894 B = class01894.y("textures/entity/fish/tropical_b_pattern_2.png");
   private static final class01894 Z = class01894.y("textures/entity/fish/tropical_b_pattern_3.png");
   private static final class01894 z = class01894.y("textures/entity/fish/tropical_b_pattern_4.png");
   private static final class01894 U = class01894.y("textures/entity/fish/tropical_b_pattern_5.png");
   private static final class01894 E = class01894.y("textures/entity/fish/tropical_b_pattern_6.png");
   private final class03853 W;
   private final class03858 m;

   public class08795(class06252<class08266, class06078<class08266>> var1, class01140 var2) {
      super(var1);
      this.W = new class03853(var2.N(class04802.ua));
      this.m = new class03858(var2.N(class04802.uc));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08266 var4, float var5, float var6) {
      class07892 class07892 = var4.N;

      Object object = switch (class07892.N()) {
         case field_41574 -> this.W;
         case field_41575 -> this.m;
      };

      class01894 class01894 = switch (class07892) {
         case field_6881 -> N;
         case field_6880 -> y;
         case field_6882 -> L;
         case field_6890 -> u;
         case field_6891 -> i;
         case field_6892 -> R;
         case field_6893 -> M;
         case field_6887 -> B;
         case field_6883 -> Z;
         case field_6884 -> z;
         case field_6888 -> U;
         case field_6889 -> E;
      };
      N((class06271<? super class08266>)object, class01894, var1, var2, var3, var4, var4.L, 1);
   }
}
