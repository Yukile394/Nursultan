package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public record class00434(
   String name,
   String profession,
   int xp,
   float health,
   float maxHealth,
   String inventory,
   boolean wantsGolem,
   int angerLevel,
   List<String> activities,
   List<String> behaviors,
   List<String> memories,
   List<String> gossips,
   Set<class07209> pois,
   Set<class07209> potentialPois
) {
   public static final class02362<class00667, class00434> N = class02362.N((var0, var1) -> var1.N(var0), class00434::new);

   public int L() {
      return this.xp;
   }

   public boolean M() {
      return this.wantsGolem;
   }

   public class00434(
      String name,
      String profession,
      int xp,
      float health,
      float maxHealth,
      String inventory,
      boolean wantsGolem,
      int angerLevel,
      List<String> activities,
      List<String> behaviors,
      List<String> memories,
      List<String> gossips,
      Set<class07209> pois,
      Set<class07209> potentialPois
   ) {
      super();
      this.name = name;
      this.profession = profession;
      this.xp = xp;
      this.health = health;
      this.maxHealth = maxHealth;
      this.inventory = inventory;
      this.wantsGolem = wantsGolem;
      this.angerLevel = angerLevel;
      this.activities = activities;
      this.behaviors = behaviors;
      this.memories = memories;
      this.gossips = gossips;
      this.pois = pois;
      this.potentialPois = potentialPois;
   }

   public class00434(class00667 var1) {
      this(
         var1.s(),
         var1.s(),
         var1.readInt(),
         var1.readFloat(),
         var1.readFloat(),
         var1.s(),
         var1.readBoolean(),
         var1.readInt(),
         var1.N_16(class00667::s),
         var1.N_16(class00667::s),
         var1.N_16(class00667::s),
         var1.N_16(class00667::s),
         var1.N_15(HashSet::new, class07209.field_48404),
         var1.N_15(HashSet::new, class07209.field_48404)
      );
   }

   public int B() {
      return this.angerLevel;
   }

   public List<String> Z() {
      return this.activities;
   }

   public float i() {
      return this.maxHealth;
   }

   public Set<class07209> m() {
      return this.potentialPois;
   }

   public List<String> U() {
      return this.memories;
   }

   public List<String> z() {
      return this.behaviors;
   }

   public float u() {
      return this.health;
   }

   public boolean y(class07209 var1) {
      return this.potentialPois.contains(var1);
   }

   public String y() {
      return this.profession;
   }

   public List<String> E() {
      return this.gossips;
   }

   private static List<String> N(class08041 var0) {
      ArrayList arraylist = new ArrayList();
      var0.O().N().forEach((var1x, var2) -> {
         String s = class01445.N(var1x);
         var2.forEach((var2x, var3x) -> arraylist.add(s + ": " + var2x + ": " + var3x));
      });
      return arraylist;
   }

   public String N() {
      return this.name;
   }

   public boolean N(class07209 var1) {
      return this.pois.contains(var1);
   }

   private static String N(class04782 var0, @Nullable Object var1) {
      return switch (var1) {
         case null -> "-";
         case UUID uuid -> N(var0, var0.method_66347(uuid));
         case class07049 class07049 -> class01445.N((class07049)var1);
         case class05352 class05352 -> N(var0, class05352.N());
         case class05751 class05751 -> N(var0, class05751.L());
         case class06289 class06289 -> N(var0, class06289.y());
         case class05744 class05744 -> N(var0, class05744.y());
         case class07072 class07072 -> {
            class07049 class07049x = ((class07072)var1).u();
            yield class07049x == null ? var1.toString() : N(var0, class07049x);
         }
         case Collection collection -> "[" + (String)collection.stream().map(var1x -> N(var0, var1x)).collect(Collectors.joining(", ")) + "]";
         default -> var1.toString();
      };
   }

   private static String N(class04782 var0, long var1, class05378<?> var3, Optional<? extends class01491<?>> var4) {
      String s;
      if (var4.isPresent()) {
         class01491 class01491 = (class01491)var4.get();
         Object object = class01491.L();
         if (var3 == class05378.g) {
            s = var1 - (Long)object + " ticks ago";
         } else if (class01491.i()) {
            s = N(var0, object) + " (ttl: " + class01491.y() + ")";
         } else {
            s = N(var0, object);
         }
      } else {
         s = "-";
      }

      return class04206.k.y(var3).N() + ": " + s;
   }

   private static Stream<String> N(class04782 var0, class07438 var1, long var2) {
      return var1.method_18868().L().entrySet().stream().map(var3 -> {
         class05378 class05378 = var3.getKey();
         Optional optional = var3.getValue();
         return N(var0, var2, class05378, optional);
      }).sorted();
   }

   public void N(class00667 var1) {
      var1.N(this.name);
      var1.N(this.profession);
      var1.writeInt(this.xp);
      var1.writeFloat(this.health);
      var1.writeFloat(this.maxHealth);
      var1.N(this.inventory);
      var1.writeBoolean(this.wantsGolem);
      var1.writeInt(this.angerLevel);
      var1.N_12(this.activities, class00667::N);
      var1.N_12(this.behaviors, class00667::N);
      var1.N_12(this.memories, class00667::N);
      var1.N_12(this.gossips, class00667::N);
      var1.N_12(this.pois, class07209.field_48404);
      var1.N_12(this.potentialPois, class07209.field_48404);
   }

   public static class00434 N(class04782 var0, class07438 var1) {
      String s = class01445.N(var1);
      String s1;
      int i;
      if (var1 instanceof class08041 class08041x) {
         s1 = class08041x.t().y().M();
         i = class08041x.u();
      } else {
         s1 = "";
         i = 0;
      }

      float f1 = var1.method_6032();
      float f = var1.method_6063();
      class01289<?> class01289 = var1.method_18868();
      long j = var1.method_73183().N();
      String s2;
      if (var1 instanceof class04391 class04391) {
         class07075 class07075 = class04391.n();
         s2 = class07075.method_5442() ? "" : class07075.toString();
      } else {
         s2 = "";
      }

      boolean flag = var1 instanceof class08041 class08041 && class08041.N(j);
      int k = var1 instanceof class04003 class04003 ? class04003.E() : -1;
      List list3 = class01289.u().stream().map(class05359::N).toList();
      List list = class01289.z().stream().map(class04142::method_46910).toList();
      List list1 = N(var0, var1, j).map(var0x -> class05018.N(var0x, 255, true)).toList();
      Set<class07209> set = N(class01289, class05378.L, class05378.y, class05378.i);
      Set<class07209> set1 = N(class01289, class05378.u);
      List list2 = var1 instanceof class08041 ? N((class08041)var1) : List.of();
      return new class00434(s, s1, i, f1, f, s2, flag, k, list3, list, list1, list2, set, set1);
   }

   @SafeVarargs
   private static Set<class07209> N(class01289<?> var0, class05378<class06289>... var1) {
      return Stream.of(var1).filter(var0::N).map(var0::L).flatMap(Optional::stream).map(class06289::y).collect(Collectors.toSet());
   }

   public Set<class07209> W() {
      return this.pois;
   }

   public String R() {
      return this.inventory;
   }
}
