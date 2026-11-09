package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01748 extends class07796 {
   public static final MapCodec<class01748> N = y(class01748::new);
   public static final class06667 y = class06665.yQ;
   public static final class06667 L = class06665.J;
   private static final class08064<class05288> u = class06665.x;
   private static final int i = 6;
   private static final int R = 4;
   private static final class01713 M = new class01713(10);
   private static final int B = 17;

   public class01748(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(u, class05288.field_23391).y(L, false).y(y, false));
   }

   private void N(class04782 var1, class07209 var2, class03145 var3, class06584 var4, class00500 var5, class03729<?> var6) {
      class07211 class07211 = var5.L(u).N();
      class06695 class06695 = class07234.N(var1, var2.method_10093(class07211));
      class06584 class06584xx = var4.t();
      if (class06695 != null && (class06695 instanceof class03145 || var4.c() > class06695.a_(var4))) {
         while (true) {
            this.N(var1, var2, var3, var4, var5, var6, null, class07211, class06695, class06584xx);
            if (class06584xx.R()) {
               break;
            }

            class06584 class06584x = class06584xx.L(1);
            class06584 class06584xx = class07234.N(var3, class06695, class06584x, class07211.b());
            this.N(var1, var2, var3, var4, var5, var6, null, class07211, class06695, class06584xx);
            if (!class06584xx.R()) {
               break;
            }

            class06584xx.B(1);
         }
      } else {
         int ix;
         if (class06695 != null) {
            do {
               this.N(var1, var2, var3, var4, var5, var6, null, class07211, class06695, class06584xx);
               if (class06584xx.R()) {
                  break;
               }

               ix = class06584xx.c();
               class06584xx = class07234.N(var3, class06695, class06584xx, class07211.b());
            } while (ix != class06584xx.c());
         }
      }

      this.N(var1, var2, var3, var4, var5, var6, null, class07211, class06695, class06584xx);
      if (!class06584xx.R()) {
         class06889 class06889x = class06889.y(var2);
         class06889 class06889x = class06889x.N(class07211, 0.7);
         class07206.N(var1, class06584xx, 6, class07211, class06889x);

         for (class04770 class04770 : var1.N(class04770.class, class00734.N(class06889x, 17.0, 17.0, 17.0))) {
            class06912.NR.N(class04770, var6.N(), var3.aC_());
         }

         var1.N(1049, var2, 0);
         var1.N(2010, var2, class07211.L());
      }
   }

   public static Optional<class03729<class05857>> N(class04782 var0, class02903 var1) {
      return M.N(var0, var1);
   }

   protected void N(class00500 var1, class04782 var2, class07209 var3) {
      if (var2.method_8321(var3) instanceof class03145 class03145) {
         class02903 class02903 = class03145.u();
         Optional<class03729<class05857>> optional = N(var2, class02903);
         if (optional.isEmpty()) {
            var2.N(1050, var3, 0);
         } else {
            class03729<class05857> class03729 = optional.get();
            class06584 class06584x = class03729.y().method_8116(class02903, var2.method_30349());
            if (class06584x.R()) {
               var2.N(1050, var3, 0);
            } else {
               class03145.y(6);
               var2.method_8652(var3, var1.y(y, true), 2);
               class06584x.N(var2);
               this.N(var2, var3, class03145, class06584x, var1, class03729);

               for (class06584 class06584x : class03729.y().N(class02903)) {
                  if (!class06584x.R()) {
                     this.N(var2, var3, class03145, class06584x, var1, class03729);
                  }
               }

               class03145.aC_().forEach(var0 -> {
                  if (!var0.R()) {
                     var0.B(1);
                  }
               });
               class03145.method_5431();
            }
         }
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var2.method_8321(var3) instanceof class03145 class03145) {
         var4.method_17355(class03145);
      }

      return class07082.N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   private void N(
      class04782 var1,
      class07209 var2,
      class03145 var3,
      class06584 var4,
      class00500 var5,
      class03729 var6,
      CallbackInfo var7,
      class07211 var8,
      class06695 var9,
      class06584 var10
   ) {
      if (var9 == null) {
         if (!var10.R()) {
            Storage<ItemVariant> storage = (Storage<ItemVariant>)ItemStorage.SIDED.find(var1, var2.method_10093(var8), var8.b());
            if (storage != null) {
               Transaction transaction = Transaction.openOuter();

               try {
                  long ix = storage.insert(ItemVariant.of(var10), var4.c(), transaction);
                  if (ix > 0L) {
                     var10.B((int)ix);
                     transaction.commit();
                  }
               } catch (Throwable throwable1) {
                  if (transaction != null) {
                     try {
                        transaction.close();
                     } catch (Throwable throwable) {
                        throwable1.addSuppressed(throwable);
                     }
                  }

                  throw throwable1;
               }

               if (transaction != null) {
                  transaction.close();
               }
            }
         }
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u, L, y);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(u, var2.N().N(var1.L(u)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(u, var2.N().N(var1.L(u)));
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.N(var1, var2, var3);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      boolean flag = var2.W(var3);
      boolean flag1 = var1.L(L);
      class00394 class00394 = var2.method_8321(var3);
      if (flag && !flag1) {
         var2.N(var3, this, 4);
         var2.method_8652(var3, var1.y(L, true), 2);
         this.N(class00394, true);
      } else if (!flag && flag1) {
         var2.method_8652(var3, var1.y(L, false).y(y, false), 2);
         this.N(class00394, false);
      }
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class03145 ? ((class03145)class00394).U() : 0;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected MapCodec<class01748> N() {
      return N;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (var3.L(L)) {
         var1.N(var2, this, 4);
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211x = var1.L().b();

      class07211 class07211 = switch (class07211x) {
         case field_11033 -> var1.method_8042().b();
         case field_11036 -> var1.method_8042();
         case field_11043, field_11035, field_11039, field_11034 -> class07211.field_11036;
      };
      return this.W().y(u, class05288.N(class07211x, class07211)).y(L, var1.method_8045().W(var1.method_8037()));
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      class03145 class03145 = new class03145(var1, var2);
      class03145.N(var2.y(L) && var2.L(L));
      return class03145;
   }

   private void N(@Nullable class00394 var1, boolean var2) {
      if (var1 instanceof class03145) {
         ((class03145)var1).N(var2);
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? null : N(var3, class00404.field_46808, class03145::N);
   }
}
