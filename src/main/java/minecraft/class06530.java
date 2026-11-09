package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class06530 extends class06581 {
   private static final Map<class07078<?>, class06530> N = Maps.newIdentityHashMap();

   public class06530(class06573 var1) {
      super(var1);
      class08983 class08983 = this.R().method_58694(class02484.NR);
      if (class08983 != null) {
         N.put((class07078<?>)class08983.N(), this);
      }
   }

   @Nullable
   public class07078<?> u(class06584 var1) {
      class08983 class08983 = var1.method_58694(class02484.NR);
      return class08983 != null ? (class07078)class08983.N() : null;
   }

   private class07082 N(@Nullable class07438 var1, class06584 var2, class07299 var3, class07209 var4, boolean var5, boolean var6) {
      class07078<?> class07078 = this.u(var2);
      if (class07078 == null) {
         return class07082.u;
      } else if (!class07078.b() && var3.y() == class07086.field_5801) {
         return class07082.u;
      } else {
         if (class07078.N((class04782)var3, var2, var1, var4, class06113.field_16465, var5, var6) != null) {
            var2.N(1, var1);
            var3.N(var1, class01194.v, var4);
         }

         return class07082.N;
      }
   }

   public Optional<class07079> N(class08036 var1, class07079 var2, class07078<? extends class07079> var3, class04782 var4, class06889 var5, class06584 var6) {
      if (!this.N(var6, var3)) {
         return Optional.empty();
      } else {
         Object object;
         if (var2 instanceof class07077) {
            object = ((class07077)var2).y(var4, (class07077)var2);
         } else {
            object = (class07079)var3.N(var4, class06113.field_16465);
         }

         if (object == null) {
            return Optional.empty();
         } else {
            ((class07079)object).y(true);
            if (!((class07079)object).method_6109()) {
               return Optional.empty();
            } else {
               ((class07079)object).method_5808(var5.N(), var5.y(), var5.L(), 0.0F, 0.0F);
               ((class07079)object).method_66652(var6);
               var4.y((class07049)object);
               var6.N(1, var1);
               return Optional.of((class07079)object);
            }
         }
      }
   }

   @Override
   public boolean N(class06584 var1, @Nullable class08036 var2) {
      if (var2 != null && var2.method_75004().hasPermission(class08162.y)) {
         class08983 class08983 = var1.method_58694(class02484.NR);
         if (class08983 != null) {
            return ((class07078)class08983.N()).j();
         }
      }

      return false;
   }

   public static Iterable<class06530> N() {
      return Iterables.unmodifiableIterable(N.values());
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      class06183 class06183 = N(var1, var2, class05835.field_1345);
      if (class06183.N() != class07113.field_1332) {
         return class07082.i;
      } else if (var1 instanceof class04782 class04782) {
         class07209 class07209 = class06183.u();
         if (!(var1.method_8320(class07209).i() instanceof class07117)) {
            return class07082.i;
         } else if (var1.method_8505(var2, class07209) && var2.method_7343(class07209, class06183.i(), class06584)) {
            class07082 class07082 = this.N(var2, class06584, var1, class07209, false, false);
            if (class07082 == class07082.N) {
               var2.method_7259(class01235.L.y(this));
            }

            return class07082;
         } else {
            return class07082.u;
         }
      } else {
         return class07082.N;
      }
   }

   public boolean N(class06584 var1, class07078<?> var2) {
      return Objects.equals(this.u(var1), var2);
   }

   @Nullable
   public static class06530 N(@Nullable class07078<?> var0) {
      return N.get(var0);
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      if (!(class07299 instanceof class04782 class04782)) {
         return class07082.N;
      } else {
         class06584 class06584 = var1.method_8041();
         class07209 class07209x = var1.method_8037();
         class07211 class07211 = var1.method_8038();
         class00500 class00500 = class07299.method_8320(class07209x);
         if (class07299.method_8321(class07209x) instanceof class04506 class04506) {
            class07078<?> class07078 = this.u(class06584);
            if (class07078 == null) {
               return class07082.u;
            } else if (!class04782.method_75001()) {
               class08036 class08036 = var1.method_8036();
               if (class08036 instanceof class04770) {
                  ((class04770)class08036).method_64398(class00392.L("advMode.notEnabled.spawner"));
               }

               return class07082.u;
            } else {
               class04506.N(class07078, class07299.method_8409());
               class07299.method_8413(class07209x, class00500, class00500, 3);
               class07299.N(var1.method_8036(), class01194.L, class07209x);
               class06584.B(1);
               return class07082.N;
            }
         } else {
            class07209 class07209x;
            if (class00500.M(class07299, class07209x).method_1110()) {
               class07209x = class07209x;
            } else {
               class07209x = class07209x.method_10093(class07211);
            }

            return this.N(
               var1.method_8036(), class06584, class07299, class07209x, true, !Objects.equals(class07209x, class07209x) && class07211 == class07211.field_11036
            );
         }
      }
   }

   @Override
   public class03767 method_45322() {
      return Optional.ofNullable(this.R().method_58694(class02484.NR)).map(class08983::N).map(class07078::method_45322).orElseGet(class03767::N);
   }
}
