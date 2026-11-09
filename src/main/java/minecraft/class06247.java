package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class class06247<S extends class08476 & class08246, M extends class06078<S> & class06275> extends class06249<S, M> {
   private static final Int2ObjectMap<class01894> N = class07536.N(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, class01894.y("stone"));
      var0.put(2, class01894.y("iron"));
      var0.put(3, class01894.y("gold"));
      var0.put(4, class01894.y("emerald"));
      var0.put(5, class01894.y("diamond"));
   });
   private final Object2ObjectMap<class05946<class05660>, class06243> y = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<class05946<class05672>, class06243> L = new Object2ObjectOpenHashMap();
   private final class01089 u;
   private final String i;
   private final M R;
   private final M M;

   public class06247(class06252<S, M> var1, class01089 var2, String var3, M var4, M var5) {
      super(var1);
      this.u = var2;
      this.i = var3;
      this.R = (M)var4;
      this.M = (M)var5;
   }

   private class03556 N(class05666 var1) {
      return (class03556)(((Boolean)VisualSettings.INSTANCE.hideVillagerProfession.getValue()) ? class06202.Nq().NE().j().i(class05672.y) : var1.y());
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      if (!var4.v) {
         class05666 class05666 = ((class08246)var4).N();
         if (class05666 != null) {
            class03556<class05660> class03556 = class05666.N();
            class03556 class03556x = this.N(class05666);
            class06243 class06243x = this.N(this.y, "type", class03556);
            class06243 class06243x = this.N(this.L, "profession", class03556x);
            class06078 class06078x = this.u();
            class01894 class01894xx = this.N("type", class03556);
            boolean flag = class06243x == class06243.field_17160 || class06243x == class06243.field_17161 && class06243x != class06243.field_17162;
            class06078 class06078x = var4.NB ? this.M : this.R;
            y(flag ? class06078x : class06078x, class01894xx, var1, var2, var3, var4, -1, 1);
            if (!class03556x.N(class05672.y) && !var4.NB) {
               class01894 class01894x = this.N("profession", class03556x);
               y(class06078x, class01894x, var1, var2, var3, var4, -1, 2);
               if (!class03556x.N(class05672.W)) {
                  class01894 class01894xx = this.N("profession_level", (class01894)N.get(class04995.N(class05666.L(), 1, N.size())));
                  y(class06078x, class01894xx, var1, var2, var3, var4, -1, 3);
               }
            }
         }
      }
   }

   private class01894 N(String var1, class01894 var2) {
      return var2.N((UnaryOperator<String>)(var2x -> "textures/entity/" + this.i + "/" + var1 + "/" + var2x + ".png"));
   }

   private class01894 N(String var1, class03556<?> var2) {
      return var2.i().map(var2x -> this.N(var1, var2x.N())).orElse(class08923.L());
   }

   public <K> class06243 N(Object2ObjectMap<class05946<K>, class06243> var1, String var2, class03556<K> var3) {
      class05946 class05946 = (class05946)var3.i().orElse(null);
      return class05946 == null
         ? class06243.field_17160
         : (class06243)var1.computeIfAbsent(class05946, var3x -> this.u.method_14486(this.N(var2, class05946.N())).flatMap(var0 -> {
            try {
               return var0.method_14481().N(class06264.y).map(class06264::N);
            } catch (IOException ioexception) {
               return Optional.empty();
            }
         }).orElse(class06243.field_17160));
   }
}
