package minecraft;

import java.util.List;
import java.util.function.Consumer;

public class class03262 extends class06581 {
   private static final class06541 N = class06541.field_1080;
   private static final class06541 y = class06541.field_1078;
   private static final class00392 L = class00392.L(class07536.N("item", class01894.y("smithing_template.ingredients"))).N(N);
   private static final class00392 m = class00392.L(class07536.N("item", class01894.y("smithing_template.applies_to"))).N(N);
   private static final class00392 P = class00392.L(class07536.N("item", class01894.y("smithing_template"))).N(N);
   private static final class00392 s = class00392.L(class07536.N("item", class01894.y("smithing_template.armor_trim.applies_to"))).N(y);
   private static final class00392 T = class00392.L(class07536.N("item", class01894.y("smithing_template.armor_trim.ingredients"))).N(y);
   private static final class00392 b = class00392.L(class07536.N("item", class01894.y("smithing_template.armor_trim.base_slot_description")));
   private static final class00392 j = class00392.L(class07536.N("item", class01894.y("smithing_template.armor_trim.additions_slot_description")));
   private static final class00392 v = class00392.L(class07536.N("item", class01894.y("smithing_template.netherite_upgrade.applies_to"))).N(y);
   private static final class00392 n = class00392.L(class07536.N("item", class01894.y("smithing_template.netherite_upgrade.ingredients"))).N(y);
   private static final class00392 t = class00392.L(class07536.N("item", class01894.y("smithing_template.netherite_upgrade.base_slot_description")));
   private static final class00392 G = class00392.L(class07536.N("item", class01894.y("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final class01894 l = class01894.y("container/slot/helmet");
   private static final class01894 d = class01894.y("container/slot/chestplate");
   private static final class01894 w = class01894.y("container/slot/leggings");
   private static final class01894 k = class01894.y("container/slot/boots");
   private static final class01894 Y = class01894.y("container/slot/hoe");
   private static final class01894 Q = class01894.y("container/slot/axe");
   private static final class01894 O = class01894.y("container/slot/sword");
   private static final class01894 g = class01894.y("container/slot/shovel");
   private static final class01894 I = class01894.y("container/slot/spear");
   private static final class01894 J = class01894.y("container/slot/pickaxe");
   private static final class01894 o = class01894.y("container/slot/ingot");
   private static final class01894 q = class01894.y("container/slot/redstone_dust");
   private static final class01894 K = class01894.y("container/slot/quartz");
   private static final class01894 V = class01894.y("container/slot/emerald");
   private static final class01894 e = class01894.y("container/slot/diamond");
   private static final class01894 H = class01894.y("container/slot/lapis_lazuli");
   private static final class01894 c = class01894.y("container/slot/amethyst_shard");
   private static final class01894 X = class01894.y("container/slot/nautilus_armor");
   private final class00392 a;
   private final class00392 p;
   private final class00392 F;
   private final class00392 A;
   private final List<class01894> f;
   private final List<class01894> C;

   public List<class01894> L() {
      return this.f;
   }

   private static List<class01894> P() {
      return List.of(o, q, H, K, e, V, c);
   }

   private static List<class01894> T() {
      return List.of(o);
   }

   public class03262(class00392 var1, class00392 var2, class00392 var3, class00392 var4, List<class01894> var5, List<class01894> var6, class06573 var7) {
      super(var7);
      this.a = var1;
      this.p = var2;
      this.F = var3;
      this.A = var4;
      this.f = var5;
      this.C = var6;
   }

   private static List<class01894> s() {
      return List.of(l, O, d, J, w, Q, k, Y, g, X, I);
   }

   private static List<class01894> m() {
      return List.of(l, d, w, k);
   }

   public class00392 y() {
      return this.A;
   }

   public static class03262 y(class06573 var0) {
      return new class03262(v, n, t, G, s(), T(), var0);
   }

   public static class03262 N(class06573 var0) {
      return new class03262(s, T, b, j, m(), P(), var0);
   }

   public class00392 N() {
      return this.F;
   }

   @Override
   public void N(class06584 var1, class06591 var2, class08562 var3, Consumer<class00392> var4, class06497 var5) {
      var4.accept(P);
      var4.accept(class05220.N);
      var4.accept(m);
      var4.accept(class05220.N().y(this.a));
      var4.accept(L);
      var4.accept(class05220.N().y(this.p));
   }

   public List<class01894> W() {
      return this.C;
   }
}
