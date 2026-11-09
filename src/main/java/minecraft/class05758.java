package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.OptionalBox.Mu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class05758 {
   private static final int N = 20;
   private static final double y = 3.0;
   private static final double L = 2.0;

   public class05758() {
      super();
   }

   private static Optional<Set<class06289>> N(class04139<Mu, Set<class06289>> var0, Optional<Set<class06289>> var1, class04782 var2, class07209 var3) {
      class06289 class06289 = class06289.N(var2.method_27983(), var3);
      return Optional.of(var1.<Set<class06289>>map(var1x -> {
         var1x.add(class06289);
         return (Set<class06289>)var1x;
      }).orElseGet(() -> {
         HashSet hashset = Sets.newHashSet(new class06289[]{class06289});
         var0.N(hashset);
         return hashset;
      }));
   }

   private static boolean N(class04782 var0, class07438 var1, class06289 var2) {
      return var2.N() != var0.method_27983() || !var2.y().method_19769(var1.method_73189(), 3.0);
   }

   private static boolean N(class01289<?> var0, class07209 var1) {
      if (!var0.N(class05378.n)) {
         return false;
      } else {
         class00143 class00143 = var0.L(class05378.n).get();
         if (class00143.L()) {
            return false;
         } else {
            class01763 class01763x = class00143.Z();
            if (class01763x == null) {
               return false;
            } else {
               class01763 class01763x = class00143.B();
               return var1.equals(class01763x.u()) || var1.equals(class01763x.u());
            }
         }
      }
   }

   private static boolean N(class07438 var0, class07209 var1, Optional<List<class07438>> var2) {
      return var2.isEmpty()
         ? false
         : ((List)var2.get())
            .stream()
            .filter(var1x -> var1x.method_5864() == var0.method_5864())
            .filter(var1x -> var1.method_19769(var1x.method_73189(), 2.0))
            .anyMatch(var1x -> N(var1x.method_18868(), var1));
   }

   public static void N(
      class04782 var0, class07438 var1, @Nullable class01763 var2, @Nullable class01763 var3, Set<class06289> var4, Optional<List<class07438>> var5
   ) {
      Iterator iterator = var4.iterator();

      while (iterator.hasNext()) {
         class06289 class06289 = (class06289)iterator.next();
         class07209 class07209 = class06289.y();
         if ((var2 == null || !var2.u().equals(class07209)) && (var3 == null || !var3.u().equals(class07209))) {
            if (N(var0, var1, class06289)) {
               iterator.remove();
            } else {
               class00500 class00500 = var0.method_8320(class07209);
               if (!class00500.N(class01210.Nj, var0x -> var0x.i() instanceof class07196)) {
                  iterator.remove();
               } else {
                  class07196 class07196 = (class07196)class00500.i();
                  if (!class07196.U(class00500)) {
                     iterator.remove();
                  } else if (N(var1, class07209, var5)) {
                     iterator.remove();
                  } else {
                     class07196.N(var1, var0, class00500, class07209, false);
                     iterator.remove();
                  }
               }
            }
         }
      }
   }

   public static class04142<class07438> N() {
      MutableObject mutableobject = new MutableObject();
      MutableInt mutableint = new MutableInt(0);
      return class04137.N_42(
         var2 -> var2.group(var2.y(class05378.n), var2.N(class05378.G), var2.N(class05378.M)).apply(var2, (var3, var4, var5) -> (var6, var7, var8) -> {
            class00143 class00143 = var2.y(var3);
            Optional<Set<class06289>> optional = var2.N(var4);
            if (!class00143.y() && !class00143.L()) {
               if (Objects.equals(mutableobject.get(), class00143.B())) {
                  mutableint.setValue(20);
               } else if (mutableint.decrementAndGet() > 0) {
                  return false;
               }

               mutableobject.setValue(class00143.B());
               class01763 class01763x = class00143.Z();
               class01763 class01763x = class00143.B();
               class07209 class07209x = class01763x.u();
               class00500 class00500x = var6.method_8320(class07209x);
               if (class00500x.N(class01210.Nj, var0xxxx -> var0xxxx.i() instanceof class07196)) {
                  class07196 class07196x = (class07196)class00500x.i();
                  if (!class07196x.U(class00500x)) {
                     class07196x.N(var7, var6, class00500x, class07209x, true);
                  }

                  optional = N(var4, optional, var6, class07209x);
               }

               class07209 class07209x = class01763x.u();
               class00500 class00500x = var6.method_8320(class07209x);
               if (class00500x.N(class01210.Nj, var0xxxx -> var0xxxx.i() instanceof class07196)) {
                  class07196 class07196 = (class07196)class00500x.i();
                  if (!class07196.U(class00500x)) {
                     class07196.N(var7, var6, class00500x, class07209x, true);
                     optional = N(var4, optional, var6, class07209x);
                  }
               }

               optional.ifPresent(var6x -> N(var6, var7, class01763x, class01763, (Set<class06289>)var6x, var2.N(var5)));
               return true;
            } else {
               return false;
            }
         })
      );
   }
}
