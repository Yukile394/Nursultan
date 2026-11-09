package minecraft;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class04479 {
   private static final String z = "spawn_data";
   private static final String U = "next_mob_spawns_at";
   private static final int E = 20;
   private static final int W = 18000;
   final Set<UUID> N = new HashSet<>();
   final Set<UUID> y = new HashSet<>();
   long L;
   long u;
   int i;
   Optional<class00808> R = Optional.empty();
   Optional<class05946<class05074>> M = Optional.empty();
   @Nullable
   private class07049 m;
   @Nullable
   private class04540<class06584> P;
   double B;
   double Z;

   public void L() {
      this.N.clear();
      this.i = 0;
      this.u = 0L;
      this.L = 0L;
   }

   public class04479() {
      super();
   }

   public double i() {
      return this.B;
   }

   public boolean u() {
      return this.y.isEmpty();
   }

   protected class00808 y(class04485 var1, class06069 var2) {
      if (this.R.isPresent()) {
         return this.R.get();
      } else {
         class04540<class00808> class04540 = var1.N().Z();
         Optional<class00808> optional = class04540.L() ? this.R : class04540.N(var2);
         this.R = Optional.of(optional.orElseGet(class00808::new));
         var1.Z();
         return this.R.get();
      }
   }

   public boolean y(class04782 var1, float var2, int var3) {
      long ix = this.L - var3;
      return (float)(var1.N() - ix) % var2 == 0.0F;
   }

   public void y() {
      this.y.clear();
      this.R = Optional.empty();
      this.L();
   }

   @Nullable
   public class07049 N(class04485 var1, class07299 var2, class04481 var3) {
      if (!var3.L()) {
         return null;
      } else {
         if (this.m == null) {
            class07001 class07001 = this.y(var1, var2.method_8409()).N();
            if (class07001.Z("id").isPresent()) {
               this.m = class07078.N(class07001, var2, class06113.field_47245, class06837.N);
            }
         }

         return this.m;
      }
   }

   public boolean N(class04782 var1) {
      return var1.N() >= this.L;
   }

   private static long N(class04782 var0, class07209 var1) {
      class07209 class07209 = new class07209(
         class04995.y(var1.method_10263() / 30.0F), class04995.y(var1.method_10264() / 20.0F), class04995.y(var1.method_10260() / 30.0F)
      );
      return var0.method_8412() + class07209.method_10063();
   }

   class04540<class06584> N(class04782 var1, class04513 var2, class07209 var3) {
      if (this.P != null) {
         return this.P;
      } else {
         class05074 class05074 = var1.method_8503().yd().N(var2.U());
         class04162 class04162 = new class04160(var1).N(class06925.L);
         long ix = N(var1, var3);
         ObjectArrayList<class06584> objectarraylist = class05074.N(class04162, ix);
         if (objectarraylist.isEmpty()) {
            return class04540.N();
         } else {
            class02136 class02136 = class04540.y();
            ObjectListIterator<class06584> objectlistiterator = objectarraylist.iterator();

            while (objectlistiterator.hasNext()) {
               class06584 class06584 = (class06584)objectlistiterator.next();
               class02136.N(class06584.L(1), class06584.c());
            }

            this.P = class02136.N();
            return this.P;
         }
      }
   }

   public class07001 N(class04481 var1) {
      class07001 class07001 = new class07001();
      if (var1 == class04481.field_47385) {
         class07001.N("next_mob_spawns_at", this.u);
      }

      this.R.ifPresent(var1x -> class07001.N("spawn_data", class00808.y, var1x));
      return class07001;
   }

   public int N(class07209 var1) {
      if (this.N.isEmpty()) {
         class07536.y("Trial Spawner at " + var1 + " has no detected players");
      }

      return Math.max(0, this.N.size() - 1);
   }

   public boolean N(class04782 var1, class04513 var2, int var3) {
      return var1.N() >= this.u && this.y.size() < var2.y(var3);
   }

   public boolean N(class04513 var1, int var2) {
      return this.i >= var1.N(var2);
   }

   public boolean N(class04485 var1, class06069 var2) {
      return this.y(var1, var2).N().Z("id").isPresent() || !var1.N().Z().L();
   }

   public void N(class04505 var1) {
      this.N.clear();
      this.N.addAll(var1.N());
      this.y.clear();
      this.y.addAll(var1.y());
      this.L = var1.L();
      this.u = var1.u();
      this.i = var1.i();
      this.R = var1.R();
      this.M = var1.M();
   }

   public class04505 N() {
      return new class04505(Set.copyOf(this.N), Set.copyOf(this.y), this.L, this.u, this.i, this.R, this.M);
   }

   private static void N(class08036 var0) {
      class07055 class07055 = var0.method_6112(class07047.g);
      if (class07055 != null) {
         int ix = class07055.i() + 1;
         int j = 18000 * ix;
         var0.method_6016(class07047.g);
         var0.method_6092(new class07055(class07047.o, j, 0));
      }
   }

   public boolean N(class04782 var1, float var2, int var3) {
      long ix = this.L - var3;
      return (float)var1.N() >= (float)ix + var2;
   }

   private static Optional<Pair<class08036, class03556<class07084>>> N(class04782 var0, List<UUID> var1) {
      class08036 class08036x = null;

      for (UUID uuid : var1) {
         class08036 class08036x = var0.N(uuid);
         if (class08036x != null) {
            class03556<class07084> class03556 = class07047.o;
            if (class08036x.method_6059(class03556)) {
               return Optional.of(Pair.of(class08036x, class03556));
            }

            if (class08036x.method_6059(class07047.g)) {
               class08036x = class08036x;
            }
         }
      }

      return Optional.ofNullable(class08036x).map(var0x -> Pair.of(var0x, class07047.g));
   }

   public void N(class04782 var1, class07209 var2, class04485 var3) {
      if ((var2.method_10063() + var1.N()) % 20L == 0L) {
         if (!var3.M().equals(class04481.field_47388) || !var3.u()) {
            List<UUID> list = var3.z().detect(var1, var3.U(), var2, var3.R(), true);
            boolean flag;
            if (!var3.u() && !list.isEmpty()) {
               Optional<Pair<class08036, class03556<class07084>>> optional = N(var1, list);
               optional.ifPresent(var3x -> {
                  class08036 class08036 = (class08036)var3x.getFirst();
                  if (var3x.getSecond() == class07047.g) {
                     N(class08036);
                  }

                  var1.N(3020, class07209.method_49638(class08036.method_33571()), 0);
                  var3.N(var1, var2);
               });
               flag = optional.isPresent();
            } else {
               flag = false;
            }

            if (!var3.M().equals(class04481.field_47388) || flag) {
               boolean flag1 = var3.B().N.isEmpty();
               List<UUID> list1 = flag1 ? list : var3.z().detect(var1, var3.U(), var2, var3.R(), false);
               if (this.N.addAll(list1)) {
                  this.u = Math.max(var1.N() + 40L, this.u);
                  if (!flag) {
                     int ix = var3.u() ? 3019 : 3013;
                     var1.N(ix, var2, this.N.size());
                  }
               }
            }
         }
      }
   }

   public void N(class04485 var1, class04782 var2) {
      this.y.stream().map(var2::method_66347).forEach(var1x -> {
         if (var1x != null) {
            var2.N(3012, var1x.method_24515(), class04500.field_50186.N());
            if (var1x instanceof class07079) {
               ((class07079)var1x).y_3(var2);
            }

            var1x.method_5650(class07062.field_26999);
         }
      });
      if (!var1.L().Z().L()) {
         this.R = Optional.empty();
      }

      this.i = 0;
      this.y.clear();
      this.u = var2.N() + var1.L().B();
      var1.Z();
      this.L = var2.N() + var1.L().N();
   }

   public double R() {
      return this.Z;
   }
}
